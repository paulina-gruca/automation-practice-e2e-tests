package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoEmailErrorPage {

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    private WebElement noEmailAlert;

    private WebDriver driver;

    public NoEmailErrorPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean noEmailCommunicateIsDisplayed()
    {
        return noEmailAlert.isDisplayed();
    }
}
