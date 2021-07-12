package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CreateAccount {
    WebDriver driver;
    //static String browser = "chrome";
    /*static String url = "http://automationpractice.com/index.php";*/
    /*@Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
    }*/
    public void waitTime(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
    }
    /*@When("user clicks on sign in")
    public void user_clicks_on_sign_in() {
        driver.findElement(By.cssSelector(".login")).click();
    }*/
    @When("user enters valid detail {string} under create an account heading")
    public void userEntersValidDetailUnderCreateAnAccountHeading(String email) {
       waitTime(3);
        driver.findElement(By.cssSelector("#email_create")).sendKeys(email);
    }

    @And("clicks on create an account button")
    public void clicksOnCreateAnAccountButton() {
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        waitTime(3);
    }

    @Then("user should navigate to create an account page")
    public void userShouldNavigateToCreateAnAccountPage() {
        boolean accountPageStatus = (driver.findElement(By.cssSelector(".page-heading"))).isDisplayed();
        Assert.assertTrue(accountPageStatus);

    }

    @And("selects title {string}, first name {string}, last name {string} and password {string}")
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

    @And("chooses date of birth {string}, month {string} and year {string}")
    public void choosesDateOfBirthMonthAndYear(String days, String month, String year) {
        waitTime(3);
        Select date = new Select(driver.findElement(By.cssSelector("#days")));
        date.selectByValue(days);
        Select months = new Select(driver.findElement(By.cssSelector("#months")));
        months.selectByValue(month);
        Select years = new Select(driver.findElement(By.cssSelector("#years")));
        years.selectByValue(year);
    }

    @And("types in address {string}, city {string} and post code {string}")
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

    @Then("user should see an error {string}")
    public void userShouldSeeAnError(String error) {
        String errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
        Assert.assertEquals(error, errorMessage);
    }



}
