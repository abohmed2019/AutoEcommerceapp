package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;


public class P01_RegisterPage {

    private WebDriver driver;

    private By maleButtonBox = By.id("gender-male");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By day = By.name("DateOfBirthDay");
    private By numOfDay = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[9]");
    private By month = By.name("DateOfBirthMonth");
    private By numOfMonth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[9]");
    private By year = By.name("DateOfBirthYear");
    private By numOfYear = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[87]");
    private By mail = By.id("Email");
    private By company = By.id("Company");
    private By password = By.id("Password");
    private By confirmedPassword = By.id("ConfirmPassword");
    private By registerSubmit = By.id("register-button");



    public P01_RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    public void registerWithValidData(){
        driver.findElement(maleButtonBox).click();
        driver.findElement(firstName).sendKeys("Ahmed");
        driver.findElement(lastName).sendKeys("Sami");
        driver.findElement(day).click();
        driver.findElement(numOfDay).click();
        driver.findElement(month).click();
        driver.findElement(numOfMonth).click();
        driver.findElement(year).click();
        driver.findElement(numOfYear).click();
        driver.findElement(mail).sendKeys("de286a1c6e47@tmail.ws");
        driver.findElement(company).sendKeys("oppo");
        driver.findElement(password).sendKeys("Anaahmedsami");
        driver.findElement(confirmedPassword).sendKeys("Anaahmedsami");
    }
    public void submitRegister(){
        driver.findElement(registerSubmit).click();
    }
    public void assert_registration() {
        String expectedResults = "Your registration completed";
        String actualResults = driver.findElement(By.className("result")).getText();
        Assert.assertTrue(actualResults.contains(expectedResults));
        System.out.println("actualResults :" + actualResults);
    }

}
