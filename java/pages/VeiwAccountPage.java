package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class VeiwAccountPage extends BaseClass {
	
	public VeiwAccountPage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
	public VeiwAccountPage clickLogout(ChromeDriver driver) {
		this.driver = driver;
		driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
		System.out.println("Account logged out");
		return this;
	}	

	public VeiwAccountPage verifyAccount() {
        return this;
}

}