package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Module.ProductPage;
import main.Module.SearchProductpage;
import main.Module.ViewProductquntity;

public class CallingProductPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		ProductPage pro = new ProductPage(driver);
		pro.uRL();
		pro.isHomePageVisible();
		pro.productM();
		pro.scrollDown();
		pro.performActionWithScrolling();
		pro.productdetails();
		pro.verifyproductdetails();
		SearchProductpage search = new SearchProductpage(driver);
		search.uRL();
		search.isHomePageVisible();
		search.productM();
		search.searchprod("Top for Women");
		search.clicksearchprod();
		search.productisVisible();
		System.out.println("Searched Product is displayed");
		
		ViewProductquntity prodQ = new ViewProductquntity(driver);
		prodQ.uRL();
		prodQ.isHomePageVisible();
		prodQ.productM();
		prodQ.performActionWithScrolling();
		prodQ.scrollDown();
		prodQ.productdetails();
		prodQ.verifyproductdetails();
		
	}

}
