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
public class Appium 
{
	
	  public static void main(String[] args) throws MalformedURLException, InterruptedException, FindFailed
	  {
		  Screen a = new Screen();
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		  cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		  cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
		  
		  AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\ekran.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\pis.jpg");
		  a.click();
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\usern.jpg");
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\l.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\l.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\u.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\u.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\b.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\b.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\i.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\i.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\e.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\e.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\sp.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\sp.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\p.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\p.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\l.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\l.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\a.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\a.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\c.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\c.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\k.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\k.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\i.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\i.jpg");
		  a.click();
		  
		  
		  
}};

