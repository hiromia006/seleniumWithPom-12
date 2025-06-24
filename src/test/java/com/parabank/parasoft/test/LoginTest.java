package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.util.ParaBankUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginPage() {
        LoginPage lPage = pg.goTo(LoginPage.class);
        Assert.assertTrue(lPage.isLoginPage());
    }

    @Test
    public void checkLoginPageUrl() {
        LoginPage lPage = pg.goTo(LoginPage.class);
        String url = lPage.getPageUrl();
        Assert.assertTrue(url.contains("ParaBank"));
    }

    @Test
    public void loginShouldFailWithUsername() {
        LoginPage lPage = pg.goTo(LoginPage.class);
        lPage = lPage
                .fillUsername("asdkjksaddsa")
                .clickLoginButtonAndStay();
        Assert.assertTrue(lPage.hasLoginError(), "Login should fail with Only username");

    }

    @Test
    public void loginShouldFailWithPassword() {
        LoginPage lPage = pg.goTo(LoginPage.class);
        lPage = lPage
                .fillPassword("asdkjksaddsa")
                .clickLoginButtonAndStay();
        Assert.assertTrue(lPage.hasLoginError(), "Login should fail with Only Password");

    }

    @Test
    public void checkLoginPageTitle() {
        LoginPage lPage = pg.goTo(LoginPage.class);
        String title = lPage.getPageTitle();
        Assert.assertEquals(title, ParaBankUtil.LOGIN_TITTLE, "Login page title does not match");
    }
}
