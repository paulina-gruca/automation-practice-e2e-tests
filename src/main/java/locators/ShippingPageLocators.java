package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPageLocators {

    @FindBy(id = "cgv")
    private WebElement termsOfServiceCheckBox;

    @FindBy(css = "#order > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a")
    private WebElement closingAlertButton;

    @FindBy(name = "processCarrier")
    private WebElement proceedToCheckOutButton;

    public WebElement getTermsOfServiceCheckBox() {
        return termsOfServiceCheckBox;
    }

    public void setTermsOfServiceCheckBox(WebElement termsOfServiceCheckBox) {
        this.termsOfServiceCheckBox = termsOfServiceCheckBox;
    }

    public WebElement getClosingAlertButton() {
        return closingAlertButton;
    }

    public void setClosingAlertButton(WebElement closingAlertButton) {
        this.closingAlertButton = closingAlertButton;
    }

    public WebElement getProceedToCheckOutButton() {
        return proceedToCheckOutButton;
    }

    public void setProceedToCheckOutButton(WebElement proceedToCheckOutButton) {
        this.proceedToCheckOutButton = proceedToCheckOutButton;
    }
}
