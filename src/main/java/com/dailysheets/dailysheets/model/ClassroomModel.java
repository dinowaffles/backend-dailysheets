package com.dailysheets.dailysheets.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classroom")
public class ClassroomModel {

    @Id
    @Column(name = "classroom_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "classroom_name")
    private String name;

    @Column(name = "classroom_age")
    private String ageGroup;

    @OneToMany(mappedBy = "classrooms", orphanRemoval = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<StudentModel> studentList;

    public ClassroomModel() {

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

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public List<StudentModel> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentModel> studentList) {
        this.studentList = studentList;
    }

}
