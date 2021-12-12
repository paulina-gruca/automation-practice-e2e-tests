import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

    WebDriver driver;

    @FindBy(id = "cgv")
    WebElement checkBox;

    @FindBy(css = "#order > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a")
    WebElement closingButton;

    @FindBy(name = "processCarrier")
    WebElement proceedToCheckOutButton;

    public ShippingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkErrorProcedure(){
        proceedToCheckOutButton.click();
        closingButton.click();
    }

    public PaymentPage confirmTermsOfServiceAndClickOnProceedToCheckOutButton(){
        checkBox.click();
        proceedToCheckOutButton.click();
        return new PaymentPage(driver);
    }

}
