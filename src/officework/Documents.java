package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Documents {
	public static WebElement element;
	public static WebElement document(WebDriver driver)
	{

		return driver.findElement(By.xpath("/html/body/app-root/div/home/div/div/div/app-myswaasth/div[1]/div/div/div/a[2]"));
	}
	
	
	public static WebElement pin1(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#password1"));
	}
	public static WebElement pin2(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#password2"));
	}

	public static WebElement pin3(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#password3"));
	}

	public static WebElement pin4(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#password4"));
	}
	
	public static WebElement openlocker(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("body > app-root > div > home > div > div > div > app-myswaasth > div:nth-child(2) > div > div > enter-pin > div > form > button"));
		
	}
	public static WebElement folder(WebDriver driver)
	{
		return driver.findElement(By.cssSelector(""));
		
	}


}
