package stepDefinitions;

import Pages.P03_HomePage;
import Pages.P04_SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class D05_Search {

    protected P03_HomePage homePage;
    protected P04_SearchPage searchpage;

    @When("User search for specific product with name")
    public void user_search_product(){
        homePage = new P03_HomePage(Hooks.driver);
        homePage.searchBYname();

    }
    @When("User search for specific product with SKU")
    public void user_search_product_SKU(){
        homePage = new P03_HomePage(Hooks.driver);
        homePage.searchBYSkU();
    }
    @And("User click on the search button")
    public void user_click_subcategory() throws InterruptedException{
        searchpage = homePage.clickSearch();
        searchpage.Alert_clickOnOk();
        Thread.sleep(2000);
    }

    @Then("User can found the product easily")
    public void assert_Euro()
    {
        boolean res = searchpage.assert_search();
        Assert.assertTrue(res);
    }

}
