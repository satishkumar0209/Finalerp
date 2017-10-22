package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profiles 
{
	public static WebElement Admincompleteprofile(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-button-text ui-clickable'])[5]"));
	}
	public static WebElement profile(WebDriver driver) {

		return driver.findElement(By.id("logoutModal"));
	}
	public static WebElement EDUCATIONSPECIALIZATION(WebDriver driver) {

		return driver.findElement(By.xpath("//*[text()='EDUCATION & SPECIALIZATION']"));
	}
	
	public static WebElement REGISTRATIONDOCUMENTS(WebDriver driver) {

		return driver.findElement(By.xpath("//*[text()='REGISTRATION & DOCUMENTS']"));
	}
	
	public static WebElement SERVICESEXPERIENCE(WebDriver driver) {

		return driver.findElement(By.xpath("//*[text()='SERVICES & EXPERIENCE']"));
	}
	public static WebElement CONSULTATION(WebDriver driver) {

		return driver.findElement(By.xpath("//*[text()='CONSULTATION']"));
	}
	public static WebElement Editprofile(WebDriver driver) {

		return driver.findElement(By.xpath("//*[text()='Edit Profile']"));
	}
}
