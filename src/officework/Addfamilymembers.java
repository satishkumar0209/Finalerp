package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addfamilymembers {
	public static WebElement Addfamilymembers(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='ADD FAMILY MEMBER']"));
	}
	
	public static WebElement Deletebutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='DELETE']"));
	}
	
	public static WebElement Firstname(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(""));
	}
	public static WebElement Lastname(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(""));
	}
	public static WebElement Phonenumber(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(""));
	}
	public static WebElement Email(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(""));
	}
	public static WebElement phonenumber(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(""));
	}
	public static WebElement Savebutton(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(""));
	}
	
	
}
