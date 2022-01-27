package com.dailysheets.dailysheets.service;

import com.dailysheets.dailysheets.exception.InfoExistsException;
import com.dailysheets.dailysheets.exception.InfoNotFoundException;
import com.dailysheets.dailysheets.model.StudentModel;
import com.dailysheets.dailysheets.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    private static final Logger LOGGER = Logger.getLogger(
            StudentService.class.getName());

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // GET all students
    public List<StudentModel> getStudents() {
        LOGGER.info("service calling getStudents");
        return studentRepository.findAll();
    }

    // POST create a student
    public StudentModel addStudent(StudentModel studentObject) {
        LOGGER.info("service calling addStudent");
        StudentModel studentModel = studentRepository
                .findByName(studentObject.getName());
        if (studentModel != null) {
            throw new InfoExistsException("Student with name "
                    + studentModel.getName() + " already exists.");
        } else {
            return studentRepository.save(studentObject);
        }
    }

    // PUT update a student
    public ResponseEntity<StudentModel> updateStudent (
            Long studentId, StudentModel studentObject) {
        LOGGER.info("service calling updateStudent");
        StudentModel studentModel = studentRepository.findById(studentId)
                .orElseThrow(() -> new InfoNotFoundException("Student with id "
                        + studentId + "not found."));
            studentModel.setName(studentObject.getName());
            studentModel.setClassroomModel(studentObject.getClassroomModel());
            StudentModel updateStudent = studentRepository.save(studentModel);
            return ResponseEntity.ok(updateStudent);
    }

    // DEL delete a student
    public ResponseEntity<Map<String, Boolean>> deleteStudent(Long studentId) {
        LOGGER.info("service calling deleteStudent");
        StudentModel studentModel = studentRepository.findById(studentId)
                .orElseThrow(() -> new InfoNotFoundException("Student with id "
                        + studentId + "not found."));
        studentRepository.delete(studentModel);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
