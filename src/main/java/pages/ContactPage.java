package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class ContactPage {

    @FindBy(css ="#id_contact > option")
    private List<WebElement> listOfSubjectHeadings;

    @FindBy(id = "email")
    private WebElement emailAddressTextBox;

    @FindBy(id = "message")
    private WebElement messageArea;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    private WebDriver driver;
    private Random random;

    public ContactPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        random = new Random();
    }

    public boolean contactPageIsOpen()
    {
        return driver.getCurrentUrl().contains("controller=contact");
    }

    public void fillInContactForm(String email, String text)
    {
        int index = random.nextInt(listOfSubjectHeadings.size() - 1) + 1;
        listOfSubjectHeadings.get(index).click();
        emailAddressTextBox.sendKeys(email);
        messageArea.sendKeys(text);
    }

    public void clickSendButton()
    {
        sendButton.click();
    }
}
