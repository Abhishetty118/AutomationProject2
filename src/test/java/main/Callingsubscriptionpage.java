package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Module.Cartpage;
import main.Module.SubscriptionPage;

public class Callingsubscriptionpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		SubscriptionPage sub = new SubscriptionPage(driver);
		sub.uRL();
		sub.isHomePageVisible();
		sub.scrollDown();
		sub.performActionWithScrolling();
		sub.subscribeemail("abhi118@gmail.com");
		sub.clicksubscribeemail();
		
		Thread.sleep(8000);
		
		Cartpage cart = new Cartpage(driver);
		cart.uRL();
		cart.isHomePageVisible();
		cart.cart();
		cart.scrollDown();
		cart.performActionWithScrolling();
		cart.subscribeemail("abhi118@gmail.com");
		cart.clicksubscribeemail();
		
	}

}

