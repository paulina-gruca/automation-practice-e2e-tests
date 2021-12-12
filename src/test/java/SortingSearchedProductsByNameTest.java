import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SearchPage;

public class SortingSearchedProductsByNameTest extends TestBase{

    @Test
    public void shouldSortBySearchedItems(){
        HomePage homePage = new HomePage(driver);
        homePage.searchProducts("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.sortByProductName();
        Assertions.assertTrue(searchPage.productsAreSortedByName());
    }
}
