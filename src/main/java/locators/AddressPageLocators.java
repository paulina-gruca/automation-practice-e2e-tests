package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPageLocators {

    @FindBy(name = "message")
    private WebElement messageArea;

    @FindBy(name = "processAddress")
    private WebElement proceedToCheckOutButton;

    public WebElement getMessageArea()
    {
        return messageArea;
    }

    public void setMessageArea(WebElement messageArea)
    {
        this.messageArea = messageArea;
    }

    public WebElement getProceedToCheckOutButton()
    {
        return proceedToCheckOutButton;
    }

    public void setProceedToCheckOutButton(WebElement proceedToCheckOutButton)
    {
        this.proceedToCheckOutButton = proceedToCheckOutButton;
    }
}
