import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SucceededBuyItemTest extends TestBase{

    @Test
    public void shouldBuyItem(){
        HomePage homePage = new HomePage(driver);
        homePage.searchItems("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAddToCartButton();
        CartPage cartPage = searchPage.clickProceedCheckOutButton();
        Assertions.assertTrue(cartPage.itemWasAddedToCart());
        cartPage.clickProceedToCheckOutButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCorrectLogInData("test@softie.pl", "1qaz!QAZ");
        AddressPage addressPage = loginPage.clickLoginButton();
        addressPage.fillInMessageArea("Hello");
        ShippingPage shippingPage = addressPage.clickOnProceedToCheckOutButton();
        shippingPage.checkErrorProcedure();
        PaymentPage paymentPage = shippingPage.confirmTermsOfServiceAndClickOnProceedToCheckOutButton();
        paymentPage.choosePayByBankOption();
        Assertions.assertTrue(paymentPage.correctHeadingIsDisplayed());
        paymentPage.clickOnConfirmationButton();
        Assertions.assertTrue(paymentPage.orderConfirmationHeadingIsDisplayed());
    }

}
