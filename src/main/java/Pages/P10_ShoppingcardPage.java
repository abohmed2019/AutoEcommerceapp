package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_ShoppingcardPage {

private WebDriver driver;
private By productName = By.linkText("Lenovo IdeaCentre 600 All-in-One PC");



public P10_ShoppingcardPage(WebDriver driver){
    this.driver = driver;
}

public boolean assert_product(){
    boolean res = driver.findElement(productName).isDisplayed();
    return res;
}





}
