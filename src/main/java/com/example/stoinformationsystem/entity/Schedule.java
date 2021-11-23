package com.example.stoinformationsystem.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

//    @OneToOne(mappedBy = "weekdayShedule")
//    private STO sto;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalTime startBreakeTime;
    private LocalTime endBreakeTime;
    private LocalTime startTimeWeekend;
    private LocalTime endTimeWeekend;

    public Schedule(){

    }

    public Schedule(LocalTime startTime, LocalTime endTime, LocalTime startBreakeTime, LocalTime endBreakeTime, LocalTime startTimeWeekend, LocalTime endTimeWeekend) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.startBreakeTime = startBreakeTime;
        this.endBreakeTime = endBreakeTime;
        this.startTimeWeekend = startTimeWeekend;
        this.endTimeWeekend = endTimeWeekend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalTime getStartBreakeTime() {
        return startBreakeTime;
    }

    public void setStartBreakeTime(LocalTime startBreakeTime) {
        this.startBreakeTime = startBreakeTime;
    }

    public LocalTime getEndBreakeTime() {
        return endBreakeTime;
    }

    public void setEndBreakeTime(LocalTime endBreakeTime) {
        this.endBreakeTime = endBreakeTime;
    }

    public LocalTime getStartTimeWeekend() {
        return startTimeWeekend;
    }

    public void setStartTimeWeekend(LocalTime startTimeWeekend) {
        this.startTimeWeekend = startTimeWeekend;
    }

    public LocalTime getEndTimeWeekend() {
        return endTimeWeekend;
    }

    public void setEndTimeWeekend(LocalTime endTimeWeekend) {
        this.endTimeWeekend = endTimeWeekend;
    }
}
