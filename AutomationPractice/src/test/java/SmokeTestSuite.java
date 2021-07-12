import org.junit.Assert;
import org.junit.Test;

public class SmokeTestSuite extends BaseTest {
    static String productSearch = "printed dress";
    @Test
    public void navigateToWomenCategory(){
    al.navigateToWomanCategory();
    Assert.assertEquals("Dresses",al.verifyUserOnWomenPage());
    }
    @Test
    public void searchProduct(){
    al.searchProduct(productSearch);
    Assert.assertEquals('"' + "PRINTED DRESS" + '"',al.verifyUserOnPrintedDressPage());
    }
    @Test
    public void clickOnSummerDresser(){
    al.clickOnSummerDresses();
    Assert.assertTrue(al.veirfyUserOnSummerDressesPage());
    }

}
