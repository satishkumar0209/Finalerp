package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class apiv4 
{

	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(By.id("id_username"));
		
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.id("id_password"));
		
	}
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@type='submit']"));
		
	}
	public static WebElement searchbox(WebDriver driver)
	{
		return driver.findElement(By.id("searchbar"));
		
	}
	public static WebElement go(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@type='submit']"));
		
	}
	public static WebElement emailid(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#result_list > tbody > tr > th > a"));
		
	}
	public static WebElement otp(WebDriver driver)
	{
		return driver.findElement(By.id("id_random"));
		
	}
}
