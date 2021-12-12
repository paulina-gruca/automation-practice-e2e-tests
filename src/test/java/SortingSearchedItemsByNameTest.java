import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class SortingSearchedItemsByNameTest extends TestBase{

    @Test
    public void shouldSortBySearchedItems(){
        HomePage homePage = new HomePage(driver);
        homePage.searchItems("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.sortByItems();
        Assertions.assertTrue(searchPage.itemsAreSortedBy());
    }
}
