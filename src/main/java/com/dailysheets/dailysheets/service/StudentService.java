package com.dailysheets.dailysheets.service;

import com.dailysheets.dailysheets.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    // POST create a student

    // PUT update a student

    // DEL delete a student

}
