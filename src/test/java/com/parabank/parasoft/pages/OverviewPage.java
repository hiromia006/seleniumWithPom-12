package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage{
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutBtn() {
        return getWebElements(By.cssSelector("a[href='logout.htm']")).size() > 0;
    }

    public OpenNewAccountPage clickOpenNewAccountBtn() {
        clickElement(By.cssSelector("a[href='openaccount.htm']"));
        return goTo(OpenNewAccountPage.class);
    }

    public BillPaymentServicePage clickBillPaymentService() {
        clickElement(By.cssSelector("a[href='billpay.htm']"));
        return goTo(BillPaymentServicePage.class);
    }


}
