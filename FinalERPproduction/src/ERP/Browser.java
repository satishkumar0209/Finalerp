package ERP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	

	public static WebDriver driver;
	public Browser()
	{
		this.driver=driver;
	}

	public void beforeTest(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/home/aj/Downloads/geckodriver");
			WebDriver driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/home/aj/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
		}

	}

}
