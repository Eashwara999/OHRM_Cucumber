package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHRMApplicationMethods 
{
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	WebElement welCome;
	
	public OrangeHRMApplicationMethods(Hook hook)
	{
		driver=hook.driver;
	}
		
	@Given("^User should Launch Edge Browser")
	public void user_should_Launch_Edge_Browser()  
	{	       
	       driver.get(applicationUrlAddress);
	}

	@When("^User Enters OrangeHRM Applicatioin Url Address$")
	public void user_Enters_OrangeHRM_Applicatioin_Url_Address()
	{			    
	     //  driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@Then("^User should be able to Navigate to OrangeHRM Application LogIn Page$")
	public void user_should_be_able_to_Navigate_to_OrangeHRM_Application_LogIn_Page()
	{
		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		
		//id="logInPanelHeading"
		By logInPanelLocator=By.id("logInPanelHeading");
		WebElement OrangeHRMApplicationLogInPageLogInPanel=driver.findElement(logInPanelLocator);
		String actual_OrangeHRMApplicationLogInPageLogInPanelText=OrangeHRMApplicationLogInPageLogInPanel.getText();
		
		if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
			System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - PASS");
		}
		else
		{
		System.out.println("Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
		}
		
		Assert.assertEquals("Failed to Navigate to OrangeHRM  LogIn Page - FAIL",
		expected_OrangeHRMApplicationLogInPageText,		actual_OrangeHRMApplicationLogInPageLogInPanelText);
	}

	@Then("^User should Close the OrangeHRM Application$")
	public void user_should_Close_the_OrangeHRM_Application() 
	{
		driver.quit();
	}
	

	@Then("^User should enter UserName and Password and click on logIn button$")
	public void user_should_enter_UserName_and_Password_and_click_on_logIn_button() 
	{
		By userNameLocator=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameLocator);
		userName.sendKeys("Eashwar");
		
		By passwordLocator=By.name("txtPassword");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys("Ea$hwar@9");
		
		By logInButtonLocator=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonLocator);
		logInButton.click();
	
	}
	
	@Then("^User should enter \"([^\"]*)\" and \"([^\"]*)\" and click on logIn button$")
	public void user_should_enter_and_and_click_on_logIn_button(String UserName, String Password) 
	{
		By userNameLocator=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameLocator);
		userName.sendKeys(UserName);
		
		By passwordLocator=By.name("txtPassword");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys(Password);
		
		By logInButtonLocator=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonLocator);
		logInButton.click();
	   
	}
	
	@Then("^User should be navigated to OrangeHRM Application Home Page$")
	public void user_should_be_navigated_to_OrangeHRM_Application_Home_Page() 
	{
	
		By welComeLocator=By.id("welcome");
		welCome=driver.findElement(welComeLocator);
		
		String expected_OrangHRMApplictionHomePageText="Welcome Admin";
		
		String actual_OrangHRMApplictionHomePageText=welCome.getText();
		
		if(actual_OrangHRMApplictionHomePageText.equals(expected_OrangHRMApplictionHomePageText))
		{
			System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS");
		}
		else
		{
			System.out.println("Failed to Navigated to OrangeHRM Application HomePage - FAIL");
		}
		
		Assert.assertEquals("Faile to Navigated to OrangeHRM Application HomePage - FAIL", expected_OrangHRMApplictionHomePageText, actual_OrangHRMApplictionHomePageText);
	}
	
	@Then("^User should logOut from the OrangeHRM Application$")
	public void user_should_logOut_from_the_OrangeHRM_Application() 
	{
		welCome.click();
		
		By logOutLocator=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutLocator);
		logOut.click();
	}	
	
}
