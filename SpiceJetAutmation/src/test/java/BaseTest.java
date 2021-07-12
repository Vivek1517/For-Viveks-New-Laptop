import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
    public static String url = "https://www.spicejet.com/";
    public static String browser = "Chrome";
    public static WebDriver driver;
    public static AutomationLibraries al;

    @BeforeClass
    public static void start()
    {
     al = new AutomationLibraries();
    }
    @Before
    public void openURL()
    {
    openBrowser(browser);
    }
    public void openBrowser(String browserName)
    {
     if(browserName.equalsIgnoreCase("chrome"))
     {
     WebDriverManager.chromedriver().setup();
     ChromeOptions chromeOptions = new ChromeOptions();
     chromeOptions.addArguments("--incognito");
     driver = new ChromeDriver(chromeOptions);
     //driver = new ChromeDriver();
     }
     if(browserName.equalsIgnoreCase("fire fox"))
     {
     WebDriverManager.firefoxdriver().setup();
     driver = new FirefoxDriver();
     }
     driver.manage().window().maximize();
     driver.get(url);
    }
   // @After
    public void closeBrowser()
    {
    driver.quit();
    }

}
