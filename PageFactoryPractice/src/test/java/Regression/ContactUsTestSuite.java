package Regression;

import Pages.CommonPage;
import Pages.ContatcUsPage;
import org.junit.Assert;
import org.junit.Test;

public class ContactUsTestSuite extends BaseTest{
    static String choose = "Customer service";
    static String emailID= "ffk_gmail.com";
    static String orderReference= " ";
    static String message = "Hello Automation";
    static String error= "There is 1 error"+"\n"+"Invalid email address.";
    CommonPage cp = new CommonPage();
    ContatcUsPage contactPage = new ContatcUsPage();


    @Test
    public void userShouldGetErrorForInvalidEmailID(){
    cp.goTOContactUsPage();
    Assert.assertTrue(contactPage.verifyUserOnContactUsPage());
    contactPage.ChooseTypeOfContact(choose);
    contactPage.enterEmailID(emailID);
    contactPage.typeMessage(message);
    contactPage.clickSend();
    Assert.assertEquals(contactPage.showError(),error);
    }
}
