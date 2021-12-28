import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import navigation.HomePage;
import navigation.LogInPage;

public class VisibilityOfElementsTest extends TestBase {

    HomePage homePage = new HomePage(driver);
    LogInPage loginPage = new LogInPage(driver);

    @Test
    void shouldLogoAndSearchBoxBeVisibleOnHomeAndLoginPages()
    {
        Assertions.assertTrue(homePage.logoIsDisplayed());
        Assertions.assertTrue(homePage.searchAreaIsDisplayed());
        homePage.clickSignInButton();
        Assertions.assertTrue(loginPage.logoIsDisplayed());
        Assertions.assertTrue(loginPage.searchAreaIsDisplayed());
    }
}
