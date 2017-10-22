package leparkres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findrequest {
	public static WebElement roomnumber(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Room Number']"));
		
		
	}
	public static WebElement Namesuggestion(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Name ']"));
	}
	public static WebElement okbutton(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Company ']"));
	}
	
	public static WebElement search(WebDriver driver){
		return driver.findElement(By.xpath("//*[@class='all_buttons']"));
	}
	
	
	
}
