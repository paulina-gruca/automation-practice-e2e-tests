import navigation.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartTests extends TestBase{

    HomePage homePage = new HomePage(driver);
    SearchPage searchPage = new SearchPage(driver);
    CartPage cartPage = new CartPage(driver);
    LogInPage loginPage = new LogInPage(driver);
    AddressPage addressPage = new AddressPage(driver);
    ShippingPage shippingPage = new ShippingPage(driver);
    PaymentPage paymentPage = new PaymentPage(driver);

    private static final String CORRECT_LOGIN = "test@softie.pl";
    private static final String CORRECT_PASSWORD = "1qaz!QAZ";

    @Test
    void shouldAddProductToCart()
    {
        homePage.searchProducts("dress");
        searchPage.clickAddToCartButton();
        Assertions.assertTrue(searchPage.productIsAddedToCart());
        searchPage.clickOnCrossSign();
        searchPage.clickOnLogo();
    }

    @Test
    void shouldDeleteProductFromCart()
    {
        homePage.searchProducts("dress");
        searchPage.clickAddToCartButton();
        searchPage.clickProceedToCheckOutButton();
        cartPage.clickDeleteButtonToRemoveProduct();
        Assertions.assertTrue(cartPage.productIsDeletedFromCart());
        cartPage.clickOnLogo();
    }

    @Test
    void shouldBuyProduct()
    {
        homePage.searchProducts("dress");
        searchPage.clickAddToCartButton();
        searchPage.clickProceedToCheckOutButton();
        Assertions.assertTrue(cartPage.productIsAddedToCart());
        cartPage.clickProceedToCheckOutButton();
        loginPage.enterCorrectLogInData(CORRECT_LOGIN, CORRECT_PASSWORD);
        loginPage.clickLogInButton();
        addressPage.fillInMessageArea("Hello");
        addressPage.clickOnProceedToCheckOutButton();
        shippingPage.clickProceedToCheckOutButtonAndDismissErrorMessage();
        shippingPage.confirmTermsOfServiceAndClickOnProceedToCheckOutButton();
        paymentPage.choosePayByBankOption();
        Assertions.assertTrue(paymentPage.bankWirePaymentHeadingIsDisplayed());
        paymentPage.clickOnConfirmationButton();
        Assertions.assertTrue(paymentPage.orderConfirmationHeadingIsDisplayed());
    }
}
