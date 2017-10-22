package leparkres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pending {
	public static WebElement pendingrequest(WebDriver driver){
		return driver.findElement(By.xpath("(//*[@class='ant-menu-item'])[4]"));
		
		
	}
	public static WebElement confirm(WebDriver driver){
		return driver.findElement(By.xpath("(//*[@class='ant-btn'])[2]"));
	}
	public static WebElement okbutton(WebDriver driver){
		return driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-sm']"));
	}
	
}
