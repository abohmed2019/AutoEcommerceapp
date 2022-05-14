package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_FaceBookPage {

private WebDriver driver;



public P05_FaceBookPage(WebDriver driver){
    this.driver = driver;
}

    public String get_URL(){
       String url = driver.getCurrentUrl().toString();
       return url;
    }



}
