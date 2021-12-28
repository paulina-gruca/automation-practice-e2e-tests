package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

    @FindBy(id = "cgv")
    private WebElement termsOfServiceCheckBox;

    @FindBy(css = "#order > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a")
    private WebElement closingAlertButton;

    @FindBy(name = "processCarrier")
    private WebElement proceedToCheckOutButton;

    private WebDriver driver;

    public ShippingPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProceedToCheckOutButtonAndDismissErrorMessage()
    {
        proceedToCheckOutButton.click();
        closingAlertButton.click();
    }

    public void confirmTermsOfServiceAndClickOnProceedToCheckOutButton()
    {
        termsOfServiceCheckBox.click();
        proceedToCheckOutButton.click();
    }
}
