import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.NoPasswordErrorPage;

public class NoPasswordProvidedTest extends TestBase{

    @Test
    public void shouldFailLoggingInWithoutEmailProvided()
    {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.clickLogInButtonWithoutPassword("test@softie.pl");
        NoPasswordErrorPage noPasswordErrorPage = new NoPasswordErrorPage(driver);
        Assertions.assertTrue(noPasswordErrorPage.noPasswordCommunicateIsDisplayed());
    }
}
