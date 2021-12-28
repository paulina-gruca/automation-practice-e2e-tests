import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.NoEmailErrorPage;

public class NoEmailProvidedTest extends TestBase{

    @Test
    public void shouldFailLoggingInWithoutEmailProvided()
    {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.clickLogInButtonWithoutEmail("1qaz!QAZ");
        NoEmailErrorPage noEmailErrorPage = new NoEmailErrorPage(driver);
        Assertions.assertTrue(noEmailErrorPage.noEmailCommunicateIsDisplayed());
    }
}
