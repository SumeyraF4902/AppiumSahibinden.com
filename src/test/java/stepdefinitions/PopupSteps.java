package stepdefinitions;


import io.cucumber.java.en.When;
import pages.PopupPage;

import utils.DriverManager;

public class PopupSteps {

PopupPage popupPage=new PopupPage(DriverManager.getDriver());



    @When("taps {string} button on Popup")
    public void tapsButtonOnPopup(String button) {
        popupPage.clickButton(button);

    }

    @When("taps {string} buttonn on Popup")
    public void tapsButtonnOnPopup(String arg0) {
        popupPage.locasyonButton(arg0);
    }
}