package com.galenframework.java.sample.tests;

import com.galenframework.java.sample.components.GalenTestBase;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.io.IOException;


public class WelcomePageTest extends GalenTestBase {

    public String email_prev_button = "//*[@id=\"preview_bar_link\"]";
    public String preview_setup_button = "//*[@id=\"preview_bar_setup\"]";
    public String turn_lights_off_button = "//*[@id=\"preview_toggle_high_light\"]";
    public double pixelPage = 10.55;


    @Test(dataProvider = "devices")
    public void previewBar_GP(TestDevice device) throws IOException {
        load("preview", "GP", "PRE");
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();
        waitforsec(4);
        //String fontSize = nowSize("#preview_bar_setup", "font-size");
        checkLayout("/specs/previewBar.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void previewBar_BR(TestDevice device) throws IOException {
        //In the Load need to put http request, brand, and the type of ENV
        load("preview", "BR", "PRE");
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();
        waitforsec(4);


        //Checking Button Send by email link
        checkLayoutVsText(getFontPix(email_prev_button), getButtonPix(email_prev_button));
        //Checking Button Preview Setup
        checkLayoutVsText(getFontPix(preview_setup_button), getButtonPix(preview_setup_button));
        //Checking Button Turn Lights Off
        checkLayoutVsText(getFontPix(turn_lights_off_button), getButtonPix(turn_lights_off_button));
        /*double count = ;
        double Hbutton = ;
        double Resta = count - Hbutton;*/
        checkLayout("/specs/previewBar.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void previewBar_ON(TestDevice device) throws IOException {
        load("preview", "ON", "PRE");
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();
        waitforsec(4);
        checkLayout("/specs/previewBar.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void previewBar_AT(TestDevice device) throws IOException {
        load("preview", "AT", "PRE");
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();
        waitforsec(4);
        checkLayout("/specs/previewBar.spec", device.getTags());
    }

}
