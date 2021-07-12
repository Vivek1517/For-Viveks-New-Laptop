import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utilities extends BaseClass{

    public static String getTitle(){
    return driver.getTitle();
    }

    public void action(WebElement element){
        Actions a = new Actions(driver);
        a.moveToElement(element);
    }
}
