package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    // POST create a classroom

    // PUT update a classroom

    // DEL delete a classroom

}
