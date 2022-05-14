package stepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utility.WindowManager;

public class D06_ConfirmLinks {

    protected P03_HomePage homePage;
    protected P05_FaceBookPage faceBookPage;
    protected P06_TwitterPage twitterPage;
    protected P07_YoutubePage youtubePage;

    @When("User click on facebook icon")
    public void user_click_FB() throws InterruptedException {
        homePage = new P03_HomePage(Hooks.driver);
        faceBookPage = homePage.click_FB();
        Thread.sleep(3000);
    }
    public WindowManager getWindowManager(){
        return new WindowManager(Hooks.driver);
    }
    @Then("facebook page should be opened")
    public void assert_FB()
    {
        String expectedURL = "https://www.facebook.com/nopCommerce";
        getWindowManager().toSwitch("NopCommerce | Facebook");
        String actualURL = faceBookPage.get_URL();
        System.out.println("actualUrl : " + actualURL);
        Assert.assertTrue(actualURL.contains(expectedURL));
    }
   @When("User click on twitter icon")
    public void user_click_twitter() throws InterruptedException {
        homePage = new P03_HomePage(Hooks.driver);
        twitterPage = homePage.click_twitter();
        Thread.sleep(3000);
   }
    @Then("twitter page should be opened")
    public void twitter()
    {
        String expectedURL = "https://twitter.com/nopCommerce";
        getWindowManager().toSwitch("nopCommerce (@nopCommerce) / Twitter");
        String actualURL = Hooks.driver.getCurrentUrl();
        System.out.println("actualUrl : " + actualURL);
        Assert.assertTrue(actualURL.contains(expectedURL));
    }
    @When("User click on youtube icon")
    public void user_click_youtube() throws InterruptedException {
        homePage = new P03_HomePage(Hooks.driver);
        youtubePage = homePage.click_youtube();
        Thread.sleep(3000);
    }
    @Then("youtube page should be opened")
    public void assert_youtube()
    {
        String expectedURL = "https://www.youtube.com/user/nopCommerce";
        getWindowManager().toSwitch("nopCommerce - YouTube");
        String actualURL = Hooks.driver.getCurrentUrl();
        System.out.println("actualUrl : " + actualURL);
        Assert.assertTrue(actualURL.contains(expectedURL));
    }

}
