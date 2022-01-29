package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.model.StudentModel;
import com.dailysheets.dailysheets.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class StudentController {

    private StudentService studentService;
    private static final Logger LOGGER = Logger.getLogger(
            StudentController.class.getName());

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET all students
    @GetMapping("/student")
    public List<StudentModel> getStudents() {
        LOGGER.info("controller calling getStudents");
        return studentService.getStudents();
    }

    // POST create a student
    @PostMapping("/student")
    public StudentModel addStudent(@RequestBody StudentModel studentObject) {
        LOGGER.info("controller calling addStudent");
        return studentService.addStudent(studentObject);
    }

    // PUT update a student
    @PatchMapping("/student/{studentId}")
    public ResponseEntity<StudentModel> updateStudent(
            @PathVariable Long studentId, @RequestBody StudentModel studentObject) {
        LOGGER.info("controller calling updateStudent");
        return studentService.updateStudent(studentId, studentObject);
    }

    // DEL delete a student
    @DeleteMapping("/student/{studentId}")
    public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long studentId) {
        LOGGER.info("controller calling deleteStudent");
        return studentService.deleteStudent(studentId);
    }

}
