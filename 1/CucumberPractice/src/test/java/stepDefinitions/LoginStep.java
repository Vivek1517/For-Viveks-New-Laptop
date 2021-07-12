package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class LoginStep {
    WebDriver driver;
    //static String browser = "chrome";
    static String url = "http://automationpractice.com/index.php";
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Given("user is on automationpractice site")
    public void user_is_automationpractice_site() {
        Assert.assertEquals(driver.getTitle(), "My Store");
    }

    @When("user clicks on sign in")
    public void user_clicks_on_sign_in() {
        driver.findElement(By.cssSelector(".login")).click();
    }

    @Then("user should navigate to authentication page")
    public void user_should_navigate_to_authentication_page() {
        boolean authenticationPageStatus = driver.findElement(By.id("login_form")).isDisplayed();
        Assert.assertTrue(authenticationPageStatus);
    }

    @When("user enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String email, String password) {
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("#passwd")).sendKeys(password);

    }

    @When("click on log in")
    public void click_on_log_in() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("he should be log in successfully & navigate to my account page")
    public void he_should_be_log_in_successfully_navigate_to_my_account_page() {
        String myAccount = driver.findElement(By.className("page-heading")).getText();
        Assert.assertEquals(myAccount,"MY ACCOUNT");
    }

    @Then("he should see his name on the page")
    public void he_should_see_his_name_on_the_page() {
        boolean accountNameStatus = driver.findElement(By.cssSelector(".account")).isDisplayed();
        Assert.assertTrue(accountNameStatus);
    }

    @When("user enters valid {string} and invalid {string}")
    public void user_enters_valid_and_invalid(String email, String password) {
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("#passwd")).sendKeys(password);
    }

    @Then("user should get a validation message {string}")
    public void user_should_get_a_validation_message(String error) {
        String errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
boolean validationMessage = driver.findElement(By.cssSelector(".alert.alert-danger")).isDisplayed();
        Assert.assertTrue(validationMessage);

        Assert.assertEquals(errorMessage,error);
    }

   @After
    public void closeBrowser() {
        driver.quit();
    }

    public void waitTime(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    /*@When("user clicks on sign in")
    public void user_clicks_on_sign_in() {
        driver.findElement(By.cssSelector(".login")).click();
    }*/
    @When("user enters email as {string} under create an account heading")
    public void userEntersValidDetailUnderCreateAnAccountHeading(String email) {
        waitTime(3);
        driver.findElement(By.cssSelector("#email_create")).sendKeys(email);
    }

    @And("user selects create an account")
    public void clicksOnCreateAnAccountButton() {
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        waitTime(3);
    }

    @Then("user should navigate to create an account page")
    public void userShouldNavigateToCreateAnAccountPage() {
        boolean accountPageStatus = (driver.findElement(By.cssSelector(".page-heading"))).isDisplayed();
        Assert.assertTrue(accountPageStatus);

    }

    @And("user provide title {string}, first name {string}, last name {string} and password {string}")
    public void selectsTitleFirstNameLastNameAndPassword(String title, String firstName, String lastName, String pwd) {
        if(title.equalsIgnoreCase("Mr")){

            driver.findElement(By.cssSelector("#id_gender1")).click();
        }
        else{
            driver.findElement(By.cssSelector("#id_gender2")).click();
        }
        waitTime(3);
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(firstName);
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(lastName);
        driver.findElement(By.cssSelector("#passwd")).sendKeys(pwd);
    }

    @And("user selects DOB {string}, month {string} and year {string}")
    public void choosesDateOfBirthMonthAndYear(String days, String month, String year) {
        waitTime(3);
        Select date = new Select(driver.findElement(By.cssSelector("#days")));
        date.selectByValue(days);
        Select months = new Select(driver.findElement(By.cssSelector("#months")));
        months.selectByValue(month);
        Select years = new Select(driver.findElement(By.cssSelector("#years")));
        years.selectByValue(year);
    }

    @And("user provide address {string}, city {string} and post code {string}")
    public void typesInAddressCityAndPostCode(String address, String city, String postCode) {
        waitTime(3);
        driver.findElement(By.cssSelector("#address1")).sendKeys(address);
        driver.findElement(By.cssSelector("#city")).sendKeys(city);
        driver.findElement(By.cssSelector("#postcode")).sendKeys(postCode);

    }

    @And("selects state {string} and country {string}")
    public void selectsStateAndCountry(String state, String country) {
        waitTime(3);
        Select states = new Select(driver.findElement(By.cssSelector("#id_state")));
        states.selectByVisibleText(state);
        Select countrys = new Select(driver.findElement(By.cssSelector("#id_country")));
        countrys.selectByVisibleText(country);
    }

    @And("enters a mobile number {string}")
    public void entersAMobileNumber(String number) {
        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys(number);
    }

    @And("clicks on register")
    public void clicksOnRegister() {
        driver.findElement(By.cssSelector("#submitAccount")).click();
        waitTime(3);
    }

    @Then("user should see an error message as {string}")
    public void userShouldSeeAnError(String error) {
        String errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
        Assert.assertEquals(error, errorMessage);

    }


    @When("^user provide address as below:$")
    public void provideRegistrationDetails(DataTable table) {
        List<String> data= table.asList();
//        System.out.println(data.get(0));
//        System.out.println(data.get(1));
//        System.out.println(data.get(2));

        waitTime(3);
        driver.findElement(By.cssSelector("#address1")).sendKeys(data.get(0));
        driver.findElement(By.cssSelector("#city")).sendKeys(data.get(1));
        driver.findElement(By.cssSelector("#postcode")).sendKeys(data.get(2));
    }


}
