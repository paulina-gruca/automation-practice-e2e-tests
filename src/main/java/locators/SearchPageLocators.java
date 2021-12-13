package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {

    @FindBy(id = "selectProductSort")
    private WebElement sortByDropDownList;

    @FindBy(css = "#center_column > ul > li:nth-child(1) > div > div.left-block > div > a.product_img_link > img")
    private WebElement imageOfProduct;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    private WebElement addToCartButton;

    @FindBy(className = "icon-ok")
    private WebElement confirmationOfAddingProductToCartCommunicate;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    private WebElement proceedToCheckOutButton;

    public WebElement getSortByDropDownList() {
        return sortByDropDownList;
    }

    public void setSortByDropDownList(WebElement sortByDropDownList) {
        this.sortByDropDownList = sortByDropDownList;
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

    public WebElement getProceedToCheckOutButton() {
        return proceedToCheckOutButton;
    }

    public void setProceedToCheckOutButton(WebElement proceedToCheckOutButton) {
        this.proceedToCheckOutButton = proceedToCheckOutButton;
    }
}
