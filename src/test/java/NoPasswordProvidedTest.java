import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoPasswordProvidedTest extends TestBase{

    @Test
    public void shouldLoginWithoutEmailProvided(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSigninButton();
        NoPasswordErrorPage noPasswordErrorPage = loginPage.clickLoginButtonWithoutPassword("test@softie.pl");
        Assertions.assertTrue(noPasswordErrorPage.noPasswordCommunicatIsDisplayed());
    }
}
