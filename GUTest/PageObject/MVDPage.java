package GUTest.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MVDPage extends BasePageGU{

    public MVDPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getButtonToStart(){
        By buttonToStartLocator = By.xpath("//*[@class=\"button font-\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonToStartLocator));
        return driver.findElement(buttonToStartLocator);
    }

    private WebElement getLinkInternationalPassport(){
        By linkInternationalPassport = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[3]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkInternationalPassport));
        return driver.findElement(linkInternationalPassport);
    }

    private WebElement getLinkOldStylePassport(){
        By linkOldStylePassport = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkOldStylePassport));
        return driver.findElement(linkOldStylePassport);
    }

    private WebElement getLinkChildFrom14To18YearsOld(){
        By linkChildFrom14To18YearsOld = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[3]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkChildFrom14To18YearsOld));
        return driver.findElement(linkChildFrom14To18YearsOld);
    }

    private WebElement getClickFieldRegion(){
        By clickFieldRegion = By.xpath("//*[@class=\"search-field lookup-input undefined\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickFieldRegion));
        return driver.findElement(clickFieldRegion);
    }

    private WebElement getFieldRegion (){
        By fieldRegion = By.xpath("//*[@class=\"search-field lookup-input undefined\"]/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldRegion));
        return driver.findElement(fieldRegion);
    }

    private WebElement getChooseRegion(){
        By chooseRegionLocator = By.xpath("//*[@class=\"virtual-scroll-content-wrapper\"]/div[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseRegionLocator));
        return driver.findElement(chooseRegionLocator);
    }

    private WebElement getSearch(){
        By searchLocator = By.xpath("//*[@class=\"widget-form__input\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchLocator));
        return driver.findElement(searchLocator);
    }

    private WebElement getFeildSearch(){
        By feildSearch = By.xpath("//*[@placeholder=\"Адрес или название\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(feildSearch));
        return driver.findElement(feildSearch);
    }

    private WebElement getDepartment(){
        By allDepartment = By.xpath("//*[@class=\"map-object__header ng-tns-c290-4\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(allDepartment));
        return driver.findElement(allDepartment);
    }

    private WebElement getButtonChoose(){
        By buttonChoose = By.xpath("//*[@class='button-container wide']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonChoose));
        return driver.findElement(buttonChoose);
    }

    private WebElement getChooseDay(){
        By chooseDay = By.xpath("(//*[@class=\"calendar-day ng-star-inserted\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseDay));
        return driver.findElement(chooseDay);
    }

    private WebElement getChoseTime(){
        By chooseTime = By.xpath("(//*[@class=\"time-slot-item ng-star-inserted\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseTime));
        return driver.findElement(chooseTime);
    }

    public void makeAppointmentWithMVDToIssuePassport() {
        getButtonToStart().click();
        getLinkInternationalPassport().click();
        getLinkOldStylePassport().click();
        getLinkChildFrom14To18YearsOld().click();
        getButtonToStart().click();
        getButtonToStart().click();
        getClickFieldRegion().click();
        getFieldRegion().sendKeys("Респ Карелия");
        getChooseRegion().click();
        getButtonToStart().click();
        getSearch().click();
        getFeildSearch().sendKeys("Пряжинскому району");
        getDepartment().click();
        getButtonChoose().click();
        getChooseDay().click();
        getChoseTime().click();
    }

    public boolean buttonMakeAppointmentActive() {
        By buttonMakeAppointment = By.xpath("//*[@class=\"button font- ng-star-inserted\"]");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(buttonMakeAppointment));
            return true;
        } catch (TimeoutException err) {
            return false;
        }
    }

    private WebElement getToButtonStart(){
        By toButtonStart = By.xpath("//*[@class=\"button font-\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(toButtonStart));
        return driver.findElement(toButtonStart);
    }


    public MVDPage clickStartAndNavigatePageRegistrationDeregistrationPlaceResidence(){
        getToButtonStart().click();
        return this;
    }

    public MVDPage clickRegisterAndNavigatePageWhoNeedsRegistered(){

        return this;
    }


    public MVDPage clickMeAndMySpouseAndNavigatePageOwnerPremises() {

        return this;
    }
}
