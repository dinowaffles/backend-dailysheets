package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.exception.InfoNotFoundException;
import com.dailysheets.dailysheets.model.ClassroomModel;
import com.dailysheets.dailysheets.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(value= HttpStatus.OK)
    public List<ClassroomModel> getClassrooms() {
        LOGGER.info("controller calling getClassrooms");
        return classroomService.getClassrooms();
    }

    // GET a classroom
    @GetMapping("/classroom/{classroomId}")
    @ResponseStatus(value= HttpStatus.OK)
    public ResponseEntity<ClassroomModel> getClassroomById(@PathVariable Long classroomId) {
        LOGGER.info("controller calling getClassroomById");
        return classroomService.getClassroomById(classroomId);
    }

    // POST create a classroom
    @PostMapping("/classroom")
    @ResponseStatus(value=HttpStatus.OK)
    public ClassroomModel addClassroom(@RequestBody ClassroomModel classroomObject) {
        LOGGER.info("controller calling addClassroom");
        return classroomService.addClassroom(classroomObject);
    }

    // PUT update a classroom
    @PutMapping("/classroom/{classroomId}")
    @ResponseStatus(value=HttpStatus.OK)
    public ResponseEntity<ClassroomModel> updateClassroom(
            @PathVariable Long classroomId, @RequestBody ClassroomModel classroomObject) {
        LOGGER.info("controller calling updateClassroom");
        return classroomService.updateClassroom(classroomId, classroomObject);
    }

    // DEL delete a classroom
    @DeleteMapping("/classroom/{classroomId}")
    @ResponseStatus(value=HttpStatus.OK)
    public ResponseEntity<Map<String, Boolean>> deleteClassroom(@PathVariable Long classroomId) {
        LOGGER.info("controller calling deleteClassroom");
        return classroomService.deleteClassroom(classroomId);
    }
}
