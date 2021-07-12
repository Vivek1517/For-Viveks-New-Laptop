package StepDefinations;

import Pages.CommonPage;
import Pages.LoginPage;
import Utils.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;


public class LogIn extends BasePage {



    CommonPage cp;
    LoginPage lp;
    @Given("browser is open")
    public void browser_is_open() {
    BasePage.openBrowser(browser);

    }
    @Given("click on signin link on home page")
    public void click_on_signin_link_on_home_page() {
        cp = new CommonPage();
        cp.goToAuthenticationPage();
    }
    @Given("this will take the user to login page")
    public void this_will_take_the_user_to_login_page() {
    lp = new LoginPage();
    boolean pageStatus = lp.userOnLoginPage();
    Assert.assertTrue(pageStatus);
    }
    @When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on log in$")
    public void user_enters_valid_something_and_something_and_click_on_log_in(String strArg1, String strArg2) {
    lp.login(email,password);
    }
    @Then("verify user is sucessfully loged in")
    public void verify_user_is_sucessfully_loged_in() {
    lp.verifyUserOnMyAccountPage();
    }
}
