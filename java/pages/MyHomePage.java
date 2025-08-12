package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

	public class MyHomePage extends BaseClass {
		
		public MyHomePage(ChromeDriver driver) {
			this.driver=driver;
			
		}
		
		public MyAccountPage clickAccountsLink() {
				
			driver.findElement(By.linkText("Accounts")).click();
			return new MyAccountPage(driver);
			}


		}

