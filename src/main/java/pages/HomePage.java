package pages;

import locators.HompePageLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    private HompePageLocators hompePageLocators;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        hompePageLocators = new HompePageLocators();
        PageFactory.initElements(driver, hompePageLocators);
    }

    public boolean logoIsDisplayed()
    {
        return hompePageLocators.getLogo().isDisplayed();
    }

    public boolean searchAreaIsDisplayed()
    {
        return hompePageLocators.getSearchBox().isDisplayed();
    }

    public void searchProducts(String product)
    {
        hompePageLocators.getSearchBox().sendKeys(product);
        hompePageLocators.getSearchBox().sendKeys(Keys.ENTER);
    }

    public LogInPage clickSignInButton()
    {
        hompePageLocators.getSignInButton().click();
        return new LogInPage(driver);
    }

    public ContactPage clickContactUsButton()
    {
        hompePageLocators.getContactUsButton().click();
        return new ContactPage(driver);
    }

}
