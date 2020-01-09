import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimexpath {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement txt=driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']//input[@type='text']"));
		System.out.println(txt.getText());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(txt.getText());
		
		WebElement pwd=driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pwd.getText());
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys(pwd.getText());//method is used in printg statement and not store in variable 


}
}