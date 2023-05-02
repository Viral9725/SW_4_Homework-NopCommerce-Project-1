package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {
    By topMenu = By.xpath("//ul[@class = 'top-menu notmobile']");
    public String findAllTabsInTopMenu (){
        List<WebElement> searchResults = driver.findElements(topMenu);
        ArrayList<String> searchResult = new ArrayList<>();
        for (WebElement e : searchResults) {//e object of webElement
            searchResult.add(e.getText());
        }
        for (String result : searchResult) {
            System.out.println(result);
            return result;
        }
        return null;
    }

    By computerTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    public void clickComputerTab(){
        clickOnElement(computerTab);
    }

    By registerLink = By.linkText("Register");
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    By electronicsTab = By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[2]");
    public void clickElectronicsTab(){
        clickOnElement(electronicsTab);
    }
}
