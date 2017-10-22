package lepark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class barlobby {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//li[contains(text(),'Bar Lobby')]")).click();
		driver.findElement(By.xpath("//*[@placeholder='Table No.']")).sendKeys("4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='imageCircle']")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("")).click();
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
		driver.findElement(By.name("Name")).sendKeys("satish");
		driver.findElement(By.name("email")).sendKeys("sai@gmail.com");
		driver.findElement(By.name("Phone")).sendKeys("988586025822");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[2]/div[2]/div/div/div[2]/button")).click();
		

	}

}
