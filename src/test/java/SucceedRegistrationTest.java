import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CorrectAuthenticationPage;
import pages.HomePage;
import pages.LogInPage;
import pages.RegistrationPage;

public class SucceedRegistrationTest extends TestBase {

    @Test
    public void shouldRegisterNewCustomer()
    {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.generateAndEnterEmail();
        loginPage.clickOnCreateAnAccountButton();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.fillInRegisterForm();
        registrationPage.clickOnRegisterButtonWithAllRequiredData();
        CorrectAuthenticationPage correctAuthenticationPage = new CorrectAuthenticationPage(driver);
        Assertions.assertTrue(correctAuthenticationPage.newUserWasRegistered());
    }
}
