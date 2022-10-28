package GUTest.PageTest;

import GUTest.PageObject.LoginPageGU;
import GUTest.PageObject.MainPageGU;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestGU extends BaseTestGU{

    @Test
    public void LoginTest_correct_LoggedToApp() throws InterruptedException {
        LoginPageGU loginPageGU = new LoginPageGU(driver);
        loginPageGU.navigete(url);
        MainPageGU mainPageGU = loginPageGU.loginToAppGU("89636577410","@Juliana-3103");
        Assert.assertTrue(mainPageGU.isGUMainPage());
    }
}
