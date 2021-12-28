package navigation;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    @FindBy(css = "#header_logo > a > img")
    private WebElement logo;

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(id = "email")
    private WebElement emailAddressTextBox;

    @FindBy(id = "passwd")
    private WebElement passwordTextBox;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement createEmailAddressTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    private WebDriver driver;
    private Faker faker;

    public LogInPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        faker = new Faker();
    }

    public boolean logoIsDisplayed()
    {
        return logo.isDisplayed();
    }

    public boolean searchAreaIsDisplayed()
    {
        return searchBox.isDisplayed();
    }

    public void enterLogin(String login)
    {
        emailAddressTextBox.sendKeys(login);
    }

    public void enterPassword(String password)
    {
        passwordTextBox.sendKeys(password);
    }

    public void enterCorrectLogInData(String login, String password)
    {
        emailAddressTextBox.sendKeys(login);
        passwordTextBox.sendKeys(password);
    }

    public void clickLogInButton()
    {
        signInButton.click();
    }

    public void clickLogInButtonWithIncorrectPassword()
    {
        signInButton.click();
    }

    public void clickLogInButtonWithoutEmail(String password)
    {
        passwordTextBox.sendKeys(password);
        signInButton.click();
    }

    public void clickLogInButtonWithoutPassword(String email)
    {
        emailAddressTextBox.sendKeys(email);
        signInButton.click();
    }

    public boolean loginPageTitleIsDisplayed ()
    {
        return driver.getTitle().equals("Login - My Store");
    }

    public void generateAndEnterEmail()
    {
        String uniqueEmail = faker.name().firstName() + faker.name().lastName() + faker.random().nextInt(100) + "@test.com";
        createEmailAddressTextBox.sendKeys(uniqueEmail);
    }

    public void clickOnCreateAnAccountButton()
    {
        createAnAccountButton.click();
    }

    public void clickOnLogo()
    {
        logo.click();
    }
}
