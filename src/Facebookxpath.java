import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		System.out.println("...Launching browser...");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);//creating thread
		driver.manage().window().maximize();
		System.out.println("....Loading URL....");
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		
		/*	WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("zeba");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("shaikh");
		System.out.println("loading url");
		WebElement log_in= driver.findElement(By.id("loginbutton"));
		log_in.click();*/
		
		
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Zeba Shaikh");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Password");
		driver.findElement(By.xpath("//label[@class='login_form_login_button uiButton uiButtonConfirm']")).click();
		*/
		
		WebElement email=driver.findElement(By.xpath("//label[@for=\"email\"]"));
		String name = email.getText();
		System.out.println(name);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(name);//coz we stored in a string variable
		
		WebElement pwd=driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pwd.getText());
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys(pwd.getText());//method is used in printg statement and not store in variable 

		
	}

}
