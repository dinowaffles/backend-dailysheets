package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.model.DailySheetModel;
import com.dailysheets.dailysheets.service.DailySheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
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

    // GET a single daily sheet
    @RequestMapping("/student/{studentId}/sheet{sheetId}")
    public ResponseEntity<DailySheetModel> getDailySheet(@PathVariable(value = "studentId") Long studentId,
                                                         @PathVariable(value = "sheetId") Long sheetId) {
        LOGGER.info("controller calling getDailySheet");
        return dailySheetService.getDailySheet(studentId, sheetId);
    }

    // POST create a daily sheet

    // PUT update a daily sheet

}
