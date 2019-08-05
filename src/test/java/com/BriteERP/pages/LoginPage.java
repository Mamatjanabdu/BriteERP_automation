package com.BriteERP.pages;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.valueOf(ConfigurationReader.getProperty("explicitwait")));

    @FindBy(css = "#login")
    public WebElement userNameElement;


    @FindBy(css = "#password")
    public WebElement passwordElement;

    @FindBy(css = "button[class='btn btn-primary']")
    public WebElement loginButtonElement;


    @FindBy(xpath = "//li[contains (text(),'#Inbox')]")
    public WebElement titleButtonElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void login(String username, String password){

       userNameElement.sendKeys(username);
       passwordElement.sendKeys(password);
       loginButtonElement.click();

    }
public void login(){
        String username=ConfigurationReader.getProperty("username");
        String password= ConfigurationReader.getProperty("password");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
}



}





