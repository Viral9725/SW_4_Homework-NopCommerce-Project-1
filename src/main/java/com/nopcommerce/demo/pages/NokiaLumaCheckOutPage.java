package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumaCheckOutPage extends Utility {
    By welcomePleaseSignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String verifyWelcomePleaseSignInText() {
        return getTextFromElement(welcomePleaseSignInText);
    }
    By clickRegisterTab = By.xpath("//button[normalize-space()='Register']");
    public void clickOnRegisterTabOption() {
        clickOnElement(clickRegisterTab);
    }
}
