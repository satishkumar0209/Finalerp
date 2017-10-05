package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Consultation {
	public static WebElement Allradiobutton(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@class='ui-helper-hidden-accessible'])[3]"));
	}
	public static WebElement text(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@class='ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-invalid']"));
	}
	public static WebElement phone(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@placeholder='₹'])[2]"));
	}
	public static WebElement video(WebDriver driver) {

		return driver.findElement(By.xpath("(//*[@placeholder='₹'])[3]"));
	}
	public static WebElement submit(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@label='Submit']"));
	}

}
