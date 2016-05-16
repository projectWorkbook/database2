package com.example.uksz.database.models;

import java.io.Serializable;

/**
 * Created by Łukasz Gielec on 12.04.2016.
 */
public class Task implements Serializable {

    private String mName;
    private int mID;
    private float mDuration ;
    private String mEndDate;
    private String mEndTime;
    private int mProgress;
    private int mState;
    private String mInfo;


    public Task() {
    }

    public Task(String name, int id, float duration, String endDate, String endTime, String info) {
        this.mName = name;
        this.mID = id;
        this.mDuration = duration;
        this.mEndDate = endDate;
        this.mEndTime = endTime;
        this.mInfo = info;
    }

    public void setName(String name){
        this.mName = name;
    }
    public String getName(){
        return this.mName;
    }

    public void setId(int id){
        this.mID = id;
    }
    public int getId(){
        return this.mID;
    }

    public void setDuration(float duration){
        this.mDuration = duration;
    }
    public float getDuration(){
        return this.mDuration;
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

    public void setProgress(int progress){
        this.mProgress = progress;
    }
    public int getProgress(){return this.mProgress;}

    public void setState(int state){
        this.mState = state;
    }
    public int getState(){return this.mState;}

    public void setInfo(String info){
        this.mInfo = info;
    }
    public String getInfo(){return this.mInfo;}

    public String toString(){
        return "ID: "+this.mID +"\n"
                +"Name: "+this.mName +"\n"
                +"Duration: "+this.mDuration +"\n"
                +"End Date: "+this.mEndDate +"\n"
                +"End Time: "+this.mEndTime +"\n"
                +"Progress: "+this.mProgress +"\n"
                +"State: "+this.mState+"\n"
                +"Info: "+this.mInfo;
    }

}
