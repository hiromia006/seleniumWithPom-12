package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasRegistrationForm() {
        return getWebElements(By.id("customerForm")).size() > 0;
    }

    public RegisterPage fillFirstName(String firstName) {
        getWebElement(By.id("customer.firstName")).sendKeys(firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastName) {
        getWebElement(By.id("customer.lastName")).sendKeys(lastName);
        return this;
    }

    public RegisterPage fillAddress(String address) {
        getWebElement(By.id("customer.address.street")).sendKeys(address);
        return this;
    }

    public RegisterPage fillCity(String city) {
        getWebElement(By.id("customer.address.city")).sendKeys(city);
        return this;
    }

    public RegisterPage fillState(String state) {
        getWebElement(By.id("customer.address.state")).sendKeys(state);
        return this;
    }

    public RegisterPage fillZipCode(String zipCode) {
        getWebElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        return this;
    }

    public RegisterPage fillPhoneNumber(String phoneNumber) {
        getWebElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
        return this;
    }

    public RegisterPage fillSsn(String ssn) {
        getWebElement(By.id("customer.ssn")).sendKeys(ssn);
        return this;
    }

    public RegisterPage fillUsername(String username) {
        getWebElement(By.id("customer.username")).sendKeys(username);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        getWebElement(By.id("customer.password")).sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword) {
        getWebElement(By.id("repeatedPassword")).sendKeys(confirmPassword);
        return this;
    }

    public OverviewPage clickRegisterButton() {
        clickElement(By.cssSelector("input[value='Register']"));
        return goTo(OverviewPage.class);
    }

    public RegisterPage clickRegisterButtonAndStay() {
        clickElement(By.cssSelector("input[value='Register']"));
        return this;
    }

    public boolean hasRegistrationError(int errorCount) {
        setWait(By.cssSelector("p.error"));
        return getWebElements(By.cssSelector("p.error")).size() >= errorCount;
    }
}
