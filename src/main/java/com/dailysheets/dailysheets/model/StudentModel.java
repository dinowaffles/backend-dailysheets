package com.dailysheets.dailysheets.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class StudentModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String classroom;

    @OneToMany(mappedBy = "studentModel", orphanRemoval = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<DailySheetModel> dailySheetModelList;

    public StudentModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DailySheetModel> getDailySheetModelList() {
        return dailySheetModelList;
    }

    public void setDailySheetModelList(List<DailySheetModel> dailySheetModelList) {
        this.dailySheetModelList = dailySheetModelList;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
