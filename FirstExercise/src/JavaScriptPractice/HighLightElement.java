package JavaScriptPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HighLightElement {
    WebDriver driver;
    String url = "http://automationpractice.com/index.php";
    String browser = "chrome";

    @Test
    public void browser(){
    openBrowser(browser);
    }
    public void openBrowser(String browserName){
    if(browserName.equalsIgnoreCase("chrome")){
    System.setProperty("webdriver.chrome.driver","src//driver//chromedriver.exe");
    driver = new ChromeDriver();
    }
    if(browserName.equalsIgnoreCase("fire fox")){
    System.setProperty("webdriver.gecko.driver","src//driver//geckodriver.exe");
    driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get(url);
    highlightingSignIn();

    }
    public void highlightingSignIn(){
    WebElement signIn= driver.findElement(By.cssSelector(".login"));
    higlightSignIn(signIn,driver);
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    drawBorderLine(signIn,driver);
    }
    public void higlightSignIn(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgColor = element.getCssValue("backgroundColor");
        for(int i =0; i<50; i++){
        changeColor("rgb(0,300,0)",element,driver);
        changeColor(bgColor,element,driver);
        }
    }
    public void changeColor(String color, WebElement element, WebDriver driver){
       JavascriptExecutor js = ((JavascriptExecutor) driver);
       js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
    }

    public void drawBorderLine(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border = '3px solid green'",element);
    }
}
