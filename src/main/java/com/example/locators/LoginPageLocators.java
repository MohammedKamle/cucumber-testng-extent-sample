package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(id = "logInPanelHeading")
    public WebElement titleText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public  WebElement errorMessage;

    @FindBy(xpath = "//*[@id='social-icons']/a[1]/img")
    public  WebElement linkedInIcon;

    @FindBy(xpath = "//*[@id='social-icons']/a[6]/img")  //Invalid Xpath
    public  WebElement faceBookIcon;

}
