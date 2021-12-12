package pages;

import locators.NoEmailErrorPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NoEmailErrorPage {

    private WebDriver driver;
    private NoEmailErrorPageLocators noEmailErrorPageLocators;

    public NoEmailErrorPage(WebDriver driver)
    {
        this.driver = driver;
        noEmailErrorPageLocators = new NoEmailErrorPageLocators();
        PageFactory.initElements(driver, noEmailErrorPageLocators);
    }

    public boolean noEmailCommunicateIsDisplayed()
    {
        return noEmailErrorPageLocators.getNoEmailAlert().isDisplayed();
    }
}
