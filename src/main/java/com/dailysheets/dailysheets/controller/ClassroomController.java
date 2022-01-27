package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.model.ClassroomModel;
import com.dailysheets.dailysheets.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class ClassroomController {

    private ClassroomService classroomService;
    private static final Logger LOGGER = Logger.getLogger(
            ClassroomController.class.getName());

    @Autowired
    public void setClassroomService(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    // GET all classrooms
    @GetMapping("/classroom")
    public List<ClassroomModel> getClassrooms() {
        LOGGER.info("controller calling getClassrooms");
        return classroomService.getClassrooms();
    }

    // POST create a classroom
    @PostMapping("/classroom")
    public ClassroomModel addClassroom(@RequestBody ClassroomModel classroomObject) {
        LOGGER.info("controller calling addClassroom");
        return classroomService.addClassroom(classroomObject);
    }

    // PUT update a classroom
    @PutMapping("/classroom/{classroomId}")
    public ResponseEntity<ClassroomModel> updateClassroom(
            @PathVariable Long classroomId, @RequestBody ClassroomModel classroomObject) {
        LOGGER.info("controller calling updateClassroom");
        return classroomService.updateClassroom(classroomId, classroomObject);
    }

    // DEL delete a classroom
    @DeleteMapping("/classroom/{classroomId}")
    public ResponseEntity<Map<String, Boolean>> deleteClassroom(@PathVariable Long classroomId) {
        LOGGER.info("controller calling deleteClassroom");
        return classroomService.deleteClassroom(classroomId);
    }
}
