import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.RegistrationPage;

public class FailedRegistrationTest extends TestBase {

    @Test
    public void shouldFailNewCustomerRegistration()
    {
        HomePage homePage = new HomePage(driver);
        LogInPage loginPage = homePage.clickSignInButton();
        loginPage.generateAndEnterEmail();
        RegistrationPage registrationPage = loginPage.clickOnCreateAnAccountButton();
        registrationPage.incompleteFillInRegisterForm();
        registrationPage.clickOnRegisterButtonWithoutAllRequiredData();
        Assertions.assertTrue(registrationPage.alertIsDisplayed());
    }
}
