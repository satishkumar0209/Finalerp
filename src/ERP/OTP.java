package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OTP 
{
	public static WebElement otp(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@formcontrolname='otp']"));
	}

	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='ui-button-text ui-clickable'])[2]"));
	}
	
	public static WebElement continuebutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='ui-button-text ui-clickable']"));
	}
}
