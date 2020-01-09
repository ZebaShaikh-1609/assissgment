import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String home = driver.getTitle();
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).click();
		Thread.sleep(2000);
		String login = driver.getTitle();
		/*System.out.println(home +"  " + login);
		if (!home.equals(login))
		{
			System.out.println("login done");
			driver.findElement(By.id("logoutLink")).click();
		}
		String logout = driver.getTitle();
		if (home.equals(logout))
			System.out.println("logout");*/
		
		
		
		if (home.equals(login))
		{
			System.out.println("Sucessfully not login");
		}
		else
		{
			Thread.sleep(2000);
			System.out.println("Sucessfully login");
			driver.findElement(By.id("logoutLink")).click();
			System.out.println("Sucessfully logout");
			
			
	}

}
}
