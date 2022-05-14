package Pages;

import org.openqa.selenium.WebDriver;

public class P07_YoutubePage {

private WebDriver driver;



public P07_YoutubePage(WebDriver driver){
    this.driver = driver;
}

    public String get_URL(){
       String url = driver.getCurrentUrl().toString();
       return url;
    }



}
