package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail2 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI GAMING\\eclipse-workspace\\WebDriverBasics\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com/");
	WebDriverWait wait=new WebDriverWait(driver, 10);
	driver.findElement(By.id("identifierId")).sendKeys("Lubie_Placki");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")));
	String tmp = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
	driver.close();
	System.out.println(tmp);
	}

}
