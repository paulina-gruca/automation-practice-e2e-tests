package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class RegistrationPage {

    @FindBy(name = "id_gender")
    private List<WebElement> genderList;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameTextBox;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameTextBox;

    @FindBy(id = "passwd")
    private WebElement passwordTextBox;

    @FindBy(css = "#days > option")
    private List<WebElement> daysList;

    @FindBy(css = "#months > option")
    private List<WebElement> monthsList;

    @FindBy(css ="#years > option")
    private List<WebElement> yearsList;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    private WebElement specialOffersCheckbox;

    @FindBy(id = "address1")
    private WebElement addressTextBox;

    @FindBy(id = "city")
    private WebElement cityTextBox;

    @FindBy(css = "#id_state > option")
    private List<WebElement> statesList;

    @FindBy(id = "postcode")
    private WebElement zipCodeTextBox;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhoneTextBox;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(css = "#center_column > div")
    private WebElement alert;

    private WebDriver driver;
    private Random random;
    private Faker faker;

    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        random = new Random();
        faker = new Faker();
    }

    public void fillInRegisterForm()
    {
        chooseGender();
        generateAndEnterCustomerFirstName();
        generateAndEnterCustomerLastName();
        generateAndEnterPassword();
        chooseRandomDateOfBirth();
        selectCheckboxForNewsletterAndSpecialOffers();
        generateAndEnterAddress();
        generateAndEnterCity();
        chooseRandomState();
        generateAndEnterZipCode();
        generateAndEnterMobilePhoneNumber();
    }

    public void incompleteFillInRegisterForm()
    {
        chooseGender();
        generateAndEnterCustomerFirstName();
        generateAndEnterCustomerLastName();
        generateAndEnterPassword();
        chooseRandomDateOfBirth();
        selectCheckboxForNewsletterAndSpecialOffers();
    }

    private void chooseGender()
    {
        int index = random.nextInt(2);
        genderList.get(index).click();
    }

    private void generateAndEnterCustomerFirstName()
    {
        String uniqueFirstName = faker.name().firstName();
        firstNameTextBox.sendKeys(uniqueFirstName);
    }

    private void generateAndEnterCustomerLastName()
    {
        String uniqueLastName = faker.name().lastName();
        lastNameTextBox.sendKeys(uniqueLastName);
    }

    private void generateAndEnterPassword()
    {
        String password = faker.pokemon().name() + faker.random().nextInt(100);
        passwordTextBox.sendKeys(password);
    }

    private void chooseRandomDateOfBirth()
    {
        int day = random.nextInt(daysList.size() - 1) + 1;
        daysList.get(day).click();
        int month = random.nextInt(monthsList.size() - 1) + 1;
        monthsList.get(month).click();
        int year = random.nextInt(yearsList.size() - 1) + 1;
        yearsList.get(year).click();
    }

    private void selectCheckboxForNewsletterAndSpecialOffers()
    {
        int choice = random.nextInt(2);
        if(choice == 1){
            clickNewsletterCheckBox();
        }
        choice = random.nextInt(2);
        if(choice == 1){
            clickSpecialOffersCheckbox();
        }
    }

    private void clickNewsletterCheckBox()
    {
        newsletterCheckbox.click();
    }

    private void clickSpecialOffersCheckbox()
    {
        specialOffersCheckbox.click();
    }

    private void generateAndEnterAddress()
    {
        String uniqueAddress = faker.address().streetAddress() + " " + faker.address().streetAddressNumber();
        addressTextBox.sendKeys(uniqueAddress);
    }

    private void generateAndEnterCity()
    {
        String uniqueCity = faker.address().city();
        cityTextBox.sendKeys(uniqueCity);
    }

    private void chooseRandomState()
    {
        int state = random.nextInt(statesList.size() - 1) + 1;
        statesList.get(state).click();
    }

    private void generateAndEnterZipCode()
    {
        zipCodeTextBox.sendKeys(generateZipCode());
    }

    private String generateZipCode()
    {
        int zipCode = random.nextInt(9999) + 90000;
        return String.valueOf(zipCode);
    }

    private void generateAndEnterMobilePhoneNumber()
    {
        String uniqueMobilePhoneNumber = String.valueOf(faker.number().randomNumber());
        mobilePhoneTextBox.sendKeys(uniqueMobilePhoneNumber);
    }

    public void clickOnRegisterButtonWithoutAllRequiredData()
    {
        registerButton.click();
    }

    public boolean alertIsDisplayed()
    {
        return alert.getText().contains("error");
    }

    public void clickOnRegisterButtonWithAllRequiredData()
    {
        registerButton.click();
    }
}
