package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageLocators {

    @FindBy(css = "#header_logo > a > img")
    private WebElement logo;

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(id = "email")
    private WebElement emailAddressTextBox;

    @FindBy(id = "passwd")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    private WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement createEmailAddressTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    public WebElement getLogo() {
        return logo;
    }

    public void setLogo(WebElement logo) {
        this.logo = logo;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }

    public WebElement getEmailAddressTextBox() {
        return emailAddressTextBox;
    }

    public void setEmailAddressTextBox(WebElement emailAddressTextBox) {
        this.emailAddressTextBox = emailAddressTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public void setPasswordTextBox(WebElement passwordTextBox) {
        this.passwordTextBox = passwordTextBox;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void setSignInButton(WebElement signInButton) {
        this.signInButton = signInButton;
    }

    public WebElement getCreateEmailAddressTextBox() {
        return createEmailAddressTextBox;
    }

    public void setCreateEmailAddressTextBox(WebElement createEmailAddressTextBox) {
        this.createEmailAddressTextBox = createEmailAddressTextBox;
    }

    public WebElement getCreateAnAccountButton() {
        return createAnAccountButton;
    }

    public void setCreateAnAccountButton(WebElement createAnAccountButton) {
        this.createAnAccountButton = createAnAccountButton;
    }
}
