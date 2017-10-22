package leparkres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirm {
	
	public static WebElement confirmrequest(WebDriver driver){
		return driver.findElement(By.xpath("(//*[@class='ant-menu-item'])[5]"));
	}
	public static WebElement viewdetails(WebDriver driver){
		return driver.findElement(By.xpath("(//*[@class='ant-btn'])[1]"));
	}
	
}
