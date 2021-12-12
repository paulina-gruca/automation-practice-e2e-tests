import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailedRegistrationTest extends TestBase {

    @Test
    public void shouldFailRegisterNewCustomer(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSigninButton();
        loginPage.createAnEmail();
        RegistrationPage registrationPage = loginPage.clickOnCreateAnAccountButton();
        registrationPage.fillInRegisterForm();
        registrationPage.clickOnRegisterButtonWithoutAllRequiredData();
        Assertions.assertTrue(registrationPage.alertIsDisplayed());
    }

}
