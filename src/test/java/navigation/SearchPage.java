package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

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

    @FindBy(className = "cross")
    private WebElement crossSign;

    @FindBy(css = "#header_logo > a > img")
    private WebElement logo;

    private WebDriver driver;

    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sortByProductName()
    {
        Select sort = new Select(sortByDropDownList);
        sort.selectByValue("name:asc");
    }

    public boolean productsAreSortedByName()
    {
        return driver.getCurrentUrl().contains("controller=search&search_query=dress&submit_search=&orderby=name&orderway=asc");
    }

    public void clickAddToCartButton()
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(imageOfProduct).build().perform();
        addToCartButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-ok")));
    }

    public boolean productIsAddedToCart()
    {
        return confirmationOfAddingProductToCartCommunicate.isDisplayed();
    }

    public void clickProceedToCheckOutButton()
    {
        proceedToCheckOutButton.click();
    }

    public void clickOnCrossSign()
    {
        crossSign.click();
    }

    public void clickOnLogo()
    {
        logo.click();
    }
}
