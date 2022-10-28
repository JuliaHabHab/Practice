package GUTest.PageTest;

import GUTest.PageObject.InternationalPassportRFPage;
import GUTest.PageObject.LoginPageGU;
import GUTest.PageObject.MainPageGU;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InternationalPassportRFTest extends BaseTestGU {

    @Test
    public void checkObtainingAnOldStylePassport(){
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410", "@Juliana-3103");
        InternationalPassportRFPage internationalPassportRFPage = new InternationalPassportRFPage(driver);
        internationalPassportRFPage.navigete(url + "/600101/1/form");
        internationalPassportRFPage.applyingForeignPassport();
        Assert.assertTrue(internationalPassportRFPage.activeButtonSendStatement());
        internationalPassportRFPage.deleteDraft();
    }
}
