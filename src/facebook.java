import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("zeba");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("shaikh");
		System.out.println("loading url");
		WebElement log_in= driver.findElement(By.id("loginbutton"));
		log_in.click();
	}

}