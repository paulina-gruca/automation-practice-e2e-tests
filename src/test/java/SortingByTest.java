import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import navigation.HomePage;
import navigation.SearchPage;

public class SortingByTest extends TestBase{

    HomePage homePage = new HomePage(driver);
    SearchPage searchPage = new SearchPage(driver);

    @Test
    void shouldSortProductsByName()
    {
        homePage.searchProducts("dress");
        searchPage.sortByProductName();
        Assertions.assertTrue(searchPage.productsAreSortedByName());
    }
}
