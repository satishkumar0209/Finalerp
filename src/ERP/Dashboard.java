package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	public static WebElement appointment(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@label='BOOK APPOINTMENT']"));
	}
	public static WebElement Scheduledon(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@formcontrolname='scheduled_on']"));
	}
	public static WebElement Date(WebDriver driver) {

		return driver.findElement(By.linkText("15"));
	}
	public static WebElement DoctornameDropdown(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-dropdown-label ui-inputtext ui-corner-all'])[8]"));
	}
	public static WebElement Doctorname(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@class='ui-dropdown-item ui-corner-all']"));
	}
	
	public static WebElement time(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-g-10 ui-g-nopad'])[1]"));
	}
	public static WebElement continues2(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-button-blue ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[8]"));
	}
	public static WebElement continues(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-button-blue ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[7]"));
	}
	public static WebElement mobilenumber(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@formcontrolname='mobile']"));
	}
	public static WebElement save(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@label='save']"));
	}

}
