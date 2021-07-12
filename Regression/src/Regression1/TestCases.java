package Regression1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

//1)Open Browser
//2)open url
//3)Click on sign in
//4)Wait for few seconds
//5)Enter valid email address in the text field under Create An Account heading
//6) Click on create account
//7)Wait for few seconds for the page to load
//8) Select Title
//9) Enter First Name in text field= Vivek
//10) Enter Last Name in text fields= khanna
//12) Enter a desired password in password field= vivek123
//13) Select date, month & year under date of birth title
//14) Keeping first name field empty=" "
//15) Enter last name in field text= khanna
//16) Enter Address in in address field
//17) Address line(2) keeping it blank=" "
//18) Enter city in city field= Camden
//19) Select state from dropdown list
//20) Enter Zip/Postal code in the field=
//21) Enter home phone number in the text field
//22) Enter a Mobile number in the text field
//23) Enter a address in Assign an Address alias for future reference
//24) Click on register
public class TestCases {
    public WebDriver driver;
    String browser="chrome";
    String url="http://automationpractice.com/index.php";

//    TestCases obj = new TestCases();


//Test case1 Data
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

//    public void open(){
//        obj.openBrowser(browser);
//    }
    @Test
    public void userShouldntBeAbleToRegisterWithIncompleteData()
    {
// Verify user is on www.automationpractuce.com
        openBrowser(browser);
        Assert.assertTrue(verifyHomePageIsOpened());
// Verify user after clicking in on sign navigates to create account page
        clickSignIn();
        Assert.assertEquals("AUTHENTICATION", verifyUserOnCreateAccountPage());
        createAccount(email1);
// Verify user navigates to create account page where they can put the details & click on register
        enterPersonalDetails(title,fName,lName,password);
        selectDOB(date,month,year);
        homeAddress(streetName,city,state,postCode,homeNumber,mobile);
        Assert.assertTrue(verifyUserCanClickonRegister());
        clickRegister();
// Verify user can see the error for not filling in the phone number
        Assert.assertEquals("There is 1 error"+"/n"+"phone is invalid",verifyUserGetsErrorMessage());
     //   closeBrowser();
    }
// opening Browser with the website to test the test case scenario
    public void openBrowser(String browserName)
    {

    if(browserName.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","src//Driver//chromedriver.exe");
        driver = new ChromeDriver();

    }
    if(browserName.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","src//Driver//geckodriver.exe");
        driver = new FirefoxDriver();

    }
    if (browserName.equalsIgnoreCase("internet explorer")){
        System.setProperty("webdriver.ie.driver","src//IE//IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }
    driver.get(url);
    driver.manage().window().maximize();

}
    public boolean verifyHomePageIsOpened(){
        boolean homePageValue = driver.findElement(By.cssSelector(".header_user_info")).isDisplayed();
        return homePageValue;
    }
    public String verifyUserOnCreateAccountPage(){
        WebElement createAccountPage = driver.findElement(By.cssSelector(".page-heading"));
        String createAccountPageDisplay = createAccountPage.getText();
        return createAccountPageDisplay;
    }
    public boolean verifyUserCanClickonRegister(){
        WebElement registerAccount = driver.findElement(By.cssSelector("#submitAccount"));
        boolean registerAccountValue= registerAccount.isDisplayed();
        return registerAccountValue;
    }
    public String verifyUserGetsErrorMessage(){
       String errorMessage ="There is 1 error"+"/n"+"phone is invalid";
        String error= driver.findElement(By.cssSelector("div[class*='alert']")).getText();
        return errorMessage;
    }
//wait time
    public void waitTime(long seconds){
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
//click on sign in
    public void clickSignIn(){
    driver.findElement(By.cssSelector("a[class='login']")).click();
    waitTime(5);
    }
// entering email address in under create an account header & click create an account
    public void createAccount(String email){
    driver.findElement(By.cssSelector("input[id='email_create']")).sendKeys(email);
    driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();
    waitTime(8);
    }
//entering 1st name, last name & password under create an account page
    public void enterPersonalDetails(String titl, String firstName, String lastName, String pwd){
    if(titl.equalsIgnoreCase("Mr")){
        driver.findElement(By.cssSelector("#id_gender1")).click();
    }
    else{
        driver.findElement(By.cssSelector("#id_gender2")).click();
    }
    driver.findElement(By.cssSelector("input[id='customer_firstname']")).sendKeys(firstName);
    waitTime(2);
    driver.findElement(By.cssSelector("input[id='customer_lastname']")).sendKeys(lastName);
    waitTime(2);
    driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(pwd);
    }
//Selecting date of birth from drop down list
    public void selectDOB(String dates, String months, String years){
    waitTime(3);
    selectByText(driver.findElement(By.cssSelector("select[id='days']")),dates );
        waitTime(3);
        selectByText(driver.findElement(By.cssSelector("select[id='months']")),months );
        waitTime(3);
        selectByText(driver.findElement(By.cssSelector("select[id='years']")),years );

    }

    public void selectByText(WebElement element, String txt){
    Select select= new Select(element);
    select.selectByVisibleText(txt);

    }
//entering home address
    public void homeAddress(String streetName, String city, String states1, String postCode, String homeNumber, String mobile){
    driver.findElement(By.cssSelector("input[id='address1']")).sendKeys(streetName);
    driver.findElement(By.cssSelector("input[id='city']")).sendKeys(city);
    waitTime(8);
    Select states= new Select(driver.findElement(By.cssSelector("select[id='id_state']")));
    states.selectByVisibleText(states1);
    driver.findElement(By.cssSelector("input[id='postcode']")).sendKeys(postCode);
    driver.findElement(By.cssSelector("input[id='phone']")).sendKeys(homeNumber);
    driver.findElement(By.cssSelector("input[id='phone_mobile']")).sendKeys(mobile);
    waitTime(2);
    }
//click on register
    public void clickRegister(){
    driver.findElement(By.cssSelector("button[id='submitAccount']")).click();
    }
    public void closeBrowser(){
    driver.close();
    }

    public static void main(String[] args) {
//    TestCases cases = new TestCases();
//    cases.userShouldntBeAbleToRegisterWithIncompleteData();
////    cases.openBrowser(cases.browser);
////    cases.clickSignIn();
////    cases.createAccount(email1);
////    cases.enterPersonalDetails(title, fName, lName, password);
////    cases.selectDOB(date, month, year);
////    cases.homeAddress(streetName, city, state, postCode, homeNumber, mobile);
////    cases.clickRegister();
//    cases.closeBrowser();

    }
}
