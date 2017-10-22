package Run;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ERP.Helpher;
import ERP.apiv4;
import ERP.signupElements;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Apiv4 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
//		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://myswaastherp.sia.co.in/signup");
//		
//			WebElement email=apiv4.email(driver);
//			Helpher.highLightElement(driver, email);
//			email.sendKeys("admin@innotical.com");
//			
//			WebElement password=apiv4.email(driver);
//			Helpher.highLightElement(driver, email);
//			password.sendKeys("admin_inno111");
//			
//			WebElement login=apiv4.email(driver);
//			Helpher.highLightElement(driver, login);
//			login.click();
		String randomNumbers = RandomStringUtils.randomNumeric(5);
		String phNo = 79393+randomNumbers;
		String email= "satish@"+randomNumbers+".com";
		String name="satish";
		String password="123456";
		File f=new File("/home/aj/Music/prasanna1.xls");
		WritableWorkbook myexcel=Workbook.createWorkbook(f);
		WritableSheet mysheet=myexcel.createSheet("mysheet",0);
		Label one=new Label(0,0,"mobile");
		Label two=new Label(1,0,"name");
		Label three=new Label(2,0,"id");
		mysheet.addCell(one);
		
		Label four=new Label(0,1,phNo);
		Label name1=new Label(1,1,name);
		Label id=new Label(2,1,email);
		
		mysheet.addCell(two);
		mysheet.addCell(three);
		mysheet.addCell(four);
		mysheet.addCell(name1);
		mysheet.addCell(id);
		
		myexcel.write();
		myexcel.close();
			
	}

}
