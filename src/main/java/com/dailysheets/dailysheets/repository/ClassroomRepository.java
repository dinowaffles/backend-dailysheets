package com.dailysheets.dailysheets.repository;

import com.dailysheets.dailysheets.model.ClassroomModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<ClassroomModel, Long> {
}
