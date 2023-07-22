package steps1;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import PAGES.LOGIN;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PAGES.*;

public class JOBS77 {
	
	WebDriver driver;
	
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.manage().window().maximize() ;	

		
	    }
	@Given("enter URL {string}")
	public void enter_url(String TestURL) {
		
		driver.get(TestURL);
		
		
	    }
	@Then("enter login details")
	public void enter_login_details(io.cucumber.datatable.DataTable dataTable) {
		
		LOGIN L1=new LOGIN();
		L1.LOGIN(driver);
		
		List<Map<String, String>> login=dataTable.asMaps(String.class,String.class);
		String Username1=login.get(0).get("Username");
		String Password1=login.get(0).get("Password");
		
		L1.loginpage(Username1, Password1);
		
	    }
	@When("enter job record details")
	public void enter_job_record_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException  {
		
	
       JOBS J2=new JOBS();
       J2.JOBS(driver);
       J2.J1(dataTable);
       
       
      
       
	
		
		
	    
	}
	@Then("close the browser")
	public void close_the_browser() {
		
		
		LOGOUT L=new LOGOUT();
		L.LOGOUT(driver);
		L.logoutpage();
	
	    }


	

}
