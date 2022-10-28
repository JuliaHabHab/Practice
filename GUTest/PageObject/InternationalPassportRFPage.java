package GUTest.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class InternationalPassportRFPage extends BasePageGU {

    public InternationalPassportRFPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getButtonToStart(){
        By buttonToStartLocator = By.xpath("//*[@class=\"button font-\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonToStartLocator));
        return driver.findElement(buttonToStartLocator);
    }

    private WebElement getLinkNewSample(){
        By linkNewSample = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkNewSample));
        return driver.findElement(linkNewSample);
    }

    private WebElement getLinkYouself(){
        By linkYouself = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkYouself));
        return driver.findElement(linkYouself);
    }

    private WebElement getLinkWhereResidencePermit(){
        By linkWhereResidencePermit = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkWhereResidencePermit));
        return driver.findElement(linkWhereResidencePermit);
    }

    private boolean checkCorrectnessData() {
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Хабейшвили Юлия Фридоновна']")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='31.03.1991']")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='4611 385930']")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='500-181']")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='20.05.2011']")));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='ТП 3 Межрайонного ОУФМС России по Мос. области в городском поселении Щелково']")));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }

    private WebElement getCountryOfBirth(){
        By countryOfBirth = By.xpath("//*[@class=\"lookup-field\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryOfBirth));
        return driver.findElement(countryOfBirth);
    }

    private WebElement getChooseCountry(){
        By chooseCountry = By.xpath("//*[text()='СССР']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseCountry));
        return driver.findElement(chooseCountry);
    }

    private WebElement getPlaceOfBith(){
        By placeOfBith = By.xpath("//*[@class=\"form__input\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(placeOfBith));
        return driver.findElement(placeOfBith);
    }

    private WebElement getFieldPlaceOfBith(){
        By fieldPlaceOfBith = By.xpath("//input[@name=\"pd1_2\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldPlaceOfBith));
        return driver.findElement(fieldPlaceOfBith);
    }

    private WebElement getChooseDataRegistration(){
        By chooseDataRegistration = By.xpath("//*[@class=\"text-control masked-input calendar-input\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseDataRegistration));
        return driver.findElement(chooseDataRegistration);
    }

    private WebElement getChooseData(){
        By chooseData = By.xpath("(//*[@class=\"text-input focused\"])[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseData));
        return driver.findElement(chooseData);
    }

    private WebElement getButtonNextStep(){
        By buttonNextStep = By.xpath("//*[text()=' Верно ']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonNextStep));
        return driver.findElement(buttonNextStep);
    }

    private WebElement getButtonResume(){
        By buttonResume = By.xpath("//*[text()=' Продолжить ']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonResume));
        return driver.findElement(buttonResume);
    }

    private WebElement getButtonUploadingPhoto(){
        By buttonUploadingPhoto = By.xpath("//*[@class=\"photo__uploading-button\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonUploadingPhoto));
        return driver.findElement(buttonUploadingPhoto);
    }

    public void getSavedPhoto(){
        StringSelection stringSelection = new StringSelection("C:\\Users\\Юлия\\IdeaProjects\\Homework\\src\\main\\resources\\nullpeizazh-lavanda.jpg");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);
        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
        }

    private WebElement getButtonSaveAndResume(){
        By buttonSaveAndResume = By.xpath("//*[text()=' Сохранить и продолжить ']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSaveAndResume));
        return driver.findElement(buttonSaveAndResume);
    }

    private WebElement getChekBoxWorked(){
        By chekBoxWorked = By.xpath("//*[@for=\"app-radio-2\"]/div");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chekBoxWorked));
        return driver.findElement(chekBoxWorked);
    }

    private WebElement getChekBoxUntilNow(){
        By chekBoxUntilNow = By.xpath("//*[@for=\"app-checkbox-1\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chekBoxUntilNow));
        return driver.findElement(chekBoxUntilNow);
    }

    private WebElement getStartWorking(){
        By startWorking = By.xpath("//*[@id=\"0_minDate\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(startWorking));
        return driver.findElement(startWorking);
    }

    private WebElement getFieldStartWorking(){
        By fieldStartWorking = By.xpath("(//*[@class=\"month-picker\"]/div/div/input)[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldStartWorking));
        return driver.findElement(fieldStartWorking);
    }

    private WebElement getFieldPositionAtWork(){
        By fieldPositionAtWork = By.xpath("(//*[@class=\"ng-pristine ng-invalid ng-touched\"]/div/input)[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldPositionAtWork));
        return driver.findElement(fieldPositionAtWork);
    }

    private WebElement getFieldPlaceAtWork(){
        By fieldPlaceAtWork = By.xpath("//input[@name=\"0_place\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldPlaceAtWork));
        return driver.findElement(fieldPlaceAtWork);
    }

    private WebElement getFieldLegalAddressAtWork(){
        By fieldLegalAddressAtWork = By.xpath("//input[@name=\"0_address\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLegalAddressAtWork));
        return driver.findElement(fieldLegalAddressAtWork);
    }

    private WebElement getClickButtonNo(){
        By clickButtonNo = By.xpath("//*[text()='Нет']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickButtonNo));
        return driver.findElement(clickButtonNo);
    }

    private WebElement getClickAnswerTwo(){
        By clickAnswerTwo = By.xpath("(//*[@class=\"btn--white btn--shadow\"])[2]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickAnswerTwo));
        return driver.findElement(clickAnswerTwo);
    }

    private WebElement getLinkGettingFirstTime(){
        By linkGettingFirstTime = By.xpath("//*[text()='Получение впервые']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkGettingFirstTime));
        return driver.findElement(linkGettingFirstTime);
    }

    private WebElement getSearchDepartment(){
        By searchDepartment = By.xpath("//*[@class=\"search-field magnifying-glass-or-throbber-shown lookup-input undefined\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchDepartment));
        return driver.findElement(searchDepartment);
    }

    private WebElement getFieldSearchDepartment(){
        By fieldSearchDepartment = By.xpath("//input[@placeholder=\"Адрес или название\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldSearchDepartment));
        return driver.findElement(fieldSearchDepartment);
    }

    private WebElement getChooseDepartment(){
        By chooseDepartment = By.xpath("//*[@class=\"balloon-content-wrapper ng-tns-c290-7\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseDepartment));
        return driver.findElement(chooseDepartment);
    }

    private WebElement getClickButtonChoose(){
        By clickButtonChoose = By.xpath("//*[text()='Выбрать ']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickButtonChoose));
        return driver.findElement(clickButtonChoose);
    }

    public void applyingForeignPassport() {
        getButtonToStart().click();
        getLinkNewSample().click();
        getLinkYouself().click();
        getLinkWhereResidencePermit().click();
        getButtonToStart().click();
        Assert.assertTrue(checkCorrectnessData());
        getButtonToStart().click();
        getCountryOfBirth().click();
        getChooseCountry().click();
        getPlaceOfBith().click();
        getFieldPlaceOfBith().sendKeys("Лосино-Петровский");
        getButtonToStart().click();
        getButtonToStart().click();
        getButtonToStart().click();
        getChooseDataRegistration().click();
        getChooseData().sendKeys(Keys.CONTROL+"a");
        getChooseData().sendKeys("01082022"+Keys.TAB+Keys.ENTER);
        getButtonNextStep().click();
        getButtonResume().click();
        getButtonUploadingPhoto().click();
        getSavedPhoto();
        getButtonSaveAndResume().click();
        getButtonResume().click();
        getChekBoxWorked().click();
        getChekBoxUntilNow().click();
        getStartWorking().click();
        getFieldStartWorking().sendKeys("102000"+Keys.TAB+Keys.TAB);
        getFieldPositionAtWork().sendKeys("Рабайтен"+Keys.TAB);
        getFieldPlaceAtWork().sendKeys("Супер джоб"+Keys.TAB);
        getFieldLegalAddressAtWork().sendKeys("Маями");
        getButtonResume().click();
        getClickButtonNo().click();
        getClickAnswerTwo().click();
        getButtonResume().click();
        getLinkGettingFirstTime().click();
        getSearchDepartment().click();
        getFieldSearchDepartment().sendKeys("Орехово-Зуевское");
        getChooseDepartment().click();
        getClickButtonChoose().click();
    }

    public boolean activeButtonSendStatement() {
        By activeButton = By.xpath("//*[@class=\"button font- ng-star-inserted\"]");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(activeButton));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }

}
