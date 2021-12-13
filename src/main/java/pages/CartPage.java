package pages;

import locators.CartPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddressPage;

public class CartPage {

    private WebDriver driver;
    private CartPageLocators cartPageLocators;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
        cartPageLocators = new CartPageLocators();
        PageFactory.initElements(driver, cartPageLocators);
    }

    public void clickDeleteButtonToRemoveProduct()
    {
        cartPageLocators.getDeleteButton().click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p")));
    }

    public boolean productIsDeletedFromCart()
    {
        return driver.getPageSource().contains("Your shopping cart is empty.");
    }

    public boolean productIsAddedToCart()
    {
        return driver.getPageSource().contains("Shopping-cart summary");
    }

    public AddressPage clickProceedToCheckOutButton()
    {
        cartPageLocators.getProceedToCheckOutButton().click();
        return new AddressPage(driver);
    }
}
