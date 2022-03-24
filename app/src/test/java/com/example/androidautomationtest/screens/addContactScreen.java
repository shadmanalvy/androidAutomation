package com.example.androidautomationtest.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class addContactScreen extends listView {

    public addContactScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id="giuseppelg.com.PersonalContacts:id/etContactName")
    MobileElement Name;


    public void WriteName() {
        Name.sendKeys("Alvy");
        System.out.println("Name Added");
    }

    @AndroidFindBy(id="giuseppelg.com.PersonalContacts:id/etContactPhone")
    MobileElement Number;


    public void WriteNumber() {
        Number.sendKeys("01711223344");
        System.out.println("Number Added");
    }

    @AndroidFindBy(id="giuseppelg.com.PersonalContacts:id/ivCheckMark")
    MobileElement Check;


    public void SaveContact() {
        Check.click();
        System.out.println("Contact Saved");
    }
}
