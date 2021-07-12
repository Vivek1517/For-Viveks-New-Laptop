package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.cssSelector("a[href*='windows']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String extraWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
    }
}
// driver.findElement(By.cssSelector("a[href*='windows']")).click();
//         Set<String> window = driver.getWindowHandles();
//        Iterator<String> it = window.iterator();
//        String parentWindow= it.next();
//        String blankWindow = it.next();
//        String childWindow= it.next();
//        driver.switchTo().window(childWindow);
//        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
//        driver.switchTo().window(parentWindow);
//        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());