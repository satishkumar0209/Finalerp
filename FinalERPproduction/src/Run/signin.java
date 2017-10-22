package Run;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ERP.Helpher;
import ERP.LOGin;
import ERP.Verificationpending;
import ERP.apiv4;

public class signin {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://clinic.myswaasth.com/login");
		String email="final@google.com";
		
		WebElement emailname=LOGin.emailid(driver);
		Helpher.highLightElement(driver, emailname);
		emailname.sendKeys(email);
		
		
		WebElement password=LOGin.password(driver);
		Helpher.highLightElement(driver, password);
		password.sendKeys("123456");
		
		WebElement login=LOGin.login(driver);
		Helpher.highLightElement(driver, login);
		login.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@label='Logout']")));
		
		 WebElement logout=Verificationpending.logout(driver);
		Helpher.highLightElement(driver, logout);
		logout.click();
		
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String>set=driver.getWindowHandles();
		Iterator<String>it=set.iterator();
		String Pwindow=it.next();
		String Cwindow=it.next();
		driver.switchTo().window(Cwindow);
		
		driver.get("http://apiv3.myswaasth.com/mahaflox/login/?next=/mahaflox/");
		
		WebElement email1=apiv4.email(driver);
		Helpher.highLightElement(driver, email1);
		email1.sendKeys("admin@innotical.com");
		
		WebElement password1=apiv4.password(driver);
		Helpher.highLightElement(driver, password1);
		password1.sendKeys("admin_inno111");
		
		WebElement login2=apiv4.submit(driver);
		Helpher.highLightElement(driver, login2);
		login2.click();
		
		
		Thread.sleep(2000);
		 
		driver.get("http://apiv3.myswaasth.com/mahaflox/facilities/main_facilities/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Automation clicnic']")).click();
		driver.findElement(By.name("doc_verifieds")).click();
		driver.findElement(By.name("_save")).click();
		
		
		
		
		
		
		
	}

}
