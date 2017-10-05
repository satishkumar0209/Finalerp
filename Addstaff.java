package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addstaff {
	public static WebElement adminregistrationnumber(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@formcontrolname='owner_reg']"));
	}

	public static WebElement nextbutton(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@label='NEXT']"));
	}

	public static WebElement checkboxadmin(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
	}
}
