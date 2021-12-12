package pages;

import locators.ContactPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class ContactPage {

    private WebDriver driver;
    private ContactPageLocators contactPageLocators;
    private Random random;

    public ContactPage(WebDriver driver)
    {
        this.driver = driver;
        contactPageLocators = new ContactPageLocators();
        PageFactory.initElements(driver, contactPageLocators);
        random = new Random();
    }

    public boolean contactPageIsOpen()
    {
        return driver.getCurrentUrl().contains("controller=contact");
    }

    public void fillInContactForm(String email, String text)
    {
        int index = random.nextInt(contactPageLocators.getListOfSubjectHeadings().size() - 1) + 1;
        contactPageLocators.getListOfSubjectHeadings().get(index).click();
        contactPageLocators.getEmailAddressTextBox().sendKeys(email);
        contactPageLocators.getMessageArea().sendKeys(text);
    }

    public CorrectDeliveredMessagePage clickSendButton()
    {
        contactPageLocators.getSendButton().click();
        return new CorrectDeliveredMessagePage(driver);
    }
}
