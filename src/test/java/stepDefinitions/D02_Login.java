package stepDefinitions;

import Pages.P02_LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.P03_HomePage;
import org.testng.asserts.SoftAssert;

public class D02_Login {

    protected P03_HomePage homepage;
    protected P02_LoginPage loginPage;

    @Given("User navigate to the Login page")
    public void user_navigates()
    {
        homepage = new P03_HomePage(Hooks.driver);
        loginPage = homepage.clickLogin();
    }
    //"^User enter \"(.*)\" and \"(.*)\"$"
    @When("User enter {string} and {string}")
    public void user_enter_credentials(String username,String password)
    {
        loginPage.login(username,password);
    }


    @And("User click on Login button")
    public void user_click_register() throws InterruptedException {
        loginPage.click_login();
        Thread.sleep(3000);
    }

    @Then("User can Login successfully")
    public void user_registered()
    {
        SoftAssert soft = new SoftAssert();
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains(expectedUrl));
        soft.assertTrue(loginPage.assert_login());

    }

}
