package StepDefinitions;

import Pages.AuthenticationPage;
import Pages.CommonPage;
import Pages.CreateAnAccountPage;
import Pages.HomePage;
import Utillities.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAnAccount {
    AuthenticationPage ap = new AuthenticationPage();
    CreateAnAccountPage cp = new CreateAnAccountPage();

 @Given("user is on authentication page")
 public void userIsOnAuthenticationPage() {
  cp.stepToGoToAuthenticationPage();
 }
    @When("user enters email {string} under create an account heading")
    public void user_enters_email_under_create_an_account_heading(String email) {
        ap.enterEmailToCreateAccount(email);
    }
    @When("user clicks on create an account page.")
    public void user_clicks_on_create_an_account_page() {
       ap.clickONCreateAccount();
    }
    @Then("user should navigate to create an account page.")
    public void user_should_navigate_to_create_an_account_page() {
        Assert.assertTrue(cp.isUserOnCreateAccountPage());
        Util.waitTime(2);

    }
    @When("user selects title {string} enters first name {string}, last name {string} and password {string}")
    public void user_selects_title(String title, String firstName, String lastName, String pwd) {
    cp.selectGender(title,firstName,lastName,pwd);
    }
    @When("user selects DOB {string}, {string} and {string}")
    public void user_selects_dob_and(String date, String month, String year) {
    cp.selectDOB(date, month, year);
    }
    @When("user enter street address {string}, city {string} and post code {string}")
    public void user_enter_street_address_city_and_post_code(String street, String city, String postCode) {
    cp.enterAddress(street, city, postCode);
    }
    @When("user selects state {string} and country {string}")
    public void user_selects_state_and_country(String state, String country) {
    cp.selectStateAndCountry(state, country);
    }
    @When("user enters mobile number {string}")
    public void user_enters_mobile_number(String mobile) {
    cp.enterHomenoMobileno(mobile);
    }
    @When("user clicks on register")
    public void user_clicks_on_register() {
    cp.clickOnRegister();
    }
    @Then("user should see a validation message {string}")
    public void user_should_see_a_validation_message(String error) {
    Assert.assertEquals(cp.userShouldGetError(),error);
    }


}
