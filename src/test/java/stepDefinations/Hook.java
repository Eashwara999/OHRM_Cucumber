package stepDefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hook 
{
	public static WebDriver driver;
	@Before
	public void setUp()
	{
		 System.setProperty("webdriver.edge.driver", "C:\\eclipse-Practice_space\\OHRM_Cucumber\\BrowserDriverFiles\\msedgedriver.exe");
	       driver = new EdgeDriver();
	      // driver.manage().deleteAllCookies();
	}
	@After
	public void tearDow()
	{
		driver.close();
	}
}
