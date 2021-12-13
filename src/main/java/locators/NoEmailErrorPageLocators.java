package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoEmailErrorPageLocators {

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    private WebElement noEmailAlert;

    public WebElement getNoEmailAlert() {
        return noEmailAlert;
    }

    public void setNoEmailAlert(WebElement noEmailAlert) {
        this.noEmailAlert = noEmailAlert;
    }
}
