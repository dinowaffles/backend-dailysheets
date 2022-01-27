package com.dailysheets.dailysheets.model;

import javax.persistence.*;

@Entity
@Table(name = "classrooms")
public class ClassroomModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String ageGroup;

    public ClassroomModel(Long id, String name, String ageGroup) {
        this.id = id;
        this.name= name;
        this.ageGroup = ageGroup;
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
}
