package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumaCartPage extends Utility {
    By nokiaLumaCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public String verifyNokiaLumaShoppingCartText() {
        return getTextFromElement(nokiaLumaCartText);
    }
    By nokiaLumaCartQuantityText = By.xpath("//input[@class=\"qty-input\"]");
    public String verifyQuantityText() {
        return getTextFromElement(nokiaLumaCartQuantityText);
    }
    By nokiaLumaCartUpdatedPriceText = By.xpath("///span//strong[contains(text(),'$698.00')]");
    public String verifyTotalPriceText() {
        return getTextFromElement(nokiaLumaCartUpdatedPriceText);
    }
    By clickOnBoxIAgreeTerms = By.xpath("//input[@id='termsofservice']");

    public void clickOnBoxIAgreeToTermsOfServiceOption() {
        clickOnElement(clickOnBoxIAgreeTerms);
    }
    By clickOnCheckOut = By.xpath("//button[@id='checkout']");
    public void clickOnCheckOutOption() {
        clickOnElement(clickOnCheckOut);
    }
}
