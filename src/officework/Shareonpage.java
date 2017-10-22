package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shareonpage {
	public static WebElement element;
	
	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[2]/app-condition-description/p-dialog[3]/div/div[2]/share-information/div[2]/div[8]/form/input"));
	}
	
	
	public static WebElement sendmail(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[2]/app-condition-description/p-dialog[3]/div/div[2]/share-information/div[2]/div[9]/button/span"));
	}
	public static WebElement facebook(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[2]/app-condition-description/p-dialog[3]/div/div[2]/share-information/div[2]/div[2]/share-buttons/div/div/share-button[1]"));
	}
	public static WebElement twitter(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[2]/app-condition-description/p-dialog[3]/div/div[2]/share-information/div[2]/div[2]/share-buttons/div/div/share-button[2]"));
	}

	public static WebElement posttofacebook(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement cancelbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[2]/app-condition-description/p-dialog[3]/div/div[2]/share-information/div[1]/div/div[2]/img"));
	}
	public static WebElement twitteremail(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement Twitterpassword(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement loginandtweet(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
