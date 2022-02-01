package com.dailysheets.dailysheets.controller;

import com.dailysheets.dailysheets.exception.InfoNotFoundException;
import com.dailysheets.dailysheets.model.DailySheetModel;
import com.dailysheets.dailysheets.service.DailySheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
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

    // GET all daily sheets
    @GetMapping("/sheet")
    @ResponseStatus(value= HttpStatus.OK)
    public List<DailySheetModel> getDailySheets() {
        LOGGER.info("controller calling getDailySheets");
        return dailySheetService.getDailySheets();
    }

    // GET a single daily sheet
    @RequestMapping("/sheet/{sheetId}")
    @ResponseStatus(value=HttpStatus.OK)
    public ResponseEntity<DailySheetModel> getDailySheet(@PathVariable Long sheetId) {
        LOGGER.info("controller calling getDailySheet");
        return dailySheetService.getDailySheet(sheetId);
    }

    // POST create a daily sheet
    @PostMapping("/sheet")
    @ResponseStatus(value=HttpStatus.OK)
    public DailySheetModel createDailySheet(@RequestBody DailySheetModel dailySheetObject) {
        LOGGER.info("controller calling createDailySheet");
        return dailySheetService.createDailySheet(dailySheetObject);
    }

    // PATCH update a daily sheet
    @PatchMapping("/sheet/{sheetId}")
    @ResponseStatus(value=HttpStatus.OK)
    public ResponseEntity<DailySheetModel> updateDailySheet (
            @RequestBody DailySheetModel dailySheetObject, @PathVariable(value="sheetId") Long sheetId) {
        LOGGER.info("service calling updateDailySheet");
        return dailySheetService.updateDailySheet(dailySheetObject, sheetId);
    }

    // DEL delete a dailysheet
    @DeleteMapping("/sheet/{sheetId}")
    @ResponseStatus(value=HttpStatus.OK)
    public ResponseEntity<Map<String, Boolean>> deleteDailySheet(@PathVariable Long sheetId) {
        LOGGER.info("controller calling deleteDailySheet");
        return dailySheetService.deleteDailySheet(sheetId);
    }
}
