package pages;

import locators.SearchPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private WebDriver driver;
    private SearchPageLocators searchPageLocators;

    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
        searchPageLocators = new SearchPageLocators();
        PageFactory.initElements(driver, searchPageLocators);
    }

    public void sortByProductName()
    {
        Select sort = new Select(searchPageLocators.getSortByDropDownList());
        sort.selectByValue("name:asc");
    }

    public boolean productsAreSortedByName()
    {
        return driver.getCurrentUrl().contains("controller=search&search_query=dress&submit_search=&orderby=name&orderway=asc");
    }

    public void clickAddToCartButton()
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(searchPageLocators.getImageOfProduct()).build().perform();
        searchPageLocators.getAddToCartButton().click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-ok")));
    }

    public boolean productIsAddedToCart()
    {
        return searchPageLocators.getConfirmationOfAddingProductToCartCommunicate().isDisplayed();
    }

    public CartPage clickProceedToCheckOutButton()
    {
        searchPageLocators.getProceedToCheckOutButton().click();
        return new CartPage(driver);
    }
}
