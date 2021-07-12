package Automation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpiceJet {
    static String browser = "chrome";
    static String website = "https://www.spicejet.com/";
    static WebDriver driver;
    static String currency = "USD";
    static int numberOfAdults = 6;
    static String departureCity = "Goa ";
    static String destinationCity = "Mumbai ";
    static String month = "July";
    static String  departureDate = "6";
    static String returnDate = "12";
    @BeforeClass
    public static void openingBrowser(){
    openBrowser(browser);
    }
    public static void openBrowser(String browserName)
    {
    if(browserName.equalsIgnoreCase("Chrome"))
    {
    System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
    driver = new ChromeDriver();
    }
    if(browserName.equalsIgnoreCase("fire fox")) {
    System.setProperty("webdriver.gecko.driver", "C://geckodriver//geckodriver.exe");
    driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.get(website);
    }
    //Testing currency dropdown selector
    @Test
    public void testCurrency()
    {
        selectCurrency(currency);
    }

    public void selectCurrency(String currencies)
    {
     reUsableSelect(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")),currencies );
    }
    public void reUsableSelect(WebElement element, String enterCurrency)
    {
    Select currency = new Select(element);
    currency.selectByVisibleText(enterCurrency);
    }
    @Test
    public void selectAdults(){
    selectNumberOfPassangers(numberOfAdults);
    }
    public void selectNumberOfPassangers(int passenger)
    {
     driver.findElement(By.id("divpaxinfo")).click();
     Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
     adult.selectByIndex(numberOfAdults);
    }
    @Test
    public void selectCity(){
    selectDestination(departureCity, destinationCity);
    }
    public void selectDestination(String from, String to)
    {
     driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     WebElement fromCity = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']"));
     fromCity.sendKeys(from);
     if(from.equalsIgnoreCase("Goa ")){
     fromCity.click();
     }
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     WebElement toCity = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']"));
     toCity.sendKeys(to);
     if(to.equalsIgnoreCase("Mumbai "))
     {
      toCity.click();
     }
     }
     @Test
     public void travelDates()
     {
     chooseDates(departureDate,returnDate,month);
     }
     public void chooseDates(String fromDate, String toDate, String chooseMonth)
     {
     driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
     while(!driver.findElement(By.cssSelector("div[id='ui-datepicker-div'] span[class='ui-datepicker-month']")).getText().contains(chooseMonth)){
     driver.findElement(By.cssSelector("div[class*='ui-datepicker-header'] [class*='ui-datepicker-next'] ")).click();
     }
     //List<WebElement> fromdates = driver.findElements(By.className("ui-state-default"));
     int count = driver.findElements(By.className("ui-state-default")).size();
     for(int i=0; i<count; i++)
     {
      String fromDates= driver.findElements(By.className("ui-state-default")).get(i).getText();
      if(fromDates.equalsIgnoreCase("6"))
      {
      driver.findElements(By.className("ui-state-default")).get(i).click();
      break;
      }
     }
     driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).click();
     //List<WebElement> returnDate = driver.findElements(By.className("ui-state-default"));
     int count1 = driver.findElements(By.className("ui-state-default")).size();
     for(int i=0; i<count1; i++)
     {
      String toDates = driver.findElements(By.className("ui-state-default")).get(i).getText();
      if(toDates.equalsIgnoreCase("12"))
      {
      driver.findElements(By.className("ui-state-default")).get(i).click();
      break;
      }
     }
     }

//    public static void main(String[] args) {
//        SpiceJet smokeTest = new SpiceJet();
//        smokeTest.openBrowser(browser);
//       // smokeTest.selectCurrency(currency);
//    }
}
