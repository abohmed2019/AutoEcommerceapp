package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class P02_LoginPage {

    private WebDriver driver;
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private By MyaccountTab = By.className("ico-account");



        public P02_LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void login(String email,String pass ){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(pass);
    }
    public void click_login(){
        driver.findElement(loginButton).click();
    }
    public boolean assert_login(){
            boolean result = driver.findElement(MyaccountTab).isDisplayed();
            return result;
        }

}
