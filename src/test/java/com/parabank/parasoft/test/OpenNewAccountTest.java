package com.parabank.parasoft.test;


import com.parabank.parasoft.pages.AccountOpenedPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import com.parabank.parasoft.pages.OverviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {

    @Test(enabled = false)
    public void checkingOpenNewAccountShouldSucceed() {
        //LoginPage > OverViewPage > Open New Account > Account Opened Page
        OverviewPage overviewPage = pg.goTo(LoginPage.class)
                .doLogin(getUsername(), getPassword());

        OpenNewAccountPage accountPage = overviewPage
                .clickOpenNewAccountBtn();

        AccountOpenedPage openedPage = accountPage
                .clickOpenNewAccountButton();

        // Verify that the account was opened successfully
        Assert.assertTrue(openedPage.hasAccountOpenedId());

    }

    @Test(enabled = true)
    public void checkingOpenNewAccountShouldSucceed2() {
        //LoginPage > OverViewPage > Open New Account > Account Opened Page
        AccountOpenedPage openedPage = pg.goTo(LoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickOpenNewAccountBtn()
                .clickOpenNewAccountButton();

        // Verify that the account was opened successfully
        Assert.assertTrue(openedPage.hasAccountOpenedId());

    }

    @Test(enabled = false)
    public void savingsOpenNewAccountShouldSucceed() {
        //LoginPage > OverViewPage > Open New Account > Account Opened Page
        AccountOpenedPage openedPage = pg.goTo(LoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickOpenNewAccountBtn()
                .selectAccountType("SAVINGS")
                .clickOpenNewAccountButton();

        // Verify that the account was opened successfully
        Assert.assertTrue(openedPage.hasAccountOpenedId());

    }
}
