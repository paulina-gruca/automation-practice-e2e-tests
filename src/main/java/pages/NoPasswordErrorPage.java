package pages;

import locators.NoPasswordErrorPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NoPasswordErrorPage {

    private WebDriver driver;
    private NoPasswordErrorPageLocators noPasswordErrorPageLocators;

    public NoPasswordErrorPage(WebDriver driver)
    {
        this.driver = driver;
        noPasswordErrorPageLocators = new NoPasswordErrorPageLocators();
        PageFactory.initElements(driver, noPasswordErrorPageLocators);
    }

    public boolean noPasswordCommunicateIsDisplayed()
    {
        return noPasswordErrorPageLocators.getNoPasswordAlert().isDisplayed();
    }
}
