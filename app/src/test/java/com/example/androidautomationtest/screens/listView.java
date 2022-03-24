package com.example.androidautomationtest.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class listView {

    public listView(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        //PageFactory.initElements(driver, this);
    }

   /* @AndroidFindBy(id="giuseppelg.com.PersonalContacts:id/contactsList")

    MobileElement pressAddNew;

    public void pressAddNew(MobileDriver driver) {

       // TouchAction touchAction = new TouchAction((PerformsTouchActions) pressAddNew);
       // touchAction.tap(PointOption.point(951, 1660)).perform();

        new Actions(driver).moveByOffset(951, 1660).click().build().perform();

    }
*/
    @AndroidFindBy(id="giuseppelg.com.PersonalContacts:id/ivSearchIcon")

    MobileElement SearchContactIcon;

    public void tapSearchContactIcon() {
        SearchContactIcon.click();
        System.out.println("Clicked Search Contact Icon");
    }

    @AndroidFindBy (id="giuseppelg.com.PersonalContacts:id/etSearchContacts")

    MobileElement SearchContactName;

    public void SearchContact() {
        SearchContactName.sendKeys("Alvy");
        System.out.println("Searched Contact Alvy");
    }

   // @AndroidFindBy (id="=giuseppelg.com.PersonalContacts:id/contactName")
   @AndroidFindBy (xpath="//android.widget.TextView[@text='Alvy']")
    MobileElement SearchResult;

    public String getSearchResult() {

        String actualResult = SearchResult.getText();
        return actualResult;
    }
}
