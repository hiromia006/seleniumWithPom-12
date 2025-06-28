package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.BillPaymentCompletePage;
import com.parabank.parasoft.pages.LoginPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillPaymentServiceTest extends BaseTest {

    @Test
    public void billPaymentServiceShouldSucceed() {
        BillPaymentCompletePage completePage = pg.goTo(LoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickBillPaymentService()
                .fillPayeeName(LoremIpsum.getInstance().getName())
                .fillPayeeAddress(LoremIpsum.getInstance().getCity())
                .fillPayeeCity(LoremIpsum.getInstance().getCity())
                .fillPayeeState(LoremIpsum.getInstance().getStateFull())
                .fillPayeeZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPayeePhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillPayeeAccountNumber("123456789")
                .fillVerifyAccountNumber("123456789")
                .fillAmount("100.00")
                .clickSendPaymentButton();

        // Verify that the payment was sent successfully
        Assert.assertTrue(completePage.hasBillPaymentCompleteMessage());


    }
}
