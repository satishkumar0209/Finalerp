package Run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ERP.Addprocedure;
import ERP.Addstaff;
import ERP.Consultation;
import ERP.Helpher;
import ERP.LOGin;
import ERP.Profiles;
import ERP.SetClinictimings;

public class validuser {

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
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@label='NEXT']")));
		 
		WebElement next=SetClinictimings.next(driver);
		Helpher.highLightElement(driver, next);
		next.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@formcontrolname='owner_reg']")));
		 
		WebElement checkboxadmin=Addstaff.checkboxadmin(driver);
		Helpher.highLightElement(driver, checkboxadmin);
		checkboxadmin.click();
		
		WebElement registeradmin=Addstaff.adminregistrationnumber(driver);
		Helpher.highLightElement(driver, registeradmin);
		registeradmin.sendKeys("996365475");
		
		WebElement nextbutton=Addstaff.nextbutton(driver);
		Helpher.highLightElement(driver, nextbutton);
		nextbutton.click();
		
		WebDriverWait wait11 = new WebDriverWait(driver, 30);
		WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ui-button-text ui-clickable'])[2]")));
		 
		
		Thread.sleep(4000);
		WebElement Service=Addprocedure.sampleservice(driver);
		Helpher.highLightElement(driver, Service);
		Service.sendKeys("den");
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//*[text()='Dental Bonding']")).click();
//		
		WebElement rs=Addprocedure.rs(driver);
		Helpher.highLightElement(driver, rs);
		rs.sendKeys("600");
//		
		WebElement done=Addprocedure.Done(driver);
		Helpher.highLightElement(driver, done);
		done.click();

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
		
		WebElement EDUCATIONSPECIALIZATION=Profiles.EDUCATIONSPECIALIZATION(driver);
		Helpher.highLightElement(driver, EDUCATIONSPECIALIZATION);
		EDUCATIONSPECIALIZATION.click();
		
		WebElement REGISTRATIONDOCUMENTS=Profiles.REGISTRATIONDOCUMENTS(driver);
		Helpher.highLightElement(driver, REGISTRATIONDOCUMENTS);
		REGISTRATIONDOCUMENTS.click();
		
		WebElement SERVICESEXPERIENCE=Profiles.SERVICESEXPERIENCE(driver);
		Helpher.highLightElement(driver, SERVICESEXPERIENCE);
		SERVICESEXPERIENCE.click();
		
		WebElement CONSULTATION=Profiles.CONSULTATION(driver);
		Helpher.highLightElement(driver, CONSULTATION);
		CONSULTATION.click();
		Thread.sleep(2000);
		WebElement Allradiobutton=Consultation.Allradiobutton(driver);
		Helpher.highLightElement(driver, Allradiobutton);
		Allradiobutton.click();
		
		
		
		WebElement phone=Consultation.phone(driver);
		Helpher.highLightElement(driver, phone);
		phone.sendKeys("800");
		
		WebElement video=Consultation.Allradiobutton(driver);
		Helpher.highLightElement(driver, video);
		video.sendKeys("1000");
		
		WebElement submit=Consultation.submit(driver);
		Helpher.highLightElement(driver, submit);
		submit.click();
		
		
		
		
		
		
		

	}

}
