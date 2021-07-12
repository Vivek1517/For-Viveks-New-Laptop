package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCases {
    WebDriver driver;
    String browser="chrome";
    String userName = "vicky_sturd@hotmail.com";
    String passWord = "Vivek123";
    String app = "http://automationpractice.com/index.php";
    String product = "casual dress";
    String emailID= "vicky_sturd@hotmail.com";
    String message= "Thank you for reviewing";

// opening browser with automationpractice website
    public void openBrowser(String browserName)
    {
    if(browserName.equalsIgnoreCase("chrome"))
    {
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
    driver.get(app);
    driver.manage().window().maximize();
    }
    public void waitToLoad(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
//click on sign
    public void signIn(){
    driver.findElement(By.cssSelector("a[class='login']")).click();
    }
//enter valid username & password & click on login
    public void logIn(String uName, String pwd){
    openBrowser(browser);
    signIn();
    waitToLoad(3);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uName);
    driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(pwd);
    driver.findElement(By.cssSelector("button[id='SubmitLogin']")).click();
    waitToLoad(2);
    }
//type in seacrh field to find a product
    public void enterProduct(String products){
    driver.findElement(By.id("search_query_top")).sendKeys(products);
    List<WebElement> options = driver.findElements(By.cssSelector("li[class*='ac_even']"));
    for(WebElement option:options){
    if(option.getText().equalsIgnoreCase("casual dresses ")){
        option.click();
    break;
    }
    }
    driver.findElement(By.cssSelector("button[name='submit_search']")).click();

    }
//enter a valid email address in the newsletter field
    public void newsLetter(String email){
    driver.findElement(By.id("newsletter-input")).sendKeys(email);
    driver.findElement(By.name("submitNewsletter")).click();
    }
//click on contact us link to go to contact us page
    public void contactUs(String message1){
    driver.findElement(By.id("contact-link")).click();
    selectByIndex(driver.findElement(By.cssSelector("select[id='id_contact']")));
    driver.findElement(By.cssSelector("#message")).sendKeys(message1);
    driver.findElement(By.id("submitMessage")).click();
    waitToLoad(2);
    }
    public void selectByIndex(WebElement element){
        Select select = new Select(element);
        select.selectByIndex(1);
    }

    public static void main(String[] args) {
    TestCases testCase = new TestCases();
    testCase.logIn(testCase.userName, testCase.passWord);
    testCase.enterProduct(testCase.product);
    testCase.newsLetter(testCase.emailID);
    testCase.contactUs(testCase.message);
    }
}
