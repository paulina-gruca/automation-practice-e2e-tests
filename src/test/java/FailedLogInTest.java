import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.FailedAuthenticationPage;
import pages.HomePage;
import pages.LogInPage;

public class FailedLogInTest extends TestBase{

    @Test
    public void shouldFailWithIncorrectPassword()
    {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.enterLogin("test@softie.pl");
        loginPage.enterPassword("wrongPass");
        loginPage.clickLogInButtonWithIncorrectPassword();
        FailedAuthenticationPage failedAuthentication = new FailedAuthenticationPage(driver);
        Assertions.assertTrue(failedAuthentication.errorCommunicateIsDisplayed());

    }
}
