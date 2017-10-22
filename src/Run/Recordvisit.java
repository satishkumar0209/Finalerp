package Run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ERP.Helpher;
import ERP.LOGin;

public class Recordvisit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myswaastherp.sia.co.in/login");
		String email="final@gmail.co.inn";
		
		WebElement emailname=LOGin.emailid(driver);
		Helpher.highLightElement(driver, emailname);
		emailname.sendKeys(email);
		
		
		WebElement password=LOGin.password(driver);
		Helpher.highLightElement(driver, password);
		password.sendKeys("123456");
		
		WebElement login=LOGin.login(driver);
		Helpher.highLightElement(driver, login);
		login.click();
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='has-children users icon5']")));
		 
		driver.findElement(By.xpath("(//*[@class='ui-button-text ui-clickable'])[4]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input'])[2]")).sendKeys("9885714096");
	//record visit pop -up
	driver.findElement(By.xpath("(//*[@class='ui-button-text ui-clickable'])[9]")).click();
	}

}
