package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElements {
	
//	private static final int India = 0;

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/samples/elements.php");
	Thread.sleep(2);
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	
//	By locatorUsername = By.id("UserName");
//	WebElement txtUsername = driver.findElement(locatorUsername);
//	txtUsername.sendKeys("admin");
//	
//	By locatorPassword = By.id("Password");
//	WebElement txtPassword = driver.findElement(locatorPassword);
//	txtPassword.sendKeys("admin");
	
	WebElement Gender1 = driver.findElement(By.id("Female"));
	Gender1.click();
	Thread.sleep(2);
	
	WebElement Interest = driver.findElement(By.id("Music"));
	Interest.click();
	Thread.sleep(2);
	
	WebElement el = driver.findElement(By.id("country"));
	Select country = new Select(el);
	country.selectByVisibleText("India");
	
	WebElement sk = driver.findElement(By.id("Skills"));
	Select Skills = new Select(el);
	Skills.selectByIndex(0);
	Thread.sleep(1);
	Skills.selectByIndex(1);
	Thread.sleep(1);
	Skills.selectByIndex(3);
	
	WebElement com = driver.findElement(By.id("Comments"));
	com.sendKeys("Pragati");
	
	WebElement FileUpload = driver.findElement(By.id("FileUpload"));
	String filepath=("C:\\Users\\cdac\\Desktop\\java");
	FileUpload.sendKeys(filepath);
	Thread.sleep(2);
	
	WebElement dobField = driver.findElement(By.id("dob"));
	dobField.sendKeys("01/16/2025"); 
	Thread.sleep(2);
	
	
//	submit_button = driver.find_element(By.ID, "submitButtonId") 
//
//			# Click the button
//			submit_button.click();
	WebElement sub = driver.findElement(By.id("Submit"));
	sub.click(); 
	driver.quit();
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
