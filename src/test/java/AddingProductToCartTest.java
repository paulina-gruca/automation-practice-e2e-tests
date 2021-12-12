import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SearchPage;

public class AddingProductToCartTest extends TestBase{

    @Test
    public void shouldAddProductToCart()
    {
        HomePage homePage = new HomePage(driver);
        homePage.searchProducts("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAddToCartButton();
        Assertions.assertTrue(searchPage.productIsAddedToCart());
    }
}
