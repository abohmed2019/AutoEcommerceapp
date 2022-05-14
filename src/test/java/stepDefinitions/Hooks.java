package stepDefinitions;

import Pages.P02_LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.P03_HomePage;
import Pages.P01_RegisterPage;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
    protected P03_HomePage homePage;
    protected P01_RegisterPage RegisterPage;
    protected P02_LoginPage loginPage;


    @Before
    public static void open_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // 2- declare the driver(mouse&keyboard)
        driver = new ChromeDriver();
        // 3- navigate to the URL
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

        //homePage = new P03_HomePage(driver);
        /*RegisterPage = new P01_RegisterPage(driver);
        loginPage = new P02_LoginPage(driver);*/
    }
    @After
    public static void close_browser(){
        driver.quit();
    }
}
