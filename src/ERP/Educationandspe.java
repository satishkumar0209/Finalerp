package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Educationandspe {
	public static WebElement Specilization(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input'])[3]"));
	}
	public static WebElement sleepmedicine(WebDriver driver) {

		return driver.findElement(By.xpath("//*[text()='Sleep Medicine']"));
	}
}
