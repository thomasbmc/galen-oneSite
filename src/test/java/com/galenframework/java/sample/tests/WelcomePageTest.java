package com.galenframework.java.sample.tests;

import com.galenframework.java.sample.components.GalenTestBase;


import com.galenframework.java.sample.components.Html.TemplateMaker;
import freemarker.template.TemplateException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.galenframework.java.sample.components.Html.Log;
import com.galenframework.java.sample.components.TextLogWritter;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class WelcomePageTest extends GalenTestBase {
    public static List<Log> logs = new ArrayList<Log>();
    public TemplateMaker output = new TemplateMaker();

    @Test(dataProvider = "devices")
    public void previewBar_BR(TestDevice device) throws IOException, TemplateException {
        //In the Load Methods needs to put the http request, brand, and the type of ENV
        load("preview", "BR", "PRE");

        //Resizing to my screen
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();

        //Waiting 4 Sec because Vpn sucks
        waitforsec(10);


        //Checking button inputs without galen
        //

        //Checking the galen spec for the component
        checkLayout("/specs/previewBar.spec", device.getTags());
        outputMaker(email_prev_button, device.getTags());
    }

    @AfterClass
    public void outputLog() throws IOException {
    TextLogWritter logWritter = new TextLogWritter();
    logWritter.WriteLog(logs);
    }


}
