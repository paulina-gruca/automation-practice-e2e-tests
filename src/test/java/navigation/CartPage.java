package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    @FindBy(className = "cart_quantity_delete")
    private WebElement deleteButton;

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
    private WebElement proceedToCheckOutButton;

    @FindBy(css = "#header_logo > a > img")
    private WebElement logo;

    private WebDriver driver;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDeleteButtonToRemoveProduct()
    {
        deleteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

    public void clickProceedToCheckOutButton()
    {
        proceedToCheckOutButton.click();
    }

    public void clickOnLogo()
    {
        logo.click();
    }
}
