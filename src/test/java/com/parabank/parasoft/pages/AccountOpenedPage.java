package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOpenedPage extends BasePage {
    public AccountOpenedPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasAccountOpenedId() {
        return getWebElements(By.cssSelector("a[id='newAccountId']")).size() > 0;
    }
}
