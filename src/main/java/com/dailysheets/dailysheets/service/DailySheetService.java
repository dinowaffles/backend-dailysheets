package com.dailysheets.dailysheets.service;

import com.dailysheets.dailysheets.exception.InfoNotFoundException;
import com.dailysheets.dailysheets.model.DailySheetModel;
import com.dailysheets.dailysheets.repository.DailySheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.logging.Logger;

@Service
public class DailySheetService {
    private DailySheetRepository dailySheetRepository;
    private static final Logger LOGGER = Logger.getLogger(
            DailySheetRepository.class.getName());

    @Autowired
    public void setDailySheetRepository(DailySheetRepository dailySheetRepository) {
        this.dailySheetRepository = dailySheetRepository;
    }


    // GET a single daily sheet
    public ResponseEntity<DailySheetModel> getDailySheet(Long sheetId) {
        LOGGER.info("service calling getDailySheet");
        DailySheetModel dailySheetModel = dailySheetRepository.findById(sheetId)
                .orElseThrow(() -> new InfoNotFoundException("Daily sheet with id "
                        + sheetId + "not found."));
        return ResponseEntity.ok(dailySheetModel);
    }

    // POST create a daily sheet
    public DailySheetModel createDailySheet(DailySheetModel dailySheetObject) {
        LOGGER.info("service calling createDailySheet");
        return dailySheetRepository.save(dailySheetObject);
    }

    // PUT update a daily sheet
    public ResponseEntity<DailySheetModel> updateDailySheet (
            Long sheetId, DailySheetModel dailySheetObject) {
        LOGGER.info("service calling updateDailySheet");
        DailySheetModel dailySheetModel = dailySheetRepository.findById(sheetId)
                .orElseThrow(() -> new InfoNotFoundException("Daily sheet with id "
                        + sheetId + "not found."));
        dailySheetModel.setStudentModel(dailySheetObject.getStudentModel());
        DailySheetModel updateDailySheet = dailySheetRepository.save(dailySheetModel);
        return ResponseEntity.ok(updateDailySheet);
    }

}
