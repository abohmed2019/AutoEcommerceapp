package stepDefinitions;

import Pages.P03_HomePage;
import Pages.P09_SubcategoryPage;
import Pages.P10_ShoppingcardPage;
import Pages.P11_ComparingListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class D10_AddToComparingList {

    protected P03_HomePage homePage;
    protected P09_SubcategoryPage subcategoryPage;
    protected P11_ComparingListPage comparingListPage;

    @When("User click on 'add to comparing list icon'")
    public void user_addTo_card() throws InterruptedException{
        subcategoryPage = new P09_SubcategoryPage(Hooks.driver);
        subcategoryPage.add_to_compareList();
        Thread.sleep(3000);
    }

    @Then("User can see the selected product in the comparing list")
    public void assert_addItem()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
        comparingListPage = new P11_ComparingListPage(Hooks.driver);
        boolean res = comparingListPage.assert_product();
        Assert.assertTrue(res);
    }


}
