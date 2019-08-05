package com.BriteERP.pages;

import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CRMPage {


    @FindBy(xpath = "//span[contains( text(),'CRM' )]")
    public WebElement CRMButtonElement;

    @FindBy(className = "btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list active")
    public WebElement listViewButtonElement;

    @FindBy(xpath = "//table/tbody/tr[2]/td[9]")
    public WebElement secondElementRevenueCell;

    @FindBy(xpath = "//th[@class='o_pivot_header_cell_closed hidden-xs']")
    public WebElement totalButtonElement;

    @FindBy(xpath = "//a[contains( text(),'Opportunity')]")
    public WebElement opportunitySelectionButtonElement;

    @FindBy(xpath = "//table/tbody/tr[2]/td[2]")
    public WebElement secondElementInPivotView;

    public void CRMPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void validateTwoValue(){

      CRMButtonElement.click();
        BrowserUtils.waitFor(3);
      listViewButtonElement.click();
        BrowserUtils.waitFor(3);
      String act=secondElementRevenueCell.getText();

      totalButtonElement.click();
        BrowserUtils.waitFor(3);
      opportunitySelectionButtonElement.click();
        BrowserUtils.waitFor(3);
      String expec=secondElementInPivotView.getText();
        Assert.assertEquals(act,expec);


    }


}
