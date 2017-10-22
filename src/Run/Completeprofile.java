package Run;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ERP.Consultation;
import ERP.Helpher;
import ERP.LOGin;
import ERP.Profiles;

public class Completeprofile {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		Thread.sleep(4000);
		WebElement profile=Profiles.profile(driver);
		Helpher.highLightElement(driver, profile);
		profile.click();
		
		Thread.sleep(4000);
		WebElement Editrprofiel=Profiles.Editprofile(driver);
		Helpher.highLightElement(driver, Editrprofiel);
		Editrprofiel.click();
		
		Thread.sleep(4000);
		
		WebElement completeprofile=Profiles.Admincompleteprofile(driver);
		Helpher.highLightElement(driver, completeprofile);
		completeprofile.click();
		
//		WebElement EDUCATIONSPECIALIZATION=Profiles.EDUCATIONSPECIALIZATION(driver);
//		Helpher.highLightElement(driver, EDUCATIONSPECIALIZATION);
//		EDUCATIONSPECIALIZATION.click();
//		
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("(//*[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input'])[3]")).sendKeys("den");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//*[@class='ui-autocomplete-list-item ui-corner-all'])[3]")).click();
//		WebDriverWait wait11 = new WebDriverWait(driver, 30);
//		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ui-growl ui-widget'])[2]")));
//		 
//		WebElement growl=driver.findElement(By.xpath("(//*[@class='ui-growl ui-widget'])[2]"));
//		growl.getText();
//		System.out.println(growl);
		
		
		WebElement REGISTRATIONDOCUMENTS=Profiles.REGISTRATIONDOCUMENTS(driver);
		Helpher.highLightElement(driver, REGISTRATIONDOCUMENTS);
		REGISTRATIONDOCUMENTS.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-valid'])[1]")).sendKeys("certificate");
		driver.findElement(By.id("upload-photo")).click();
		Thread.sleep(4000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//r.keyPress(KeyEvent.VK_T);
		
//		
//		WebElement SERVICESEXPERIENCE=Profiles.SERVICESEXPERIENCE(driver);
//		Helpher.highLightElement(driver, SERVICESEXPERIENCE);
//		SERVICESEXPERIENCE.click();
//		
//		WebElement CONSULTATION=Profiles.CONSULTATION(driver);
//		Helpher.highLightElement(driver, CONSULTATION);
//		CONSULTATION.click();
//		Thread.sleep(2000);
//		WebElement Allradiobutton=Consultation.Allradiobutton(driver);
//		Helpher.highLightElement(driver, Allradiobutton);
//		Allradiobutton.click();
//		
//		
//		
//		WebElement phone=Consultation.phone(driver);
//		Helpher.highLightElement(driver, phone);
//		phone.sendKeys("800");
//		
//		WebElement video=Consultation.Allradiobutton(driver);
//		Helpher.highLightElement(driver, video);
//		video.sendKeys("1000");
//		
//		WebElement submit=Consultation.submit(driver);
//		Helpher.highLightElement(driver, submit);
//		submit.click();
//		
		

	}

}
