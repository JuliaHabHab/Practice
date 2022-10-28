package GUTest.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium7.pageObjectTest.BaseTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ExtractsFromTheEGRNPage extends BasePageGU{

    public ExtractsFromTheEGRNPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getButtonStart(){
        By buttonStartLocator = By.xpath("//*[@class='button font-']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonStartLocator));
        return driver.findElement(buttonStartLocator);
    }
    private WebElement getLinkGetExtractsEGRN(){
        By getExtractsEGRN = By.xpath("//*[text()='Получить выписку из ЕГРН']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(getExtractsEGRN));
        return driver.findElement(getExtractsEGRN);
    }

    private WebElement getLinkRightsOrDocumentsForEstate(){
        By linkRightsOrDocumentsForEstate = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkRightsOrDocumentsForEstate));
        return driver.findElement(linkRightsOrDocumentsForEstate);
    }
    private WebElement getLinkRightsOfPersonHisEstateObjects(){
        By linkRightsOfPersonHisEstateObjects = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkRightsOfPersonHisEstateObjects));
        return driver.findElement(linkRightsOfPersonHisEstateObjects);
    }

    private WebElement getLinkAllTerritoryRF(){
        By linkAllTerritoryRF = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkAllTerritoryRF));
        return driver.findElement(linkAllTerritoryRF);
    }

    private WebElement getButtonStartData(){
        By buttonStartData = By.xpath("//*[@class=\"value-field-container ng-tns-c82-1\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonStartData));
        return driver.findElement(buttonStartData);
    }

    private WebElement getFocusStartData(){
        By focusStartData = By.xpath("(//*[@class=\"text-input focused\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(focusStartData));
        return driver.findElement(focusStartData);
    }

    private WebElement getButtonEndData(){
        By buttonEndData = By.xpath("//*[@class=\"value-field-container ng-tns-c82-2\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonEndData));
        return driver.findElement(buttonEndData);
    }

    private WebElement getFocusEndData(){
        By focusEndData = By.xpath("(//*[@class=\"text-input focused\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(focusEndData));
        return driver.findElement(focusEndData);
    }

    public void sendingRequestForExtractEGRN() {
        getButtonStart().click();
        getLinkGetExtractsEGRN().click();
        getLinkRightsOrDocumentsForEstate().click();
        getLinkRightsOfPersonHisEstateObjects().click();
        getButtonStart().click();
        getButtonStart().click();
        getButtonStart().click();
        getButtonStart().click();
        getButtonStart().click();
        getLinkAllTerritoryRF().click();
        getButtonStartData().click();
        getFocusStartData().sendKeys(Keys.CONTROL+"a");
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -5);
        getFocusStartData().sendKeys(dateFormat.format(calendar.getTime())+Keys.TAB);
        getButtonEndData().click();
        getFocusEndData().sendKeys(Keys.CONTROL+"a");
        Calendar calendar1 = Calendar.getInstance();
        getFocusEndData().sendKeys(dateFormat.format(calendar1.getTime())+Keys.TAB);
    }

    public boolean activeButtonSendApplication() {
        By buttonSendApplicatoin = By.xpath("//*[@class='button font-']");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSendApplicatoin));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }
}
