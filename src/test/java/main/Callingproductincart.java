package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Module.Addprodincart;

public class Callingproductincart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");

		Addprodincart addcart = new Addprodincart(driver);
		
		addcart.isHomePageVisible();
		addcart.productM();
		addcart.scrollDown();
		addcart.performActionWithScrolling();
		addcart.Product1();
		addcart.continuebutton();
		addcart.Product2();
		addcart.viewCart();
		addcart.printAllTableValues();
		
	}

}
