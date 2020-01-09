
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgblueStone {
  @Test
  public void bluestone(){
	  System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Reporter.log("....Loading URL....",true);
	  driver.get("https://www.bluestone.com/");
	  driver.close();
	  
	  
  }
  
}
