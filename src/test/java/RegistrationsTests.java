import navigation.CorrectAuthenticationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import navigation.HomePage;
import navigation.LogInPage;
import navigation.RegistrationPage;

public class RegistrationsTests extends TestBase {

    HomePage homePage = new HomePage(driver);
    LogInPage loginPage = new LogInPage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);
    CorrectAuthenticationPage correctAuthenticationPage = new CorrectAuthenticationPage(driver);

    @Test
    void shouldFailNewCustomerRegistration()
    {
        homePage.clickSignInButton();
        loginPage.generateAndEnterEmail();
        loginPage.clickOnCreateAnAccountButton();
        registrationPage.incompleteFillInRegisterForm();
        registrationPage.clickOnRegisterButtonWithoutAllRequiredData();
        Assertions.assertTrue(registrationPage.alertIsDisplayed());
    }

    @Test
    void shouldRegisterNewCustomer()
    {
        homePage.clickSignInButton();
        loginPage.generateAndEnterEmail();
        loginPage.clickOnCreateAnAccountButton();
        registrationPage.fillInRegisterForm();
        registrationPage.clickOnRegisterButtonWithAllRequiredData();
        Assertions.assertTrue(correctAuthenticationPage.newUserWasRegistered());
        correctAuthenticationPage.clickSignOutButton();
        loginPage.clickOnLogo();
    }
}
