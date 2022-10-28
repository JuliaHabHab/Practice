package GUTest.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppointmentWithADoctorPage extends BasePageGU{

    public AppointmentWithADoctorPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getButtonToStart(){
        By buttonToStartLocator = By.xpath("//*[@class=\"button font-\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonToStartLocator));
        return driver.findElement(buttonToStartLocator);
    }

    private WebElement getSpanYourself(){
        By spanYourselfLocator = By.xpath("//*[text()='Себя']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(spanYourselfLocator));
        return driver.findElement(spanYourselfLocator);
    }

    private WebElement getLinkErrorCondition(){
        By linkErrorConditionLocator = By.xpath("//*[@id=\"noOms\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(linkErrorConditionLocator));
        return driver.findElement(linkErrorConditionLocator);
    }

    private WebElement getButtonClosePopAp(){
        By buttonClosePopApLocator = By.xpath("//*[@class=\"conf-modal__close icon-close\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonClosePopApLocator));
        return driver.findElement(buttonClosePopApLocator);
    }

    public void appointmentWithADoctor_yourself() {
        getButtonToStart().click();
        getSpanYourself().click();
        getButtonToStart().click();
        getLinkErrorCondition().click();
        getButtonClosePopAp().click();
    }

    public boolean activeButton() {
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"button font-\"]")));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }
}
