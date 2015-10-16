package com.galenframework.java.sample.tests;

import com.galenframework.java.sample.components.GalenTestBase;



import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.galenframework.java.sample.components.Log;
import com.galenframework.java.sample.components.TextLogWritter;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class WelcomePageTest extends GalenTestBase {
    public static List<Log> logs = new ArrayList<Log>();

    @Test(dataProvider = "devices")
    public void previewBar_BR(TestDevice device) throws IOException {
        //In the Load Methods needs to put the http request, brand, and the type of ENV
        load("preview", "BR", "PRE");

        //Resizing to my screen
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();

        //Waiting 4 Sec because Vpn sucks
        waitforsec(4);


        //Checking button inputs without galen
        logs.add(checkInput(email_prev_button, device.getTags()));
        logs.add(checkInput(preview_setup_button, device.getTags()));
        logs.add(checkInput(turn_lights_off_button, device.getTags()));
        logs.add(checkInput(go_button, device.getTags()));
        logs.add(checkInput(contry_dropMenu, device.getTags()));
        logs.add(checkInput(date_txtField, device.getTags()));
        //Checking the galen spec for the component
        checkLayout("/specs/previewBar.spec", device.getTags());

    }

    @AfterClass
    public void outputLog() throws IOException {
    TextLogWritter logWritter = new TextLogWritter();
    logWritter.WriteLog(logs);
    }


}
