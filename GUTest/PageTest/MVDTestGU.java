package GUTest.PageTest;

import GUTest.PageObject.BasePageGU;
import GUTest.PageObject.LoginPageGU;
import GUTest.PageObject.MVDPage;
import GUTest.PageObject.MainPageGU;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class MVDTestGU extends BaseTestGU{

    @Test
    public void checkObtainingAnOldStylePassport(){
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410","@Juliana-3103");
        MVDPage mvdPage = mainPageGU.goToAppointmentPageAtTheMVD();
        mvdPage.makeAppointmentWithMVDToIssuePassport();
        Assert.assertTrue(mvdPage.buttonMakeAppointmentActive());
    }

    @Test
    public void spousesКegistered_Owners_EntitlementRegisteredRosreestr(){
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410","@Juliana-3103");
        mainPageGU.navigete(url+"/600124/1/form");
        MVDPage mvdPage = new MVDPage(driver)
                .clickStartAndNavigatePageRegistrationDeregistrationPlaceResidence()
                .clickRegisterAndNavigatePageWhoNeedsRegistered()
                .clickMeAndMySpouseAndNavigatePageOwnerPremises();
//                .clickYesAndNavigatePageSpouseIsOwnerResidentialPremises()
//                .clickYesAndNavigatePageOwnershipPremisesRegisteredInRosreestr()
//                .clickYesAndNavigatePageToApplyYouNeed()
//                .clickGoToApplicationAndNavigatePageCheckCorrectnessYourData()
//                .clickButtonRightAndNavigatePageCheckCorrectNumberPhone()
//                .clickButtonRightAndNavigatePageCheckCorrectEmail()
//                .clickButtonRightAndNavigatePageCheckCorrectAddressPreviousPlaceResidence()
//                .fillAllFieldsAndNavigatePageRemovedRegisterAddressPreviousPlaceOResidence()
//                .clickButtonRightAndNavigatePageSpecifyNewAddressPlaceResidence()
//                .fillAddressAndClickNextAndNavigatePageDocumentConfirmingOwnership();


    }
}
