import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.ContactPage;
import pages.HomePage;

public class NavigationToContactPageTest extends TestBase {

    @Test
    public void shouldNavigateFromHomeToContactPage()
    {
        HomePage homePage = new HomePage(driver);
        ContactPage contactPage = homePage.clickContactUsButton();
        Assertions.assertTrue(contactPage.contactPageIsOpen());
    }
}
