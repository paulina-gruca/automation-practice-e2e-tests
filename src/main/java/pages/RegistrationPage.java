package pages;

import com.github.javafaker.Faker;
import locators.RegistrationPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class RegistrationPage {

    private WebDriver driver;
    private RegistrationPageLocators registrationPageLocators;
    private Random random;
    private Faker faker;

    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
        registrationPageLocators = new RegistrationPageLocators();
        PageFactory.initElements(driver, registrationPageLocators);
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
        registrationPageLocators.getGenderList().get(index).click();
    }

    private void generateAndEnterCustomerFirstName()
    {
        String uniqueFirstName = faker.name().firstName();
        registrationPageLocators.getFirstNameTextBox().sendKeys(uniqueFirstName);
    }

    private void generateAndEnterCustomerLastName()
    {
        String uniqueLastName = faker.name().lastName();
        registrationPageLocators.getLastNameTextBox().sendKeys(uniqueLastName);
    }

    private void generateAndEnterPassword()
    {
        String password = faker.pokemon().name() + faker.random().nextInt(100);
        registrationPageLocators.getPasswordTextBox().sendKeys(password);
    }

    private void chooseRandomDateOfBirth()
    {
        int day = random.nextInt(registrationPageLocators.getDaysList().size() - 1) + 1;
        registrationPageLocators.getDaysList().get(day).click();
        int month = random.nextInt(registrationPageLocators.getMonthsList().size() - 1) + 1;
        registrationPageLocators.getMonthsList().get(month).click();
        int year = random.nextInt(registrationPageLocators.getYearsList().size() - 1) + 1;
        registrationPageLocators.getYearsList().get(year).click();
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
        registrationPageLocators.getNewsletterCheckbox().click();
    }

    private void clickSpecialOffersCheckbox()
    {
        registrationPageLocators.getSpecialOffersCheckbox().click();
    }

    private void generateAndEnterAddress()
    {
        String uniqueAddress = faker.address().streetAddress() + " " + faker.address().streetAddressNumber();
        registrationPageLocators.getAddressTextBox().sendKeys(uniqueAddress);
    }

    private void generateAndEnterCity()
    {
        String uniqueCity = faker.address().city();
        registrationPageLocators.getCityTextBox().sendKeys(uniqueCity);
    }

    private void chooseRandomState()
    {
        int state = random.nextInt(registrationPageLocators.getStatesList().size() - 1) + 1;
        registrationPageLocators.getStatesList().get(state).click();
    }

    private void generateAndEnterZipCode()
    {
        registrationPageLocators.getZipCodeTextBox().sendKeys(generateZipCode());
    }

    private String generateZipCode()
    {
        int zipCode = random.nextInt(9999) + 90000;
        return String.valueOf(zipCode);
    }

    private void generateAndEnterMobilePhoneNumber()
    {
        String uniqueMobilePhoneNumber = String.valueOf(faker.number().randomNumber());
        registrationPageLocators.getMobilePhoneTextBox().sendKeys(uniqueMobilePhoneNumber);
    }

    public void clickOnRegisterButtonWithoutAllRequiredData()
    {
        registrationPageLocators.getRegisterButton().click();
    }

    public boolean alertIsDisplayed()
    {
        return registrationPageLocators.getAlert().getText().contains("error");
    }

    public CorrectAuthenticationPage clickOnRegisterButtonWithAllRequiredData()
    {
        registrationPageLocators.getRegisterButton().click();
        return new CorrectAuthenticationPage(driver);
    }
}
