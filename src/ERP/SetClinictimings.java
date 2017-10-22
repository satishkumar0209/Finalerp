package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SetClinictimings 
{

public static WebElement next(WebDriver driver){
		
		return driver.findElement(By.xpath("//*[@label='NEXT']"));
}
}