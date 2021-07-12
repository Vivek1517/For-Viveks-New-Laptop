package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingCookies {
    public static void main(String[] args) {
        String url = "https://www.clarks.co.uk/";
        String email="vicky_sturd@hotmail.com";
        String name = "Vivek";
        String surName="Salgaonkar";
        String pwd = "Vivek1979";
        System.setProperty("webdriver.gecko.driver","src/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());
        for(Cookie cookie:cookies){
            System.out.println("Name: "+ cookie.getName());
            System.out.println("Domain: "+cookie.getDomain());
            System.out.println("Path: "+cookie.getPath());
            System.out.println("Value: "+cookie.getValue());
            driver.manage().addCookie(cookie);
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).click();*/
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.cssSelector(".text-center.create-account-link.js-create-account-link")).click();
        driver.findElement(By.cssSelector("#txtUserEmail")).sendKeys(email);
        driver.findElement(By.cssSelector("#firstName")).sendKeys(name);
        driver.findElement(By.cssSelector("#surname")).sendKeys(surName);
        driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
        driver.findElement(By.cssSelector("#accRegChkRememberMe_label")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.xpath("//button[contains(text(),'CREATE ACCOUNT')]")).click();
    }

}
    /*public List<WebElement> handlePopup() {
        WebElement popUp = driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]"));
        return driver.findElements((By) popUp);

    }
    public void clickPopUp() {
        if (handlePopup().size() > 0) {
            WebElement popUp = driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]"));
            popUp.click();*//*
       *//* } else {
            driver.findElement(By.linkText("Log in / Register")).click*/