package Automation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Practice {

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","c:\\ChromeDriver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://facebook.com");
   //(tagname can be replaced with*)
    // driver.findElement(By.xpath("//*[@id='email']")).sendKeys("my1stXpath");
   //this is the syntax for creating customised xpath //tagname[@attribute='value']
  //driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Kiyaan");
  //this is the syntax for creating customised css tagname[attribute='value'] you can also skip writing tagname for css
    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("My1stCSS");
   driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("Kiyaan");
   //this is the syntax for creating css only if you id in that object tagname#id (value of id should be given not just id)
    driver.findElement(By.cssSelector("input#pass")).sendKeys("Kiyaan");
    //this is th syntax for creating css only if you have classname in that object tagname.classname(value of classname should be given not just id)
    driver.findElement(By.cssSelector("button[name='login']")).click();
    }
}
