package ConfigProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPageProperties {
    public static void main(String[] args) throws IOException {
        WebDriver driver =null;
        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream("E:/Java Project/PageFactoryPractice/src/main/java/ConfigProperties/Login.properties");
        prop.load(ip);
        System.out.println(prop.getProperty("browser"));
        String browserName = prop.getProperty("browser");

        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--incognito");
            driver = new ChromeDriver(chromeOptions);
        }
        else{
            System.out.println("Browser value is empty");
        }
       driver.get(prop.getProperty("url"));
       driver.findElement(By.cssSelector(prop.getProperty("clicklogin_css"))).click();
       driver.findElement(By.cssSelector(prop.getProperty("username_css"))).sendKeys(prop.getProperty("username"));
       driver.findElement(By.cssSelector(prop.getProperty("password_css"))).sendKeys(prop.getProperty("password"));
       driver.findElement(By.id(prop.getProperty("clickSubmit_id"))).click();
       driver.quit();
    }
}
