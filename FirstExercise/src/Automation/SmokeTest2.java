package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SmokeTest2 {
    String webSite="http://automationpractice.com/index.php";
    String userName="vicky_sturd@hotmail.com";
    String passWord="Vivek123";
    String selectBrowser="firefox";
    WebDriver driver;
    String searchItem="dresses";
    WebElement element;
    //opening firefox browser with website http://automationpractice.com/index.php
    public void openBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
            driver= new ChromeDriver();
        }
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C://geckodriver//geckodriver.exe");
            driver= new FirefoxDriver();
        }
        driver.get(webSite);
    }
    //delaying time
    public void waitTime(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
// click on the sign in link to go to the log in page
    public void sigIn(){
       element= driver.findElement(By.cssSelector("a[class='login']"));
        element.click();
        waitTime(2);
    }
// input valid username & password to log in
public void logIn(String uname, String pwd){
        element= driver.findElement(By.cssSelector("input[id='email']"));
        element.sendKeys(uname);
        element= driver.findElement(By.cssSelector("input[id='passwd']"));
        element.sendKeys(pwd);
        element= driver.findElement(By.cssSelector("#SubmitLogin"));
        element.click();
        waitTime(3);
}

    public static void main(String[] args) {
        SmokeTest2 smoke= new SmokeTest2();
        smoke.openBrowser(smoke.selectBrowser);
        smoke.sigIn();
        smoke.logIn(smoke.userName, smoke.passWord);
    }
}
