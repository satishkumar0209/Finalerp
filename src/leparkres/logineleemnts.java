package leparkres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logineleemnts {
	public static WebElement email(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Enter your name']"));
	}
	public static WebElement password(WebDriver driver){
		return driver.findElement(By.xpath("//*[@placeholder='Enter your password']"));
	}

	public static WebElement loginbutton(WebDriver driver){
		return driver.findElement(By.xpath("//*[@class='login_button']"));
	}

}
