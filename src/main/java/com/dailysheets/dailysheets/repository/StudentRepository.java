package com.dailysheets.dailysheets.repository;

import com.dailysheets.dailysheets.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}
