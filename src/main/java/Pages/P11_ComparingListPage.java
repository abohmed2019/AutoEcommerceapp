package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_ComparingListPage {

private WebDriver driver;
private By productName = By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");



public P11_ComparingListPage(WebDriver driver){
    this.driver = driver;
}

public boolean assert_product(){
    boolean res = driver.findElement(productName).isDisplayed();
    return res;
}





}
