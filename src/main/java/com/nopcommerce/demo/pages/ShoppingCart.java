package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCart extends Utility {
    By shoppingCarText = By.xpath("//span[contains(text(),'Shopping cart')]");

    public String getTextFromShoppingCartHeading() {
        return getTextFromElement(shoppingCarText);
    }

    By quantityOption = By.xpath("//input[@class='qty-input']");

    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }

    By shoppingCartOption = By.xpath("//button[@id='updatecart']");

    public void updateShoppingCart() {
        clickOnElement(shoppingCartOption);
    }

    By priceFinalOption = By.xpath("//tbody/tr[1]/td[6]/span[1]");

    public String getTextFromFinalPrice() {
        return getTextFromElement(priceFinalOption);
    }

    By updateCartOption = By.xpath("//button[@id='updatecart']");

    public void clickOnUpdateCartOption() {
        clickOnElement(updateCartOption);
    }

    By termsOption = By.xpath("//input[@id='termsofservice']");

    public void clickOnTermsOfServiceOption() {
        clickOnElement(termsOption);
    }

    By checkOutOption = By.xpath("//button[@id='checkout']");

    public void clickCheckOutOption() {
        clickOnElement(checkOutOption);
    }

    By shoppingCarWelcomeText = By.xpath("//span[contains(text(),'Shopping cart')]");

    public String getTextWelcomePleaseSignInOption() {
        return getTextFromElement(shoppingCarWelcomeText);
    }
}
