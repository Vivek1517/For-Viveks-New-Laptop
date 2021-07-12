import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

    public class AutomationLibraries extends BaseTest {

    //verify user is able to choose method of payment from the drop down list
    public void chooseMethodOfPayment(String currency) {
    selectCurrency(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")), currency);
    }
    //verifying method of payment
    public boolean verifyPayment()
    {
    boolean currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).isDisplayed();
    return currency;
    }
    //re usable select method for way of payment
    public void selectCurrency(WebElement element, String currency) {
        Select currencyType = new Select(element);
        currencyType.selectByVisibleText(currency);
    }

    //verify user is able to choose adults & childrens from the passengers drop down list
    public void choosePassenger(int adult, int children) {
    driver.findElement(By.id("divpaxinfo")).click();
    selectPassenger(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")), adult);
    selectPassenger(driver.findElement(By.name("ctl00$mainContent$ddl_Child")), children);
    }
    //verify 7 adults & 2 childrens are chosen from the passenger list
    public boolean verifyAdultPassengers()
    {
    boolean adultDisplay = driver.findElement(By.name("ctl00$mainContent$ddl_Adult")).isDisplayed();
    return adultDisplay;
    }
    public boolean verifyChildPassengers()
    {
    boolean childDisplay = driver.findElement(By.name("ctl00$mainContent$ddl_Child")).isDisplayed();
    return childDisplay;
    }
    public void selectPassenger(WebElement element, int passenger) {
        Select numberOfAdult = new Select(element);
        numberOfAdult.selectByIndex(passenger);
        Select numberOfChildren = new Select(element);
        numberOfChildren.selectByIndex(passenger);
    }

    //verify user can choose departure & arrival city from the drop down list
    public void selectDestination(String departureCity, String destinationCity) {
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        WebElement from = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']"));
        from.sendKeys(departureCity);
        if (departureCity.equalsIgnoreCase("Goa ")) {
            from.click();
        }
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement to = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']"));
        to.sendKeys(destinationCity);
        if (destinationCity.equalsIgnoreCase("Mumbai ")) {
            to.click();
        }
    }

    //verify user is able to choose out & inbound month & date for their arrival
    public void chooseMonthAndDateForReturnJourney(String month, String departureDate, String returnDate) {
    driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
    while(!driver.findElement(By.cssSelector("div[class*='ui-datepicker-header'] div[class='ui-datepicker-title']")).getText().contains(month))
    {
    driver.findElement(By.cssSelector("a[class*='ui-datepicker-next']")).click();
    }
    List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
    int count = dates.size();
    for(int i=0; i<count; i++)
    {
     String fromDate= driver.findElements(By.className("ui-state-default")).get(i).getText();
     if(fromDate.equalsIgnoreCase("6"))
     {
     driver.findElements(By.className("ui-state-default")).get(i).click();
     break;
     }
    }
    driver.findElement(By.className("picker-second")).click();
    List<WebElement> dates1 = driver.findElements(By.className("ui-state-default"));
    int count1 = dates1.size();
    for(int i=0; i<count1; i++)
    {
     String toDate = driver.findElements(By.className("ui-state-default")).get(i).getText();
     if(toDate.equalsIgnoreCase("12"))
     {
     driver.findElements(By.className("ui-state-default")).get(i).click();
     break;
     }
    }

    }
}


