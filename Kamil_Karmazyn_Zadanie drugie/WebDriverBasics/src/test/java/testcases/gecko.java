package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class gecko {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.28.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("http://pizza-koszalin.pl");
		Thread.sleep(5000);
		driver.get("http://pizza-koszalin.pl/#menu");
		Thread.sleep(5000);
		driver.findElement(By.className("styl1")).click();

		driver.close();

	}

}




