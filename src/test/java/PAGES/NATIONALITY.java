package PAGES;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class NATIONALITY {
	
	WebDriver driver;
	
	
	public void NATIONALITY(WebDriver driver1) {
		
		this.driver=driver1;
		
	}
	
	public void nationalitypage(DataTable dataTable) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
List<Map<String, String>> NationalityData=dataTable.asMaps(String.class,String.class);
		
		for(int i=0;i<NationalityData.size();i++) {
			
			String Nationality=NationalityData.get(i).get("Nationality");
			
			
			System.out.println("____________________________");
			
driver.findElement(By.xpath("//span[text()='Admin']")).click();
			  
driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
				
driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click(); 
			  
driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(Nationality);
				
driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		
		
		
	}
	}
}
	


