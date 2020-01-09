import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleByjavascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(".....Launching browser.....");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		
		//for scroll down
		Thread.sleep(5000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(5000);
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		WebElement next=driver.findElement(By.xpath("//span[@style='background:url(/images/nav_logo299.webp) no-repeat;background-position:-96px 0;width:71px']"));
		next.click();
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
       while(next.isEnabled());
       
}
}