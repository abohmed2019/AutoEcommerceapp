package Pages;

import org.openqa.selenium.WebDriver;

public class P06_TwitterPage {

private WebDriver driver;



public P06_TwitterPage(WebDriver driver){
    this.driver = driver;
}

    public String get_URL(){
       String url = driver.getCurrentUrl().toString();
       return url;
    }



}
