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
        homePage.clickSignInButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.generateAndEnterEmail();
        loginPage.clickOnCreateAnAccountButton();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.incompleteFillInRegisterForm();
        registrationPage.clickOnRegisterButtonWithoutAllRequiredData();
        Assertions.assertTrue(registrationPage.alertIsDisplayed());
    }
}
