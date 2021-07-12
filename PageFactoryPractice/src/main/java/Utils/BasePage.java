package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasePage {
    public static String url = "http://automationpractice.com/index.php";
    public static WebDriver driver;
    public static String browser = "chrome";
    public static String email = "vicky_sturd@hotmail.com";
    public static String password = "Vivek123";
    public static void goToSite(){
        openBrowser(browser);
    }
    public static void openBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--incognito");
            driver = new ChromeDriver(chromeOptions);
        }
        if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--incognito");
            driver = new FirefoxDriver(firefoxOptions);
        }
        driver.manage().window().maximize();
        driver.get(url);
    }
}
