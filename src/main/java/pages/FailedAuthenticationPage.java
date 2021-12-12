package pages;

import locators.FailedAuthenticationPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FailedAuthenticationPage {

    private WebDriver driver;
    private FailedAuthenticationPageLocators failedAuthenticationPageLocators;

    public FailedAuthenticationPage(WebDriver driver)
    {
        this.driver = driver;
        failedAuthenticationPageLocators = new FailedAuthenticationPageLocators();
        PageFactory.initElements(driver, failedAuthenticationPageLocators);
    }

    public boolean errorCommunicateIsDisplayed()
    {
        return failedAuthenticationPageLocators.getErrorAlert().isDisplayed();
    }

}
