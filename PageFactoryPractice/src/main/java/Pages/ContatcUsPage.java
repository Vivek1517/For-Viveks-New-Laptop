package Pages;

import Utils.BasePage;
import Utils.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContatcUsPage extends BasePage {

    public ContatcUsPage(){
    PageFactory.initElements(driver,this);
    }
    @FindBy(className="contact-form-box")
    WebElement userOnContactUsPage;
    @FindBy(css="#id_contact")
    WebElement chooseTypeOfContact;
    @FindBy(css="#email")
    WebElement enterEmailID;
    @FindBy(css="#message")
    WebElement typeMessage;
    @FindBy(id="submitMessage")
    WebElement clickSend;
    @FindBy(css="div[class*='alert-danger']")
    WebElement showError;

    public boolean verifyUserOnContactUsPage(){
    return Util.isDisplayed(userOnContactUsPage);
    }

    public void ChooseTypeOfContact(String text){
    Util.selectByText(chooseTypeOfContact, text);
    }

    public void enterEmailID(String email){
    Util.sendKeys(enterEmailID,email);
    }

    public void typeMessage(String message){
    Util.sendKeys(typeMessage, message);
    }

    public void clickSend(){
    Util.click(clickSend);
    }

    public String showError(){
    return Util.isEqual(showError);
    }
}
