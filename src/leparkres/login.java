package leparkres;

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

import ERP.Helpher;
import ERP.LOGin;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class login {
	public static WebDriver driver;
	@Test(dataProvider="testdata")
	public void login(String room,String name,String company) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leparkhotel.sia.co.in/");

		WebElement email = logineleemnts.email(driver);
		Helpher.highLightElement(driver, email);
		email.sendKeys("admin");
		
		WebElement password = logineleemnts.password(driver);
		Helpher.highLightElement(driver, password);
		password.sendKeys("admin");
		
		WebElement loginbutton = logineleemnts.loginbutton(driver);
		Helpher.highLightElement(driver, loginbutton);
		loginbutton.click();
		
		Thread.sleep(3000);
		WebElement room1 = Application.room(driver);
		Helpher.highLightElement(driver, room1);
		room1.sendKeys(room);
		
		
		WebElement name1 = Application.name(driver);
		Helpher.highLightElement(driver, name1);
		name1.sendKeys(name);
		
		WebElement company1 = Application.company(driver);
		Helpher.highLightElement(driver, company1);
		company1.sendKeys(company);
		
		WebElement submit = Application.submit(driver);
		Helpher.highLightElement(driver, submit);
		submit.click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement message=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-notification-notice-message']")));
		message.getText();
		System.out.println("hai");
		
		
		WebElement pendingrequest = pending.pendingrequest(driver);
		Helpher.highLightElement(driver, pendingrequest);
		pendingrequest.click();
		

		WebDriverWait wait1=new WebDriverWait(driver, 30);
		WebElement confirmed=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-btn'])[2]")));
		message.getText();
		
		WebElement confirm = pending.confirm(driver);
		Helpher.highLightElement(driver, confirm);
		confirm.click();
		WebElement okbutton = pending.okbutton(driver);
		Helpher.highLightElement(driver, okbutton);
		okbutton.click();
		
		
		WebElement confirmrequest = Confirm.confirmrequest(driver);
		Helpher.highLightElement(driver, confirmrequest);
		confirmrequest.click();
		
		
		
		
		//driver.quit();
		
	}

	@DataProvider(name="testdata")
  public Object [][] readexcel() throws BiffException, IOException {
	  
	
	  FileInputStream f =new FileInputStream("/home/aj/Music/hotelapplication.xls");
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
