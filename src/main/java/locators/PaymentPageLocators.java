package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageLocators {

    @FindBy(className = "bankwire")
    private WebElement bankWirePaymentOption;

    @FindBy(className = "page-subheading")
    private WebElement bankWirePaymentOptionConfirmationHeading;

    @FindBy(css = "#cart_navigation > button")
    private WebElement confirmationOfOrderButton;

    public WebElement getBankWirePaymentOption() {
        return bankWirePaymentOption;
    }

    public void setBankWirePaymentOption(WebElement bankWirePaymentOption) {
        this.bankWirePaymentOption = bankWirePaymentOption;
    }

    public WebElement getBankWirePaymentOptionConfirmationHeading() {
        return bankWirePaymentOptionConfirmationHeading;
    }

    public void setBankWirePaymentOptionConfirmationHeading(WebElement bankWirePaymentOptionConfirmationHeading) {
        this.bankWirePaymentOptionConfirmationHeading = bankWirePaymentOptionConfirmationHeading;
    }

    public WebElement getConfirmationOfOrderButton() {
        return confirmationOfOrderButton;
    }

    public void setConfirmationOfOrderButton(WebElement confirmationOfOrderButton) {
        this.confirmationOfOrderButton = confirmationOfOrderButton;
    }
}
