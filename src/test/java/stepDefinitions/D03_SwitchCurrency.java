package stepDefinitions;

import Pages.P03_HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class D03_SwitchCurrency {

    protected P03_HomePage homePage;

    @When("User Select “Euro” from currency dropdown list")
    public void user_select_Euro() throws InterruptedException{
        homePage = new P03_HomePage(Hooks.driver);
        homePage.selectCurrency();
        Thread.sleep(2000);
    }

    @Then("User can see the prices with the new selected currency")
    public void assert_Euro()
    {
        String expectedResults = "€";
        String actualResults = homePage.assertCurrency();
        Assert.assertTrue(actualResults.contains(expectedResults));
        System.out.println("actualResults " + actualResults);
    }


}
