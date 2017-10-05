package Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ERP.Helpher;
import ERP.apiv4;
import ERP.signupElements;

public class Apiv4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myswaastherp.sia.co.in/signup");
		
			WebElement email=apiv4.email(driver);
			Helpher.highLightElement(driver, email);
			email.sendKeys("admin@innotical.com");
			
			WebElement password=apiv4.email(driver);
			Helpher.highLightElement(driver, email);
			password.sendKeys("admin_inno111");
			
			WebElement login=apiv4.email(driver);
			Helpher.highLightElement(driver, login);
			login.click();
			
	}

}
