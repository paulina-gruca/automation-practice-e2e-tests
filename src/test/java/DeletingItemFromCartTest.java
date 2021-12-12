import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeletingItemFromCartTest extends TestBase {

    @Test
    public void shouldDeleteItemFromCart(){
        HomePage homePage = new HomePage(driver);
        homePage.searchItems("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAddToCartButton();
        CartPage cartPage = searchPage.clickProceedCheckOutButton();
        cartPage.clickDeleteButton();
        Assertions.assertTrue(cartPage.itemWasDeletedFromCart());
    }

}
