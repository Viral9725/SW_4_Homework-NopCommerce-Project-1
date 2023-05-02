package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basetest.BaseTest;
import com.nopcommerce.demo.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() {
        String expectedMessage = "Computers\n" +
                "Electronics\n" +
                "Apparel\n" +
                "Digital downloads\n" +
                "Books\n" +
                "Jewelry\n" +
                "Gift Cards";
        String actualText = homePage.findAllTabsInTopMenu();
        Assert.assertEquals(actualText, expectedMessage, "Top menu is not displayed");
    }
}
