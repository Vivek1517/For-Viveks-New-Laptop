package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TravelPortal {
    String webSite="https://rahulshettyacademy.com/dropdownsPractise/";
    String browserName="firefox";
    WebDriver driver;
    WebDriver driver1;
    //opening browser for the website:https://rahulshettyacademy.com/dropdownsPractise/
    public void openBrowser(String selectBrowser){
        if(selectBrowser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
            driver= new ChromeDriver();
        }
        if(selectBrowser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C://geckodriver//geckodriver.exe");
            driver = new FirefoxDriver();
        }
        if(selectBrowser.equalsIgnoreCase("internet explorer")){
            System.setProperty("webdriver.ie.driver","C://IE//IEDriverServer.exe");
            driver= new InternetExplorerDriver();
        }
        driver.get(webSite);
        waitTime(2);
        driver.manage().window().maximize();
    }

    public void waitTime(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    //Selecting 5 adults from the passenger dropdown list
    public void selectinAdultPassengers(){
        WebElement selectAdultPassenger= driver.findElement(By.xpath("//*[@id='divpaxinfo']"));
        selectAdultPassenger.click();
        waitTime(3);
        WebElement addingPassenger= driver.findElement(By.xpath("//*[@id='hrefIncAdt']"));

        for(int i=0; i<4; i++){
        addingPassenger.click();
        }
        waitTime(3);

        WebElement clickDone= driver.findElement(By.xpath("//*[@id='btnclosepaxoption']"));
        clickDone.click();
    }
    public void explicitWait(WebDriver driver1, WebElement element, int timeOut){
        new WebDriverWait(driver1, timeOut).until(ExpectedConditions.visibilityOf(element));

    }
    // Selecting currency from the dropdown list
    public void selectCurrency(){
        WebElement staticDropDown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown= new Select(staticDropDown);
        //waitTime(2);
        dropDown.selectByIndex(3);
        //explicitWait(driver,staticDropDown,3);

    }
    //select destination from, to from the dropwdon list
    public void chooseDestination(){
        WebElement dropDownFrom= driver.findElement(By.xpath("//input[contains(@id,'originStation')]"));
        dropDownFrom.click();
        waitTime(2);
        WebElement selectFrom= driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']"));
        selectFrom.click();
        WebElement selectTo= driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']"));
        selectTo.click();
        waitTime(2);
    }
    //typing country name inside search field
    public void selectCountry(){
    WebElement typeCountry= driver.findElement(By.cssSelector("input[id='autosuggest']"));
    typeCountry.sendKeys("ind");
    waitTime(3);
    List<WebElement> option= driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
    for(WebElement options:option){
        if(options.getText().equalsIgnoreCase("India")){
            options.click();
            break;
        }
    }
    waitTime(3);
    }
//    public void action(){
//        Actions action = new Actions(driver.findElement());
//    }
    public static void main(String[] args) {
        TravelPortal portal= new TravelPortal();
        portal.openBrowser(portal.browserName);
        portal.selectCurrency();
        portal.selectinAdultPassengers();
        portal.chooseDestination();
        portal.selectCountry();

    }
}
