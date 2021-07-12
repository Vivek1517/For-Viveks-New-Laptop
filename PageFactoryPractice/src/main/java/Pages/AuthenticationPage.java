package Pages;

import Utils.BasePage;
import Utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {
    public AuthenticationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="#email_create")
    WebElement enterEmailId;
    @FindBy(id="create-account_form")
    WebElement isUserOnAuthenticationPage;
    @FindBy(css="#SubmitCreate")
    WebElement clickOnCreateAccount;

    public void enterEmailId(String emailID){
    Util.sendKeys(enterEmailId,emailID);
    }
    public void clickOnCreateAccount(){
    Util.click(clickOnCreateAccount);
    }
    public boolean isUserOnAuthenticationPage(){
    return Util.isDisplayed(isUserOnAuthenticationPage);
    }
}
