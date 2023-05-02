package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutBilling extends Utility {
    By firstNameOption = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    public void firstNameOption(String firstName){
        sendTextToElement(firstNameOption, firstName);
    }
    By lastNameOption = By.xpath("//input[@id='BillingNewAddress_LastName']");
    public void lastNameOption(String lastName) {
        sendTextToElement(lastNameOption,lastName);
    }

    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    By dropDownOption = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    public void selectUKFromDropdownOption(String country) {
        selectByVisibleTextFromDropDown(dropDownOption, country);
    }

    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    By addressField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    public void enterAddressLine1(String address) {
        sendTextToElement(addressField, address);
    }

    By zipcodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    public void enterZipcode(String zipcode) {
        sendTextToElement(zipcodeField, zipcode);
    }

    By phoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumberField, phoneNumber);
    }

    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    By shippingOption = By.xpath("//input[@id='shippingoption_1']");
    public void clickOnTheShoppingOption() {
        clickOnElement(shippingOption);
    }

    By continueButton2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    public void clickOnSecondContinueButton(){
        clickOnElement(continueButton2);
    }

    By paymentOption = By.xpath("//input[@id='paymentmethod_1']");
    public void clickOnThePaymentOption() {
        clickOnElement(paymentOption);
    }

    By continueButton3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    public void clickOnThirdContinueButton(){
        clickOnElement(continueButton3);
    }

    By cardDropdownOption = By.xpath("//select[@id='CreditCardType']");
    public void selectMasterCardOptionFromDropdown(String cardType){
        selectByVisibleTextFromDropDown(cardDropdownOption, cardType);
    }

    By nameField = By.xpath("//input[@id='CardholderName']");
    public void enterCardHolderName(String name) {
        sendTextToElement(nameField, name);
    }

    By cardNumberField = By.xpath("//input[@id='CardNumber']");
    public void enterCardNumber(String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
    }

    By monthExpiryField = By.xpath("//select[@id='ExpireMonth']");
    public void enterExpiryMonth(String month) {
        sendTextToElement(monthExpiryField, month);
    }

    By yearExpiryField = By.xpath("//select[@id='ExpireYear']");
    public void enterExpiryYear(String year) {
        sendTextToElement(yearExpiryField, year);
    }

    By securityCodeField = By.xpath("//input[@id='CardCode']");
    public void enterSecurityCode(String code) {
        sendTextToElement(securityCodeField, code);
    }

    By continueButton4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    public void clickOnFourthContinueButton(){
        clickOnElement(continueButton4);
    }

    By paymentMethodText = By.xpath("//span[contains(text(),'Credit Card')]");
    public String getPaymentMethodText() {
        return getTextFromElement(paymentMethodText);
    }

    By shippingMethodText = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]" +
            "/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    public String getShippingMethodText() {
        return getTextFromElement(shippingMethodText);
    }

    By totalPriceText = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]" +
            "/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/" +
            "table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    public String getTotalPriceText() {
        return getTextFromElement(totalPriceText);
    }

    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }

    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    By successfulOrderText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    public String getSuccessfulOrderText() {
        return getTextFromElement(successfulOrderText);
    }

    By lastContinueButton = By.xpath("//button[contains(text(),'Continue')]");
    public void clickOnTheLastContinueButton(){
        clickOnElement(lastContinueButton);
    }

    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }


}
