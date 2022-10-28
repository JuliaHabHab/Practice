package GUTest.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageGU {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePageGU(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,700);
    }

    public void navigete(String url){
        driver.get(url);
    }

    private WebElement getButtonDelete(){
        By buttonDelete = By.xpath("//*[text()='Удалить']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDelete));
        return driver.findElement(buttonDelete);
    }

    private WebElement getIconDelete(){
        By iconDlelte = By.xpath("//*[@class=\"delete-icon\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(iconDlelte));
        return driver.findElement(iconDlelte);
    }

    public void deleteDraft(){
        navigete("https://lk.gosuslugi.ru/orders?type=ORDER,EQUEUE,APPEAL,CLAIM,COMPLEX_ORDER,SIGN");
        getIconDelete().click();
        getButtonDelete().click();
    }

}
