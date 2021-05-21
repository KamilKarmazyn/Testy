package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail1 {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI GAMING\\eclipse-workspace\\WebDriverBasics\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("Lubie_placki");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	String tmp = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
    	
    	driver.close();
    	System.out.println(tmp);
	}}

