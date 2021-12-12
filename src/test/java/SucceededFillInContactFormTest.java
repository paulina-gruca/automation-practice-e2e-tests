import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SucceededFillInContactFormTest extends TestBase {

    @Test
    public void shouldFillInContactForm(){
        HomePage homePage = new HomePage(driver);
        ContactPage contactPage = homePage.clickContactUsButton();
        contactPage.fillInContactForm("test@softie.pl", "Hello!");
        CorrectDeliveredMessagePage correctDeliveredMessagePage = contactPage.clickSendButton();
        Assertions.assertTrue(correctDeliveredMessagePage.messageCommunicatIsDisplayed());
    }
}
