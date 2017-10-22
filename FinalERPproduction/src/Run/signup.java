package Run;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ERP.Clinicdetails;
import ERP.Helpher;
import ERP.OTP;
import ERP.apiv4;
import ERP.signupElements;

public class signup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://clinic.myswaasth.com/signup");
		String mainemail="final@google.com";
		
			WebElement username=signupElements.username(driver);
			Helpher.highLightElement(driver, username);
			username.sendKeys("satish");
		
			WebElement email=signupElements.email(driver);
			Helpher.highLightElement(driver, email);
			email.sendKeys(mainemail);
			
			WebElement number=signupElements.number(driver);
			Helpher.highLightElement(driver, number);
			number.sendKeys("8733008145");
			
			WebElement password=signupElements.password(driver);
			Helpher.highLightElement(driver, password);
			password.sendKeys("123456");
			
			WebElement Register=signupElements.register(driver);
			Helpher.highLightElement(driver, Register);
			Register.click();
		
//			Thread.sleep(2000);
//			WebElement element=driver.findElement(By.xpath("//*[class='ui-g-10']"));
//			element.getText();
//			System.out.println(element);
			Thread.sleep(2000);
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
			
			WebElement login=apiv4.submit(driver);
			Helpher.highLightElement(driver, login);
			login.click();
			
			Thread.sleep(3000);
			
			driver.get("http://apiv3.myswaasth.com/mahaflox/authentication/account//");
			
			WebElement search=apiv4.searchbox(driver);
			Helpher.highLightElement(driver, search);
			search.sendKeys(mainemail);
			
			WebElement goo=apiv4.go(driver);
			Helpher.highLightElement(driver, goo);
			goo.click();
			
			
			WebElement emailid=apiv4.emailid(driver);
			Helpher.highLightElement(driver, emailid);
			emailid.click();
			
			
			WebElement random=apiv4.otp(driver);
			Helpher.highLightElement(driver, random);
			random.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
			
			driver.switchTo().window(Pwindow);
			
			WebElement otp=OTP.otp(driver);
			Helpher.highLightElement(driver, otp);
			otp.sendKeys(Keys.CONTROL + "v");
			
			WebElement verify=OTP.submit(driver);
			Helpher.highLightElement(driver, verify);
			verify.click();
			
			Thread.sleep(3000);
			
			WebElement continueb=OTP.continuebutton(driver);
			Helpher.highLightElement(driver, continueb);
			continueb.click();
			
			Thread.sleep(3000);
			WebElement cname=Clinicdetails.clinicname(driver);
			Helpher.highLightElement(driver, cname);
			cname.sendKeys("Automation clicnic");
			
			WebElement spe=Clinicdetails.Specialization(driver);
			Helpher.highLightElement(driver, spe);
			spe.sendKeys("den");
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[text()='Dental']")).click();
			
			WebElement phone=Clinicdetails.clinicphone(driver);
			Helpher.highLightElement(driver, phone);
			phone.sendKeys("08647227406");
			
			WebElement cbutton=Clinicdetails.conbutton(driver);
			Helpher.highLightElement(driver, cbutton);
			cbutton.click();
			Thread.sleep(3000);
			
			
			

	}

}
