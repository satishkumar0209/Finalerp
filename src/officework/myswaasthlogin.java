package officework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class myswaasthlogin {
public static WebDriver driver;
	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver");
		driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("http://myswaasthfinal.sia.co.in/#/");

            WebElement Joinnowbutton=LOGIN.joinnowbutton(driver);
     		//pageobjectmodel.Helpher.highLightElement(driver,Joinnowbutton );
     		Joinnowbutton.click();	
     		
     		WebElement email=LOGIN.Email(driver);
     	//pageobjectmodel.Helpher.highLightElement(driver,email );
     		email.sendKeys("peloteando2@GMAIL.COM");
     		
     		WebElement password=LOGIN.password(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,password );
     		password.sendKeys("654321");
     		
     		WebElement signme=LOGIN.signinbutton(driver);
     		//pageobjectmodel.Helpher.highLightElement(driver,signme );
     		signme.click();
     		
     		
     	
     		WebDriverWait wait=new WebDriverWait(driver,20);
     		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > app-root > div > home > div > div > div > app-myswaasth > div:nth-child(2) > div > div > app-dashboard > div > div.ui-g.category > div:nth-child(6) > div.ui-g.category-info > div.ui-g-7.ui-lg-6.category-no")));
     		
     		String url=driver.getCurrentUrl();
     		System.out.println(url);
     		
     		Assert.assertEquals(url, "http://myswaasthfinal.sia.co.in/home/myswaasth/dashboard");
     		
     		
     		WebElement viewmembers=Dashboardpage.viewmembers(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,viewmembers );
     		viewmembers.click();
     		WebDriverWait wait2=new WebDriverWait(driver,20);
     		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='VIEW MEMBERS']")));
     		String viemembers=driver.getCurrentUrl();
     		System.out.println(viemembers);
     		Assert.assertEquals(viemembers, "http://myswaasthfinal.sia.co.in/home/myswaasth/dashboard/view-member");
     		
     		
     		
     		WebElement documents=Documents.document(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,documents );
     		documents.click();
     		
     		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     		WebElement pin1=Documents.pin1(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,pin1 );
     		pin1.sendKeys("1");
     		
     		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     		WebElement pin2=Documents.pin2(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,pin1 );
     		pin2.sendKeys("2");
     		
     		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     		WebElement pin3=Documents.pin3(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,pin1 );
     		pin3.sendKeys("3");
     		
     		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     		WebElement pin4=Documents.pin4(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,pin1 );
     		pin4.sendKeys("4");
     		
     		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     		WebElement openlocker=Documents.openlocker(driver);
     	//	pageobjectmodel.Helpher.highLightElement(driver,openlocker );
     		openlocker.click();
     		
     		WebDriverWait wait1=new WebDriverWait(driver,20);
     		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='KUMAR SATISH']")));
     		String documenturl=driver.getCurrentUrl();
     		System.out.println(documenturl);
     		Assert.assertEquals(documenturl, "http://myswaasthfinal.sia.co.in/home/myswaasth/documents/my-document");
     		
     		


	}

}
