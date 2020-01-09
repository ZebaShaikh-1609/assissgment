import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class facebookss {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		System.out.println("...Launching browser...");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);//creating thread
		driver.manage().window().maximize();
		System.out.println("....Loading URL....");
		driver.get("http://www.facebook.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		File ScreenSave = new File (".\\ScreenShot\\facebook.png");
		Files.copy(Screenshot, ScreenSave);
		

	
	}
}
