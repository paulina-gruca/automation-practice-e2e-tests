import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HomePage;
import pages.SearchPage;

public class DeletingProductFromCartTest extends TestBase {

    @Test
    public void shouldDeleteItemFromCart(){
        HomePage homePage = new HomePage(driver);
        homePage.searchProducts("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAddToCartButton();
        CartPage cartPage = searchPage.clickProceedToCheckOutButton();
        cartPage.clickDeleteButtonToRemoveProduct();
        Assertions.assertTrue(cartPage.productWasDeletedFromCart());
    }

}
