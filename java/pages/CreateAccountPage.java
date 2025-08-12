package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateAccountPage extends BaseClass {
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
		
	}

	
	public CreateAccountPage enterAccountName(String accountname) {
		
		driver.findElement(By.id("accountName")).sendKeys(accountname);	
		return this;
	}
	
	public CreateAccountPage enterDescription(String description) {
		
		driver.findElement(By.name("description")).sendKeys(description);
		return this;
	}
	
	public CreateAccountPage enterNoOfEmployees(String noofemp) {
		
		driver.findElement(By.id("numberEmployees")).sendKeys(noofemp);
		
		return this;
		

	}
	
	public CreateAccountPage enterSiteName(String sitename) {
		
		driver.findElement(By.id("officeSiteName")).sendKeys(sitename);
		
		return this;
		
	}
	
	public VeiwAccountPage clickBtn() {
		
		driver.findElement(By.className("smallSubmit")).click();
		
		return new VeiwAccountPage(driver);
		

	}
	
	
	
}

