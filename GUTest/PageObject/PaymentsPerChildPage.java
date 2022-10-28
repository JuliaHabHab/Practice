package GUTest.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PaymentsPerChildPage extends BasePageGU{

    public PaymentsPerChildPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getRegionPayment(){
        By regionPayment = By.xpath("//*[@class=\"static-content-container\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(regionPayment));
        return driver.findElement(regionPayment);
    }

    private WebElement getChooseRegion(){
        By chooseRegion = By.xpath("(//*[@class=\"search-field magnifying-glass-or-throbber-shown lookup-input undefined\"]/input)[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseRegion));
        return driver.findElement(chooseRegion);
    }

    private WebElement getClickRegion(){
        By clickRegion = By.xpath("//*[@itemid=\"46000000000\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickRegion));
        return driver.findElement(clickRegion);
    }

    private WebElement getLastname(){
        By lastname = By.xpath("//*[@formcontrolname=\"lastName\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastname));
        return driver.findElement(lastname);
    }

    private WebElement getFieldLastname(){
        By fieldLastname = By.xpath("//*[@formcontrolname=\"lastName\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLastname));
        return driver.findElement(fieldLastname);
    }

    private WebElement getFieldFirstname(){
        By fieldFirstname = By.xpath("//*[@formcontrolname=\"firstName\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstname));
        return driver.findElement(fieldFirstname);
    }

    private WebElement getFieldMiddlename(){
        By fieldMiddlename = By.xpath("//*[@formcontrolname=\"middleName\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldMiddlename));
        return driver.findElement(fieldMiddlename);
    }

    private WebElement getFieldBithday(){
        By fieldBithday = By.xpath("(//*[@class=\"input-container plain-input\"])[1]/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldBithday));
        return driver.findElement(fieldBithday);
    }

    private WebElement getFieldSnils(){
        By fieldSnils = By.xpath("//*[@formcontrolname=\"snils\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldSnils));
        return driver.findElement(fieldSnils);
    }

    private WebElement getSeriesPassport(){
        By seriesPassport = By.xpath("//*[@formcontrolname=\"series\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(seriesPassport));
        return driver.findElement(seriesPassport);
    }

    private WebElement getFieldSeriesPassport(){
        By fieldSeriesPassport = By.xpath("//*[@formcontrolname=\"series\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldSeriesPassport));
        return driver.findElement(fieldSeriesPassport);
    }

    private WebElement getFieldNumberPassport(){
        By fieldNumberPassport = By.xpath("//*[@formcontrolname=\"number\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldNumberPassport));
        return driver.findElement(fieldNumberPassport);
    }

    private WebElement getFieldIssueDate(){
        By fieldIssueDate = By.xpath("(//*[@class=\"text-control masked-input calendar-input\"]/div/input)[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldIssueDate));
        return driver.findElement(fieldIssueDate);
    }

    private WebElement getFieldCodePodr(){
        By fieldCodePodr = By.xpath("//*[@formcontrolname=\"codePodr\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldCodePodr));
        return driver.findElement(fieldCodePodr);
    }

    private WebElement getFieldIssuePodr(){
        By fieldIssuePodr = By.xpath("//*[@class=\"multiline-input\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldIssuePodr));
        return driver.findElement(fieldIssuePodr);
    }

    private WebElement getFieldPlaceBith(){
        By fieldPlaceBith = By.xpath("//*[@formcontrolname=\"birthPlace\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldPlaceBith));
        return driver.findElement(fieldPlaceBith);
    }

    private WebElement getDateAssemblyRecord(){
        By dateAssemblyRecord = By.xpath("(//*[@class=\"text-control masked-input calendar-input\"])[3]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dateAssemblyRecord));
        return driver.findElement(dateAssemblyRecord);
    }

    private WebElement getFieldDateAssemblyRecord(){
        By fieldDateAssemblyRecord = By.xpath("(//*[@class=\"text-control masked-input calendar-input\"])[3]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldDateAssemblyRecord));
        return driver.findElement(fieldDateAssemblyRecord);
    }

    private WebElement getFieldNumberAssemblyRecord(){
        By fieldNumberAssemblyRecord = By.xpath("(//*[@formcontrolname=\"number\"]/div/input)[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldNumberAssemblyRecord));
        return driver.findElement(fieldNumberAssemblyRecord);
    }

    private WebElement getFieldIssuedAssemblyRecord(){
        By fieldIssuedAssemblyRecord = By.xpath("(//*[@formcontrolname=\"issued\"]/div/div/lib-search-bar/div/input)[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldIssuedAssemblyRecord));
        return driver.findElement(fieldIssuedAssemblyRecord);
    }

    private WebElement getChooseIssued(){
        By chooseIssue = By.xpath("//div[@itemid=\"R1300005\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseIssue));
        return driver.findElement(chooseIssue);
    }

    private WebElement getFirstChildLastname(){
        By firstChildLastname = By.xpath("(//*[@formcontrolname=\"lastname\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstChildLastname));
        return driver.findElement(firstChildLastname);
    }

    private WebElement getFieldFirstChildLastname(){
        By fieldFirstChildLastname = By.xpath("(//*[@formcontrolname=\"lastname\"]/div/input)[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstChildLastname));
        return driver.findElement(fieldFirstChildLastname);
    }

    private WebElement getFieldFirstChildFirstname(){
        By fieldFirstChildFirstname = By.xpath("(//*[@formcontrolname=\"firstName\"]/div/input)[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstChildFirstname));
        return driver.findElement(fieldFirstChildFirstname);
    }

    private WebElement getFieldFirstChildMiddlename(){
        By fieldFirstChildMiddlename = By.xpath("(//*[@formcontrolname=\"middleName\"]/div/input)[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstChildMiddlename));
        return driver.findElement(fieldFirstChildMiddlename);
    }

    private WebElement getDateBithFirstChild(){
        By dateBithFirstChild = By.xpath("(//*[@formcontrolname=\"bithday\"]/div/div/div/div/lib-standard-masked-input/div/div/div/input)[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dateBithFirstChild));
        return driver.findElement(dateBithFirstChild);
    }

    private WebElement getFieldFirstChildSnils(){
        By fieldFirstChildSnils = By.xpath("(//*[@formcontrolname=\"snils\"]/div/input)[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldFirstChildSnils));
        return driver.findElement(fieldFirstChildSnils);
    }

    private WebElement getDateIssueBithdayChild(){
        By dateIssueBithdayChild = By.xpath("(//*[@class=\"text-control masked-input calendar-input\"])[7]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dateIssueBithdayChild));
        return driver.findElement(dateIssueBithdayChild);
    }

    private WebElement getFieldDateIssueBithdayChild(){
        By fieldDateIssueBithdayChild = By.xpath("(//*[@class=\"text-control masked-input calendar-input\"])[7]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldDateIssueBithdayChild));
        return driver.findElement(fieldDateIssueBithdayChild);
    }

    private WebElement getFieldCountIssueBithdayChild(){
        By fieldCountIssueBithdayChild = By.xpath("(//*[@formcontrolname=\"number\"]/div/input)[5]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldCountIssueBithdayChild));
        return driver.findElement(fieldCountIssueBithdayChild);
    }

    private WebElement getFieldIssuedBithdayChild(){
        By fieldIssuedBithdayChild = By.xpath("(//*[@formcontrolname=\"issued\"]/div/div/lib-search-bar/div/input)[4]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldIssuedBithdayChild));
        return driver.findElement(fieldIssuedBithdayChild);
    }

    private WebElement getChooseIssuedBithdayChild(){
        By chooseIssue = By.xpath("//div[@itemid=\"R4500012\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseIssue));
        return driver.findElement(chooseIssue);
    }

    private WebElement getChooseChild(){
        By chooseChild = By.xpath("//*[@formcontrolname=\"paymentChild\"]/label/span");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseChild));
        return driver.findElement(chooseChild);
    }

    private WebElement getBankNameOrBIK(){
        By bankNameOrBIK = By.xpath("//*[@formcontrolname=\"bankNameOrBIK\"]/div");
        wait.until(ExpectedConditions.visibilityOfElementLocated(bankNameOrBIK));
        return driver.findElement(bankNameOrBIK);
    }

    private WebElement getFieldBankNameOrBIK(){
        By fieldBankNameOrBIK = By.xpath("//*[@formcontrolname=\"bankNameOrBIK\"]/div/div/lib-search-bar/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldBankNameOrBIK));
        return driver.findElement(fieldBankNameOrBIK);
    }

    private WebElement getChooseBank(){
        By chooseBank = By.xpath("//span[text()='044525196']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseBank));
        return driver.findElement(chooseBank);
    }

    private WebElement getAccountNumber(){
        By accountNumber = By.xpath("//*[@formcontrolname=\"accountNumber\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountNumber));
        return driver.findElement(accountNumber);
    }

    private WebElement getFieldAccountNumber(){
        By fieldAccountNumber = By.xpath("//*[@formcontrolname=\"accountNumber\"]/div/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldAccountNumber));
        return driver.findElement(fieldAccountNumber);
    }

    private WebElement getButtonSaveAndSendLater(){
        By buttonSaveAndSendLater = By.xpath("//*[@class=\"button-container small-paddings\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSaveAndSendLater));
        return driver.findElement(buttonSaveAndSendLater);
    }

    public void fillingOutTheApplication(){
        getRegionPayment().click();
        getChooseRegion().sendKeys(Keys.CONTROL+"a");
        getChooseRegion().sendKeys("Московская область");
        getClickRegion().click();
        getLastname().click();
        getFieldLastname().sendKeys("Иванов"+Keys.TAB);
        getFieldFirstname().sendKeys("Иван"+Keys.TAB);
        getFieldMiddlename().sendKeys("Иванович"+Keys.TAB+Keys.TAB);
        getFieldBithday().sendKeys(Keys.CONTROL+"a");
        getFieldBithday().sendKeys("10102000"+Keys.TAB);
        getFieldSnils().sendKeys("00000000101");
        getSeriesPassport().click();
        getFieldSeriesPassport().sendKeys("1111"+Keys.TAB);
        getFieldNumberPassport().sendKeys("111111"+Keys.TAB);
        getFieldIssueDate().sendKeys("20032005"+Keys.TAB);
        getFieldCodePodr().sendKeys("111111"+Keys.TAB);
        getFieldIssuePodr().sendKeys("Секретное агентство"+Keys.TAB);
        getFieldPlaceBith().sendKeys("Страна чудес");
        getDateAssemblyRecord().click();
        getFieldDateAssemblyRecord().sendKeys(Keys.CONTROL+"a");
        getFieldDateAssemblyRecord().sendKeys("02082022"+Keys.TAB);
        getFieldNumberAssemblyRecord().sendKeys("0"+Keys.TAB);
        getFieldIssuedAssemblyRecord().sendKeys("Пролетарский отдел ЗАГС Управления");
        getChooseIssued().click();
        getFirstChildLastname().click();
        getFieldFirstChildLastname().sendKeys("ПРО"+Keys.TAB);
        getFieldFirstChildFirstname().sendKeys("ПРО"+Keys.TAB);
        getFieldFirstChildMiddlename().sendKeys("ПРО"+Keys.TAB+Keys.TAB);
        getDateBithFirstChild().sendKeys("10102017"+Keys.TAB+Keys.TAB);
        getFieldFirstChildSnils().sendKeys("09081618572");
        getDateIssueBithdayChild().click();
        getFieldDateIssueBithdayChild().sendKeys(Keys.CONTROL+"a");
        getFieldDateIssueBithdayChild().sendKeys("04082022"+Keys.TAB);
        getFieldCountIssueBithdayChild().sendKeys("3785"+Keys.TAB);
        getFieldIssuedBithdayChild().sendKeys("Администрация Просветского");
        getChooseIssuedBithdayChild().click();
        getChooseChild().click();
        getBankNameOrBIK().click();
        getFieldBankNameOrBIK().sendKeys("044525196");
        getChooseBank().click();
        getAccountNumber().click();
        getFieldAccountNumber().sendKeys("12340000000000000000");
        getButtonSaveAndSendLater().click();
    }

    public boolean draftsaved() {
        By linkDraft = By.xpath("//*[@class=\"expiry-date-plate-wrapper flex-container justify-between align-items-center\"]");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(linkDraft));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }

    private WebElement getButtonSubmitApplication(){
        By buttonSumbitApplicatoin = By.xpath("//*[@class=\"button font- ng-star-inserted\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSumbitApplicatoin));
        return driver.findElement(buttonSumbitApplicatoin);
    }

    public void chooseEveryValidField(){
        List<WebElement> validField = driver.findElements(By.xpath("//*[@class=\"error-label ng-star-inserted\"]"));
        System.out.println(validField.size());
    }

    public void checkValidField() {
        getRegionPayment().click();
        getChooseRegion().sendKeys(Keys.CONTROL+"a");
        getChooseRegion().sendKeys("Московская область");
        getClickRegion().click();
        getButtonSubmitApplication().click();
        chooseEveryValidField();
    }

    public boolean assertValidField() {
        List<WebElement> validField = driver.findElements(By.xpath("//*[@class=\"error-label ng-star-inserted\"]"));
        for (int i=1; i<=validField.size();i++){

        }
        return true;
    }
}
