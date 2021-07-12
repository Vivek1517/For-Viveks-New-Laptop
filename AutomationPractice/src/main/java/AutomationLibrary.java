import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AutomationLibrary extends BaseClass {
// rollover on women category and select casual dresses
// user should be able to navigate to women category from home page
    public void navigateToWomanCategory(){
    a = new Actions(driver);
    a.moveToElement(driver.findElement(By.cssSelector("div[id ='block_top_menu'] a[title='Women']"))).build().perform();
    driver.findElement(By.cssSelector("ul[class='submenu-container clearfix first-in-line-xs'] li a[title='Casual Dresses'] ")).click();
    }
// verify user is on Women category page
    public String verifyUserOnWomenPage(){
    WebElement womenPage = driver.findElement(By.cssSelector("div[class='breadcrumb clearfix'] a[title='Dresses']"));
    String womenPageStatus = womenPage.getText();
    return womenPageStatus;
    }
// enter a product type in search field
// user should be able to enter a product & search using search field
    public void searchProduct(String product){
    driver.findElement(By.id("search_query_top")).sendKeys(product);
    List<WebElement> options = driver.findElements(By.className("ac_results"));
    for(WebElement option:options){
    if(option.getText().equalsIgnoreCase("printed dress")){
    option.click();
    break;
    }
    }
    driver.findElement(By.name("submit_search")).click();
    }
// verify user is on printed dress page
    public String verifyUserOnPrintedDressPage(){
    WebElement page = driver.findElement(By.cssSelector("span[class='lighter']"));
    String pageStatus = page.getText();
    return pageStatus;
    }
//user should be able to click on summer dresses under Women category
    public void clickOnSummerDresses(){
    a = new Actions(driver);
    a.moveToElement(driver.findElement(By.cssSelector("div[id ='block_top_menu'] a[title='Women']"))).build().perform();
    driver.findElement(By.cssSelector("ul[class='submenu-container clearfix first-in-line-xs'] li a[title='Summer Dresses']")).click();
    a.moveToElement(driver.findElement(By.xpath("//ul[contains(@class,'product_list')]/li[2]"))).build().perform();
    driver.findElement(By.xpath("//ul[contains(@class,'product_list')]/li[2]/div/div[2]/div[2]/a[1]")).click();
    }
//verify user is on Summer Dresses page
    public boolean veirfyUserOnSummerDressesPage(){
    WebElement page = driver.findElement(By.cssSelector("div[class='cat_desc']"));
    boolean pageStatus = page.isDisplayed();
    return pageStatus;
    }
}
