import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class SucceededBuyProductTest extends TestBase{

    @Test
    public void shouldBuyProduct()
    {
        HomePage homePage = new HomePage(driver);
        homePage.searchProducts("dress");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickAddToCartButton();
        CartPage cartPage = searchPage.clickProceedToCheckOutButton();
        Assertions.assertTrue(cartPage.productWasAddedToCart());
        cartPage.clickProceedToCheckOutButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.enterCorrectLogInData("test@softie.pl", "1qaz!QAZ");
        AddressPage addressPage = loginPage.clickLogInButton();
        addressPage.fillInMessageArea("Hello");
        ShippingPage shippingPage = addressPage.clickOnProceedToCheckOutButton();
        shippingPage.clickProceedToCheckOutButtonAndDismissErrorMessage();
        PaymentPage paymentPage = shippingPage.confirmTermsOfServiceAndClickOnProceedToCheckOutButton();
        paymentPage.choosePayByBankOption();
        Assertions.assertTrue(paymentPage.bankWirePaymentHeadingIsDisplayed());
        paymentPage.clickOnConfirmationButton();
        Assertions.assertTrue(paymentPage.orderConfirmationHeadingIsDisplayed());
    }
}
