package HomeInterface;

public class RunTestPractice {
    static int x = 1;
    public static void main(String[] args) {
        ImplementTestPractice run = new ImplementTestPractice();
        run.openBrowser(run.browser);
        run.clickSignIn();
        run.logIn(run.userName, run.passWord);
        run.searchProduct(run.productSearch);
        run.closeBrowser();


    }
}
