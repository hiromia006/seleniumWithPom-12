package com.parabank.parasoft.pages;

import com.aventstack.extentreports.Status;
import com.parabank.parasoft.report.ReportTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By locator) {
        // Handle exception if the element is not found
        WebElement element = null;
        try {
            addInfo("Selenium Webdriver going to find a WebElement with " + locator + " Locator");
            element = driver.findElement(locator);
            addInfo("Selenium Webdriver found a Web Element with " + locator + " Locator");
        } catch (Exception e) {
            addFailInfo("Selenium Webdriver is not found a Web Element with " + locator + " Locator");
            System.out.println("Element not found: " + locator);
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        // Handle exception if the elements are not found
        List<WebElement> elements = null;
        try {
            addInfo("Selenium Webdriver going to find a WebElements with " + locator + " Locator");
            elements = driver.findElements(locator);
            addInfo("Selenium Webdriver found a Web Elements with " + locator + " Locator");
        } catch (Exception e) {
            addFailInfo("Selenium Webdriver is not found a Web Elements with " + locator + " Locator");
            System.out.println("Elements not found: " + locator);
        }
        return elements;
    }

    @Override
    public String getElementText(By locator) {
        return getWebElement(locator).getText().trim();
    }

    @Override
    public void clickElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    @Override
    public void setWait(By locator) {
        wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
    }

    @Override
    public Select getSelect(By locator) {

        return new Select(getWebElement(locator));
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }

    public void addFailInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.FAIL, message);
        }
    }
}
