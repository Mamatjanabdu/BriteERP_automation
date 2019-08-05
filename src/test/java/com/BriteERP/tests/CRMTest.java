package com.BriteERP.tests;

import com.BriteERP.pages.CRMPage;

import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class CRMTest extends TestBase {

    @Test
    public void veryTwoValue() {
        LoginPage loginPage = new LoginPage();
        CRMPage crmPage = new CRMPage();

        String username=ConfigurationReader.getProperty("username");
        String password= ConfigurationReader.getProperty("password");
       loginPage.login(username,password);
        BrowserUtils.waitFor(4);
       crmPage.validateTwoValue();

    }
}