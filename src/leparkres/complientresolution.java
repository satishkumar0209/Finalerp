package leparkres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class complientresolution {
	public static WebElement room(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Room Number']"));
	}
	public static WebElement name(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Name ']"));
	}

	public static WebElement company(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Company']"));
	}
	public static WebElement submit(WebDriver driver){
		return driver.findElement(By.xpath(" (//*[@class='all_buttons'])[2]"));
		
	}
}
