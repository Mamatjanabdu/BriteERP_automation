package com.BriteERP.utilities;

import com.BriteERP.pages.LoginPage;

public class Pages {
    private LoginPage loginPage;



    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

}
