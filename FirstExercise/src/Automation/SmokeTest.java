package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SmokeTest {
    public static WebDriver driver= null;
    public void openChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }
    public void goToSigninPage(){
        WebElement signIn= driver.findElement(By.cssSelector("a[rel='nofollow']"));
        signIn.click();
        waitToLoad(5);
    }
    public void waitToLoad(long seconds){
        driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
    }
    public void logIn(String uname, String pwd){
        WebElement logIn= driver.findElement(By.cssSelector("#email"));
        logIn.sendKeys(uname);
        WebElement password= driver.findElement(By.cssSelector("#passwd"));
        password.sendKeys(pwd);
        WebElement signIn= driver.findElement(By.cssSelector("#SubmitLogin"));
        signIn.click();
        waitToLoad(8);
    }
    public void searchField(String enterProduct){
        //enter a product in search field
        WebElement productSearch= driver.findElement(By.xpath("//input[@id='search_query_top']"));
        productSearch.sendKeys(enterProduct);
        WebElement searchbutton= driver.findElement(By.xpath("//button[@name='submit_search']"));
        searchbutton.click();
        waitToLoad(5);
    }

    public static void main(String[] args) {
        SmokeTest test= new SmokeTest();
        test.openChromeBrowser();
        test.goToSigninPage();
        test.logIn("vicky_sturd@hotmail.com","Vivek123");
        test.searchField("Dresses");
    }
}
