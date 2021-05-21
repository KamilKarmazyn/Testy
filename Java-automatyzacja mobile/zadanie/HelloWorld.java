package GL.zadanie;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Unit test for simple App.
 */
public class HelloWorld 
{
  public static void main(String[] args) throws MalformedURLException, InterruptedException
  {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	  cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
	  cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
	  
	  AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"startUserRegistrationCD\"]")).click();
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]")).setValue("Karmazyn");
	  driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"email of the customer\"]")).setValue("uczelniapk@gmail.com");
	  driver.hideKeyboard();
	  driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[3]")).setValue("lubieplacki");
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[4]")).clear();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[4]")).setValue("PLACUSZKI");
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView")).click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]")).click();
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[8]/android.widget.Button")).click();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"visibleButtonTestCD\"]")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  System.out.println("Tekst z Pierwszego buttona: " +  driver.findElement(By.xpath("(//android.widget.LinearLayout[@content-desc=\"visibleTestAreaCD\"])[1]/android.widget.TextView")).getText());
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"showPopupWindowButtonCD\"]")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  System.out.println("Nie moge znakeżc tekstu z popupu wiec dałem byle co : " + driver.findElement(By.xpath("//android.widget.Button[@content-desc=\\\"visibleButtonTestCD\\\"]")).getText());
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"showPopupWindowButtonCD\"]")).click();
	  Thread.sleep(3000);
	  driver.quit();
	  
		

	

		

		
		
	 

	  
  }
}
