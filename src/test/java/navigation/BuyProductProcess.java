package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuyProductProcess {

    private WebDriver driver;
    private BuyProductProcessLocators buyProductProcessLocators;

    public BuyProductProcess(WebDriver driver)
    {
        this.driver = driver;
        buyProductProcessLocators = new BuyProductProcessLocators();
        PageFactory.initElements(driver, buyProductProcessLocators);
    }

    public void searchProducts(String product)
    {
        buyProductProcessLocators.getSearchBox().sendKeys(product);
        buyProductProcessLocators.getSearchBox().sendKeys(Keys.ENTER);
    }

    public void clickAddToCartButton()
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(buyProductProcessLocators.getImageOfProduct()).build().perform();
        buyProductProcessLocators.getAddToCartButton().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-ok")));
    }

    public boolean productIsAddedToCart()
    {
        return driver.getPageSource().contains("Shopping-cart summary");
    }

    public void clickProceedToCheckOutButton1()
    {
        buyProductProcessLocators.getProceedToCheckOutButton1().click();
    }

    public void clickProceedToCheckOutButton2()
    {
        buyProductProcessLocators.getProceedToCheckOutButton2().click();
    }

    public void enterCorrectLogInData(String login, String password)
    {
        buyProductProcessLocators.getEmailAddressTextBox().sendKeys(login);
        buyProductProcessLocators.getPasswordTextBox().sendKeys(password);
        buyProductProcessLocators.getSignInButton().click();
    }

    public void clickOnProceedToCheckOutButton3()
    {
        buyProductProcessLocators.getProceedToCheckOutButton3().click();
    }

    public void confirmTermsOfServiceAndClickOnProceedToCheckOutButton4()
    {
        buyProductProcessLocators.getTermsOfServiceCheckBox().click();
        buyProductProcessLocators.getProceedToCheckOutButton4().click();
    }

    public void choosePayByBankOption()
    {
        buyProductProcessLocators.getBankWirePaymentOption().click();
    }

    public boolean bankWirePaymentHeadingIsDisplayed()
    {
        return buyProductProcessLocators.getBankWirePaymentOptionConfirmationHeading().isDisplayed();
    }

    public void clickOnConfirmationButton()
    {
        buyProductProcessLocators.getConfirmationOfOrderButton().click();
    }

    public boolean orderConfirmationHeadingIsDisplayed()
    {
        return driver.getCurrentUrl().contains("controller=order-confirmation&id_cart");
    }
}
