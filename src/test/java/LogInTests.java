import navigation.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogInTests extends TestBase{

    HomePage homePage = new HomePage(driver);
    LogInPage loginPage = new LogInPage(driver);
    FailedAuthenticationPage failedAuthentication = new FailedAuthenticationPage(driver);
    NoEmailErrorPage noEmailErrorPage = new NoEmailErrorPage(driver);
    NoPasswordErrorPage noPasswordErrorPage = new NoPasswordErrorPage(driver);
    CorrectAuthenticationPage correctAuthenticationPage = new CorrectAuthenticationPage(driver);

    private static final String CORRECT_LOGIN = "test@softie.pl";
    private static final String CORRECT_PASSWORD = "1qaz!QAZ";

    private static final String INCORRECT_LOGIN = "tset@softie.pl";
    private static final String INCORRECT_PASSWORD = "wrongPass";

    @Test
    void shouldLogInWithCorrectPasswordAndLogOut()
    {
        homePage.clickSignInButton();
        loginPage.enterCorrectLogInData(CORRECT_LOGIN, CORRECT_PASSWORD);
        loginPage.clickLogInButton();
        Assertions.assertTrue(correctAuthenticationPage.userIsLoggedIn());
        Assertions.assertTrue(correctAuthenticationPage.loggedUserButtonIsDisplayed());
        correctAuthenticationPage.clickSignOutButton();
        Assertions.assertTrue(loginPage.loginPageTitleIsDisplayed());
        loginPage.clickOnLogo();
    }

    @Test
    void shouldFailWithIncorrectPassword()
    {
        homePage.clickSignInButton();
        loginPage.enterLogin(INCORRECT_LOGIN);
        loginPage.enterPassword(INCORRECT_PASSWORD);
        loginPage.clickLogInButtonWithIncorrectPassword();
        Assertions.assertTrue(failedAuthentication.errorCommunicateIsDisplayed());
        failedAuthentication.clickOnLogo();
    }

    @Test
    void shouldFailLoggingInWithoutEmailProvided()
    {
        homePage.clickSignInButton();
        loginPage.clickLogInButtonWithoutEmail(CORRECT_PASSWORD);
        Assertions.assertTrue(noEmailErrorPage.noEmailCommunicateIsDisplayed());
        noEmailErrorPage.clickOnLogo();
    }

    @Test
    void shouldFailLoggingInWithoutPasswordProvided()
    {
        homePage.clickSignInButton();
        loginPage.clickLogInButtonWithoutPassword(CORRECT_LOGIN);
        Assertions.assertTrue(noPasswordErrorPage.noPasswordCommunicateIsDisplayed());
        noPasswordErrorPage.clickOnLogo();
    }
}
