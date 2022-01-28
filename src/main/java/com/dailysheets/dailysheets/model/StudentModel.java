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


    @ManyToOne
    @JoinColumn(name = "classroommodel_id")
    @JsonIgnore
    private ClassroomModel classroomModel;

    @OneToMany(mappedBy = "studentList", orphanRemoval = false)
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

    public ClassroomModel getClassroomModel() {
        return classroomModel;
    }

    public void setClassroomModel(ClassroomModel classroomModel) {
        this.classroomModel = classroomModel;
    }
}
