package stepDefinitions;

import Pages.P03_HomePage;
import Pages.P09_SubcategoryPage;
import Pages.P10_ShoppingcardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class D09_AddToShoppingcard {

    protected P03_HomePage homePage;
    protected P09_SubcategoryPage subcategoryPage;
    protected P10_ShoppingcardPage shoppingcardPage;

    @When("User click on 'add to cart'")
    public void user_addTo_card() throws InterruptedException{
        subcategoryPage = new P09_SubcategoryPage(Hooks.driver);
        subcategoryPage.add_to_card();
        Thread.sleep(3000);
    }

    @Then("User can see the selected product in the shopping cart")
    public void assert_addItem()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/cart");
        shoppingcardPage = new P10_ShoppingcardPage(Hooks.driver);
        boolean res = shoppingcardPage.assert_product();
        Assert.assertTrue(res);
    }


}
