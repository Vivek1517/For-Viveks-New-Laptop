package Pages;

import Utils.BasePage;
import Utils.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
    PageFactory.initElements(driver,this);
    }
 @FindBy(id="home-page-tabs")
 WebElement homePage;
public boolean isDisplayed(){
return Util.isDisplayed(homePage);
}
}
