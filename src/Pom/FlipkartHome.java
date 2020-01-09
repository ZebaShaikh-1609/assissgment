package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FlipkartHome {
@FindBy	(xpath="//input[@type='text']")
private WebElement search;
@FindBy	(xpath="//input[@type='text']")


public void electronicMouse(WebDriver Driver){
	Actions a = new Actions(driver);
	a.moveToElement(electronics).perform();
}


public void miClick(){
	mi.click();
}


public void phoneClick(){
	phone.click();
}


public void switch_Tab(WebDriver driver){
	Set<WebElements> wins  driver.getWindowHandles();
	for ( string win : wins) {
		
	}
	public void cartClick(){
		addToCart.click();
	}
}
}
