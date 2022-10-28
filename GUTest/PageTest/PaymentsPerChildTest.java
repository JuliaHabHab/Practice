package GUTest.PageTest;

import GUTest.PageObject.LoginPageGU;
import GUTest.PageObject.MainPageGU;
import GUTest.PageObject.PaymentsPerChildPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentsPerChildTest extends BaseTestGU {

    @Test
    public void sendingApplicationForChildBenefits(){
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410","@Juliana-3103");
        PaymentsPerChildPage paymentsPerChildPage = new PaymentsPerChildPage (driver);
        paymentsPerChildPage.navigete(url+"/434403/2/form");
        paymentsPerChildPage.fillingOutTheApplication();
        Assert.assertTrue(paymentsPerChildPage.draftsaved());
        paymentsPerChildPage.deleteDraft();
    }

    @Test
    public void checkingValidFields(){
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410","@Juliana-3103");
        PaymentsPerChildPage paymentsPerChildPage = new PaymentsPerChildPage (driver);
        paymentsPerChildPage.navigete(url+"/434403/2/form");
        paymentsPerChildPage.checkValidField();
//        Assert.assertTrue(paymentsPerChildPage.assertValidField());
    }

}
