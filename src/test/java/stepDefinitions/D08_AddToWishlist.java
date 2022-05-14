package stepDefinitions;

import Pages.P03_HomePage;
import Pages.P08_WishlistPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class D08_AddToWishlist {

    protected P03_HomePage homePage;
    protected P08_WishlistPage wishlistPage;

    @When("User click on the heart icon below the product")
    public void user_click_hearticon() throws InterruptedException{
        homePage = new P03_HomePage(Hooks.driver);
        homePage.click_product_heartIcon();
        Thread.sleep(3000);
    }

    @Then("User can see the selected product in the wishlist")
    public void assert_wishlist()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/wishlist");
        wishlistPage = new P08_WishlistPage(Hooks.driver);
        boolean res = wishlistPage.assert_product();
        Assert.assertTrue(res);
    }


}
