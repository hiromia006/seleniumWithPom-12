package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void checkRegistrationPage() {
        LoginPage lPage = pg.goTo(LoginPage.class);
        RegisterPage registerPage = lPage
                .clickRegister();
        Assert.assertTrue(registerPage.hasRegistrationForm());
    }
}
