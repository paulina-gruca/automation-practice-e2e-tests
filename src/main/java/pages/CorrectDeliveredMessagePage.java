package pages;

import org.openqa.selenium.WebDriver;

public class CorrectDeliveredMessagePage {

    private WebDriver driver;

    public CorrectDeliveredMessagePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean messageCommunicateIsDisplayed()
    {
        return driver.getPageSource().contains("Your message has been successfully sent to our team.");
    }
}
