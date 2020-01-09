import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotkeyboardAct {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		System.out.println("...Launching Browser...");
		WebDriver driver = new ChromeDriver();//upcasting
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("....Loading URL....");
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_CONTROL);
	}
}
