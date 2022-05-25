package com.Stsystem.stsystem;

import org.apache.tomcat.jni.Local;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class CricketMatch {

    private String teamAName;

    private String teamBName;
    private LocalDate date;
    private LocalTime time;

    public CricketMatch(String teamAName, String teamBName, LocalDate date, LocalTime time){
        this.teamAName = teamAName;
        this.teamBName = teamBName;
        this.date = date;
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTeamBName() {
        return teamBName;
    }

    public String getTeamAName() {
        return teamAName;
    }
    public LocalTime getTime(){
        return time;
    }

}
