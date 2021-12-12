import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaymentPage {

    WebDriver driver;

    @FindBy(className = "bankwire")
    WebElement paymentOption;

    @FindBy(className = "page-subheading")
    WebElement heading;

    @FindBy(css = "#cart_navigation > button")
    WebElement confirmationButton;

    public PaymentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void choosePayByBankOption(){
        paymentOption.click();
    }

    public boolean correctHeadingIsDisplayed(){
        return heading.isDisplayed();
    }

    public void clickOnConfirmationButton(){
        confirmationButton.click();
    }

    public Boolean orderConfirmationHeadingIsDisplayed(){
        return driver.getCurrentUrl().contains("controller=order-confirmation&id_cart");
    }

}
