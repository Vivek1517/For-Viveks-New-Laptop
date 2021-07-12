package Pages;

import Utils.BasePage;
import Utils.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BasePage {
    public CommonPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css=".login")
    WebElement signIn;
    @FindBy(id="contact-link")
    WebElement contactUs;
    public void goToAuthenticationPage() {
    Util.click(signIn);
    }
    public void goTOContactUsPage(){
    Util.click(contactUs);
    }
}
