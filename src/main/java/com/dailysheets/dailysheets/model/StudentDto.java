package com.dailysheets.dailysheets.model;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
    private Long id;
    private String name;
    private ClassroomModel classroomModel;
    private List<DailySheetModel> dailySheetModelList;

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

    public ClassroomModel getClassroomModel() {
        return classroomModel;
    }

    public void setClassroomModel(ClassroomModel classroomModel) {
        this.classroomModel = classroomModel;
    }

    public List<DailySheetModel> getDailySheetModelList() {
        return dailySheetModelList;
    }

    public void setDailySheetModelList(List<DailySheetModel> dailySheetModelList) {
        this.dailySheetModelList = dailySheetModelList;
    }


}
