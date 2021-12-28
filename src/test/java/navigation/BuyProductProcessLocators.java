package navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyProductProcessLocators {

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(css = "#center_column > ul > li:nth-child(1) > div > div.left-block > div > a.product_img_link > img")
    private WebElement imageOfProduct;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartButton;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    private WebElement proceedToCheckOutButton1;

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
    private WebElement proceedToCheckOutButton2;

    @FindBy(id = "email")
    private WebElement emailAddressTextBox;

    @FindBy(id = "passwd")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    private WebElement signInButton;

    @FindBy(name = "processAddress")
    private WebElement proceedToCheckOutButton3;

    @FindBy(id = "cgv")
    private WebElement termsOfServiceCheckBox;

    @FindBy(name = "processCarrier")
    private WebElement proceedToCheckOutButton4;

    @FindBy(className = "bankwire")
    private WebElement bankWirePaymentOption;

    @FindBy(className = "page-subheading")
    private WebElement bankWirePaymentOptionConfirmationHeading;

    @FindBy(css = "#cart_navigation > button")
    private WebElement confirmationOfOrderButton;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getImageOfProduct() {
        return imageOfProduct;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getProceedToCheckOutButton1() {
        return proceedToCheckOutButton1;
    }

    public WebElement getProceedToCheckOutButton2() {
        return proceedToCheckOutButton2;
    }

    public WebElement getEmailAddressTextBox() {
        return emailAddressTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getProceedToCheckOutButton3() {
        return proceedToCheckOutButton3;
    }

    public WebElement getTermsOfServiceCheckBox() {
        return termsOfServiceCheckBox;
    }

    public WebElement getProceedToCheckOutButton4() {
        return proceedToCheckOutButton4;
    }

    public WebElement getBankWirePaymentOption() {
        return bankWirePaymentOption;
    }

    public WebElement getBankWirePaymentOptionConfirmationHeading() {
        return bankWirePaymentOptionConfirmationHeading;
    }

    public WebElement getConfirmationOfOrderButton() {
        return confirmationOfOrderButton;
    }
}
