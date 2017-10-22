package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebbook {
	public static WebElement element;
	
	public static WebElement id(WebDriver driver)
	{
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.id("pass"));
	}
	
	public static WebElement login(WebDriver driver)
	{
		return driver.findElement(By.id("u_0_2"));
	}
	public static WebElement posttofacebook(WebDriver driver)
	{
		return driver.findElement(By.id("u_0_1s"));
	}
	
	public static WebElement saysomething(WebDriver driver)
	{
		return driver.findElement(By.id("u_0_s"));
	}

}
