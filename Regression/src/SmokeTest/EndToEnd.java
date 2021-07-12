package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EndToEnd {
    WebDriver driver;
    String url="https://rahulshettyacademy.com/dropdownsPractise/";
    String browser="chrome";
    static String currencies="USD";
    static int noOfPassengers= 8;

//open browser with the given url
public void openBrowser(String browserName){
    if(browserName.equalsIgnoreCase("chrome"))
    {System.setProperty("webdriver.chrome.driver","src//Driver//chromedriver.exe");
     driver = new ChromeDriver();
    }
    if(browserName.equalsIgnoreCase("fire fox"))
    {System.setProperty("webdriver.gecko.driver","src//Driver//geckoriver.exe");
        driver = new FirefoxDriver();
    }
    driver.get(url);
    driver.manage().window().maximize();
}
    public void waitTime(long seconds){
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
//selecting 5 adults from the drop down list of passengers
    public void selectPassenger(int passenger) {
    waitTime(2);
        driver.findElement(By.id("divpaxinfo")).click();
        int i=0;

        while(i<passenger){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;

        }
//        for (int i=1; i < passenger; i++)
//        {
//        driver.findElement(By.id("hrefIncAdt")).click();
//        }
        driver.findElement(By.id("btnclosepaxoption")).click();
    }
//selecting currency from the dropdown list
    public void selectCurrency(String currency) {
        waitTime(3);
        selectBytext(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']")), currency);
        }

// creating common static dropdown
    public void selectBytext(WebElement element, String text){
        Select select= new Select(element);
        select.selectByVisibleText(text);
    }
// choosing country from the search field
    public void selectCountry()
    {
    waitTime(3);
    driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
    List<WebElement> options= driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
    for(WebElement option:options){
        if(option.getText().equalsIgnoreCase("india"))
        {
            option.click();
        break;
        }
    }
    }
// selecting destination from & to
    public void selectDestination()
    {
    waitTime(3);
    driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
    waitTime(2);
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
    waitTime(2);
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
    }
// selecting friends & family from the options
    public void selectFriendsAndFamily()
    {
     driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
    }
    public static void main(String[] args) {
        EndToEnd testCase= new EndToEnd();
        testCase.openBrowser(testCase.browser);
        testCase.selectPassenger(noOfPassengers);
        testCase.selectCountry();
        testCase.selectDestination();
        testCase.selectFriendsAndFamily();
        testCase.selectCurrency(currencies);
    }
}
