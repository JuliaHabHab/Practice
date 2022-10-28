package GUTest.PageTest;

import Helper.BrowserFabric;
import enums.BrowserTypes;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestGU {
    protected WebDriver driver;
    protected String url;

    @BeforeMethod
    public  void startBeforeEveryTest_GU(){
        BrowserTypes types = BrowserTypes.CHROME;
        driver = BrowserFabric.getDriver(types);
        url = "https://www.gosuslugi.ru";
    }

    @AfterMethod
    public void endAfterEveryTest_GU() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
