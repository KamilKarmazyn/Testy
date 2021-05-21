package siculi.siculi;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Unit test for simple App.
 */
public class Kalkulator 
{
	
	  public static void main(String[] args) throws MalformedURLException, InterruptedException, FindFailed
	  {
		  Screen a = new Screen();
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		  cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		  cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		  
		  AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\kalk.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\7.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\x.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\x.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\5.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\5.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\dz.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\dz.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\9.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\9.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\=.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\=.jpg");
		  a.click();
		  
}};

