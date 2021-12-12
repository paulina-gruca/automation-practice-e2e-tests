import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorrectAuthenticationPage {

    WebDriver driver;

    @FindBy(className = "account")
    WebElement loggedUser;

    @FindBy(className = "logout")
    WebElement signOutButton;

    public CorrectAuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean userIsLoggedIn(){
        return driver.getCurrentUrl().contains("controller=my-account");
    }

    public Boolean loggedUserIsDisplayed(){
        return loggedUser.isDisplayed();
    }

    public LoginPage clickSignOutButton(){
        signOutButton.click();
        return new LoginPage(driver);
    }

}
