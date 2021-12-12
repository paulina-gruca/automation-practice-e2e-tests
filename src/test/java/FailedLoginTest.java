import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailedLoginTest extends TestBase{

    @Test
    public void shouldFailWithIncorrectPassword(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSigninButton();
        loginPage.enterLogin("test@softie.pl");
        loginPage.enterPassword("wrongPass");
        FailedAuthenticationPage failedAuthentication = loginPage.clickLoginButtonWithIncorrectPassword();
        Assertions.assertTrue(failedAuthentication.errorCommunicatIsDisplayed());

    }
}
