import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HomePage;
import pages.SearchPage;

public class DeletingProductFromCartTest extends TestBase {

    @Test
    public void shouldDeleteProductFromCart()
    {
        HomePage homePage = new HomePage(driver);
        homePage.searchProducts("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAddToCartButton();
        searchPage.clickProceedToCheckOutButton();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickDeleteButtonToRemoveProduct();
        Assertions.assertTrue(cartPage.productIsDeletedFromCart());
    }
}
