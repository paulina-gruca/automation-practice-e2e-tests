import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(css = "#header_logo > a > img")
    WebElement logo;

    @FindBy(id = "search_query_top")
    WebElement searchArea;

    @FindBy(id = "email")
    WebElement loginTextBox;

    @FindBy(id = "passwd")
    WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    WebElement loginButton;

    @FindBy(id = "email_create")
    WebElement emailTextBox;

    @FindBy(id = "SubmitCreate")
    WebElement createAnAccountButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean logoIsDisplayed(){
        return logo.isDisplayed();
    }

    public Boolean searchAreaIsDisplayed(){
        return searchArea.isDisplayed();
    }

    public void enterLogin(String login){
        loginTextBox.sendKeys(login);
    }

    public void enterPassword(String password){
        passwordTextBox.sendKeys(password);
    }

    public void enterCorrectLogInData(String login, String password){
        loginTextBox.sendKeys(login);
        passwordTextBox.sendKeys(password);
    }

    public AddressPage clickLoginButton(){
        loginButton.click();
        return new AddressPage(driver);
    }

    public CorrectAuthenticationPage clickLoginButtonWithCorrectPassword(){
        loginButton.click();
        return new CorrectAuthenticationPage(driver);
    }

    public FailedAuthenticationPage clickLoginButtonWithIncorrectPassword(){
        loginButton.click();
        return new FailedAuthenticationPage(driver);
    }

    public NoEmailErrorPage clickLoginButtonWithoutEmail(String password){
        passwordTextBox.sendKeys(password);
        loginButton.click();
        return new NoEmailErrorPage(driver);
    }

    public NoPasswordErrorPage clickLoginButtonWithoutPassword (String email){
        loginTextBox.sendKeys(email);
        loginButton.click();
        return new NoPasswordErrorPage(driver);
    }

    public Boolean loginPageTitleIsDisplayed (){
        return driver.getTitle().equals("Login - My Store");
    }

    public void createAnEmail(){
        Faker faker = new Faker();
        String uniqueEmail = faker.name().firstName() + faker.name().lastName() + faker.random().nextInt(100) + "@test.com";
        emailTextBox.sendKeys(uniqueEmail);
    }

    public RegistrationPage clickOnCreateAnAccountButton(){
        createAnAccountButton.click();
        return new RegistrationPage(driver);
    }
}
