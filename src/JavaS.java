import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//h2[contains(.,'News')]"));
	    js.executeScript("arguments[0].scrollIntoView()",ele);

	}
}
