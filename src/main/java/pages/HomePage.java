package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(css = "#header_logo > a > img")
    private WebElement logo;

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(css = "#contact-link > a")
    private WebElement contactUsButton;

    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean logoIsDisplayed()
    {
        return logo.isDisplayed();
    }

    public boolean searchAreaIsDisplayed()
    {
        return searchBox.isDisplayed();
    }

    public void searchProducts(String product)
    {
        searchBox.sendKeys(product);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void clickSignInButton()
    {
        signInButton.click();
    }

    public void clickContactUsButton()
    {
        contactUsButton.click();
    }

}
