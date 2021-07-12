package Pages;

import Utils.BasePage;
import Utils.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LoginPage extends BasePage {
    @FindBy(id="login_form")
    WebElement verifyUserOnLoginPage;
    @FindBy(css="#email")
    WebElement enterEmail;
    @FindBy(css="#passwd")
    WebElement enterPassword;
    @FindBy(id="SubmitLogin")
    WebElement clickSignIn;
    @FindBy(className="navigation_page")
    WebElement userOnMyAccountPage;

    public LoginPage(){
    PageFactory.initElements(driver,this);
    }
    public boolean userOnLoginPage(){
    return Util.isDisplayed(verifyUserOnLoginPage);
    }
    public void login(String email, String password){
    Util.sendKeys(enterEmail,email);
    Util.sendKeys(enterPassword, password);
    Util.click(clickSignIn);
    }
    public boolean verifyUserOnMyAccountPage(){
    return Util.isDisplayed(userOnMyAccountPage);
    }
}
