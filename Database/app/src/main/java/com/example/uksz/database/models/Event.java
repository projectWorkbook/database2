package com.example.uksz.database.models;

import java.io.Serializable;

/**
 * Created by Łukasz Gielec on 12.04.2016.
 */
public class Event implements Serializable {

    private String mName;
    private int mID = 0;
    private String mPlace;
    private String mStartDate;
    private String mStartTime;
    private String mEndDate;
    private String mEndTime;
    private String mInfo;


    public Event() {
    }
    public Event(String name, String place, String startDate, String startTime, String endDate,String endTime, String info) {
        this.mName = name;
        this.mPlace = place;
        this.mInfo = info;

        this.mStartDate = startDate;
        this.mStartTime = startTime;
        this.mEndTime = endTime;
        this.mEndDate = endDate;
    }

    public void setName(String mName){
        this.mName = mName;
    }
    public String getName(){
        return this.mName;
    }

    public void setId(int ID){
        this.mID = ID;
    }
    public int getId(){
        return this.mID;
    }

    public void setStartDate(String date){
            this.mStartDate = date;
    }
    public String getStartDate(){
        return this.mStartDate;
    }

    public void setStartTime(String time){
            this.mStartTime = time;
    }
    public String getStartTime(){
        return this.mStartTime;
    }

    public void setEndDate(String date){
            this.mEndDate = date;
    }
    public String getEndDate(){
        return this.mEndDate;
    }

    public void setEndTime(String time){
            this.mEndTime = time;
    }
    public String getEndTime(){
        return this.mEndTime;
    }

    public void setPlace(String mPlace){
        this.mPlace = mPlace;
    }
    public String getPlace(){return this.mPlace;}


    public void setInfo(String info){
        this.mInfo = info;
    }
    public String getInfo(){return this.mInfo;}

    public String toString(){
        return "ID: "+this.mID +"\n"
                +"Name: "+this.mName +"\n"
                +"Place: "+this.mPlace +"\n"
                +"Start Date: "+this.mStartDate +"\n"
                +"Start Time: "+this.mStartTime +"\n"
                +"End Date: "+this.mEndDate +"\n"
                +"End Time: "+this.mEndTime +"\n"
                +"Info: "+this.mInfo;

    }

}
