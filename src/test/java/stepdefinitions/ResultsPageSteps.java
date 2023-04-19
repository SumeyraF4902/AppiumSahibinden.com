package stepdefinitions;

import io.cucumber.java.en.Then;

import pages.ResultsPage;
import utils.DriverManager;

public class ResultsPageSteps {
    ResultsPage resultsPage=new ResultsPage(DriverManager.getDriver());
    @Then("user should see Results on Result Page")
    public void userShouldSeeResultsOnResultPage() {
        resultsPage.checkShareIcon();
    }


}