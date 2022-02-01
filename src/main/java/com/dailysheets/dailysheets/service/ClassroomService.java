package com.dailysheets.dailysheets.service;

import com.dailysheets.dailysheets.exception.InfoExistsException;
import com.dailysheets.dailysheets.exception.InfoNotFoundException;
import com.dailysheets.dailysheets.model.ClassroomModel;
import com.dailysheets.dailysheets.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class ClassroomService {
    private ClassroomRepository classroomRepository;
    private static final Logger LOGGER = Logger.getLogger(
            ClassroomService.class.getName());

    @Autowired
    public void setClassroomRepository(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    // GET all classrooms
    public List<ClassroomModel> getClassrooms() {
        LOGGER.info("service calling getClassrooms");
        return classroomRepository.findAll();
    }

    // GET a classroom
    public ResponseEntity<ClassroomModel> getClassroomById(Long classroomId) {
        LOGGER.info("service calling getClassroomById");
        ClassroomModel classroomModel = classroomRepository.findById(classroomId)
                .orElseThrow(() -> new InfoNotFoundException("Classroom with id "
                        + classroomId + "not found."));
        return ResponseEntity.ok(classroomModel);
    }

    // POST create a classroom
    public ClassroomModel addClassroom(ClassroomModel classroomObject) {
        LOGGER.info("service calling addClassroom");
        ClassroomModel classroomModel = classroomRepository
                .findByName(classroomObject.getName());
        if (classroomModel != null) {
            throw new InfoExistsException("Classroom with name"
                    + classroomModel.getName() + "already exists.");
        } else {
            return classroomRepository.save(classroomObject);
        }
    }

    // PUT update a classroom
    public ResponseEntity<ClassroomModel> updateClassroom(
            Long classroomId, ClassroomModel classroomObject) {
        LOGGER.info("service calling updateClassroom");
        ClassroomModel classroomModel = classroomRepository.findById(classroomId)
                .orElseThrow(() -> new InfoNotFoundException("Classroom with id "
                + classroomId + "not found."));
            classroomModel.setName(classroomObject.getName());
            classroomModel.setAgeGroup(classroomObject.getAgeGroup());
            ClassroomModel updateClassroom = classroomRepository.save(classroomModel);
            return ResponseEntity.ok(updateClassroom);
    }

    // DEL delete a classroom
    public ResponseEntity<Map<String, Boolean>> deleteClassroom(Long classroomId) {
        LOGGER.info("service calling deleteClassroom");
        ClassroomModel classroomModel = classroomRepository.findById(classroomId)
                .orElseThrow(() -> new InfoNotFoundException("Classroom with id "
                        + classroomId + "not found."));
        classroomRepository.delete(classroomModel);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
