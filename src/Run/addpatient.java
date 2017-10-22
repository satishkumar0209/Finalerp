package Run;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ERP.Helpher;
import ERP.LOGin;

public class addpatient {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myswaastherp.sia.co.in/login");
		String email="final@gmail.co.inn";
		
		WebElement emailname=LOGin.emailid(driver);
		Helpher.highLightElement(driver, emailname);
		emailname.sendKeys("testing24@testing.com");
		
		
		WebElement password=LOGin.password(driver);
		Helpher.highLightElement(driver, password);
		password.sendKeys("123456");
		
		WebElement login=LOGin.login(driver);
		Helpher.highLightElement(driver, login);
		login.click();
		
		Thread.sleep(5000);
		
		driver.get("https://myswaastherp.sia.co.in/home/patient/add-patient");
		
		Thread.sleep(8000);
		
		driver.findElement(By.id("upload-photo")).click();
		driver.findElement(By.id("upload-photo")).sendKeys(Keys.TAB);
		driver.findElement(By.id("upload-photo")).sendKeys(Keys.TAB);
		driver.findElement(By.id("upload-photo")).sendKeys(Keys.TAB);
		driver.findElement(By.id("upload-photo")).sendKeys(Keys.TAB);
		driver.findElement(By.id("upload-photo")).sendKeys(Keys.TAB);
		

	}

}
