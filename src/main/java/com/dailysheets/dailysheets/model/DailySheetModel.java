package com.dailysheets.dailysheets.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate(value = true)
@SelectBeforeUpdate(value = true)
@Table(name = "dailysheet")
public class DailySheetModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String studentName;

    @Column
    private String classroom;

     @ManyToOne
     @JoinColumn(name = "student_id")
     @JsonIgnore
    private StudentModel studentModel;

    @Column
    private String date;

    @Column
    private String feeding1Time;
    @Column
    private Double feeding1Amt;
    @Column
    private String feeding2Time;
    @Column
    private Double feeding2Amt;
    @Column
    private String feeding3Time;
    @Column
    private Double feeding3Amt;
    @Column
    private String feeding4Time;
    @Column
    private Double feeding4Amt;
    @Column
    private String feeding5Time;
    @Column
    private Double feeding5Amt;

    @Column
    private String breakfastAmt;
    @Column
    private String lunchAmt;
    @Column
    private String snackAmt;

    @Column
    private String potty1Time;
    @Column
    private String potty1Description;
    @Column
    private String potty2Time;
    @Column
    private String potty2Description;
    @Column
    private String potty3Time;
    @Column
    private String potty3Description;
    @Column
    private String potty4Time;
    @Column
    private String potty4Description;
    @Column
    private String potty5Time;
    @Column
    private String potty5Description;
    @Column
    private String potty6Time;
    @Column
    private String potty6Description;

    @Column
    private String nap1Start;
    @Column
    private String nap1End;
    @Column
    private String nap2Start;
    @Column
    private String nap2End;

    @Column
    private String activity;

    @Column
    private String needs;

    public DailySheetModel() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public StudentModel getStudentModel() {
        return studentModel;
    }

    public void setStudentModel(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFeeding1Time() {
        return feeding1Time;
    }

    public void setFeeding1Time(String feeding1Time) {
        this.feeding1Time = feeding1Time;
    }

    public Double getFeeding1Amt() {
        return feeding1Amt;
    }

    public void setFeeding1Amt(Double feeding1Amt) {
        this.feeding1Amt = feeding1Amt;
    }

    public String getFeeding2Time() {
        return feeding2Time;
    }

    public void setFeeding2Time(String feeding2Time) {
        this.feeding2Time = feeding2Time;
    }

    public Double getFeeding2Amt() {
        return feeding2Amt;
    }

    public void setFeeding2Amt(Double feeding2Amt) {
        this.feeding2Amt = feeding2Amt;
    }

    public String getFeeding3Time() {
        return feeding3Time;
    }

    public void setFeeding3Time(String feeding3Time) {
        this.feeding3Time = feeding3Time;
    }

    public Double getFeeding3Amt() {
        return feeding3Amt;
    }

    public void setFeeding3Amt(Double feeding3Amt) {
        this.feeding3Amt = feeding3Amt;
    }

    public String getFeeding4Time() {
        return feeding4Time;
    }

    public void setFeeding4Time(String feeding4Time) {
        this.feeding4Time = feeding4Time;
    }

    public Double getFeeding4Amt() {
        return feeding4Amt;
    }

    public void setFeeding4Amt(Double feeding4Amt) {
        this.feeding4Amt = feeding4Amt;
    }

    public String getFeeding5Time() {
        return feeding5Time;
    }

    public void setFeeding5Time(String feeding5Time) {
        this.feeding5Time = feeding5Time;
    }

    public Double getFeeding5Amt() {
        return feeding5Amt;
    }

    public void setFeeding5Amt(Double feeding5Amt) {
        this.feeding5Amt = feeding5Amt;
    }

    public String getBreakfastAmt() {
        return breakfastAmt;
    }

    public void setBreakfastAmt(String breakfastAmt) {
        this.breakfastAmt = breakfastAmt;
    }

    public String getLunchAmt() {
        return lunchAmt;
    }

    public void setLunchAmt(String lunchAmt) {
        this.lunchAmt = lunchAmt;
    }

    public String getSnackAmt() {
        return snackAmt;
    }

    public void setSnackAmt(String snackAmt) {
        this.snackAmt = snackAmt;
    }

    public String getPotty1Time() {
        return potty1Time;
    }

    public void setPotty1Time(String potty1Time) {
        this.potty1Time = potty1Time;
    }

    public String getPotty1Description() {
        return potty1Description;
    }

    public void setPotty1Description(String potty1Description) {
        this.potty1Description = potty1Description;
    }

    public String getPotty2Time() {
        return potty2Time;
    }

    public void setPotty2Time(String potty2Time) {
        this.potty2Time = potty2Time;
    }

    public String getPotty2Description() {
        return potty2Description;
    }

    public void setPotty2Description(String potty2Description) {
        this.potty2Description = potty2Description;
    }

    public String getPotty3Time() {
        return potty3Time;
    }

    public void setPotty3Time(String potty3Time) {
        this.potty3Time = potty3Time;
    }

    public String getPotty3Description() {
        return potty3Description;
    }

    public void setPotty3Description(String potty3Description) {
        this.potty3Description = potty3Description;
    }

    public String getPotty4Time() {
        return potty4Time;
    }

    public void setPotty4Time(String potty4Time) {
        this.potty4Time = potty4Time;
    }

    public String getPotty4Description() {
        return potty4Description;
    }

    public void setPotty4Description(String potty4Description) {
        this.potty4Description = potty4Description;
    }

    public String getPotty5Time() {
        return potty5Time;
    }

    public void setPotty5Time(String potty5Time) {
        this.potty5Time = potty5Time;
    }

    public String getPotty5Description() {
        return potty5Description;
    }

    public void setPotty5Description(String potty5Description) {
        this.potty5Description = potty5Description;
    }

    public String getPotty6Time() {
        return potty6Time;
    }

    public void setPotty6Time(String potty6Time) {
        this.potty6Time = potty6Time;
    }

    public String getPotty6Description() {
        return potty6Description;
    }

    public void setPotty6Description(String potty6Description) {
        this.potty6Description = potty6Description;
    }

    public String getNap1Start() {
        return nap1Start;
    }

    public void setNap1Start(String nap1Start) {
        this.nap1Start = nap1Start;
    }

    public String getNap1End() {
        return nap1End;
    }

    public void setNap1End(String nap1End) {
        this.nap1End = nap1End;
    }

    public String getNap2Start() {
        return nap2Start;
    }

    public void setNap2Start(String nap2Start) {
        this.nap2Start = nap2Start;
    }

    public String getNap2End() {
        return nap2End;
    }

    public void setNap2End(String nap2End) {
        this.nap2End = nap2End;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }

}
