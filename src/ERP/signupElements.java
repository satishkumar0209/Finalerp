package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupElements 
{
	
	public static WebElement element;
	
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@placeholder='Your full name']"));
		//Helpher.highLightElement(driver, username);
	}
	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@placeholder='Your email address']"));
	}
	
	public static WebElement number(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@placeholder='Your mobile number']"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath(".//*[@placeholder='Create password (minimum 6 character)']"));
	}
	public static WebElement register(WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[text()='REGISTER']"));
	}
	
		
			
	

}
