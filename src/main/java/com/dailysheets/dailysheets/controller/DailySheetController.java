package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.exception.InfoNotFoundException;
import com.dailysheets.dailysheets.model.DailySheetModel;
import com.dailysheets.dailysheets.service.DailySheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/sheet/{sheetId}")
    public ResponseEntity<DailySheetModel> getDailySheet(@PathVariable Long sheetId) {
        LOGGER.info("controller calling getDailySheet");
        return dailySheetService.getDailySheet(sheetId);
    }

    // POST create a daily sheet
    @PostMapping("/sheet")
    public DailySheetModel createDailySheet(@RequestBody DailySheetModel dailySheetObject) {
        LOGGER.info("controller calling createDailySheet");
        return dailySheetService.createDailySheet(dailySheetObject);
    }

    // PUT update a daily sheet
    @PutMapping("/sheet/{sheetId}")
    public ResponseEntity<DailySheetModel> updateDailySheet (
            @PathVariable Long sheetId, @RequestBody DailySheetModel dailySheetObject) {
        LOGGER.info("service calling updateDailySheet");
        return dailySheetService.updateDailySheet(sheetId, dailySheetObject);
    }
}
