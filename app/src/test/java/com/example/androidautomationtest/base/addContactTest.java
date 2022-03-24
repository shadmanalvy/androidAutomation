package com.example.androidautomationtest.base;

import com.example.androidautomationtest.screens.addContactScreen;

import org.testng.annotations.Test;

public class addContactTest extends baseClass {

    @Test
    public void addContact() throws InterruptedException {

        //Thread.sleep(2000);
        addContactScreen addC = new addContactScreen(driver);
        addC.WriteName();
        addC.WriteNumber();
        addC.SaveContact();

    }
}
