import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.NoPasswordErrorPage;

public class NoPasswordProvidedTest extends TestBase{

    @Test
    public void shouldLoginWithoutEmailProvided(){
        HomePage homePage = new HomePage(driver);
        LogInPage loginPage = homePage.clickSignInButton();
        NoPasswordErrorPage noPasswordErrorPage = loginPage.clickLogInButtonWithoutPassword("test@softie.pl");
        Assertions.assertTrue(noPasswordErrorPage.noPasswordCommunicateIsDisplayed());
    }
}
