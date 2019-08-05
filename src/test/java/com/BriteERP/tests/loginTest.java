package com.BriteERP.tests;

import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends TestBase {
 LoginPage loginPage=new LoginPage();
    @Test
    public void loginTest(){


        String username= ConfigurationReader.getProperty("username");

        String password= ConfigurationReader.getProperty("password");

        loginPage.login(username,password);
        BrowserUtils.waitFor(5);
        Assert.assertEquals(driver.getTitle(),"#Inbox - Odoo");
        //  extentLogger.pass("Verified that BriteERP main page is open");
    }



}
