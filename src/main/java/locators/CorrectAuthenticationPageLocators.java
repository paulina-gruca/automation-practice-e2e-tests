package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorrectAuthenticationPageLocators {

    @FindBy(className = "account")
    WebElement loggedUserButton;

    @FindBy(className = "logout")
    WebElement signOutButton;

    public WebElement getLoggedUserButton() {
        return loggedUserButton;
    }

    public void setLoggedUserButton(WebElement loggedUserButton) {
        this.loggedUserButton = loggedUserButton;
    }

    public WebElement getSignOutButton() {
        return signOutButton;
    }

    public void setSignOutButton(WebElement signOutButton) {
        this.signOutButton = signOutButton;
    }

}
