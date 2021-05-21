package siculi.siculi;
import java.net.MalformedURLException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

/**
 * Unit test for simple App.
 */
public class Aplikacja 
{
	
	  public static void main(String[] args) throws MalformedURLException, InterruptedException, FindFailed
	  {
		  Screen a = new Screen();
		  a.exists("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wys.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wys.jpg");
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wys.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wys.jpg");
		  a.type("Google Chrome" + Key.ENTER);
		  a.exists("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\ext.jpg");
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wysz.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wysz.jpg");
		  a.click("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wysz.jpg");
		  a.paste("Witam w automatyzacji przeglądarki przy pomocy sikulix");
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wit.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wit.jpg");
		  a.click("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\wit.jpg");
		  a.doubleClick();
		  a.paste("Youtube");
		  a.click("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\yt.jpg"); 
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\it.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\it.jpg");
		  a.click();
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\szukajyt.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\szukajyt.jpg");
		  a.click();
		  a.paste("never gonna give you up");
		  a.wait("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\lupa.jpg");
		  a.find("C:\\Users\\kamil\\OneDrive\\Dokumenty\\eclipse - proj\\siculi\\Zdjecia\\lupa.jpg");
		  a.click();
		  a.wait("./rick.jpg");
		  a.find("./rick.jpg");
		  a.click();
		  
}};

