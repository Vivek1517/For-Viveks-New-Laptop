package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class Amazon {
    WebDriver driver;
    String url="https://www.amazon.co.uk/";
    String browser="chrome";
    String enterProduct="toys for toddlers";
    Actions a;
   // WebDriverWait wait= new WebDriverWait(driver, 5);

    public void openBrowser(String browserName){
    if(browserName.equalsIgnoreCase("chrome")){
    System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
    driver = new ChromeDriver();
    }
    if(browserName.equalsIgnoreCase("fire fox")){
    System.setProperty("webdriver.gecko.driver","C://geckodriver//geckodriver.exe");
    driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.get(url);
    }
    public void goToAccountAndSignIn(){
    a = new Actions(driver);
    a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
    }
    public void searchProduct(String product){
    a = new Actions(driver);
    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys(product).build().perform();
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-submit-button")));
    driver.findElement(By.id("nav-search-submit-button")).click();
    Set<String> windows = driver.getWindowHandles();
    Iterator<String> it = windows.iterator();
    String parentWindow = it.next();
    String emptyWindow = it.next();
    String childWindow = it.next();
    driver.switchTo().window(childWindow);
    System.out.println(driver.getTitle());
    driver.switchTo().window(parentWindow);
    System.out.println(driver.getTitle());

    }
//    //reusable method for explicit wait
//    public void waitForElementToClick(By elementBy) {
//    wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
//
//    }
    public void automate(){
    openBrowser(browser);
    goToAccountAndSignIn();
    searchProduct(enterProduct);
    }

    public static void main(String[] args) {
        Amazon run = new Amazon();
        run.automate();
    }
}