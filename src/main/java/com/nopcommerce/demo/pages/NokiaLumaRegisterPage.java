package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumaRegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }
    By clickGenderButton = By.xpath("//input[@id='gender-male']");
    public void clickOnAppropriateGenderButton() {
        clickOnElement(clickGenderButton);
    }
    By firstNameOption = By.xpath("//input[@id='FirstName']");
    public void firstNameOption(String firstName){
        sendTextToElement(firstNameOption, firstName);
    }
    By lastNameOption = By.xpath("//input[@id='LastName']");
    public void lastNameOption(String lastName){
        sendTextToElement(lastNameOption, lastName);
    }
    By dateOption = By.xpath("//select[@name='DateOfBirthDay']");
    public void dateOfBirth(String date){
        selectByVisibleTextFromDropDown(dateOption, date);
    }
    By monthOption = By.xpath("//select[@name='DateOfBirthMonth']");
    public void dateOfBirthMonth(String month){
        selectByVisibleTextFromDropDown(monthOption, month);
    }
    By yearOption = By.xpath("//select[@name='DateOfBirthYear']");
    public void dateOfBirthYear(String year){
        selectByVisibleTextFromDropDown(yearOption, year);
    }
    By emailOption = By.xpath("//input[@id='LastName']");
    public void enterEmailOption(String email){
        sendTextToElement(emailOption, email);
    }
    By passwordOption = By.xpath("//input[@id='LastName']");
    public void enterPasswordOption(String password){
        sendTextToElement(passwordOption, password);
    }
    By confirmPasswordOption = By.xpath("//input[@id='LastName']");
    public void confirmPasswordOption(String password){
        sendTextToElement(confirmPasswordOption, password);
    }
    By clickRegisterButton = By.id("register-button");
    public void clickOnRegisterTabButton() {
        clickOnElement(clickRegisterButton);
    }
    By registrationCompletedText = By.xpath("//div[contains(text(),'Your registration completed')]");
    public String verifyYourRegistrationCompletedText() {
        return getTextFromElement(registrationCompletedText);
    }
    By clickOnContinueButton = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinueButton() {
        clickOnElement(clickOnContinueButton);
    }
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }
    By clickOnTermsAndServiceBox = By.id("termsofservice");
    public void clickOnTermsAndServiceBox() {
        clickOnElement(clickOnTermsAndServiceBox);
    }
    By clickOnCheckOutTab = By.id("checkout");
    public void clickOnCheckOutTab() {
        clickOnElement(clickOnCheckOutTab);

    }
}
