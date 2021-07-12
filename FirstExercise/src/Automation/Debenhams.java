package Automation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Debenhams {
    String url="https://www.debenhams.com/";
    WebDriver driver;
    static String browser= "chrome";
    Actions a;

    public void openBrowser(String browserName){
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



//        driver.findElement(By.xpath("//*[@class='PrimaryDesktopNavigation']/li")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@class='PrimaryDesktopNavigation']/li/following-sibling::li[4]")).click();
        }
        @Test
        public void goToLingerie(){
        openBrowser(browser);
        a= new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("a[href='/lingerie']"))).build().perform();
        }
        public void searchItem(){
        a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("#search-1"))).click().keyDown(Keys.SHIFT).sendKeys("trousers").build().perform();
        }

    public static void main(String[] args) {
        Debenhams test = new Debenhams();
        test.openBrowser(test.browser);
        test.goToLingerie();
        test.searchItem();
    }
}
