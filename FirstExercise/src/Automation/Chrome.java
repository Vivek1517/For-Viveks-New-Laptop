package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c://ChromeDriver//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://debenhams.co.uk");
        //Below method is to travel through sibling elements using xpath
        driver.findElement(By.xpath("//ul[@class='t-desktop-nav__tab-panel u-center-piece']/li[1]/following-sibling::li[2]")).click();
        driver.findElement(By.xpath("//ul[@class='t-desktop-nav__tab-panel u-center-piece']/li[1]/following-sibling::li[3]")).click();
      //  driver.findElement(By.xpath("//div/nav/div/ul/li[2]")).click();
       // driver.findElement(By.linkText("//text()='See All Results'")).click();
      //  driver.findElement(By.cssSelector("a [title='WOMEN']")).click();
      //  driver.quit();
     //   driver.findElement(By.xpath("//li[@class='Option available']/div/div[2]/class")).isSelected();

    }

}
