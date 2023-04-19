package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {
    HomePage homePage=new HomePage(DriverManager.getDriver());

    @Given("user should see the home page")
    public void userShouldSeeTheHomePage() {
        homePage.checkLoginLogo();
    }


    @When("user taps {string} on Home Page")
    public void userTapsOnHomePage(String tab) {
        homePage.clickTab(tab);
    }
}