package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage{
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean HasLogoutBtn() {
        return getWebElements(By.cssSelector("a[href='logout.htm']")).size() > 0;
    }
}
