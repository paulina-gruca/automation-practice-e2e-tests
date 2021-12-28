package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorrectAuthenticationPage {

    @FindBy(className = "account")
    private WebElement loggedUserButton;

    @FindBy(className = "logout")
    private WebElement signOutButton;

    private WebDriver driver;

    public CorrectAuthenticationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean userIsLoggedIn()
    {
        return driver.getCurrentUrl().contains("controller=my-account");
    }

    public boolean loggedUserButtonIsDisplayed()
    {
        return loggedUserButton.isDisplayed();
    }

    public void clickSignOutButton()
    {
        signOutButton.click();
    }

    public boolean newUserWasRegistered()
    {
        return driver.getPageSource().contains("Welcome to your account");
    }
}
