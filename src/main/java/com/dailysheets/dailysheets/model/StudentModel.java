package com.dailysheets.dailysheets.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class StudentModel {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ClassroomModel classroomModel;

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
