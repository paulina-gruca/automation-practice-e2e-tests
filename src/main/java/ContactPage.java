import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class ContactPage {

    WebDriver driver;

    @FindBy(css ="#id_contact > option")
    List<WebElement> listOfSubjectHeadings;

    @FindBy(id = "email")
    WebElement emailTextBox;

    @FindBy(id = "message")
    WebElement textArea;

    @FindBy(id = "submitMessage")
    WebElement sendButton;

    public ContactPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean contactPageIsOpen(){
        return driver.getCurrentUrl().contains("controller=contact");
    }

    public void fillInContactForm(String email, String text){
        Random random = new Random();
        int index = random.nextInt(2) + 1;
        listOfSubjectHeadings.get(index).click();
        emailTextBox.sendKeys(email);
        textArea.sendKeys(text);
    }

    public CorrectDeliveredMessagePage clickSendButton(){
        sendButton.click();
        return new CorrectDeliveredMessagePage(driver);
    }
}
