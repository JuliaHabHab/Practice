package GUTest.PageObject;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageGU extends BasePageGU{

    public LoginPageGU(WebDriver driver) {
        super(driver);
    }

    private WebElement getfeildUsernameGU(){
        By feildUsernameGULocator = By.xpath("//*[@id='login']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(feildUsernameGULocator));
        return driver.findElement(feildUsernameGULocator);
    }

    private WebElement getfeildPasswordGU(){
        By feildPasswordGULocator = By.xpath("//*[@id='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(feildPasswordGULocator));
        return driver.findElement(feildPasswordGULocator);
    }

    private WebElement getbuttonLoginGU(){
        By buttonLoginGULocator = By.xpath("//*[@class='plain-button plain-button_wide']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLoginGULocator));
        return driver.findElement(buttonLoginGULocator);
    }

    public MainPageGU loginToAppGU(String username, String password){
        getbuttonLogin().click();
        getfeildUsernameGU().sendKeys(username);
        getfeildPasswordGU().sendKeys(password);
        getbuttonLoginGU().click();
        return new MainPageGU(driver);
    }

    private WebElement getbuttonLogin(){
        By buttonLoginGULocator = By.xpath("(//*[@class=\"button-container light\"])[1]");
        return driver.findElement(buttonLoginGULocator);
    }

}
