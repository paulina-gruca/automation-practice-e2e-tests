import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoEmailErrorPage {

    WebDriver driver;

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    WebElement noEmailCommunicat;

    public NoEmailErrorPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean noEmailCommunicatIsDisplayed(){
        return noEmailCommunicat.isDisplayed();
    }

}
