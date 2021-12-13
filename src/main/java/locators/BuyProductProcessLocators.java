package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyProductProcessLocators {

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(css = "#center_column > ul > li:nth-child(1) > div > div.left-block > div > a.product_img_link > img")
    private WebElement imageOfProduct;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartButton;

    @FindBy(className = "icon-ok")
    private WebElement confirmationOfAddingProductToCartCommunicate;

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

    public void setSearchBox(WebElement searchBox) {
        this.searchBox = searchBox;
    }

    public WebElement getImageOfProduct() {
        return imageOfProduct;
    }

    public void setImageOfProduct(WebElement imageOfProduct) {
        this.imageOfProduct = imageOfProduct;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public void setAddToCartButton(WebElement addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public WebElement getConfirmationOfAddingProductToCartCommunicate() {
        return confirmationOfAddingProductToCartCommunicate;
    }

    public void setConfirmationOfAddingProductToCartCommunicate(WebElement confirmationOfAddingProductToCartCommunicate) {
        this.confirmationOfAddingProductToCartCommunicate = confirmationOfAddingProductToCartCommunicate;
    }

    public WebElement getProceedToCheckOutButton1() {
        return proceedToCheckOutButton1;
    }

    public void setProceedToCheckOutButton1(WebElement proceedToCheckOutButton1) {
        this.proceedToCheckOutButton1 = proceedToCheckOutButton1;
    }

    public WebElement getProceedToCheckOutButton2() {
        return proceedToCheckOutButton2;
    }

    public void setProceedToCheckOutButton2(WebElement proceedToCheckOutButton2) {
        this.proceedToCheckOutButton2 = proceedToCheckOutButton2;
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

    public WebElement getProceedToCheckOutButton3() {
        return proceedToCheckOutButton3;
    }

    public void setProceedToCheckOutButton3(WebElement proceedToCheckOutButton3) {
        this.proceedToCheckOutButton3 = proceedToCheckOutButton3;
    }

    public WebElement getTermsOfServiceCheckBox() {
        return termsOfServiceCheckBox;
    }

    public void setTermsOfServiceCheckBox(WebElement termsOfServiceCheckBox) {
        this.termsOfServiceCheckBox = termsOfServiceCheckBox;
    }

    public WebElement getProceedToCheckOutButton4() {
        return proceedToCheckOutButton4;
    }

    public void setProceedToCheckOutButton4(WebElement proceedToCheckOutButton4) {
        this.proceedToCheckOutButton4 = proceedToCheckOutButton4;
    }

    public WebElement getBankWirePaymentOption() {
        return bankWirePaymentOption;
    }

    public void setBankWirePaymentOption(WebElement bankWirePaymentOption) {
        this.bankWirePaymentOption = bankWirePaymentOption;
    }

    public WebElement getBankWirePaymentOptionConfirmationHeading() {
        return bankWirePaymentOptionConfirmationHeading;
    }

    public void setBankWirePaymentOptionConfirmationHeading(WebElement bankWirePaymentOptionConfirmationHeading) {
        this.bankWirePaymentOptionConfirmationHeading = bankWirePaymentOptionConfirmationHeading;
    }

    public WebElement getConfirmationOfOrderButton() {
        return confirmationOfOrderButton;
    }

    public void setConfirmationOfOrderButton(WebElement confirmationOfOrderButton) {
        this.confirmationOfOrderButton = confirmationOfOrderButton;
    }
}
