package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.CustomerLookupPage;
import com.parabank.parasoft.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerLookupTest extends BaseTest {
    @Test
    public void checkCustomerLookupPage() {
        LoginPage lPage = pg.goTo(LoginPage.class);
        CustomerLookupPage clPage = lPage
                .clickForgotPassword();
        Assert.assertTrue(clPage.hasLookupForm());
    }
}
