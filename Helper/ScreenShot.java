package Helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void get(WebDriver driver,String filename){

        TakesScreenshot takesScreenshot = (TakesScreenshot)driver; // после равно выражение называется кастинг
        File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("./screenshots/" + filename + ".png"));
        } catch (IOException err) {}
    }
}
