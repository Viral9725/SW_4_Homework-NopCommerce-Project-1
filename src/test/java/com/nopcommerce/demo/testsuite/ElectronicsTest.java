package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellphonePages cellphonePage = new CellphonePages();
    NokiaLumaPage nokiaLumaPage = new NokiaLumaPage();
    NokiaLumaCartPage nokiaLumaCartPage = new NokiaLumaCartPage();
    NokiaLumaCheckOutPage nokiaLumaCheckOutPage = new NokiaLumaCheckOutPage();
    NokiaLumaRegisterPage nokiaLumaRegisterPage = new NokiaLumaRegisterPage();
    NokiaLumaBillingPage nokiaLumaBillingPage = new NokiaLumaBillingPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        homePage.clickElectronicsTab();
        electronicsPage.clickCellPhones();
        String expectedMessage = "Cell phones";
        Assert.assertEquals(cellphonePage.getCellPhoneText(),
                expectedMessage, "Cell Phones page is not displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.clickElectronicsTab();
        electronicsPage.clickCellPhones();
        String expectedMessage = "Cell phones";
        Assert.assertEquals(cellphonePage.getCellPhoneText(),
                expectedMessage, "Cell Phones page is not displayed");
        cellphonePage.clickOnTheListButton();
        Thread.sleep(1000);
        cellphonePage.clickOnThePhoneOption();
        String expectedMessage1 = "Nokia Lumia 1020";
        Assert.assertEquals(nokiaLumaPage.verifyNokiaLuma1020Text(),
                expectedMessage1, "Nokia Luma Cell Phones page is not displayed");
        String expectedMessage2 = "$349.00";
        Assert.assertEquals(nokiaLumaPage.verifyNokiaLuma1020PriceText(),
                expectedMessage2, "Nokia Luma Cell Phones Price is not displayed");
        nokiaLumaPage.quantitySpaceOption();
        nokiaLumaPage.clickOnAddToCartOption();
        Thread.sleep(3000);
        String expectedMessage3 = "The product has been added to your shopping cart";
        Assert.assertEquals(nokiaLumaPage.verifyTheProductHasBeenAddedToYourShoppingCartText(),
                expectedMessage3, "Product not added to Cart displayed");
        nokiaLumaPage.clickOnXOnGreenBarOption();

        nokiaLumaPage.mouseHoverOverShoppingCartOption();
        nokiaLumaPage.clickOnGoToCartOption();
        nokiaLumaCartPage.verifyNokiaLumaShoppingCartText();
        nokiaLumaCartPage.verifyQuantityText();
        nokiaLumaCartPage.verifyTotalPriceText();
        nokiaLumaCartPage.clickOnBoxIAgreeToTermsOfServiceOption();
        nokiaLumaCartPage.clickOnCheckOutOption();
        nokiaLumaCheckOutPage.verifyWelcomePleaseSignInText();
        nokiaLumaCheckOutPage.clickOnRegisterTabOption();
        String expectedMessage4 = "Register";
        Assert.assertEquals(nokiaLumaRegisterPage.verifyRegisterText(),
                expectedMessage4, "Register Tab not displayed");
        nokiaLumaRegisterPage.clickOnAppropriateGenderButton();
        nokiaLumaRegisterPage.firstNameOption("abcd");
        nokiaLumaRegisterPage.lastNameOption("abcd123");
        nokiaLumaRegisterPage.dateOfBirth("01");
        nokiaLumaRegisterPage.dateOfBirthMonth("January");
        nokiaLumaRegisterPage.dateOfBirthYear("2000");
        nokiaLumaRegisterPage.enterEmailOption("viral1234@gmail.com");
        nokiaLumaRegisterPage.enterPasswordOption("Viral123456789");
        nokiaLumaRegisterPage.confirmPasswordOption("Viral123456789");
        nokiaLumaRegisterPage.clickOnRegisterTabButton();
        String expectedMessage5 = "Your registration completed";
        Assert.assertEquals(nokiaLumaRegisterPage.verifyRegisterText(),
                expectedMessage5, "YourRegistration Completed tab not displayed");
        nokiaLumaRegisterPage.clickOnContinueButton();
        nokiaLumaRegisterPage.verifyShoppingCartText();
        nokiaLumaRegisterPage.clickOnTermsAndServiceBox();
        nokiaLumaRegisterPage.clickOnCheckOutTab();
        nokiaLumaBillingPage.firstNameOption("abc");
        nokiaLumaBillingPage.lastNameOption("xyz");
        nokiaLumaBillingPage.selectUKFromDropdownOption("United Kingdom");
        nokiaLumaBillingPage.inputProvince("Other");
        nokiaLumaBillingPage.selectOtherProvinceFromDropdownOption("Other");
        nokiaLumaBillingPage.enterCity("London");
        nokiaLumaBillingPage.enterFirstLineOfAddressCity("10 Downing Street");
        nokiaLumaBillingPage.enterZipPostalCode("SW111AA ");
        nokiaLumaBillingPage.enterPhoneNumber("0758541258");
        nokiaLumaBillingPage.clickOnContinueTab();
        nokiaLumaBillingPage.clickOnRadioButtonSecondDayAir();
        Thread.sleep(3000);
        nokiaLumaBillingPage.clickOnContinueButtonTab();
        nokiaLumaBillingPage.clickOnCreditCardRadioButton();
        nokiaLumaBillingPage.clickOnCheckOutStepPaymentMethodRadioButton();
        nokiaLumaBillingPage.selectMasterOrVisaCardForPayment("Visa");
        nokiaLumaBillingPage.cardHolderNameAsOnCard("abc");
        nokiaLumaBillingPage.cardNumberAsOnCard("232 1478 4876 3353");
        nokiaLumaBillingPage.enterMonthOption("02");
        nokiaLumaBillingPage.enterYearOption("2025");
        nokiaLumaBillingPage.enterCardCodeFromBackOfTheCard("000");
        nokiaLumaBillingPage.clickOnContinueCheckOutTab();
        String expectedMessage6 = "Credit Card";
        Assert.assertEquals(nokiaLumaBillingPage.verifyPaymentMethodByCreditCardText(),
                expectedMessage6, "Credit Card tab not displayed");
        String expectedMessage7 = "Next Day Air";
        Assert.assertEquals(nokiaLumaBillingPage.getShippingSecondDayAirMethodText(),
                expectedMessage7, "Shipping Method incorrect");
        String expectedMessage8 = "$698.00";
        Assert.assertEquals(nokiaLumaBillingPage.getTotalPriceText(),
                expectedMessage8, "Total price incorrect");
        nokiaLumaBillingPage.clickOnConfirmButton();
        nokiaLumaBillingPage.getThankYouText();
        nokiaLumaBillingPage.clickOnConfirmButton();
        String expectedMessage9 = "Thank you";
        Assert.assertEquals(nokiaLumaBillingPage.getThankYouText(), expectedMessage9, "Text displayed is incorrect");
        String expectedMessage10 = "Your order has been successfully processed!";
        Assert.assertEquals(nokiaLumaBillingPage.getSuccessfulOrderText(), expectedMessage10, "Page displayed is incorrect");
        nokiaLumaBillingPage.clickOnTheLastContinueButton();
        String expectedMessage11 = "Welcome to our store";
        Assert.assertEquals(nokiaLumaBillingPage.getWelcomeText(),
                expectedMessage11, "Page displayed is incorrect");
        nokiaLumaBillingPage.clickOnLogoutTabButton();
        String expectedMessage12 = "https://demo.nopcommerce.com/";
        Assert.assertEquals(nokiaLumaBillingPage.getWelcomeText(),
                expectedMessage11, "Wrong URL");

    }
}
