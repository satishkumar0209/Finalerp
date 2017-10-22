package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboardpage 
{
public static WebElement viewmembers(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='VIEW MEMBERS']"));
}


public static WebElement Editorupdateprofile(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='EDIT/UPDATE PROFILE']"));
}


}
