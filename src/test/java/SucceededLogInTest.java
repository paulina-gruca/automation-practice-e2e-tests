import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CorrectAuthenticationPage;
import pages.HomePage;
import pages.LogInPage;

public class SucceededLogInTest extends TestBase{

    @Test
    public void shouldLogInWithCorrectPasswordAndLogOut()
    {
        HomePage homePage = new HomePage(driver);
        LogInPage loginPage = homePage.clickSignInButton();
        loginPage.enterCorrectLogInData("test@softie.pl", "1qaz!QAZ");
        CorrectAuthenticationPage correctAuthenticationPage = loginPage.clickLogInButtonWithCorrectPassword();
        Assertions.assertTrue(correctAuthenticationPage.userIsLoggedIn());
        Assertions.assertTrue(correctAuthenticationPage.loggedUserButtonIsDisplayed());
        loginPage = correctAuthenticationPage.clickSignOutButton();
        Assertions.assertTrue(loginPage.loginPageTitleIsDisplayed());
    }
}
