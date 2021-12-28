package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoPasswordErrorPage {

    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    private WebElement noPasswordAlert;

    private WebDriver driver;

    public NoPasswordErrorPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean noPasswordCommunicateIsDisplayed()
    {
        return noPasswordAlert.isDisplayed();
    }
}
