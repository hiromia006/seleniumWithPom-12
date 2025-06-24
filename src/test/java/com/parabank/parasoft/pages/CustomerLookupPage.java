package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLookupPage extends BasePage {
    public CustomerLookupPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLookupForm() {
        return getWebElements(By.id("lookupForm")).size() > 0;
    }
}
