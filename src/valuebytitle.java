import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class valuebytitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("Launching browser");
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		System.out.println("Title of webpage by getTitle() method :" + driver.getTitle());
		WebElement titleElement = driver.findElement(By.tagName("title"));
		System.out.println("Title of webpage by webelement title :" + titleElement.getAttribute("textContent"));
	}
}
