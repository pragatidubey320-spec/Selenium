package test;

import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;

public class main {
	private static final Point Point = null;

	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("opening google:");
		driver.get("https://www.google.com/");
		
		System.out.println("Going to currenturl:"+driver.getCurrentUrl());
		System.out.println("page title:"+driver.getTitle());
		
		
//		String url= "https://www.google.com/";
//		System.out.println(url);
//		driver.get
		
//		String Currenturl = new driverGetCurrenturl();
//		System.out.println(Currenturl);
//		
//		String Title = new drivertitle();
//	    driver.quit();
		Thread.sleep(3);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3);
		
		System.out.println("Going back to google");
		driver.navigate().back();
		Thread.sleep(5);
		
		System.out.println("Going forward");
		driver.navigate().forward();
		Thread.sleep(3);
		
		System.out.println("Going back to refresh");
		driver.navigate().refresh();
		Thread.sleep(3);
//		driver.quit();
		
		System.out.println("Going to Fullscreen");
		driver.manage().window().fullscreen();
		Thread.sleep(3);
		
		System.out.println("Going to getposition");
		driver.manage().window().getPosition();
		Thread.sleep(5);
		
		System.out.println("going to getsized");
		driver.manage().window().getSize();
		Thread.sleep(5);
		
		System.out.println("going to maximize");
		driver.manage().window().maximize();
		Thread.sleep(5);
		
		System.out.println("going to minimize");
		driver.manage().window().minimize();
		Thread.sleep(5);
		
		System.out.println("going to setposition");
		driver.manage().window().setPosition(new Point(80, 80));
		Thread.sleep(5);
		
		System.out.println("going to setsize");
		driver.manage().window().setSize(new Dimension(500, 300));
//		driver.quit();
		
		System.out.println("log entries");
		LogEntries lo = driver.manage().logs().get("browser");
	   for (org.openqa.selenium.logging.LogEntry logEntry : lo) {
		   System.out.println(logEntry);
		
	}
		
		System.out.println("Getavailable");
		System.out.println(driver.manage().logs().getAvailableLogTypes());
		driver.quit();
	}

}
