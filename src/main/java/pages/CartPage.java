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
    private WebDriverWait wait;
    private CartPageLocators cartPageLocators;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
        cartPageLocators = new CartPageLocators();
        PageFactory.initElements(driver, cartPageLocators);
        wait = new WebDriverWait(driver, 10);
    }

    public void clickDeleteButtonToRemoveProduct()
    {
        cartPageLocators.getDeleteButton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p")));
    }

    public boolean productWasDeletedFromCart()
    {
        return driver.getPageSource().contains("Your shopping cart is empty.");
    }

    public boolean productWasAddedToCart()
    {
        return driver.getPageSource().contains("Shopping-cart summary");
    }

    public AddressPage clickProceedToCheckOutButton()
    {
        cartPageLocators.getProceedToCheckOutButton().click();
        return new AddressPage(driver);
    }
}
