package Automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Amazon1 {
  public static  String url = "https://www.amazon.co.uk/";
  public static  String product = "drinks dispenser";
  public static  String choiceOfBrowser = "chrome";
  public static WebDriver driver;
  public static Actions a;

  public void openBrowse(String broswer)
  {
  if(broswer.equalsIgnoreCase("chrome"))
  {
  System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
      driver = new ChromeDriver();
  }
  if(broswer.equalsIgnoreCase("fire fox"))
  {
  System.setProperty("webdriver.gecko.driver","C://geckodriver//geckodriver.exe");
  driver = new FirefoxDriver();
  }
  driver.get(url);
  driver.manage().window().maximize();
  }
  @Before
  public void openWebsite()
  {
   System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
   driver = new ChromeDriver();
  driver.get(url);
  driver.manage().window().maximize();
  }
  @Test
  public void moveToSignIn()
  {
   a = new Actions(driver);
   a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
   driver.findElement(By.xpath("//div[@id='nav-al-container']/div[2]/a[1]")).click();
   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
   driver.findElement(By.xpath("//div[@id='nav-al-container']/div[3]/a[3]")).click();
  }
  @Test
  public void searchProduct()
  {
  a = new Actions(driver);
  a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys(product).build().perform();
  driver.findElement(By.id("nav-search-submit-button")).click();
  Set<String> window = driver.getWindowHandles();
  Iterator<String> it = window.iterator();
  String parentWindow = it.next();
  String blankWindow = it.next();
  String childWindow = it.next();
  driver.switchTo().window(childWindow);
  driver.switchTo().window(parentWindow);
  driver.findElement(By.xpath("//div[@id='nav-main']/div/div/div/a[1]")).click();
  }
}
