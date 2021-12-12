import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SearchPage {

    WebDriver driver;

    @FindBy(id = "selectProductSort")
    WebElement sortBy;

    @FindBy(css = "#center_column > ul > li:nth-child(1) > div > div.left-block > div > a.product_img_link > img")
    WebElement image;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    WebElement addToCart;

    @FindBy(className = "icon-ok")
    WebElement confirmationCommunicat;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    WebElement proceedToCheckOutButton;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sortByItems(){
        Select sort = new Select(sortBy);
        sort.selectByValue("name:asc");
    }

    public boolean itemsAreSortedBy(){
        return driver.getCurrentUrl().contains("controller=search&search_query=dress&submit_search=&orderby=name&orderway=asc");
    }

    public void clickAddToCartButton(){
        Actions builder = new Actions(driver);
        builder.moveToElement(image).build().perform();
        addToCart.click();
        Wait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-ok")));
    }

    public boolean itemWasAddedToCart(){
        return confirmationCommunicat.isDisplayed();
    }

    public CartPage clickProceedCheckOutButton(){
        proceedToCheckOutButton.click();
        return new CartPage(driver);
    }
}
