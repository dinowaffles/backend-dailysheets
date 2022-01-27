package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
