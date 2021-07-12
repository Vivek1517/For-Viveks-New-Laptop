package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice1 {
    Select dropDown;
    public WebDriver driver;
    public void slect(WebElement element, String currency){
        dropDown= new Select(element);
        dropDown.selectByValue(currency);
    }
    public void selectingDOB(String date, String month, String year){
        dropDown.selectByValue(date);
        dropDown.selectByValue(month);
        dropDown.selectByValue(year);
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c://ChromeDriver//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropDown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown= new Select(staticDropDown);
        dropDown.selectByIndex(3);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=1; i<4; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        Thread.sleep(3000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

    }
}
