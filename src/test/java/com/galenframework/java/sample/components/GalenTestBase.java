package com.galenframework.java.sample.components;

import com.galenframework.testng.GalenTestNgTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import com.galenframework.testng.GalenTestNgReportsListener;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.galenframework.java.sample.components.FontUtil;

import static java.util.Arrays.asList;
@Listeners(value = GalenTestNgReportsListener.class)
public abstract class GalenTestBase extends GalenTestNgTestBase {

    public FontUtil fontClass = new FontUtil();
    //Preview Environment
    private static final String ENV_URL_GP_PRE = "http://www.gol.wip.vdev.gidapps.com/";
    private static final String ENV_URL_BR_PRE = "http://www.brol.wip.vdev.gidapps.com/";
    private static final String ENV_URL_ON_PRE = "http://www.onol.wip.vdev.gidapps.com/";
    private static final String ENV_URL_AT_PRE = "http://www.atol.wip.vdev.gidapps.com/";
    //VDEV Environment
    private static final String ENV_URL_GP = "http://www.vdev.gidgol.com/";
    private static final String ENV_URL_BR = "http://www.brol.vdev.gidgol.com/";
    private static final String ENV_URL_ON = "http://www.onol.vdev.gidgol.com/";
    private static final String ENV_URL_AT = "http://www.atol.vdev.gidgol.com/";


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

    public String nowText(String id){
         String found = getDriver().findElement(By.xpath(id)).getAttribute("value");
         return found;
    }

    public String getFontAuto(String id){
        String found = getDriver().findElement(By.xpath(id)).getCssValue("fontSize");
        return found;
    }

    public int fontToInt(String font){
        int fontNumber;
        font = font.replaceAll("[^\\d.]", "");
        fontNumber = Integer.parseInt(font);
        return fontNumber;
    }

    public String nowFontName(String id){
        String found = getDriver().findElement(By.xpath(id)).getCssValue("value");
        return found;
    }
    public double getFontPix(String id){
        return fontClass.createWordsTypeFont(nowText(id),   fontClass.createFont("Arial",1,fontToInt(getFontAuto(id)))  ,true);
    }


    public double getButtonPix(String id){
        int found = getDriver().findElement(By.xpath(id)).getSize().getWidth();
        return found;
    }



    public boolean checkLayoutVsText(double textSize, double butonSize){
        if(textSize<=butonSize)
            return true;
        else
            return false;

    }
    @DataProvider(name = "devices")
    public Object [][] devices () {
        return new Object[][] {
                //{new TestDevice("mobile", new Dimension(450, 800), asList("mobile"))},
                {new TestDevice("tablet", new Dimension(1024, 768), asList("ipad"))},
                //{new TestDevice("desktop", new Dimension(1366, 768), asList("desktop"))}
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
