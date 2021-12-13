package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegistrationPageLocators {

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

    public List<WebElement> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<WebElement> genderList) {
        this.genderList = genderList;
    }

    public WebElement getFirstNameTextBox() {
        return firstNameTextBox;
    }

    public void setFirstNameTextBox(WebElement firstNameTextBox) {
        this.firstNameTextBox = firstNameTextBox;
    }

    public WebElement getLastNameTextBox() {
        return lastNameTextBox;
    }

    public void setLastNameTextBox(WebElement lastNameTextBox) {
        this.lastNameTextBox = lastNameTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public void setPasswordTextBox(WebElement passwordTextBox) {
        this.passwordTextBox = passwordTextBox;
    }

    public List<WebElement> getDaysList() {
        return daysList;
    }

    public void setDaysList(List<WebElement> daysList) {
        this.daysList = daysList;
    }

    public List<WebElement> getMonthsList() {
        return monthsList;
    }

    public void setMonthsList(List<WebElement> monthsList) {
        this.monthsList = monthsList;
    }

    public List<WebElement> getYearsList() {
        return yearsList;
    }

    public void setYearsList(List<WebElement> yearsList) {
        this.yearsList = yearsList;
    }

    public WebElement getNewsletterCheckbox() {
        return newsletterCheckbox;
    }

    public void setNewsletterCheckbox(WebElement newsletterCheckbox) {
        this.newsletterCheckbox = newsletterCheckbox;
    }

    public WebElement getSpecialOffersCheckbox() {
        return specialOffersCheckbox;
    }

    public void setSpecialOffersCheckbox(WebElement specialOffersCheckbox) {
        this.specialOffersCheckbox = specialOffersCheckbox;
    }

    public WebElement getAddressTextBox() {
        return addressTextBox;
    }

    public void setAddressTextBox(WebElement addressTextBox) {
        this.addressTextBox = addressTextBox;
    }

    public WebElement getCityTextBox() {
        return cityTextBox;
    }

    public void setCityTextBox(WebElement cityTextBox) {
        this.cityTextBox = cityTextBox;
    }

    public List<WebElement> getStatesList() {
        return statesList;
    }

    public void setStatesList(List<WebElement> statesList) {
        this.statesList = statesList;
    }

    public WebElement getZipCodeTextBox() {
        return zipCodeTextBox;
    }

    public void setZipCodeTextBox(WebElement zipCodeTextBox) {
        this.zipCodeTextBox = zipCodeTextBox;
    }

    public WebElement getMobilePhoneTextBox() {
        return mobilePhoneTextBox;
    }

    public void setMobilePhoneTextBox(WebElement mobilePhoneTextBox) {
        this.mobilePhoneTextBox = mobilePhoneTextBox;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(WebElement registerButton) {
        this.registerButton = registerButton;
    }

    public WebElement getAlert() {
        return alert;
    }

    public void setAlert(WebElement alert) {
        this.alert = alert;
    }
}
