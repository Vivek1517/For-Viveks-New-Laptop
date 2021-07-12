package Regression;

import Utils.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest extends BasePage {

    @BeforeClass
    public static void goToSite(){
    openBrowser(browser);
    }
    public static void openBrowser(String browser){
    if(browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
    }
    if(browser.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--incognito");
        driver = new FirefoxDriver(firefoxOptions);
    }
    driver.manage().window().maximize();
    driver.get(url);
    }
}
