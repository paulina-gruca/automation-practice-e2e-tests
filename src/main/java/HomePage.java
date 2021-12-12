import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(className = "login")
    WebElement signinButton;

    @FindBy(css = "#header_logo > a > img")
    WebElement logo;

    @FindBy(id = "search_query_top")
    WebElement searchArea;

    @FindBy(css = "#contact-link > a")
    WebElement contactUsButton;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean logoIsDisplayed(){
        return logo.isDisplayed();
    }

    public Boolean searchAreaIsDisplayed(){
        return searchArea.isDisplayed();
    }

    public void searchItems(String item){
        searchArea.sendKeys(item);
        searchArea.sendKeys(Keys.ENTER);
    }

    public LoginPage clickSigninButton(){
        signinButton.click();
        return new LoginPage(driver);
    }

    public ContactPage clickContactUsButton(){
        contactUsButton.click();
        return new ContactPage(driver);
    }

}
