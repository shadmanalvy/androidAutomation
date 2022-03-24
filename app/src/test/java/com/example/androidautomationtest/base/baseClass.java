package com.example.androidautomationtest.base;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseClass {

    public AppiumDriver<MobileElement> driver;

    @BeforeTest

    public void Setup() {

        try {

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "emulator-5554");
            //caps.setCapability("automationName", "uiautomator2");
            caps.setCapability("appPackage", "giuseppelg.com.PersonalContacts");
            caps.setCapability("appActivity", "giuseppelg.com.PersonalContacts.MainActivity");
            caps.setCapability("app", "/Users/shadman/Desktop/AndroidAutomationNew/Android-Personal-Contacts-master/app/build/outputs/apk/debug/app-debug.apk");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            caps.setCapability("fullReset", false);
            caps.setCapability("noReset", true);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url,caps);

        }

        catch (Exception exp) {
            System.out.println("Cause is: " +exp.getCause());
            System.out.println("Message: " +exp.getMessage());
            exp.printStackTrace();
        }
    }

 /*   @Test
    public void verifyScreenTitle() throws InterruptedException {

        MobileElement expectedTitle = driver.findElement(By.xpath("//android.widget.TextView[@text='Contacts List']"));
        MobileElement actualTitle = driver.findElement(By.xpath("//android.widget.TextView[@text='Contacts List']"));
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title Verified");

    }
*/

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
