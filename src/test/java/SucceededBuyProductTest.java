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
        searchPage.clickProceedToCheckOutButton();
        CartPage cartPage = new CartPage(driver);
        Assertions.assertTrue(cartPage.productIsAddedToCart());
        cartPage.clickProceedToCheckOutButton();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.enterCorrectLogInDataAndClickLogInButton("test@softie.pl", "1qaz!QAZ");
        loginPage.clickLogInButton();
        AddressPage addressPage = new AddressPage(driver);
        addressPage.fillInMessageArea("Hello");
        addressPage.clickOnProceedToCheckOutButton();
        ShippingPage shippingPage = new ShippingPage(driver);
        shippingPage.clickProceedToCheckOutButtonAndDismissErrorMessage();
        shippingPage.confirmTermsOfServiceAndClickOnProceedToCheckOutButton();
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.choosePayByBankOption();
        Assertions.assertTrue(paymentPage.bankWirePaymentHeadingIsDisplayed());
        paymentPage.clickOnConfirmationButton();
        Assertions.assertTrue(paymentPage.orderConfirmationHeadingIsDisplayed());
    }
}
