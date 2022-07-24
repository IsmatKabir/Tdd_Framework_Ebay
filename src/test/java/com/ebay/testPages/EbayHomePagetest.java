package com.ebay.testPages;

import com.ebay.pages.EbayHomePage;
import configuration.common.WebTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayHomePagetest extends WebTestBase {

    EbayHomePage ebayHomePage;
    @BeforeMethod
    public void getInit() {
        ebayHomePage  = PageFactory.initElements(driver, EbayHomePage.class);
    }
    @Test

    public void testProductSearch(){
        ebayHomePage.checksearchBoxWithValidProduct("airpods pro case");

    }

}
