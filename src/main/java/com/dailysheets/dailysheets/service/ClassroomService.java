package com.dailysheets.dailysheets.service;

import com.dailysheets.dailysheets.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
