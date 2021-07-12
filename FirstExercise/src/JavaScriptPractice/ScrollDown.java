package JavaScriptPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ScrollDown {
    WebDriver driver;
    String url = "http://automationpractice.com/index.php";
    String browser = "chrome";
    String navigateTo = "https://www.perfmatrix.com/performance-testing-engineering-training-update/";

    @Test
    public void browser() {
        openBrowser(browser);
    }

    public void openBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src//driver//chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--incognito");
            driver = new ChromeDriver(chromeOptions);
        }
        if (browserName.equalsIgnoreCase("fire fox")) {
            System.setProperty("webdriver.gecko.driver", "src//driver//geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        scrollDownToViewAnELement();
//       clickOnSignIn();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        scrollDown(driver);
//        driver.navigate().to(navigateTo);
//        driver.navigate().back();

    }
    public void clickOnSignIn(){
        WebElement signIn= driver.findElement(By.cssSelector(".login"));
        clickOnElement(signIn,driver);
    }
    public void scrollDownToViewAnELement(){
        WebElement myOrders = driver.findElement(By.xpath("//a[contains(@title,'My orders')]"));
        scrollToViewElement(myOrders,driver);
    }
    public void scrollDown(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    // using javascript to click on element
    public void clickOnElement(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].click();",element);
    }
    // scroll down to view an element
    public void scrollToViewElement(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        js.executeScript("arguments[0].click();",element);
    }
}
