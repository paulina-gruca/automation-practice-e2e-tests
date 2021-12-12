import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoEmailProvidedTest extends TestBase{

    @Test
    public void shouldLoginWithoutEmailProvided(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSigninButton();
        NoEmailErrorPage noEmailErrorPage = loginPage.clickLoginButtonWithoutEmail("1qaz!QAZ");
        Assertions.assertTrue(noEmailErrorPage.noEmailCommunicatIsDisplayed());
    }
}
