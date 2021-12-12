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
        LogInPage loginPage = homePage.clickSignInButton();
        NoEmailErrorPage noEmailErrorPage = loginPage.clickLogInButtonWithoutEmail("1qaz!QAZ");
        Assertions.assertTrue(noEmailErrorPage.noEmailCommunicateIsDisplayed());
    }
}
