package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FailedAuthenticationPageLocators {

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    private WebElement errorAlert;

    public WebElement getErrorAlert() {
        return errorAlert;
    }

    public void setErrorAlert(WebElement errorAlert) {
        this.errorAlert = errorAlert;
    }
}
