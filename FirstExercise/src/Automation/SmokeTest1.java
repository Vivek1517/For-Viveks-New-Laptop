package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class SmokeTest1 {
    String userName="vicky_sturd@hotmail.com";
    String passWord="Vivek123";
    String webSite="http://automationpractice.com/index.php";
    public WebDriver driver;
    public Select dropDown;
    String browser="chrome";
    String product="casual dress";
    String date="1";
    String month="January";
    String year="1979";

    //open browser with the website:"http://automationpractice.com/index.php"
    public void openWebsite(String openBrowser){

    if(openBrowser.equalsIgnoreCase("chrome")){
    System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
    driver= new ChromeDriver();
    }
    if(openBrowser.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","C://geckodriver//geckodriver.exe");
        driver= new FirefoxDriver();
    }
    driver.get(webSite);
    driver.manage().window().maximize();
    }
    public void waitTime(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void closeWindow(){
        driver.close();
    }
 //Clicking on sign in link to go to sign in page
    public void signIn(){
        WebElement signInPage= driver.findElement(By.cssSelector("a[class='login']"));
        signInPage.click();
        waitTime(5);
    }
//Log in by using valid user name & password
public void logIn(String uname, String pwd){
        WebElement typeUserName= driver.findElement(By.cssSelector("input[id='email']"));
        typeUserName.sendKeys(uname);
        WebElement typePassword= driver.findElement(By.cssSelector("input[id='passwd']"));
        typePassword.sendKeys(pwd);
        WebElement clickOnSigIN= driver.findElement(By.cssSelector("button[id='SubmitLogin']"));
        clickOnSigIN.click();
        waitTime(5);
}
// Searching for product using Search field
    public void searchProduct(String producttype){
        WebElement product= driver.findElement(By.cssSelector("input[id='search_query_top']"));
        product.sendKeys(producttype);
        waitTime(2);
        WebElement clickSearch= driver.findElement(By.cssSelector("button[name='submit_search']"));
        clickSearch.click();
        waitTime(2);

    }
// Adding product to the cart
//    public void addProduct(){
//
//   // WebElement add= driver.findElement(By.xpath("//li[@class='ajax_block_product first-in-line first-item-of-tablet-line first-item-of-mobile-line col-xs-12'] //a[@class='button ajax_add_to_cart_button btn btn-default']"));
//    //add.click();
//    waitTime(2);
//    }

// Contacting customer service using contact us link
    public void contactUs(){
        WebElement contact= driver.findElement(By.cssSelector("#contact-link"));
        contact.click();
        waitTime(2);
        WebElement staticDropDown= driver.findElement(By.cssSelector("#id_contact"));
        Select dropDownHeading = new Select(staticDropDown);
        dropDownHeading.selectByIndex(2);
        waitTime(2);
        WebElement message= driver.findElement(By.xpath("//textarea[@class='form-control']"));
        message.sendKeys("Helloo Automation");
        waitTime(2);
        WebElement clickSubmit= driver.findElement(By.id("submitMessage"));
        clickSubmit.click();
    }
    public void createAccount(){
        driver.findElement(By.cssSelector("#email_create")).sendKeys("ghjgj@gmail.com");
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
    }
//    public void dob(String dates, String months, String years){
//        createAccount();
//
//        driver.findElement(By.cssSelector("#days"));
//        dropDown.selectByValue(dates);
//        driver.findElement(By.cssSelector("months"));
//        dropDown.selectByValue(months);
//        driver.findElement(By.cssSelector("#years"));
//        dropDown.selectByValue(years);
//
//    }

    public void selectdOB(){
        createAccount();
        waitTime(10);
        WebElement staticDropDown= driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropDown= new Select(staticDropDown);
        dropDown.selectByValue("10");
    }

// signing up for news letter
    public void newsLetter(String email){
        WebElement enterEmail= driver.findElement(By.id("newsletter-input"));
        enterEmail.sendKeys(email);
        waitTime(2);
        WebElement clickSubmit= driver.findElement(By.name("submitNewsletter"));
        clickSubmit.click();
    }
    public static void main(String[] args) {
        SmokeTest1 smoke= new SmokeTest1();
        smoke.openWebsite(smoke.browser);
        smoke.signIn();
        smoke.selectdOB();
//      smoke.dob(smoke.date, smoke.month, smoke.year);
//        smoke.logIn(smoke.userName, smoke.passWord);
//        smoke.searchProduct(smoke.product);
//      smoke.addProduct();
//        smoke.contactUs();
//        smoke.newsLetter(smoke.userName);
//       smoke.closeWindow();


    }
}