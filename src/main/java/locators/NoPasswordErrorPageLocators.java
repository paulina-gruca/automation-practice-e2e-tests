package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoPasswordErrorPageLocators {

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    private WebElement noPasswordAlert;

    public WebElement getNoPasswordAlert() {
        return noPasswordAlert;
    }

    public void setNoPasswordAlert(WebElement noPasswordAlert) {
        this.noPasswordAlert = noPasswordAlert;
    }
}
