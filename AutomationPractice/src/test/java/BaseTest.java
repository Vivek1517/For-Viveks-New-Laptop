import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class BaseTest extends BaseClass {

    public static AutomationLibrary al;
    @BeforeClass
    public static void obj(){
    al = new AutomationLibrary();
    }
    @Before
    public void open(){
    openBrowser(browser);
    }
    public void openBrowser(String browserName){
    if(browserName.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
    }
    if(browserName.equalsIgnoreCase("fire fox")){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--incognito");
        driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.get(url);
    }
    public void closeBrowser(){
    driver.close();
    }

}
