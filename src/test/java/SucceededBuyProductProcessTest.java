import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class SucceededBuyProductProcessTest extends TestBase{

    @Test
    public void shouldBuyProduct()
    {
        BuyProductProcess buyProductProcess = new BuyProductProcess(driver);
        buyProductProcess.searchProducts("dress");
        buyProductProcess.clickAddToCartButton();
        buyProductProcess.clickProceedToCheckOutButton1();
        Assertions.assertTrue(buyProductProcess.productIsAddedToCart());
        buyProductProcess.clickProceedToCheckOutButton2();
        buyProductProcess.enterCorrectLogInData("test@softie.pl", "1qaz!QAZ");
        buyProductProcess.clickOnProceedToCheckOutButton3();
        buyProductProcess.confirmTermsOfServiceAndClickOnProceedToCheckOutButton4();
        buyProductProcess.choosePayByBankOption();
        Assertions.assertTrue(buyProductProcess.bankWirePaymentHeadingIsDisplayed());
        buyProductProcess.clickOnConfirmationButton();
        Assertions.assertTrue(buyProductProcess.orderConfirmationHeadingIsDisplayed());
    }
}
