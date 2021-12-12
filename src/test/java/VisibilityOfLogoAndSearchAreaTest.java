import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisibilityOfLogoAndSearchAreaTest extends TestBase {

    @Test
    public void shouldLogoAndSearchAreaBeVisibleOnHomeAndLoginPages(){
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.logoIsDisplayed());
        Assertions.assertTrue(homePage.searchAreaIsDisplayed());
        LoginPage loginPage = homePage.clickSigninButton();
        Assertions.assertTrue(loginPage.logoIsDisplayed());
        Assertions.assertTrue(loginPage.searchAreaIsDisplayed());
    }

}
