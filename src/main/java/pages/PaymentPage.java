package pages;

import locators.PaymentPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    private WebDriver driver;
    private PaymentPageLocators paymentPageLocators;

    public PaymentPage(WebDriver driver)
    {
        this.driver = driver;
        paymentPageLocators = new PaymentPageLocators();
        PageFactory.initElements(driver, paymentPageLocators);
    }

    public void choosePayByBankOption()
    {
        paymentPageLocators.getBankWirePaymentOption().click();
    }

    public boolean bankWirePaymentHeadingIsDisplayed()
    {
        return paymentPageLocators.getBankWirePaymentOptionConfirmationHeading().isDisplayed();
    }

    public void clickOnConfirmationButton()
    {
        paymentPageLocators.getConfirmationOfOrderButton().click();
    }

    public boolean orderConfirmationHeadingIsDisplayed()
    {
        return driver.getCurrentUrl().contains("controller=order-confirmation&id_cart");
    }
}
