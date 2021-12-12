import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;

    @FindBy(className = "cart_quantity_delete")
    WebElement deleteButton;

    @FindBy(id = "cart_title")
    WebElement cartSummaryHeading;

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
    WebElement proceedToCheckOutButton;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDeleteButton(){
        deleteButton.click();
        Wait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p")));
    }

    public boolean itemWasDeletedFromCart(){
        return driver.getPageSource().contains("Your shopping cart is empty.");
    }

    public boolean itemWasAddedToCart(){
        return driver.getPageSource().contains("Shopping-cart summary");
    }

    public AddressPage clickProceedToCheckOutButton(){
        proceedToCheckOutButton.click();
        return new AddressPage(driver);
    }
}
