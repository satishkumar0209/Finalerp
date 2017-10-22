package Dailytask;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Timelog {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",Thread.currentThread().getContextClassLoader().getResource("chromedriver.exe").getFile());
	        System.out.println("123");
		final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
		System.setProperty("webdriver.chrome.driver","current dir = " + dir );
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://management.innotical.com/login");
//		driver.findElement(By.id("username")).sendKeys("satishkumar");
//		driver.findElement(By.id("password")).sendKeys("openproject@123");
//		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
//		Thread.sleep(6000);
//		
//		driver.get("http://management.innotical.com/projects/myswaasth-phase-3/time_entries/new");
//		Thread.sleep(3000);
//		driver.findElement(By.id("time_entry_hours")).sendKeys("8");
//		driver.findElement(By.id("time_entry_comments")).sendKeys("Working onn lepark restarents");
//		driver.findElement(By.id("time_entry_activity_id")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[text()='Testing']")).click();
				

	}

}
