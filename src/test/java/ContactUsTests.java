import navigation.CorrectDeliveredMessagePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import navigation.ContactPage;
import navigation.HomePage;

public class ContactUsTests extends TestBase {

    HomePage homePage = new HomePage(driver);
    ContactPage contactPage = new ContactPage(driver);

    @Test
    void shouldNavigateFromHomeToContactPage()
    {
        homePage.clickContactUsButton();
        Assertions.assertTrue(contactPage.contactPageIsOpen());
        contactPage.clickOnLogo();
    }

    @Test
    void shouldFillInContactForm()
    {
        homePage.clickContactUsButton();
        contactPage.fillInContactForm("test@softie.pl", "Hello!");
        CorrectDeliveredMessagePage correctDeliveredMessagePage = new CorrectDeliveredMessagePage(driver);
        contactPage.clickSendButton();
        Assertions.assertTrue(correctDeliveredMessagePage.messageCommunicateIsDisplayed());
        contactPage.clickOnLogo();
    }

}
