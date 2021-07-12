package SmokeTest;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class UsingJunit {
    static WebDriver driver;
    static String browser = "chrome";
    static String userName = "vicky_sturd@hotmail.com";
    static String  passWord = "Vivek123";
    static String url = "http://automationpractice.com/index.php";
    static String product = "Dress";

// open browser

    public static void openBrowser(String browserName)
    {
    if(browserName.equalsIgnoreCase("chrome"))
    {
    System.setProperty("webdriver.chrome.driver","src//Driver//chromedriver.exe");
    driver = new ChromeDriver();
    }
    if(browserName.equalsIgnoreCase("fire fox"))
    {
    System.setProperty("webdriver.gecko.driver","src//Driver//geckodriver.exe");
    driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.get(url);

    }
//click on sign in after opening the system
    @Test
    public void signIn(){

        openBrowser(browser);
        driver.findElement(By.cssSelector("a[class='login']")).click();
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(userName);
        driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(passWord);
        driver.findElement(By.cssSelector("button[id='SubmitLogin']")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

    public void logIn(String uName, String pwd){
    driver.findElement(By.cssSelector("input[id='email']")).sendKeys(uName);
    driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(pwd);
    driver.findElement(By.cssSelector("button[id='SubmitLogin']")).click();
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }
//enter valid user name & password to go on my account page

//enter product type in search field
   @Test
    public void productSearch()
    {

        searchProduct(product);
    }
    public void searchProduct(String productName)
    {
     driver.findElement(By.id("search_query_top")).sendKeys(productName);
     driver.findElement(By.cssSelector("button[class*='btn btn-default button-search']")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
//click logout

// close browser
    @AfterClass
    public static void closeBrowser()
    {
    driver.close();
    }


}
