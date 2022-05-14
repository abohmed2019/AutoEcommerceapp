package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_SearchPage {

private WebDriver driver;

private By imgLumia = By.cssSelector("a[href = \"/nokia-lumia-1020\"]");


public P04_SearchPage(WebDriver driver){
    this.driver = driver;
}

    public boolean assert_search(){
        boolean result = driver.findElement(imgLumia).isDisplayed();
        return result;
    }
    public void Alert_clickOnOk(){
        driver.switchTo().alert().accept();
    }



}
