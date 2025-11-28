package test;


	

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Alab1Browser {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			Thread.sleep(Duration.ofSeconds(5));
//			driver.quit();
			
			Thread.sleep(Duration.ofSeconds(3));

			WebDriver driver1 = new FirefoxDriver();
			Thread.sleep(Duration.ofSeconds(5));
//			driver.quit();
			
			Thread.sleep(Duration.ofSeconds(3));

			WebDriver driver2 = new EdgeDriver();
			Thread.sleep(Duration.ofSeconds(5));
			driver.quit();
		}
	}


