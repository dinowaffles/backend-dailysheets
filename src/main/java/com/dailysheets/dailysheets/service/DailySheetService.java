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
        dailySheetModel.setDate(dailySheetObject.getDate());
        dailySheetModel.setFeeding1Time(dailySheetObject.getFeeding1Time());
        dailySheetModel.setFeeding1Amt(dailySheetObject.getFeeding1Amt());
        dailySheetModel.setFeeding2Time(dailySheetObject.getFeeding2Time());
        dailySheetModel.setFeeding2Amt(dailySheetObject.getFeeding2Amt());
        dailySheetModel.setFeeding3Time(dailySheetObject.getFeeding3Time());
        dailySheetModel.setFeeding3Amt(dailySheetObject.getFeeding3Amt());
        dailySheetModel.setFeeding4Time(dailySheetObject.getFeeding4Time());
        dailySheetModel.setFeeding4Amt(dailySheetObject.getFeeding4Amt());
        dailySheetModel.setFeeding5Time(dailySheetObject.getFeeding5Time());
        dailySheetModel.setFeeding5Amt(dailySheetObject.getFeeding5Amt());
        dailySheetModel.setBreakfastAmt(dailySheetObject.getBreakfastAmt());
        dailySheetModel.setLunchAmt(dailySheetObject.getLunchAmt());
        dailySheetModel.setSnackAmt(dailySheetObject.getSnackAmt());
        dailySheetModel.setDiaper1Time(dailySheetObject.getDiaper1Time());
        dailySheetModel.setDiaper1Description(dailySheetObject.getDiaper1Description());
        dailySheetModel.setDiaper2Time(dailySheetObject.getDiaper2Time());
        dailySheetModel.setDiaper2Description(dailySheetObject.getDiaper2Description());
        dailySheetModel.setDiaper3Time(dailySheetObject.getDiaper3Time());
        dailySheetModel.setDiaper3Description(dailySheetObject.getDiaper3Description());
        dailySheetModel.setDiaper4Time(dailySheetObject.getDiaper4Time());
        dailySheetModel.setDiaper4Description(dailySheetObject.getDiaper4Description());
        dailySheetModel.setDiaper5Time(dailySheetObject.getDiaper5Time());
        dailySheetModel.setDiaper5Description(dailySheetObject.getDiaper5Description());
        dailySheetModel.setDiaper6Time(dailySheetObject.getDiaper6Time());
        dailySheetModel.setDiaper6Description(dailySheetObject.getDiaper6Description());
        dailySheetModel.setPotty1Time(dailySheetObject.getPotty1Time());
        dailySheetModel.setPotty1Description(dailySheetObject.getPotty1Description());
        dailySheetModel.setPotty2Time(dailySheetObject.getPotty2Time());
        dailySheetModel.setPotty2Description(dailySheetObject.getPotty2Description());
        dailySheetModel.setPotty3Time(dailySheetObject.getPotty3Time());
        dailySheetModel.setPotty3Description(dailySheetObject.getPotty3Description());
        dailySheetModel.setPotty4Time(dailySheetObject.getPotty4Time());
        dailySheetModel.setPotty4Description(dailySheetObject.getPotty4Description());
        dailySheetModel.setPotty5Time(dailySheetObject.getPotty5Time());
        dailySheetModel.setPotty5Description(dailySheetObject.getPotty5Description());
        dailySheetModel.setNap1Start(dailySheetObject.getNap1Start());
        dailySheetModel.setNap1End(dailySheetObject.getNap1End());
        dailySheetModel.setNap2Start(dailySheetObject.getNap2Start());
        dailySheetModel.setNap2End(dailySheetObject.getNap2End());
        dailySheetModel.setActivity(dailySheetObject.getActivity());
        dailySheetModel.setNeeds(dailySheetObject.getNeeds());
        DailySheetModel updateDailySheet = dailySheetRepository.save(dailySheetModel);
        return ResponseEntity.ok(updateDailySheet);
    }

}
