package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HompePageLocators {

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(css = "#header_logo > a > img")
    private WebElement logo;

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(css = "#contact-link > a")
    private WebElement contactUsButton;

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void setSignInButton(WebElement signinButton) {
        this.signInButton = signinButton;
    }

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

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    public void setContactUsButton(WebElement contactUsButton) {
        this.contactUsButton = contactUsButton;
    }
}
