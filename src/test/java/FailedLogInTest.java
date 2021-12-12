import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.FailedAuthenticationPage;
import pages.HomePage;
import pages.LogInPage;

public class FailedLogInTest extends TestBase{

    @Test
    public void shouldFailWithIncorrectPassword(){
        HomePage homePage = new HomePage(driver);
        LogInPage loginPage = homePage.clickSignInButton();
        loginPage.enterLogin("test@softie.pl");
        loginPage.enterPassword("wrongPass");
        FailedAuthenticationPage failedAuthentication = loginPage.clickLogInButtonWithIncorrectPassword();
        Assertions.assertTrue(failedAuthentication.errorCommunicateIsDisplayed());

    }
}
