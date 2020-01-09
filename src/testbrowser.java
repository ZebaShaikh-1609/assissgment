import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://iqgenie.org/");
		String s1=driver.getTitle();
		System.out.println(s1);
		Thread.sleep(1000);
		driver.findElement(By.id("userIcon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='hollow button alert']")).click();
		String s2= driver.getTitle();
		System.out.println(s2);
		Thread.sleep(1000);
        if(s1.equals(s2)){
        	System.out.println("equals");
        }
        	else{
            	System.out.println("not equals");

        		
        }	
		
	}
}
