import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshotsave {
	public static void screenshot (WebDriver driver , String name) throws IOException{
	  TakesScreenshot ts = (TakesScreenshot)driver;	
	  File Screenshot = ts.getScreenshotAs(OutputType.FILE);
	  File ScreenSave = new File (".\\ScreenShot\\" + name  + ".png");
	  Files.copy(Screenshot, ScreenSave);
		
		
		

}
}