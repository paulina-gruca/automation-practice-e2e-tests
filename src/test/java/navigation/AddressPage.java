package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    @FindBy(name = "message")
    private WebElement messageArea;

    @FindBy(name = "processAddress")
    private WebElement proceedToCheckOutButton;

    private WebDriver driver;

    public AddressPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillInMessageArea(String text)
    {
        messageArea.sendKeys(text);
    }

    public void clickOnProceedToCheckOutButton()
    {
        proceedToCheckOutButton.click();
    }
}
