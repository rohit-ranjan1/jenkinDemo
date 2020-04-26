package JenkinsPack.jenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openGoogleTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		openchrome();
		
		
	}
@Test
	private static void openchrome() throws Exception {
	System.setProperty("webdriver.chrome.driver", "E://cognizant-intelligent-test-scripter-1.1//lib//Drivers//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	System.out.println("Bye Bye");
	driver.close();
		
	}

}
