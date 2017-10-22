package Run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ERP.Dashboard;
import ERP.Helpher;
import ERP.LOGin;

public class Bookappoinment {
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
	 
	
	WebElement appointment=Dashboard.appointment(driver);
	Helpher.highLightElement(driver, appointment);
	appointment.click();
	
	WebDriverWait wait2 = new WebDriverWait(driver, 30);
	WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(Dashboard.Scheduledon(driver)));
	 
	WebElement Scheduledon=Dashboard.Scheduledon(driver);
	Helpher.highLightElement(driver, Scheduledon);
	Scheduledon.click();
	WebDriverWait wait3 = new WebDriverWait(driver, 30);
	WebElement element3 = wait1.until(ExpectedConditions.elementToBeClickable(Dashboard.Date(driver)));
	 
	
	WebElement Date=Dashboard.Date(driver);
	Helpher.highLightElement(driver, Date);
	Date.click();
	WebDriverWait wait4 = new WebDriverWait(driver, 30);
	WebElement element4 = wait1.until(ExpectedConditions.elementToBeClickable(Dashboard.DoctornameDropdown(driver)));
	
	WebElement DoctornameDropdown=Dashboard.DoctornameDropdown(driver);
	Helpher.highLightElement(driver, DoctornameDropdown);
	DoctornameDropdown.click();
	WebDriverWait wait5 = new WebDriverWait(driver, 30);
	WebElement element5 = wait1.until(ExpectedConditions.elementToBeClickable(Dashboard.Doctorname(driver)));
	
	
	WebElement Doctorname=Dashboard.Doctorname(driver);
	Helpher.highLightElement(driver, Doctorname);
	Doctorname.click();
	Thread.sleep(3000);
	
	WebElement time=Dashboard.time(driver);
	Helpher.highLightElement(driver, time);
	time.click();
	WebDriverWait wait7 = new WebDriverWait(driver, 30);
	WebElement element7 = wait1.until(ExpectedConditions.elementToBeClickable(Dashboard.continues2(driver)));
	
	WebElement continues2=Dashboard.continues2(driver);
	Helpher.highLightElement(driver, continues2);
	continues2.click();
	WebDriverWait wait8 = new WebDriverWait(driver, 30);
	WebElement element8 = wait1.until(ExpectedConditions.elementToBeClickable(Dashboard.continues(driver)));
	
	WebElement continues=Dashboard.continues(driver);
	Helpher.highLightElement(driver, continues);
	continues.click();
	
	WebDriverWait wait9 = new WebDriverWait(driver, 30);
	WebElement element9 = wait1.until(ExpectedConditions.elementToBeClickable(Dashboard.mobilenumber(driver)));
	
	WebElement mobilenumber=Dashboard.mobilenumber(driver);
	Helpher.highLightElement(driver, mobilenumber);
	mobilenumber.sendKeys("9885714096");
	Thread.sleep(5000);
	
	WebElement save=Dashboard.save(driver);
	Helpher.highLightElement(driver, save);
	save.click();
	
	
	
	
	
	
//	driver.findElement(By.xpath("//*[@formcontrolname='scheduled_on']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("7")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//*[@class='ui-dropdown-label ui-inputtext ui-corner-all'])[8]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@class='ui-dropdown-item ui-corner-all']")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("(//*[@class='ui-g-10 ui-g-nopad'])[1]")).click();
//	
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("(//*[@class='ui-button-blue ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[8]")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("(//*[@class='ui-button-blue ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[7]")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@formcontrolname='mobile']")).sendKeys("9885714096");
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@label='save']")).click();
	}

}
