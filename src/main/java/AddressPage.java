import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    WebDriver driver;

    @FindBy(name = "message")
    WebElement textArea;

    @FindBy(name = "processAddress")
    WebElement proceedToCheckOutButton;

    public AddressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void fillInMessageArea(String text){
        textArea.sendKeys(text);
    }

    public ShippingPage clickOnProceedToCheckOutButton(){
        proceedToCheckOutButton.click();
        return new ShippingPage(driver);
    }
}
