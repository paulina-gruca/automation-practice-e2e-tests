package pages;

import locators.AddressPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    private WebDriver driver;
    private AddressPageLocators addressPageLocators;

    public AddressPage(WebDriver driver)
    {
        this.driver = driver;
        addressPageLocators = new AddressPageLocators();
        PageFactory.initElements(driver, addressPageLocators);
    }

    public void fillInMessageArea(String text)
    {
        addressPageLocators.getMessageArea().sendKeys(text);
    }

    public ShippingPage clickOnProceedToCheckOutButton()
    {
        addressPageLocators.getProceedToCheckOutButton().click();
        return new ShippingPage(driver);
    }
}
