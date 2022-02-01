package com.dailysheets.dailysheets.service;

import com.dailysheets.dailysheets.exception.InfoNotFoundException;
import com.dailysheets.dailysheets.model.DailySheetModel;
import com.dailysheets.dailysheets.model.StudentModel;
import com.dailysheets.dailysheets.repository.DailySheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    // GET all daily sheets
    public List<DailySheetModel> getDailySheets() {
        LOGGER.info("service calling getDailySheets");
        return dailySheetRepository.findAll();
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

    // PATCH update a daily sheet
    public ResponseEntity<DailySheetModel> updateDailySheet (
            DailySheetModel dailySheetObject, Long sheetId) {
        LOGGER.info("service calling updateDailySheet");
        DailySheetModel dailySheetModel = dailySheetRepository.findById(sheetId)
                .orElseThrow(() -> new InfoNotFoundException("Daily sheet with id "
                        + sheetId + "not found."));
        if(dailySheetObject.getStudentName() != null) {
            dailySheetModel.setStudentName(dailySheetObject.getStudentName());
        } else {
            dailySheetModel.getStudentName();
        }
        if(dailySheetObject.getClassroom() != null) {
            dailySheetModel.setClassroom(dailySheetObject.getClassroom());
        } else {
            dailySheetModel.getClassroom();
        }
        if(dailySheetObject.getDate() != null) {
            dailySheetModel.setDate(dailySheetObject.getDate());
        } else {
            dailySheetModel.getDate();
        }
        if(dailySheetObject.getFeeding1Time() != null) {
            dailySheetModel.setFeeding1Time(dailySheetObject.getFeeding1Time());
        } else {
            dailySheetModel.getFeeding1Time();
        }
        if(dailySheetObject.getFeeding1Amt() != null) {
            dailySheetModel.setFeeding1Amt(dailySheetObject.getFeeding1Amt());
        } else {
            dailySheetModel.getFeeding1Amt();
        }
        if(dailySheetObject.getFeeding2Time() != null) {
            dailySheetModel.setFeeding2Time(dailySheetObject.getFeeding2Time());
        } else {
            dailySheetModel.getFeeding2Time();
        }
        if(dailySheetObject.getFeeding2Amt() != null) {
            dailySheetModel.setFeeding2Amt(dailySheetObject.getFeeding2Amt());
        } else {
            dailySheetModel.getFeeding2Amt();
        }
        if(dailySheetObject.getFeeding3Time() != null) {
            dailySheetModel.setFeeding3Time(dailySheetObject.getFeeding3Time());
        } else {
            dailySheetModel.getFeeding3Time();
        }
        if(dailySheetObject.getFeeding3Amt() != null) {
            dailySheetModel.setFeeding3Amt(dailySheetObject.getFeeding3Amt());
        } else {
            dailySheetModel.getFeeding3Amt();
        }
        if(dailySheetObject.getFeeding4Time() != null) {
            dailySheetModel.setFeeding4Time(dailySheetObject.getFeeding4Time());
        } else {
            dailySheetModel.getFeeding4Time();
        }
        if(dailySheetObject.getFeeding4Amt() != null) {
            dailySheetModel.setFeeding4Amt(dailySheetObject.getFeeding4Amt());
        } else {
            dailySheetModel.getFeeding4Amt();
        }
        if(dailySheetObject.getFeeding5Time() != null) {
            dailySheetModel.setFeeding5Time(dailySheetObject.getFeeding5Time());
        } else {
            dailySheetModel.getFeeding5Time();
        }
        if(dailySheetObject.getFeeding5Amt() != null) {
            dailySheetModel.setFeeding5Amt(dailySheetObject.getFeeding5Amt());
        } else {
            dailySheetModel.getFeeding5Amt();
        }
        if(dailySheetObject.getBreakfastAmt() != null) {
            dailySheetModel.setBreakfastAmt(dailySheetObject.getBreakfastAmt());
        } else {
            dailySheetModel.getBreakfastAmt();
        }
        if(dailySheetObject.getLunchAmt() != null) {
            dailySheetModel.setLunchAmt(dailySheetObject.getLunchAmt());
        } else {
            dailySheetModel.getLunchAmt();
        }
        if(dailySheetObject.getSnackAmt() != null) {
            dailySheetModel.setSnackAmt(dailySheetObject.getSnackAmt());
        } else {
            dailySheetModel.getSnackAmt();
        }
        if(dailySheetObject.getPotty1Time() != null) {
            dailySheetModel.setPotty1Time(dailySheetObject.getPotty1Time());
        } else {
            dailySheetModel.getPotty1Time();
        }
        if(dailySheetObject.getPotty1Description() != null) {
            dailySheetModel.setPotty1Description(dailySheetObject.getPotty1Description());
        } else {
            dailySheetModel.getPotty1Description();
        }
        if(dailySheetObject.getPotty2Time() != null) {
            dailySheetModel.setPotty2Time(dailySheetObject.getPotty2Time());
        } else {
            dailySheetModel.getPotty2Time();
        }
        if(dailySheetObject.getPotty2Description() != null) {
            dailySheetModel.setPotty2Description(dailySheetObject.getPotty2Description());
        } else {
            dailySheetModel.getPotty2Description();
        }
        if(dailySheetObject.getPotty3Time() != null) {
            dailySheetModel.setPotty3Time(dailySheetObject.getPotty3Time());
        } else {
            dailySheetModel.getPotty3Time();
        }
        if(dailySheetObject.getPotty3Description() != null) {
            dailySheetModel.setPotty3Description(dailySheetObject.getPotty3Description());
        } else {
            dailySheetModel.getPotty3Description();
        }
        if(dailySheetObject.getPotty4Time() != null) {
            dailySheetModel.setPotty4Time(dailySheetObject.getPotty4Time());
        } else {
            dailySheetModel.getPotty4Time();
        }
        if(dailySheetObject.getPotty4Description() != null) {
            dailySheetModel.setPotty4Description(dailySheetObject.getPotty4Description());
        } else {
            dailySheetModel.getPotty4Description();
        }
        if(dailySheetObject.getPotty5Time() != null) {
            dailySheetModel.setPotty5Time(dailySheetObject.getPotty5Time());
        } else {
            dailySheetModel.getPotty5Time();
        }
        if(dailySheetObject.getPotty5Description() != null) {
            dailySheetModel.setPotty5Description(dailySheetObject.getPotty5Description());
        } else {
            dailySheetModel.getPotty5Description();
        }
        if(dailySheetObject.getPotty6Time() != null) {
            dailySheetModel.setPotty6Time(dailySheetObject.getPotty6Time());
        } else {
            dailySheetModel.getPotty6Time();
        }
        if(dailySheetObject.getPotty6Description() != null) {
            dailySheetModel.setPotty6Description(dailySheetObject.getPotty6Description());
        } else {
            dailySheetModel.getPotty6Description();
        }
        if(dailySheetObject.getNap1Start() != null) {
            dailySheetModel.setNap1Start(dailySheetObject.getNap1Start());
        } else {
            dailySheetModel.getNap1Start();
        }
        if(dailySheetObject.getNap1End() != null) {
            dailySheetModel.setNap1End(dailySheetObject.getNap1End());
        } else {
            dailySheetModel.getNap1End();
        }
        if(dailySheetObject.getNap2Start() != null) {
            dailySheetModel.setNap2Start(dailySheetObject.getNap2Start());
        } else {
            dailySheetModel.getNap2Start();
        }
        if(dailySheetObject.getNap2End() != null) {
            dailySheetModel.setNap2End(dailySheetObject.getNap2End());
        } else {
            dailySheetModel.getNap2End();
        }
        if(dailySheetObject.getActivity() != null) {
            dailySheetModel.setActivity(dailySheetObject.getActivity());
        } else {
            dailySheetModel.getActivity();
        }
        if(dailySheetObject.getNeeds() != null) {
            dailySheetModel.setNeeds(dailySheetObject.getNeeds());
        } else {
            dailySheetModel.getNeeds();
        }
//        dailySheetModel.setStudentName(dailySheetObject.getStudentName());
//        dailySheetModel.setClassroom(dailySheetObject.getClassroom());
//        dailySheetModel.setStudentModel(dailySheetObject.getStudentModel());
//        dailySheetModel.setDate(dailySheetObject.getDate());
//        dailySheetModel.setFeeding1Time(dailySheetObject.getFeeding1Time());
//        dailySheetModel.setFeeding1Amt(dailySheetObject.getFeeding1Amt());
//        dailySheetModel.setFeeding2Time(dailySheetObject.getFeeding2Time());
//        dailySheetModel.setFeeding2Amt(dailySheetObject.getFeeding2Amt());
//        dailySheetModel.setFeeding3Time(dailySheetObject.getFeeding3Time());
//        dailySheetModel.setFeeding3Amt(dailySheetObject.getFeeding3Amt());
//        dailySheetModel.setFeeding4Time(dailySheetObject.getFeeding4Time());
//        dailySheetModel.setFeeding4Amt(dailySheetObject.getFeeding4Amt());
//        dailySheetModel.setFeeding5Time(dailySheetObject.getFeeding5Time());
//        dailySheetModel.setFeeding5Amt(dailySheetObject.getFeeding5Amt());
//        dailySheetModel.setBreakfastAmt(dailySheetObject.getBreakfastAmt());
//        dailySheetModel.setLunchAmt(dailySheetObject.getLunchAmt());
//        dailySheetModel.setSnackAmt(dailySheetObject.getSnackAmt());
//        dailySheetModel.setPotty1Time(dailySheetObject.getPotty1Time());
//        dailySheetModel.setPotty1Description(dailySheetObject.getPotty1Description());
//        dailySheetModel.setPotty2Time(dailySheetObject.getPotty2Time());
//        dailySheetModel.setPotty2Description(dailySheetObject.getPotty2Description());
//        dailySheetModel.setPotty3Time(dailySheetObject.getPotty3Time());
//        dailySheetModel.setPotty3Description(dailySheetObject.getPotty3Description());
//        dailySheetModel.setPotty4Time(dailySheetObject.getPotty4Time());
//        dailySheetModel.setPotty4Description(dailySheetObject.getPotty4Description());
//        dailySheetModel.setPotty5Time(dailySheetObject.getPotty5Time());
//        dailySheetModel.setPotty5Description(dailySheetObject.getPotty5Description());
//        dailySheetModel.setNap1Start(dailySheetObject.getNap1Start());
//        dailySheetModel.setNap1End(dailySheetObject.getNap1End());
//        dailySheetModel.setNap2Start(dailySheetObject.getNap2Start());
//        dailySheetModel.setNap2End(dailySheetObject.getNap2End());
//        dailySheetModel.setActivity(dailySheetObject.getActivity());
//        dailySheetModel.setNeeds(dailySheetObject.getNeeds());
        DailySheetModel updateDailySheet = dailySheetRepository.save(dailySheetModel);
        return ResponseEntity.ok(updateDailySheet);
    }

    // DEL delete a dailysheet
    public ResponseEntity<Map<String, Boolean>> deleteDailySheet(Long sheetId) {
        LOGGER.info("service calling deleteDailySheet");
        DailySheetModel dailySheetModel = dailySheetRepository.findById(sheetId)
                .orElseThrow(() -> new InfoNotFoundException("Daily sheet with id "
                        + sheetId + "not found."));
        dailySheetRepository.delete(dailySheetModel);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
