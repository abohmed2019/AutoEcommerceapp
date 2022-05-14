package stepDefinitions;

import Pages.P03_HomePage;
import Pages.P09_SubcategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D04_HoverCategories {

    protected P03_HomePage homePage;
    protected P09_SubcategoryPage subcategoryPage;


    @When("User select any subcategory")
    public void user_hover_category() throws InterruptedException {
        homePage = new P03_HomePage(Hooks.driver);
        subcategoryPage = homePage.hover();
        Thread.sleep(1000);
    }
    @Then("new page for selected subcategory should open")
    public void assert_Euro()
    {

    }

}
