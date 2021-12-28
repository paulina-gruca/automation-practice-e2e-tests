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
        homePage.clickSignInButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.enterCorrectLogInDataAndClickLogInButton("test@softie.pl", "1qaz!QAZ");
        CorrectAuthenticationPage correctAuthenticationPage = new CorrectAuthenticationPage(driver);
        Assertions.assertTrue(correctAuthenticationPage.userIsLoggedIn());
        Assertions.assertTrue(correctAuthenticationPage.loggedUserButtonIsDisplayed());
        correctAuthenticationPage.clickSignOutButton();
        Assertions.assertTrue(loginPage.loginPageTitleIsDisplayed());
    }
}
