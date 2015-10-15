package com.galenframework.java.sample.tests;

import com.galenframework.java.sample.components.GalenTestBase;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.model.LayoutReport;
import com.galenframework.testng.GalenTestNgReportsListener;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class WelcomePageTest extends GalenTestBase {

    public String email_prev_button = "//*[@id=\"preview_bar_link\"]";
    public String preview_setup_button = "//*[@id=\"preview_bar_setup\"]";
    public String turn_lights_off_button = "//*[@id=\"preview_toggle_high_light\"]";
    public String go_button = "//*[@id=\"previewContent\"]/form[1]/ul/li[5]/div/input";
    public String date_txtField = "//*[@id=\"date\"]";
    public String contry_dropMenu = "//*[@id=\"previewCountryCode\"]";




    @Test(dataProvider = "devices")
    public void previewBar_GP(TestDevice device) throws IOException {
        load("preview", "GP", "PRE");
        //For the own screen
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();

        //Vpn Slow
        waitforsec(4);
        LayoutReport layoutReport = new LayoutReport();

        getReport().layout(layoutReport, "title");
        //Checking Button Send by email link
        Assert.assertEquals(checkButtonOneId(email_prev_button), true);
        //Checking Button Preview Setup
        Assert.assertEquals(checkButtonOneId(preview_setup_button), true);
        //Checking Button Turn Lights Off
        Assert.assertEquals(checkButtonOneId(turn_lights_off_button), true);

        //Checking the spec for the component
        checkLayout("/specs/previewBar.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void previewBar_BR(TestDevice device) throws IOException {
        //In the Load need to put http request, brand, and the type of ENV
        load("preview", "BR", "PRE");

        //For the own screen
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();

        //Vpn Slow
        waitforsec(4);

        //Checking Button Send by email link
        Assert.assertEquals(checkButtonOneId(email_prev_button), true);
        //Checking Button Preview Setup
        Assert.assertEquals(checkButtonOneId(preview_setup_button), true);
        //Checking Button Turn Lights Off
        Assert.assertEquals(checkButtonOneId(turn_lights_off_button), true);

        Assert.assertEquals(checkButtonOneId(go_button), true);

        Assert.assertEquals(checkButtonOneId(date_txtField), true);

        //Checking the spec for the component
        checkLayout("/specs/previewBar.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void previewBar_ON(TestDevice device) throws IOException {
        load("preview", "ON", "PRE");
        //For the own screen
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();

        //Vpn Slow
        waitforsec(4);

        //Checking Button Send by email link
        Assert.assertEquals(checkButtonOneId(email_prev_button), true);
        //Checking Button Preview Setup
        Assert.assertEquals(checkButtonOneId(preview_setup_button), true);
        //Checking Button Turn Lights Off
        Assert.assertEquals(checkButtonOneId(turn_lights_off_button), true);

        //Checking the spec for the component
        checkLayout("/specs/previewBar.spec", device.getTags());
    }


    @Test(dataProvider = "devices")
    public void previewBar_AT(TestDevice device) throws IOException {
        load("preview", "AT", "PRE");
        //For the own screen
        if(device.getScreenSize().getWidth()==1366 && device.getScreenSize().getHeight()==768)
            max();

        //Vpn Slow
        waitforsec(4);

        //Checking Button Send by email link
         Assert.assertEquals(checkButtonOneId(email_prev_button), true);
        //Checking Button Preview Setup
        Assert.assertEquals(checkButtonOneId(preview_setup_button), true);
        //Checking Button Turn Lights Off
        Assert.assertEquals(checkButtonOneId(turn_lights_off_button), true);

        //Checking the spec for the component
        checkLayout("/specs/previewBar.spec", device.getTags());
    }

}
