package com.example.androidautomationtest.base;

import com.example.androidautomationtest.screens.addContactScreen;
import com.example.androidautomationtest.screens.listView;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class listViewTest extends baseClass {

    @Test (priority = 0)
    public void verifyScreenTitle() throws InterruptedException {

        //String expectedTitle = "Contacts List";
        //String actualTitle = driver.getTitle();
        MobileElement expectedTitle = driver.findElement(By.xpath("//android.widget.TextView[@text='Contacts List']"));
        MobileElement actualTitle = driver.findElement(By.xpath("//android.widget.TextView[@text='Contacts List']"));
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title Verified");

    }

    @Test (priority = 1)
    public void TapContact() throws InterruptedException {

       /* listView add = new listView(driver);
        add.pressAddNew();
        System.out.println("Entered Add Contact Screen");
*/

        driver.findElement(By.id("giuseppelg.com.PersonalContacts:id/contactsList"));
      //  new Actions(driver).moveByOffset(951, 1660).click().build().perform();
       // TouchAction action= new TouchAction(driver);
       // action.press(951, 1660).perform();
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(951, 1660)).perform();

        Thread.sleep(5000);
        System.out.println("Entered Add Contact Screen");

    }

    @Test (priority = 2)
    public void addContact() throws InterruptedException {

        //Thread.sleep(2000);
        addContactScreen addC = new addContactScreen(driver);
            addC.WriteName();
        addC.WriteNumber();
        addC.SaveContact();
        System.out.println("Saved Contact");

    }

    @Test (priority = 3)
    public void verifyContact() throws InterruptedException {

        listView search = new listView(driver);
        search.tapSearchContactIcon();
        search.SearchContact();
        Thread.sleep(5000);
        String actualResult = search.getSearchResult();
        Thread.sleep(5000);
        Assert.assertEquals(actualResult, "Alvy");
        System.out.println("Added Contact is verified");

    }
}
