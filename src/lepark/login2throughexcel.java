package lepark;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class login2throughexcel {

	public static WebDriver driver;
	@Test(dataProvider="testdata")
	public void login(String name,String email,String mobile) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://lepark.sia.co.in/");
		
		driver.findElement(By.xpath("//*[@class='ant-select-search__field']")).sendKeys("a");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='ant-select-dropdown-menu ant-select-dropdown-menu-vertical  ant-select-dropdown-menu-root']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection__rendered'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'testing')]")).click();
		driver.findElement(By.xpath("(//*[@class='ant-select-selection__rendered'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='ant-select-dropdown-menu-item-active ant-select-dropdown-menu-item']")).click();
		//driver.findElement(By.xpath("//*[@placeholder='Table No.']")).sendKeys("4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='imageCircle']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='ant-radio']")).click();
		driver.findElement(By.xpath("//*[@class='imageCircle']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='imagecircleright']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='imagecircleright']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='imagecircleright']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.name("Name")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("Phone")).sendKeys(mobile);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[2]/div[2]/div/div/div[2]/button[2]")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}
	@DataProvider(name="testdata")
	  public Object [][] readexcel() throws BiffException, IOException {
		  
		
		  FileInputStream f =new FileInputStream("/home/aj/Music/data.xls");
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
