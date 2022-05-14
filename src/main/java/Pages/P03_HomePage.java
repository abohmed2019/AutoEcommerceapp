package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class P03_HomePage {

    private WebDriver driver;
    private By registerTab = By.className("ico-register");
    private By loginTab = By.className("ico-login");
    private By currencyList = By.name("customerCurrency");
    private By actaulPrice = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span");
    private By searchBox = By.id("small-searchterms");
    private By searchButton = By.cssSelector("button[type =\"submit\"]");
    private By fbIcon = By.cssSelector("a[href =\"http://www.facebook.com/nopCommerce\"]");
    private By twitterIcon = By.cssSelector("a[href = \"https://twitter.com/nopCommerce\"]");
    private By youtubeIcon = By.cssSelector("a[href = \"http://www.youtube.com/user/nopCommerce\"]");
    private By product = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]");
    private By WishListTab = By.className("ico-wishlist");


    public P03_HomePage(WebDriver driver){
        this.driver = driver;
    }

    public P01_RegisterPage clickRegister(){
        driver.findElement(registerTab).click();
        return new P01_RegisterPage(driver);
    }
    public P02_LoginPage clickLogin(){
        driver.findElement(loginTab).click();
        return new P02_LoginPage(driver);
    }
    public void selectCurrency(){
        Select select = new Select(driver.findElement(currencyList));
        select.selectByIndex(1);
    }
    public String assertCurrency(){
        String price = driver.findElement(actaulPrice).getText();
        return price;
    }
    public P09_SubcategoryPage hover(){
        WebElement mainCategory = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainCategory);
        WebElement subcategory = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
        actions.moveToElement(subcategory);
        actions.click().build().perform();
        return new P09_SubcategoryPage(driver);
    }
    public void searchBYname(){
        driver.findElement(searchBox).sendKeys("Nokia Lumia 1020");
        driver.findElement(searchButton).click();
    }
    public void searchBYSkU(){
        driver.findElement(searchBox).sendKeys("N_1020_LU");
        driver.findElement(searchButton).click();
    }
    public P04_SearchPage clickSearch(){
        driver.findElement(searchButton).click();
        return new  P04_SearchPage(driver);
    }
    public P05_FaceBookPage click_FB(){
        driver.findElement(fbIcon).click();
        return new P05_FaceBookPage(driver);
    }

    public P06_TwitterPage click_twitter(){
        driver.findElement(twitterIcon).click();
        return new P06_TwitterPage(driver);
    }
    public P07_YoutubePage click_youtube(){
        driver.findElement(youtubeIcon).click();
        return new P07_YoutubePage(driver);
    }

    public void click_product_heartIcon(){
        driver.findElement(product).click();
    }
    public P08_WishlistPage click_wishlist(){
        driver.findElement(WishListTab).click();
        return new P08_WishlistPage(driver);
    }

}
