package com.dailysheets.dailysheets.repository;

import com.dailysheets.dailysheets.model.DailySheetModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailySheetRepository extends JpaRepository<DailySheetModel, Long> {

}
