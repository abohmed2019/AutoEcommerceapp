package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void toSwitch(String tabName){
        var windows = driver.getWindowHandles();
        windows.forEach(System.out::println);
        for(String window : windows){
            driver.switchTo().window(window);
            if (tabName.equals(driver.getTitle()))
                break;
        }
    }
}
