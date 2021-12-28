package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FailedAuthenticationPage {

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    private WebElement errorAlert;

    private WebDriver driver;

    public FailedAuthenticationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean errorCommunicateIsDisplayed()
    {
        return errorAlert.isDisplayed();
    }

}
