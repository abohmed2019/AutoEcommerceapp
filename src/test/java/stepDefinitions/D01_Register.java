package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import Pages.P03_HomePage;

public class D01_Register {



    protected P03_HomePage homePage;
    protected P01_RegisterPage RegisterPage;


    @Given("User navigate to the register page")
    public void user_navigates()
    {
        homePage = new P03_HomePage(Hooks.driver);
        RegisterPage = new P01_RegisterPage(Hooks.driver);
        RegisterPage = homePage.clickRegister();
    }

    @When("User enter all the valid data")
    public void user_enter_data()
    {
        RegisterPage.registerWithValidData();
    }

    @And("User click on Register button")
    public void user_click_register() throws InterruptedException {
        RegisterPage.submitRegister();
        Thread.sleep(3000);
    }

    @Then("User can register successfully")
    public void user_registered()
    {
        RegisterPage.assert_registration();
    }

}
