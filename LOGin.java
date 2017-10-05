package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LOGin
{
	
	public static WebElement emailid(WebDriver driver){
	return driver.findElement(By.id("username"));
}

	public static WebElement password(WebDriver driver){
	return driver.findElement(By.xpath("//*[@type='password']"));
}

	public static WebElement login(WebDriver driver){
	return driver.findElement(By.xpath("//*[@label='SIGN IN']"));
}
	
	
}
