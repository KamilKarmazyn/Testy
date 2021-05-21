package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demagog {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSI GAMING\\eclipse-workspace\\WebDriverBasics\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/");
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")).click();
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
    	driver.findElement(By.id("firstName")).sendKeys("Kamil");
    	driver.findElement(By.id("lastName")).sendKeys("Karmazyn");
    	driver.findElement(By.id("userEmail")).sendKeys("kamilkar303onet.pl@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
    	driver.findElement(By.id("userNumber")).sendKeys("0123456789");
    	driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	driver.findElement(By.id("dateOfBirthInput")).sendKeys("08 november 1998");
    	driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);
    	driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]")).sendKeys("Co");
    	driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]")).sendKeys(Keys.TAB);
    	driver.findElement(By.xpath("//label[text()=\"Reading\"]")).click();
    	driver.findElement(By.xpath("//label[text()=\"Music\"]")).click();
    	driver.findElement(By.id("currentAddress")).sendKeys("Tadeusza Rejtana 15, 75-507 Koszalin");
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.id("react-select-3-option-2")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.id("react-select-4-option-1")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.id("submit")).click();
    	
    	String tmp = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/table")).getText();
    	driver.close();
    	System.out.println(tmp);
	}

}
