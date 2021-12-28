package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    @FindBy(className = "bankwire")
    private WebElement bankWirePaymentOption;

    @FindBy(className = "page-subheading")
    private WebElement bankWirePaymentOptionConfirmationHeading;

    @FindBy(css = "#cart_navigation > button")
    private WebElement confirmationOfOrderButton;

    @FindBy(css = "#header_logo > a > img")
    private WebElement logo;

    private WebDriver driver;

    public PaymentPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void choosePayByBankOption()
    {
        bankWirePaymentOption.click();
    }

    public boolean bankWirePaymentHeadingIsDisplayed()
    {
        return bankWirePaymentOptionConfirmationHeading.isDisplayed();
    }

    public void clickOnConfirmationButton()
    {
       confirmationOfOrderButton.click();
    }

    public boolean orderConfirmationHeadingIsDisplayed()
    {
        return driver.getCurrentUrl().contains("controller=order-confirmation&id_cart");
    }

    public void clickOnLogo()
    {
        logo.click();
    }
}
