package me.bingpple.mobile.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {

    @FindBy(id = "comments")
    public WebElementFacade commentBox;

}
