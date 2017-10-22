package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LOGIN {
	
	
	
	public static WebElement element;
	public static WebElement joinnowbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[text()='JOIN NOW']"));
	}
	
public static WebElement Email(WebDriver driver)
{
return driver.findElement(By.cssSelector("#loginContainer > div > div.ui-g-5 > div > form > div:nth-child(3) > input"));
}


public static WebElement password(WebDriver driver)
{
	return driver.findElement(By.cssSelector("#loginContainer > div > div.ui-g-5 > div > form > div:nth-child(4) > input"));
	
}
public static WebElement signinbutton(WebDriver driver)
{
	return driver.findElement(By.cssSelector("#loginContainer > div > div.ui-g-5 > div > form > div:nth-child(7) > button"));
	
}

}
