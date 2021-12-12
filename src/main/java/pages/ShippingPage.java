package pages;

import locators.ShippingPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

    private WebDriver driver;
    private ShippingPageLocators shippingPageLocators;

    public ShippingPage(WebDriver driver)
    {
        this.driver = driver;
        shippingPageLocators = new ShippingPageLocators();
        PageFactory.initElements(driver, shippingPageLocators);
    }

    public void clickProceedToCheckOutButtonAndDismissErrorMessage()
    {
        shippingPageLocators.getProceedToCheckOutButton().click();
        shippingPageLocators.getClosingAlertButton().click();
    }

    public PaymentPage confirmTermsOfServiceAndClickOnProceedToCheckOutButton()
    {
        shippingPageLocators.getTermsOfServiceCheckBox().click();
        shippingPageLocators.getProceedToCheckOutButton().click();
        return new PaymentPage(driver);
    }
}
