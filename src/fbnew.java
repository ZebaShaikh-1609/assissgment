import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbnew {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(day);
		d.selectByValue("16");
		WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(month);
		m.selectByValue("9");
		WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(year);
		y.selectByValue("2000");


	}

}
