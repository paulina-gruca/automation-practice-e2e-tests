import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class RegistrationPage {

    WebDriver driver;

    @FindBy(name = "id_gender")
    List<WebElement> genderList;

    @FindBy(id = "customer_firstname")
    WebElement firstNameTextBox;

    @FindBy(id = "customer_lastname")
    WebElement lastNameTextBox;

    @FindBy(id = "passwd")
    WebElement passwordTextBox;

    @FindBy(css = "#days > option")
    List<WebElement> daysList;

    @FindBy(css = "#months > option")
    List<WebElement> monthsList;

    @FindBy(css ="#years > option")
    List<WebElement> yearsList;

    @FindBy(id = "newsletter")
    WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    WebElement specialOffersCheckbox;

    @FindBy(id = "address1")
    WebElement addressTextBox;

    @FindBy(id = "city")
    WebElement cityTextBox;

    @FindBy(css = "#id_state > option")
    List<WebElement> statesList;

    @FindBy(id = "postcode")
    WebElement zipCodeTextBox;

    @FindBy(id = "phone_mobile")
    WebElement mobilePhoneTextBox;

    @FindBy(id = "submitAccount")
    WebElement registerButton;

    @FindBy(css = "#center_column > div")
    WebElement alert;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillInRegisterForm(){
        chooseGender();
        enterCustomerFirstName();
        enterCustomerLastName();
        enterPassword();
        chooseDateOfBirth();
        selectCheckboxForNewsletterAndSpecialOffers();
        enterAddress();
        enterCity();
        chooseState();
        enterZipCode();
        enterMobilePhoneNumber();
    }

    private void chooseGender(){
        Random random = new Random();
        int index = random.nextInt(2);
        genderList.get(index).click();
    }

    private void enterCustomerFirstName(){
        Faker faker = new Faker();
        String uniqueFirstName = faker.name().firstName();
        firstNameTextBox.sendKeys(uniqueFirstName);
    }

    private void enterCustomerLastName(){
        Faker faker = new Faker();
        String uniqueLastName = faker.name().lastName();
        lastNameTextBox.sendKeys(uniqueLastName);
    }

    private void enterPassword(){
        Faker faker = new Faker();
        String password = faker.pokemon().name() + faker.random().nextInt(100);
        passwordTextBox.sendKeys(password);
    }

    private void chooseDateOfBirth(){
        Random random = new Random();
        int day = random.nextInt(daysList.size() - 1) + 1;
        daysList.get(day).click();
        System.out.println(daysList.size());
        int month = random.nextInt(monthsList.size() - 1) + 1;
        monthsList.get(month).click();
        int year = random.nextInt(yearsList.size() - 1) + 1;
        yearsList.get(year).click();
    }

    private void selectCheckboxForNewsletterAndSpecialOffers(){
        Random random = new Random();
        int choice = random.nextInt(2);
        if(choice == 0){
            clickNewsletterCheckBox();
        }
        choice = random.nextInt(2);
        if(choice == 0){
            clickSpecialOffersCheckbox();
        }
    }

    private void clickNewsletterCheckBox(){
        newsletterCheckbox.click();
    }

    private void clickSpecialOffersCheckbox(){
        specialOffersCheckbox.click();
    }

    private void enterAddress(){
        Faker faker = new Faker();
        String uniqueAddress = faker.address().streetAddress() + " " + faker.address().streetAddressNumber();
        addressTextBox.sendKeys(uniqueAddress);
    }

    private void enterCity(){
        Faker faker = new Faker();
        String uniqueCity = faker.address().city();
        cityTextBox.sendKeys(uniqueCity);
    }

    private void chooseState(){
        Random random = new Random();
        int state = random.nextInt(statesList.size() - 1) + 1;
        statesList.get(state).click();
    }

    private void enterZipCode(){
        zipCodeTextBox.sendKeys(generateZipCode());
    }

    private String generateZipCode(){
        Random random = new Random();
        int zipCode = random.nextInt(9999) + 90000;
        return String.valueOf(zipCode);
    }

    private void enterMobilePhoneNumber(){
        Faker faker = new Faker();
        String uniqueMobilePhoneNumber = String.valueOf(faker.number().randomNumber());
        mobilePhoneTextBox.sendKeys(uniqueMobilePhoneNumber);
    }

    public void clickOnRegisterButtonWithoutAllRequiredData(){
        registerButton.click();
    }

    public boolean alertIsDisplayed(){
        return alert.getText().contains("error");
    }

    public CorrectAuthenticationPage clickOnRegisterButtonWithAllRequiredData(){
        registerButton.click();
        return new CorrectAuthenticationPage(driver);
    }

}
