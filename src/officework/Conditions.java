package officework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Conditions {
	public static WebElement element;
	public static WebElement share(WebDriver driver)

	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[2]/app-condition-description/div/div/panel/div/div[1]/header/div/div[2]/img[2]"));
	}

public static WebElement facebook(WebDriver driver)
{
	return driver.findElement(By.cssSelector("body > app-root > div > home > div > div > div > app-self-help > div:nth-child(2) > div > div > app-conditions > div > div > div > app-condition-list > div > div.ui-g-8.ui-sm-8.ui-md-8.ui-lg-8 > app-condition-description > p-dialog:nth-child(5) > div > div.ui-dialog-content.ui-widget-content > share-information > div.ui-g.share-dialog-body > div.share-container > share-buttons > div > div > share-button:nth-child(3) > button > img"));
	
}

public static WebElement close(WebDriver driver)
{
	return driver.findElement(By.xpath("/html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[2]/app-condition-description/div/div/panel/div/div[1]/header/div/div[2]/img[2]"));
}
public static WebElement Abdominaladhesionsscartissue(WebDriver driver)
{
return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[1]/panel/div/div[2]/div/div/div/ul/li[1]/div/div"));
}

public static WebElement ABDOMINALAORTICANEURYSMENLARGEDMAJORBLOODVESSEL(WebDriver driver){
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[1]/panel/div/div[2]/div/div/div/ul/li[2]/div/div"));
}

public static WebElement ABDOMINALSWELLING(WebDriver driver){
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/div/app-conditions/div/div/div/app-condition-list/div/div[1]/panel/div/div[2]/div/div/div/ul/li[3]/div/div"));
}
}


