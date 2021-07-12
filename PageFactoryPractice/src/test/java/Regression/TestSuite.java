package Regression;

import Pages.AuthenticationPage;
import Pages.CommonPage;
import Pages.CreateAnAccountPage;
import Pages.HomePage;
import Regression.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class TestSuite extends BaseTest {
    static String email1="dedk@gmail.com";
    static String title="Mr";
    static String fName="Vicky";
    static String lName="Khanna";
    static String password="vivek123";
    static String date="6  ";
    static String month="July ";
    static String year="1979  ";
    static String streetName="4703  American Drive";
    static String city="Camden";
    static String state="New Jersey";
    static String postCode="08104";
    static String homeNumber="a1234";
    static String mobile="609-636-3757";
    static String error="There is 1 error"+"\n"+"phone is invalid.";

    AuthenticationPage ap = new AuthenticationPage();
    CommonPage cp = new CommonPage();
    HomePage hp = new HomePage();
    CreateAnAccountPage createAccountPage = new CreateAnAccountPage();

    @Test
    public void userShouldntBeAbleToCreateAnAccountWithInvalidCredentials(){
        Assert.assertTrue(hp.isDisplayed());
        cp.goToAuthenticationPage();
        Assert.assertTrue(ap.isUserOnAuthenticationPage());
        ap.enterEmailId(email1);
        ap.clickOnCreateAccount();
        Assert.assertTrue(createAccountPage.isUseronCreateAccountPage());
        createAccountPage.selectTitle(title,fName,lName,password);
        createAccountPage.selectDOB(date,month,year);
        createAccountPage.enterAddressAndContactNumber(streetName, city, state, postCode, homeNumber, mobile);
        createAccountPage.clickOnRegister();
        Assert.assertEquals(createAccountPage.userShouldGetError(),error);
        }
}
