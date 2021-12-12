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
        LogInPage loginPage = homePage.clickSignInButton();
        loginPage.generateAndEnterEmail();
        RegistrationPage registrationPage = loginPage.clickOnCreateAnAccountButton();
        registrationPage.fillInRegisterForm();
        CorrectAuthenticationPage correctAuthenticationPage = registrationPage.clickOnRegisterButtonWithAllRequiredData();
        Assertions.assertTrue(correctAuthenticationPage.newUserWasRegistered());
    }
}
