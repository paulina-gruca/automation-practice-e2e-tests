package pages;

import com.github.javafaker.Faker;
import locators.LogInPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    private WebDriver driver;
    private LogInPageLocators loginPageLocators;
    private Faker faker;

    public LogInPage(WebDriver driver)
    {
        this.driver = driver;
        loginPageLocators = new LogInPageLocators();
        PageFactory.initElements(driver, loginPageLocators);
        faker = new Faker();
    }

    public boolean logoIsDisplayed()
    {
        return loginPageLocators.getLogo().isDisplayed();
    }

    public boolean searchAreaIsDisplayed()
    {
        return loginPageLocators.getSearchBox().isDisplayed();
    }

    public void enterLogin(String login)
    {
        loginPageLocators.getEmailAddressTextBox().sendKeys(login);
    }

    public void enterPassword(String password)
    {
        loginPageLocators.getPasswordTextBox().sendKeys(password);
    }

    public void enterCorrectLogInData(String login, String password)
    {
        loginPageLocators.getEmailAddressTextBox().sendKeys(login);
        loginPageLocators.getPasswordTextBox().sendKeys(password);
    }

    public AddressPage clickLogInButton()
    {
        loginPageLocators.getSignInButton().click();
        return new AddressPage(driver);
    }

    public CorrectAuthenticationPage clickLogInButtonWithCorrectPassword()
    {
        loginPageLocators.getSignInButton().click();
        return new CorrectAuthenticationPage(driver);
    }

    public FailedAuthenticationPage clickLogInButtonWithIncorrectPassword()
    {
        loginPageLocators.getSignInButton().click();
        return new FailedAuthenticationPage(driver);
    }

    public NoEmailErrorPage clickLogInButtonWithoutEmail(String password)
    {
        loginPageLocators.getPasswordTextBox().sendKeys(password);
        loginPageLocators.getSignInButton().click();
        return new NoEmailErrorPage(driver);
    }

    public NoPasswordErrorPage clickLogInButtonWithoutPassword(String email)
    {
        loginPageLocators.getEmailAddressTextBox().sendKeys(email);
        loginPageLocators.getSignInButton().click();
        return new NoPasswordErrorPage(driver);
    }

    public boolean loginPageTitleIsDisplayed ()
    {
        return driver.getTitle().equals("Login - My Store");
    }

    public void generateAndEnterEmail()
    {
        String uniqueEmail = faker.name().firstName() + faker.name().lastName() + faker.random().nextInt(100) + "@test.com";
        loginPageLocators.getCreateEmailAddressTextBox().sendKeys(uniqueEmail);
    }

    public RegistrationPage clickOnCreateAnAccountButton()
    {
        loginPageLocators.getCreateAnAccountButton().click();
        return new RegistrationPage(driver);
    }
}
