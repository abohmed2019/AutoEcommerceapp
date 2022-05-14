package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_WishlistPage {

private WebDriver driver;
private By productName = By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]");



public P08_WishlistPage(WebDriver driver){
    this.driver = driver;
}

public boolean assert_product(){
    boolean res = driver.findElement(productName).isDisplayed();
    return res;
}





}
