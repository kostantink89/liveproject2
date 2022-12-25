package PageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPersInfo extends BasePage {

    private WebDriver driver;

    By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By emailField = By.cssSelector("form#customer-form > section input[name='email']");
    By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
    By birthDateField = By.cssSelector("input[name='birthday']");
    By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7) > .col-md-6 > .custom-checkbox > label");
    By newsletterCheckbox = By.cssSelector("div:nth-of-type(8) > .col-md-6 > .custom-checkbox > label");
    By termsConditionsCheckbox= By.cssSelector("div:nth-of-type(9) > .col-md-6 > .custom-checkbox > label");

    By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");

    public OrderFormPersInfo() throws IOException {
        super();

    }

    public WebElement getGenderMr() throws IOException {
        this.driver = getDriver();
        return driver.findElement(genderMr);
    }

    public WebElement getGenderMrs() throws IOException {
        this.driver = getDriver();
        return driver.findElement(genderMrs);
    }

    public WebElement getFirstNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(firstNameField);
    }

    public WebElement getLastnameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(lastNameField);
    }

    public WebElement getEmailField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(passwordField);
    }

    public WebElement getBirthDateField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(birthDateField);
    }

    public WebElement getRecOfferCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(receiveOffersCheckbox);
    }

    public WebElement getNewsletterCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(newsletterCheckbox);
    }

    public WebElement getTermsConditionsCheckbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(termsConditionsCheckbox);
    }

    public WebElement getContinueBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(continueBtn);
    }


}
