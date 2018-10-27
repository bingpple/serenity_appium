package me.bingpple.mobile.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {

    @AndroidFindBy(id = "comments")
    public WebElementFacade commentBox;

}
