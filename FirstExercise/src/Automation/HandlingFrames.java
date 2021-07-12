package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Drag and Drop")).click();
        Actions a = new Actions(driver);
        WebElement columnA = driver.findElement(By.id("column-a"));
        WebElement columnB = driver.findElement(By.id("column-b"));
        a.dragAndDrop(columnA,columnB).build().perform();
    }
}
