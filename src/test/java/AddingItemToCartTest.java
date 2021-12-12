import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddingItemToCartTest extends TestBase{

    @Test
    public void shouldAddItemToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.searchItems("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAddToCartButton();
        Assertions.assertTrue(searchPage.itemWasAddedToCart());
    }
}
