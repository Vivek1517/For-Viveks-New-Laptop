package Automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class SouthallTravel {
   static String browser= "chrome";
   static String outBoundDate = "12";
    static String inBoundDate = "18";
    static String from = "LHR";
    static String to = "Mumbai";
    static String outBoundMonth = "July";
    static String inBoundMonth = "July";
    static String url = "https://www.southalltravel.co.uk/";
    static WebDriver driver;
    @Before
    public void open(){
    openBrowser(browser);

    }
    public void openBrowser(String browserType){
    if(browserType.equalsIgnoreCase("chrome")){
    System.setProperty("webdriver.chrome.driver","C:ChromeDriver//chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--incognito");
    driver = new ChromeDriver(chromeOptions);
    driver.manage().window().maximize();
    driver.get(url);
    }

    }
    @Test
    public void selctDates(){
        chooseMonthAndDate(outBoundDate,outBoundMonth);
    }
    public void chooseMonthAndDate(String toDate, String fromDate){
        driver.findElement(By.id("")).click();
    List<WebElement> dates= driver.findElements(By.className("ui-state-default"));
    int count = dates.size();
    for(int i=0; i<count; i++){
    String fromDates =  driver.findElements(By.className("ui-state-default")).get(i).getText();
    if(fromDate.equalsIgnoreCase("12")) {
        driver.findElements(By.className("ui-state-default")).get(i).click();
        break;
    }
    }
    List<WebElement> inDates = driver.findElements(By.className("ui-state-default"));
    int count1 = inDates.size();
    for(int i=0; i<count1; i++){
    String toDates = driver.findElements(By.className("ui-state-default")).get(i).getText();
    if(toDate.equalsIgnoreCase("18")){
        driver.findElements(By.className("ui-state-default")).get(i).click();
        break;
    }
    }

    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.southalltravel.co.uk/");
        driver.findElement(By.id("depdateit")).click();
        Select flyingMonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
        flyingMonth.selectByVisibleText("Mar");
        List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
        int count = driver.findElements(By.className("ui-state-default")).size();
        for(int i=0; i<count; i++){
        String text= driver.findElements(By.className("ui-state-default")).get(i).getText();
        if(text.equalsIgnoreCase("12")){
        driver.findElements(By.className("ui-state-default")).get(i).click();
        break;
        }
        }
    }
}
