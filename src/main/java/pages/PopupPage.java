package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class PopupPage {

    ElementHelper elementHelper;


    By buttons=By.className("android.widget.Button");
    By locasyonBtn=By.id("com.android.permissioncontroller:id/permission_deny_button");

    public PopupPage(WebDriver driver) {

        this.elementHelper = new ElementHelper(driver);
    }


    public void clickButton(String button) {

        elementHelper.clickElementWithText(buttons,button);

    }
    public void locasyonButton(String button){
        elementHelper.clickElementWithText(locasyonBtn,button);

    }
}
