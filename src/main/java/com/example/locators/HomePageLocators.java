package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(id = "welcome")
    public  WebElement homePageUserName;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    public WebElement homePageDasboard;
}
