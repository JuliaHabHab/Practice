package GUTest.PageTest;

import GUTest.PageObject.ExtractsFromTheEGRNPage;
import GUTest.PageObject.LoginPageGU;
import GUTest.PageObject.MainPageGU;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtractsFromTheEGRNTest extends BaseTestGU{

    @Test
    private void requestExtractEGRNRealEstateObjects(){
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410","@Juliana-3103");
        ExtractsFromTheEGRNPage extractsFromTheEGRNPage = new ExtractsFromTheEGRNPage(driver);
        extractsFromTheEGRNPage.navigete(url+"/600359/1/form");
        extractsFromTheEGRNPage.sendingRequestForExtractEGRN();
        Assert.assertTrue(extractsFromTheEGRNPage.activeButtonSendApplication());
        extractsFromTheEGRNPage.deleteDraft();
    }

}
