package Run;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ERP.Dashboard;
import ERP.Helpher;
import ERP.LOGin;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Bookappointmentinnewmember {
	public static WebDriver driver;
	@Test(dataProvider="testdata")
	public void login(String mobile,String name,String id) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myswaastherp.sia.co.in/login");
		String email="final@gmail.co.inn";
		
		WebElement emailname=LOGin.emailid(driver);
		Helpher.highLightElement(driver, emailname);
		emailname.sendKeys(email);
		
		
		WebElement password1=LOGin.password(driver);
		Helpher.highLightElement(driver, password1);
		password1.sendKeys("123456");
		
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
		mobilenumber.sendKeys(mobile);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@formcontrolname='name']")).sendKeys(name);
		driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(id);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@label='save']")).click();
	}

	
	@DataProvider(name="testdata")
  public Object [][] readexcel() throws BiffException, IOException {
	  
	
	  FileInputStream f =new FileInputStream("/home/aj/Music/prasanna1.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  
	  Sheet s=w.getSheet(0);
	  int rows=s.getRows();
	  int columns=s.getColumns();
	 // System.out.println("rows"); 	 	 	 	 	
	  //System.out.println("columns");
	  String inputdata[][]=new String[rows][columns];
	  for(int i=1;i<rows;i++){
		  for(int j=0;j<columns;j++){
			 Cell  c=s.getCell(j,i);
			  inputdata[i][j]=c.getContents();
			  System.out.println(inputdata[i][j]);
			  
			  
		  }
	  }
	return inputdata; 
	  
	  
}
}