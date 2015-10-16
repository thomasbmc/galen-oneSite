package com.galenframework.java.sample.components;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tmphillips on 16-10-2015.
 */
public class Log {
    public String title;
    public String status;
    public String descryption;
    public Date date;

    public Log(){}

    public Log(String title, String status, String descryption, Date date){
        this.title = title;
        this.status = status;
        this.descryption = descryption;
        this.date = date;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

