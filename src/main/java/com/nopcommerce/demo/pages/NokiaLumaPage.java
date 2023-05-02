package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumaPage extends Utility {
    By nokiaLumaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    public String verifyNokiaLuma1020Text() {
        return getTextFromElement(nokiaLumaText);
    }

    By nokiaLumaPriceText = By.xpath("//span[@id='price-value-20']");

    public String verifyNokiaLuma1020PriceText() {
        return getTextFromElement(nokiaLumaPriceText);
    }

    By quantityOption = By.xpath("//input[@id='product_enteredQuantity_20']");

    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }

    By addToCartOption = By.xpath("//button[@id='add-to-cart-button-20']");

    public void clickOnAddToCartOption() {
        clickOnElement(addToCartOption);
    }

    By productAddedToShoppingCartText = By.xpath("//div[@id='bar-notification']/div/p");

    public String verifyTheProductHasBeenAddedToYourShoppingCartText() {
        return getTextFromElement(productAddedToShoppingCartText);
    }

    By clickOnGreenBarXButtonOption = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public void clickOnXOnGreenBarOption() {
        clickOnElement(clickOnGreenBarXButtonOption);
    }

    By shoppingCartButtonOption = By.xpath("//button[contains(text(),'Go to cart')]");

    public void mouseHoverOverShoppingCartOption() {
        mouseHoverToElementAndClick(shoppingCartButtonOption);
    }
    By goToCartOption = By.xpath("//button[contains(text(),'Go to cart')]");
    public void clickOnGoToCartOption() {
        clickOnElement(goToCartOption);
    }
}
