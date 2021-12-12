package pages;

import locators.CorrectAuthenticationPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CorrectAuthenticationPage {

    private WebDriver driver;
    private CorrectAuthenticationPageLocators correctAuthenticationPageLocators;

    public CorrectAuthenticationPage(WebDriver driver)
    {
        this.driver = driver;
        correctAuthenticationPageLocators = new CorrectAuthenticationPageLocators();
        PageFactory.initElements(driver, correctAuthenticationPageLocators);
    }

    public boolean userIsLoggedIn()
    {
        return driver.getCurrentUrl().contains("controller=my-account");
    }

    public boolean loggedUserButtonIsDisplayed()
    {
        return correctAuthenticationPageLocators.getLoggedUserButton().isDisplayed();
    }

    public LogInPage clickSignOutButton()
    {
        correctAuthenticationPageLocators.getSignOutButton().click();
        return new LogInPage(driver);
    }

    public boolean newUserWasRegistered()
    {
        return driver.getPageSource().contains("Welcome to your account");
    }
}
