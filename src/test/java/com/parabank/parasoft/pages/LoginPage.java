package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillUsername(String username) {
        getWebElement(By.name("username")).sendKeys(username);
        return this;
    }

    public LoginPage fillPassword(String password) {
        getWebElement(By.name("password")).sendKeys(password);
        return this;
    }

    public OverviewPage clickLoginButton() {
        clickElement(By.xpath("//input[@value='Log In']"));
        return goTo(OverviewPage.class);
    }

    public LoginPage clickLoginButtonAndStay() {
        clickElement(By.xpath("//input[@value='Log In']"));
        return this;
    }

    public CustomerLookupPage clickForgotPassword() {
        ParaBankUtil.waitForPageLoad();
        clickElement(By.cssSelector("a[href='lookup.htm']"));
        return goTo(CustomerLookupPage.class);
    }

    public RegisterPage clickRegister() {
        clickElement(By.cssSelector("a[href='register.htm']"));
        return goTo(RegisterPage.class);
    }

    public boolean isLoginPage() {
        return getWebElements(By.cssSelector("form[name='login']")).size() > 0;
    }

    public boolean hasLoginError() {
        setWait(By.cssSelector("p.error"));
        return getWebElements(By.cssSelector("p.error")).size() > 0; //1 0
    }
}
