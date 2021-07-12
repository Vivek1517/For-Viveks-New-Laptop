package HomeInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplementTestPractice implements TestPractice, TestPractice1 {
    WebDriver driver;

  //  ImplementTestPractice test = new ImplementTestPractice();

    @Override
    public void openBrowser(String browserName) {
        if(browserName.equalsIgnoreCase("chrome"))
        {
        System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        }
        if(browserName.equalsIgnoreCase("fire Fox"))
        {
         System.setProperty("webdriver.gecko.driver","C://geckodriver//geckodriver.exe");
         driver = new FirefoxDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        waitTime(2);
//        test.openBrowser(browser);
//        test.waitTime(2);
//        test.clickSignIn();
//        test.waitTime(2);
//        test.logIn(userName,passWord);
//        test.searchProduct(productSearch);
//        driver.close();
    }

    @Override
    public void clickSignIn() {
    driver.findElement(By.cssSelector("a[title='Log in to your customer account']")).click();
    waitTime(2);
    }

    @Override
    public void logIn(String uName, String pwd) {
    driver.findElement(By.cssSelector("input[id='email']")).sendKeys(userName);
    driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(passWord);
    driver.findElement(By.id("SubmitLogin")).click();
    waitTime(2);
    }

    @Override
    public void searchProduct(String product) {
    driver.findElement(By.id("search_query_top")).sendKeys(productSearch);
        List<WebElement> options = driver.findElements(By.className("ac_odd ac_over"));
        for(WebElement option:options){
            if(option.getText().equalsIgnoreCase(productSearch)){
                option.click();
            }
        }
    driver.findElement(By.cssSelector("button[name*='submit']")).click();
        waitTime(2);

    }

    @Override
    public void waitTime(long seconds) {
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
    driver.close();
    }


    @Override
    public void createAccount() {

    }


}
