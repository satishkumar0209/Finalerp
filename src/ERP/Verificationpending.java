package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verificationpending 
{

	public static WebElement logout(WebDriver driver){
		
		return driver.findElement(By.xpath("//*[@label='Logout']"));
	}
}
