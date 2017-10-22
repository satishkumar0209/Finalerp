package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clinicdetails {

	
	public static WebElement clinicname(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@formcontrolname='c_name']"));
		
	}
	public static WebElement Specialization(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input']"));
		
	}
	public static WebElement clinicphone(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@formcontrolname='mobile']"));
		
	}
	public static WebElement conbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@label='continue']"));
		
	}
}
