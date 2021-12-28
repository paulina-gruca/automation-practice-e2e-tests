import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.ContactPage;
import pages.CorrectDeliveredMessagePage;
import pages.HomePage;

public class SucceededFillInContactFormTest extends TestBase {

    @Test
    public void shouldFillInContactForm()
    {
        HomePage homePage = new HomePage(driver);
        homePage.clickContactUsButton();
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillInContactForm("test@softie.pl", "Hello!");
        CorrectDeliveredMessagePage correctDeliveredMessagePage = new CorrectDeliveredMessagePage(driver);
        contactPage.clickSendButton();
        Assertions.assertTrue(correctDeliveredMessagePage.messageCommunicateIsDisplayed());
    }
}
