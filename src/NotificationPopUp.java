import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications");//browser pre-setting to avoid PopUp
		WebDriver driver = new ChromeDriver(co);
		System.out.println("Launching browser");
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
	}
	
}
