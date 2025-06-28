package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPaymentServicePage extends BasePage{
    public BillPaymentServicePage(WebDriver driver) {
        super(driver);
    }

    public BillPaymentServicePage fillPayeeName(String payeeName) {
        getWebElement(By.cssSelector("input[name='payee.name']")).sendKeys(payeeName);
        return this;
    }

    public BillPaymentServicePage fillPayeeAddress(String payeeAddress) {
        getWebElement(By.cssSelector("input[name='payee.address.street']")).sendKeys(payeeAddress);
        return this;
    }

    public BillPaymentServicePage fillPayeeCity(String payeeCity) {
        getWebElement(By.cssSelector("input[name='payee.address.city']")).sendKeys(payeeCity);
        return this;
    }

    public BillPaymentServicePage fillPayeeState(String payeeState) {
        getWebElement(By.cssSelector("input[name='payee.address.state']")).sendKeys(payeeState);
        return this;
    }

    public BillPaymentServicePage fillPayeeZipCode(String payeeZipCode) {
        getWebElement(By.cssSelector("input[name='payee.address.zipCode']")).sendKeys(payeeZipCode);
        return this;
    }
    public BillPaymentServicePage fillPayeePhoneNumber(String payeePhoneNumber) {
        getWebElement(By.cssSelector("input[name='payee.phoneNumber']")).sendKeys(payeePhoneNumber);
        return this;
    }

    public BillPaymentServicePage fillPayeeAccountNumber(String payeeAccountNumber) {
        getWebElement(By.cssSelector("input[name='payee.accountNumber']")).sendKeys(payeeAccountNumber);
        return this;
    }

    public BillPaymentServicePage fillAmount(String amount) {
        getWebElement(By.cssSelector("input[name='amount']")).sendKeys(amount);
        return this;
    }

    public BillPaymentServicePage fillVerifyAccountNumber(String verifyAccountNumber) {
        getWebElement(By.cssSelector("input[name='verifyAccount']")).sendKeys(verifyAccountNumber);
        return this;
    }

    public BillPaymentServicePage clickSendPaymentButton() {
        clickElement(By.cssSelector("input[value='Send Payment']"));
        return this;
    }
}
