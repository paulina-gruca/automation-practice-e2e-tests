import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FailedAuthenticationPage {

    WebDriver driver;

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    WebElement errorCommunicat;

    public FailedAuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean errorCommunicatIsDisplayed(){
        return errorCommunicat.isDisplayed();
    }

}
