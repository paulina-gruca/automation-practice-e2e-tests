import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import navigation.*;

public class SucceededBuyProductProcessTest extends TestBase{

    BuyProductProcess buyProductProcess = new BuyProductProcess(driver);

    private static final String CORRECT_LOGIN = "test@softie.pl";
    private static final String CORRECT_PASSWORD = "1qaz!QAZ";

    @Test
    void shouldBuyProduct()
    {
        buyProductProcess.searchProducts("dress");
        buyProductProcess.clickAddToCartButton();
        buyProductProcess.clickProceedToCheckOutButton1();
        Assertions.assertTrue(buyProductProcess.productIsAddedToCart());
        buyProductProcess.clickProceedToCheckOutButton2();
        buyProductProcess.enterCorrectLogInData(CORRECT_LOGIN, CORRECT_PASSWORD);
        buyProductProcess.clickOnProceedToCheckOutButton3();
        buyProductProcess.confirmTermsOfServiceAndClickOnProceedToCheckOutButton4();
        buyProductProcess.choosePayByBankOption();
        Assertions.assertTrue(buyProductProcess.bankWirePaymentHeadingIsDisplayed());
        buyProductProcess.clickOnConfirmationButton();
        Assertions.assertTrue(buyProductProcess.orderConfirmationHeadingIsDisplayed());
    }
}
