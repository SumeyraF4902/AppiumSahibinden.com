package stepdefinitions;

import io.cucumber.java.en.When;
import pages.CategoriesPage;

import utils.DriverManager;

public class CatagoriesPageSteps {
    CategoriesPage categoriesPage=new CategoriesPage(DriverManager.getDriver());
    @When("user taps {string} on Categories Page")
    public void userTapsOnCategoriesPage(String tab) {
        categoriesPage.clickTab(tab);
    }


    @When("user taps {string} on Categoriess Page")
    public void userTapsOnCategoriessPage(String tab) {
        categoriesPage.clickTab(tab);
    }
}