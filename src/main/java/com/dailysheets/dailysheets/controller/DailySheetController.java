package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.service.DailySheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api")
public class DailySheetController {

    private DailySheetService dailySheetService;
    private static final Logger LOGGER = Logger.getLogger(
            DailySheetController.class.getName());

    @Autowired
    public void setDailySheetService(DailySheetService dailySheetService) {
        this.dailySheetService = dailySheetService;
    }

}
