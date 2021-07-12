package Pages;

import Utils.BasePage;
import Utils.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage extends BasePage {
    public CreateAnAccountPage(){
    PageFactory.initElements(driver,this);
    }

    @FindBy(className="page-heading")
    WebElement display;
    @FindBy(css="#id_gender1")
    WebElement selectTitleMr;
    @FindBy(css="#id_gender2")
    WebElement selectTitleMrs;
    @FindBy(css="#customer_firstname")
    WebElement enterFirstName;
    @FindBy(css="#customer_lastname")
    WebElement enterLastName;
    @FindBy(css="#passwd")
    WebElement enterPassword;
    @FindBy(css="#days")
    WebElement selectDate;
    @FindBy(css="#months")
    WebElement selectMonth;
    @FindBy(css="#years")
    WebElement selectYear;
    @FindBy(css="#address1")
    WebElement enterAddress;
    @FindBy(css="#city")
    WebElement enterCity;
    @FindBy(css="#id_state")
    WebElement chooseState;
    @FindBy(css="#postcode")
    WebElement enterPostCode;
    @FindBy(css="#phone")
    WebElement enterHomeNumber;
    @FindBy(css="#phone_mobile")
    WebElement enterMobileNumber;
    @FindBy(id="submitAccount")
    WebElement clickOnRegister;
    @FindBy(css=".alert.alert-danger")
    WebElement showError;

    public boolean isUseronCreateAccountPage(){
    return Util.isDisplayed(display);
    }

    public void selectTitle(String title, String firstName, String lastName, String pwd){
    Util.waitTime(2);
    if(title.equalsIgnoreCase("Mr")){
    Util.click(selectTitleMr);
    }
    else{
    Util.click(selectTitleMrs);
    }
    Util.sendKeys(enterFirstName, firstName);
    Util.sendKeys(enterLastName, lastName);
    Util.sendKeys(enterPassword,pwd);
    }

    public void selectDOB(String date, String month, String year){
    Util.waitTime(2);
    Util.selectByText(selectDate,date);
    Util.selectByText(selectMonth,month);
    Util.selectByText(selectYear,year);
    }

    public void enterAddressAndContactNumber(String address, String city, String state, String postCode, String homeNo, String mobileNo){
    Util.sendKeys(enterAddress, address);
    Util.sendKeys(enterCity, city);
    Util.waitTime(2);
    Util.selectByText(chooseState, state);
    Util.sendKeys(enterPostCode, postCode);
    Util.sendKeys(enterHomeNumber, homeNo);
    Util.sendKeys(enterMobileNumber, mobileNo);
    }

    public void clickOnRegister(){
    Util.click(clickOnRegister);
    }

    public String userShouldGetError(){
    return Util.isEqual(showError);
    }
}
