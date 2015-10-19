package com.galenframework.java.sample.components.Html;




/**
 * Created by tmphillips on 16-10-2015.
 */
public class Log {
    public String title;
    public String type;
    public String input;
    public String status;
    public String descryption;
    public String date;

    public Log(){}

    public Log(String title, String type, String input, String status, String descryption, String date){
        this.title = title;
        this.type = type;
        this.input = input;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

