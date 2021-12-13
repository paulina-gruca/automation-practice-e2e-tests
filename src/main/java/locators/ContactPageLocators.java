package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactPageLocators {

    @FindBy(css ="#id_contact > option")
    private List<WebElement> listOfSubjectHeadings;

    @FindBy(id = "email")
    private WebElement emailAddressTextBox;

    @FindBy(id = "message")
    private WebElement messageArea;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public List<WebElement> getListOfSubjectHeadings() {
        return listOfSubjectHeadings;
    }

    public void setListOfSubjectHeadings(List<WebElement> listOfSubjectHeadings) {
        this.listOfSubjectHeadings = listOfSubjectHeadings;
    }

    public WebElement getEmailAddressTextBox() {
        return emailAddressTextBox;
    }

    public void setEmailAddressTextBox(WebElement emailAddressTextBox) {
        this.emailAddressTextBox = emailAddressTextBox;
    }

    public WebElement getMessageArea() {
        return messageArea;
    }

    public void setMessageArea(WebElement messageArea) {
        this.messageArea = messageArea;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public void setSendButton(WebElement sendButton) {
        this.sendButton = sendButton;
    }
}
