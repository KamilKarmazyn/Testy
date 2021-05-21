package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wb5 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI GAMING\\eclipse-workspace\\WebDriverBasics\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://wikipedia.pl");
		driver.findElement(By.name("search")).sendKeys("Lubie placki");
		Thread.sleep(5000);
		driver.findElement(By.name("go")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("searchmatch")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("wieś")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[2]/div/div/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#mw-content-text > div.mw-parser-output > table:nth-child(2) > tbody > tr:nth-child(4) > td:nth-child(2) > a")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("kilka ważniejszych bitew")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("a")));
		
		driver.close();

	}

}
//get name classname linktext xpath partialLinkText cssSelector tagName