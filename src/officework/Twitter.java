package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Twitter {
public static WebElement element;
	
	public static WebElement twitterid(WebDriver driver)
	{
		return driver.findElement(By.id("username_or_email"));
	}
	
	public static WebElement twitterpassword(WebDriver driver)
	{
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement twitterlogin(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#update-form > div.ft > fieldset.submit > input.button.selected.submit"));
	}
	public static WebElement twitterpost(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#update-form > div.ft > fieldset > input.button.selected.submit"));
	}

	
	public static WebElement Error(WebDriver driver)
	{
		return driver.findElement(By.id("post-error"));
	}
}



