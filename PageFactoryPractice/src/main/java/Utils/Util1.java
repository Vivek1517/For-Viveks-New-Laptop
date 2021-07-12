package Utils;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 extends BasePage{
   public static void click(WebElement element){
   element.click();
   }
   public static void sendKeys(WebElement element){
   element.sendKeys();
   }
   public static void selectByVisibleTest(WebElement element, String text){
   Select select = new Select(element);
   select.selectByVisibleText(text);
   }
   public static void selectByIndex(WebElement element, int value){
   Select select = new Select(element);
   select.selectByIndex(value);
   }
   public static void action(WebElement element){
   Actions a = new Actions(driver);
   a.moveToElement(element);
   }
   public static boolean isDisplayed(WebElement element){
   return element.isDisplayed();
   }
   public static boolean contains(WebElement element, String text){
   return element.getText().contains(text);
   }
   public static String isEqual(WebElement element){
   return element.getText();
   }
   /*public static void explicitWait(WebElement element){
   WebDriverWait wait = new WebDriverWait(driver,2);
   wait.until(ExpectedConditions.visibilityOf(element));
   }*/

   public static void explicitWait1(WebDriver driver, WebElement locator, int timeOut){
   new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
   locator.click();
   }

   public static void explicitWait2(WebDriver driver, WebElement element, int timeOut){
      new WebDriverWait(driver,timeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
      element.isDisplayed();

   }
  
}
