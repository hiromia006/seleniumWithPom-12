package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillUsername(String username) {
        getWebElement(By.id("username")).sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password) {
        getWebElement(By.id("password")).sendKeys(password);
        return this;
    }

    public OverviewPage clickLoginButton() {
        clickElement(By.xpath("//input[@value='Log In']"));
        return getInstance(OverviewPage.class);
    }
}
