package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


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



    @And("close browser")
    public void closeBrowser() {
        driver.quit();
    }




}
