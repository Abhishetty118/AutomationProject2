package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Module.ViewProductquntity;

public class CallingproductQuantity {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	
		ViewProductquntity prodq = new ViewProductquntity(driver);
		prodq.uRL();
		prodq.isHomePageVisible();
		prodq.productM();
		prodq.performActionWithScrolling();
		prodq.scrollDown();
	
	
	}	

}
