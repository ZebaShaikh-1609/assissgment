import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo2 {
	static WebDriver driver; 
	
	@BeforeMethod  
	public void beforeM() {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Before Method");
	}
	@Test
	public void demo() {
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Reporter.log("Demo",true);
	}
    @Test
    public void demo1() {
    	driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		Reporter.log("Demo!",true);
    }
    @AfterMethod
    	public void afterM(){
        driver.close();
    	}
    }
   


