import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SucceededLoginTest extends TestBase{

    @Test
    public void shouldLoginWithCorrectPasswordAndLogout(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSigninButton();
        loginPage.enterCorrectLogInData("test@softie.pl", "1qaz!QAZ");
        CorrectAuthenticationPage correctAuthentication = loginPage.clickLoginButtonWithCorrectPassword();
        Assertions.assertTrue(correctAuthentication.userIsLoggedIn());
        Assertions.assertTrue(correctAuthentication.loggedUserIsDisplayed());
        correctAuthentication.clickSignOutButton();
        Assertions.assertTrue(loginPage.loginPageTitleIsDisplayed());
    }
}
