package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class P09_SubcategoryPage {

    private WebDriver driver;
    private By product3 = By.xpath("(//button[contains ( @class,'product-box-add-to-cart-button') ])[3]");
    private By product2 = By.xpath("(//button[contains ( @class,'add-to-compare-list-button') ])[2]");



    public P09_SubcategoryPage(WebDriver driver){
    this.driver = driver;
}
    public void add_to_card(){
        driver.findElement(product3).click();
    }
    public void add_to_compareList(){
            driver.findElement(product2).click();
    }


}
