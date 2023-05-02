package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String getTextFromBuildYourOwnComputerHeading() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    By processorOption = By.xpath("//select[@id='product_attribute_1']");

    public void selectProcessorOption() {
        selectByVisibleTextFromDropDown(processorOption, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    By ramOption = By.xpath("//select[@id='product_attribute_2']");

    public void selectRamOption() {
        selectByVisibleTextFromDropDown(ramOption, "8GB [+$60.00]");
    }

    By hddOption = By.xpath("//input[@id='product_attribute_3_7']");

    public void selectHddOption() {
        clickOnElement(hddOption);
    }

    By osOption = By.xpath("//input[@id='product_attribute_4_9']");

    public void selectOsOption() {
        clickOnElement(osOption);
    }

    By softwareOption = By.xpath("//input[@id='product_attribute_5_12']");

    public void selectSoftWareOption() {
        clickOnElement(softwareOption);
    }

    By priceText = By.xpath("//span[@id='price-value-1']");

    public String getTextFromPriceHeading() {
        return getTextFromElement(priceText);
    }

    By addTooCartOption = By.xpath("//button[@id='add-to-cart-button-1']");

    public void addToCartOption() {
        clickOnElement(addTooCartOption);
    }

    By productAddedToText = By.xpath("//body/div[@id='bar-notification']/div[1]");

    public String getTheProductHasBeenAddedToCart() {
        return getTextFromElement(productAddedToText);
    }

    //After that close the bar clicking on the cross button.
    By crossButtonOption = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void crossButtonOption() {
        clickOnElement(crossButtonOption);
    }
    By shoppingCartButtonOption = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void mouseHoverOverShoppingCartOption() {
        mouseHoverToElement(shoppingCartButtonOption);
    }

    By goToCartOption = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void clickOnGoToCartShoppingCartOption() {
        clickOnElement(goToCartOption);
    }

}
