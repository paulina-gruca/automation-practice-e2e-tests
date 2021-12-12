import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SucceedRegistrationTest extends TestBase {

    @Test
    public void shouldRegisterNewCustomer(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSigninButton();
        loginPage.createAnEmail();
        RegistrationPage registrationPage = loginPage.clickOnCreateAnAccountButton();
        registrationPage.fillInRegisterForm();
        CorrectAuthenticationPage correctAuthenticationPage = registrationPage.clickOnRegisterButtonWithAllRequiredData();
        Assertions.assertTrue(correctAuthenticationPage.newUserWasRegistered());
    }

}
