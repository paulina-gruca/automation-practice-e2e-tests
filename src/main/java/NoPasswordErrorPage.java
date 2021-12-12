import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPasswordErrorPage {

    WebDriver driver;

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    WebElement noPasswordCommunicat;

    public NoPasswordErrorPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean noPasswordCommunicatIsDisplayed(){
        return noPasswordCommunicat.isDisplayed();
    }

}
