package com.dailysheets.dailysheets.service;

import com.dailysheets.dailysheets.repository.DailySheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
