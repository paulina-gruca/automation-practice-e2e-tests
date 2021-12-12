import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LogInPage;

public class VisibilityOfLogoAndSearchBoxTest extends TestBase {

    @Test
    public void shouldLogoAndSearchAreaBeVisibleOnHomeAndLoginPages(){
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.logoIsDisplayed());
        Assertions.assertTrue(homePage.searchAreaIsDisplayed());
        LogInPage loginPage = homePage.clickSignInButton();
        Assertions.assertTrue(loginPage.logoIsDisplayed());
        Assertions.assertTrue(loginPage.searchAreaIsDisplayed());
    }

}