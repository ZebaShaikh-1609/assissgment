import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("Launching browser");
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		Point loc = email.getLocation();
		System.out.println(loc);
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x + "  " +y);
	}
}
