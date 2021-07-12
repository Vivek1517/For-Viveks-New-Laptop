package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Util extends BasePage{
    public static boolean isDisplayed(WebElement element){
    return element.isDisplayed();
    }

    public static boolean getText(WebElement element, String text){
    return element.getText().contains(text);
    }

    public static void sendKeys(WebElement element, String text){
    element.sendKeys(text);
    }

    public static void click(WebElement element){
    element.click();
    }

    public static void selectByText(WebElement element, String text){
    Select select = new Select(element);
    select.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element, int index){
    Select select = new Select(element);
    select.selectByIndex(index);
    }

    public static void action(WebElement element, WebDriver driver){
    Actions action = new Actions(driver);
    action.moveToElement(element);
    }

    public static void waitTime(long seconds){
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    /*public static void explicitTime(WebElement element){
    WebDriverWait wait = new WebDriverWait(driver, 3);
    wait.until(element.isDisplayed());
    }*/

   /* public static String isEqual(WebElement element, String text){
    return element.getText();
    }*/

    public static String isEqual(WebElement element) {
    return element.getText();
    }
}
