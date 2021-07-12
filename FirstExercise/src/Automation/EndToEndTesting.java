package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class EndToEndTesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c://ChromeDriver//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropDown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown= new Select(staticDropDown);
        dropDown.selectByIndex(3);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);
        for(int i=1; i<5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options= driver.findElements(By.className("ui-corner-all"));
        Thread.sleep(3000);
        for(WebElement option:options){
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }
        Thread.sleep(3000);
      //  Assert.assertFalse(driver.findElement(By.className("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
     //  Assert.assertTrue(driver.findElement(By.className("input[id*='friendsandfamily']")).isSelected());
    }
}
