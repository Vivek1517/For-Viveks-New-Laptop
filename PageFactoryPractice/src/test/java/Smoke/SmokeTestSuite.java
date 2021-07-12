package Smoke;

import Pages.AuthenticationPage;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.LoginPage;
import Regression.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class SmokeTestSuite extends BaseTest {
    static String email = "vicky_sturd@hotmail.com";
    static String password = "Vivek123";

    HomePage hp = new HomePage();
    CommonPage cp = new CommonPage();
    AuthenticationPage ap = new AuthenticationPage();
    LoginPage lp = new LoginPage();
    @Test
    public void userShouldBeAbleToLoginUsingValidCredentials(){
    Assert.assertTrue(hp.isDisplayed());
    cp.goToAuthenticationPage();
    Assert.assertTrue(ap.isUserOnAuthenticationPage());
    lp.login(email,password);
    Assert.assertTrue(lp.verifyUserOnMyAccountPage());
    }
}
