package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLocators {

    @FindBy(className = "cart_quantity_delete")
    private WebElement deleteButton;

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
    private WebElement proceedToCheckOutButton;

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(WebElement deleteButton) {
        this.deleteButton = deleteButton;
    }

    public WebElement getProceedToCheckOutButton() {
        return proceedToCheckOutButton;
    }

    public void setProceedToCheckOutButton(WebElement proceedToCheckOutButton) {
        this.proceedToCheckOutButton = proceedToCheckOutButton;
    }
}
