package GUTest.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageGU extends BasePageGU {

    public MainPageGU(WebDriver driver) {
        super(driver);
    }

    public boolean isGUMainPage() {
        By GULocator = By.xpath("(//*[@class=\"logo ng-star-inserted\"])[2]");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(GULocator));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }

    private WebElement getIconDepartments(){
        By iconDepartments = By.xpath("(//*[@class=\"catalog-link-item ng-star-inserted\"])[33]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(iconDepartments));
        return driver.findElement(iconDepartments);
    }

    private WebElement getLinkShowAll(){
        By linkShowAll = By.xpath("(//*[@class=\"mt-28 link-plain ng-star-inserted\"])[4]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkShowAll));
        return driver.findElement(linkShowAll);
    }

    private WebElement getLinkMakeAppointmentWithMVD(){
        By linkMakeAppointmentWithMVD = By.xpath("//*[text()=' Запись на прием в МВД ']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkMakeAppointmentWithMVD));
        return driver.findElement(linkMakeAppointmentWithMVD);
    }

    public MVDPage goToAppointmentPageAtTheMVD(){
        getIconDepartments().click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",getLinkShowAll());
        getLinkShowAll().click();
        jse.executeScript("arguments[0].scrollIntoView(true);",getLinkMakeAppointmentWithMVD());
        getLinkMakeAppointmentWithMVD().click();
        return new MVDPage(driver);
    }

}
