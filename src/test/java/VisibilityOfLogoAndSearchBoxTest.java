import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LogInPage;

public class VisibilityOfLogoAndSearchBoxTest extends TestBase {

    @Test
    public void shouldLogoAndSearchBoxBeVisibleOnHomeAndLoginPages()
    {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.logoIsDisplayed());
        Assertions.assertTrue(homePage.searchAreaIsDisplayed());
        homePage.clickSignInButton();
        LogInPage loginPage = new LogInPage(driver);
        Assertions.assertTrue(loginPage.logoIsDisplayed());
        Assertions.assertTrue(loginPage.searchAreaIsDisplayed());
    }
}
