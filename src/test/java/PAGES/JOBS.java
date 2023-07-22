package PAGES;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;

public class JOBS{
	
	WebDriver driver;
	
	
	public void JOBS(WebDriver driver1) {
		
		this.driver=driver1;
		
	}
	
	public void J1(DataTable dataTable) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
List<Map<String, String>> JOBSData=dataTable.asMaps(String.class,String.class);
		
		for(int i=0;i<JOBSData.size();i++) {
			
			String JOBname=JOBSData.get(i).get("JOBNAME");
			String JOBdescr=JOBSData.get(i).get("JOBDESCR");
			String JOBnote=JOBSData.get(i).get("JOBNOTE");
			
			
			System.out.println("____________________________");
			
driver.findElement(By.xpath("//span[text()='Admin']")).click();
			  
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();

driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();

driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JOBname);
driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JOBdescr);
driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JOBnote);
driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		
		
		
	}
	}
}
	


