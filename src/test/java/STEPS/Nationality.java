package STEPS;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.LOGIN;
import PAGES.LOGOUT;
import PAGES.NATIONALITY;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nationality {
	
	WebDriver driver;
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	

		
	    
	}
	
	@When("User opens URL {string}")
	public void user_opens_Testurl(String TestURL) {
		
		driver.get(TestURL);
		
	   
	}
	
	@When("Log into Application with below credentials")
	public void log_into_application_with_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		
		LOGIN l1=new LOGIN();
		l1.LOGIN(driver);
		
		List<Map<String, String>> login=dataTable.asMaps(String.class,String.class);
		String username1=login.get(0).get("Username");
		String password1=login.get(0).get("Password");
		
		l1.loginpage(username1, password1);
		
		
		
		
	    	}
	
	@Then("Created Nationality Records")
	public void created_nationality_records(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
		NATIONALITY N1=new NATIONALITY();
		N1.NATIONALITY(driver);
		N1.nationalitypage(dataTable);
		
	    }
	
	@When("Click on logout button")
	public void click_on_logout_button() {
		
		LOGOUT L1=new LOGOUT();
		L1.LOGOUT(driver);
		L1.logoutpage();
		
		
		
	    }
	
	@Then("Close Browser")
	public void close_browser() {
		 
		System.out.println("All details entered succesfully");
		
	    }

	

}
