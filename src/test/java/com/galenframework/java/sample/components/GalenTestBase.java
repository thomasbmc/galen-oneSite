package com.galenframework.java.sample.components;

import com.galenframework.testng.GalenTestNgTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import com.galenframework.testng.GalenTestNgReportsListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;
@Listeners(value = GalenTestNgReportsListener.class)
public abstract class GalenTestBase extends GalenTestNgTestBase implements Environment {

    public FontUtil fontClass = new FontUtil();





    @Override
    public WebDriver createDriver(Object[] args) {
        WebDriver driver = new ChromeDriver();
        if (args.length > 0) {
            if (args[0] != null && args[0] instanceof TestDevice) {
                TestDevice device = (TestDevice)args[0];
                if (device.getScreenSize() != null) {
                    driver.manage().window().setSize(device.getScreenSize());
                }
            }
        }
        return driver;
    }

    public void load(String uri, String brand, String env) {
        if(env=="PRE"){
            if (brand=="GP")
                getDriver().get(ENV_URL_GP_PRE + uri);
            if (brand=="BR")
                getDriver().get(ENV_URL_BR_PRE + uri);
            if (brand=="ON")
                getDriver().get(ENV_URL_ON_PRE + uri);
            if (brand=="AT")
                getDriver().get(ENV_URL_AT_PRE + uri);
        }
        else {
            if (brand=="GP")
                getDriver().get(ENV_URL_GP + uri);
            if (brand=="BR")
                getDriver().get(ENV_URL_BR + uri);
            if (brand=="ON")
                getDriver().get(ENV_URL_ON + uri);
            if (brand=="AT")
                getDriver().get(ENV_URL_AT + uri);
        }


    }

    public void max(){
        getDriver().manage().window().maximize();
    }

    public void waitforsec(long time){
        getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public String transformToString(boolean status){
        String statusString;
        if(status==true)
            return statusString= "Passed";
        else
            return statusString= "Failed";
    }

    public String nowText(String id){
         String found = getDriver().findElement(By.xpath(id)).getAttribute("value");
         return found;
    }

    public String getFontAuto(String id){
        String found = getDriver().findElement(By.xpath(id)).getCssValue("fontSize");
        return found;
    }

    public int fontToInt(String font){
        double fontNumberDouble;
        int fontNumberInt;
        font = font.replaceAll("[^\\d.]", "");
        fontNumberDouble = Double.parseDouble(font);
        fontNumberInt = (int)(Math.round(fontNumberDouble));
        return fontNumberInt;
    }

    public String getFontType(String id){
        String found = getDriver().findElement(By.xpath(id)).getCssValue("fontFamily");
        return found;
    }
    public double getFontPix(String id){
        return fontClass.createWordsTypeFont(nowText(id),   fontClass.createFont("Arial",fontToInt(getFontAuto(id)))  ,true);
    }


    public double getButtonPix(String id){
        int found = getDriver().findElement(By.xpath(id)).getSize().getWidth();
        return found;
    }

    public boolean checkButtonOneId(String id){
        if(getFontPix(id)<=getButtonPix(id))
            return true;
        else
            return false;
        }

    public Log checkInput(String input, List<String> tags){
        boolean status = checkButtonOneId(input);
        Date date = new Date();
        Log test = new Log(input.toString(), transformToString(status),
                ("Size Font: "+getFontPix(input)+" Size Button: "+getButtonPix(input)+" Device: "+tags), date);
        return test;

    }

    @DataProvider(name = "devices")
    public Object [][] devices () {
        return new Object[][] {
                //{new TestDevice("mobile", new Dimension(375, 627), asList("Iphone6"))},
                //{new TestDevice("tablet", new Dimension(1024, 768), asList("ipad"))},
                {new TestDevice("desktop", new Dimension(1366, 768), asList("desktop"))}
        };
    }

    public static class TestDevice {
        private final String name;
        private final Dimension screenSize;
        private final List<String> tags;

        public TestDevice(String name, Dimension screenSize, List<String> tags) {
            this.name = name;
            this.screenSize = screenSize;
            this.tags = tags;
        }

        public String getName() {
            return name;
        }

        public Dimension getScreenSize() {
            return screenSize;
        }

        public List<String> getTags() {
            return tags;
        }


    }
}
