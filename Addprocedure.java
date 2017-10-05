package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addprocedure {
	public static WebElement sampleservice(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input']"));
	}
	public static WebElement rs(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@formcontrolname='amount']"));
	}
	public static WebElement plus(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@label='+']"));
	}
	public static WebElement Done(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-button-text ui-clickable'])[2]"));
	}
	public static WebElement adminregistrationnumber(WebDriver driver) {

		return driver.findElement(By.xpath(""));
	}
}
