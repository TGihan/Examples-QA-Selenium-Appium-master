package com.saucelabs.appium;

import static org.junit.Assert.assertEquals;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidTest {

    private AppiumDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File("C:/allapk");
        File app = new File(appDir, "Autotrader.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "4.4.2");
        capabilities.setCapability("udid", "492cd2d9");
//        capabilities.setCapability("browserName", "Chrome");
//        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("appPackage", "com.android.chrome");
//        capabilities.setCapability("appActivity", ".ApiDemos");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void apiDemo(){
//    	driver.get("http://www.kbb.com");
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='MENU']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='HOME']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='View Listings']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Distance Near to Far']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Year New to Old']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='Filter']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Style']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Coupe']")).click();
        driver.navigate().back();
        driver.scrollTo("Fuel Type");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Fuel Type']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Gasoline']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//android.widget.Button[@text='Apply Filters']")).click();
        driver.scrollTo("Gasoline");
        
        driver.findElement(By.xpath("//android.support.v4.view.ViewPager/android.widget.RelativeLayout[1]")).click();
//        
//        assertEquals("Animation", el.getText());
//        el = driver.findElementByClassName("android.widget.TextView");
//        assertEquals("API Demos", el.getText());
//        el = driver.findElement(By.name("App"));
//        el.click();
//        List<WebElement> els = driver.findElementsByClassName("android.widget.TextView");
//        assertEquals("Activity", els.get(2).getText());
    }

}
