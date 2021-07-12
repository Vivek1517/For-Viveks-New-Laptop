package HomeInterface;

import org.openqa.selenium.WebDriver;

public interface TestPractice {
   public String browser="chrome";
    String url= "http://automationpractice.com/index.php";
    String userName= "vicky_sturd@hotmail.com";
    String passWord= "Vivek123";
    String productSearch = "Dress";
    public void openBrowser(String browserName);
    public void clickSignIn();
    public void logIn(String uName, String pwd);
    public void searchProduct(String product);
    public void waitTime(long seconds);
}
