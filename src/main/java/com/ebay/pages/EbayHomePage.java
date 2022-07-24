package com.ebay.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.ebay.pageElement.ebayPageElement.*;
import static configuration.common.GlobalReUsableMethods.*;

public class EbayHomePage extends WebTestBase{



@FindBy(xpath = clickOnSearchBox)
public WebElement searchbox;
    public void checksearchBoxWithValidProduct(String productname){
        enterValueOnElement(searchbox, productname );



    }
}









