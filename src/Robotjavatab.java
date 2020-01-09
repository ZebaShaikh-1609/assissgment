import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotjavatab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		System.out.println("...Launching Browser...");
		WebDriver driver = new ChromeDriver();//upcasting
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("....Loading URL....");
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		String s1 = driver.getTitle();
		System.out.println(s1);
		WebElement java=driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt']/span[contains(.,'Java')]"));
		
		Actions a = new Actions (driver);
		a.doubleClick(java).perform();
		
        Thread.sleep(1000);
        
        Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    
		String s2 = driver.getTitle();
		System.out.println(s2);
		
		if(s1.equals(s2))
			{
				System.out.println("Equals");
			}
			else
			{
				Thread.sleep(2000);
				System.out.println("Not Equals");		
			}	
		}
	}


