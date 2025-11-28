package labwork;

import org.openqa.selenium.WebDriver;

//import drivermanager.DriverFactory;
//import testcase.LoginTestCase;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.initDriver("chrome");
		WebDriver driver1 = DriverFactory.initDriver("chrome");
		
		LoginTestCase tc1 = new LoginTestCase(driver);
		tc1.validLogin();
		System.out.println("successfully login");
		
		Thread.sleep(5000);
	
		
		LoginTestCase tc2 = new LoginTestCase(driver1);
		tc2.invalidlogin();
		System.out.println("failed");
		driver1.quit();
	}
}
