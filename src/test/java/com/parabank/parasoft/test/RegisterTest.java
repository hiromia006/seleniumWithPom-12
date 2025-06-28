package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OverviewPage;
import com.parabank.parasoft.pages.RegisterPage;
import com.thedeanda.lorem.LoremIpsum;
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

    @Test
    public void registrationShouldSucceed() {
        OverviewPage regPage = pg.goTo(LoginPage.class)
                .clickRegister()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateFull())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillSsn(LoremIpsum.getInstance().getPhone())
                .fillUsername(LoremIpsum.getInstance().getFirstName())
                .fillPassword("password123")
                .fillConfirmPassword("password123")
                .clickRegisterButton();
        Assert.assertTrue(regPage.hasLogoutBtn(), "Registration should succeed");
    }
}
