package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By cellPhoneOption = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/" +
            "div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    public void clickCellPhones(){
        clickOnElement(cellPhoneOption);

    }
}
