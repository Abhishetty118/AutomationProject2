package main.Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductpage {
	WebDriver driver;
	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[2]/a")
	WebElement ProductModule;
	@FindBy(id = "search_product")
	WebElement SearchProd;
	@FindBy(id = "submit_search")
	WebElement ClickSearch;
	@FindBy(xpath = "//div[@class='features_items']/h2")
	WebElement Verifyproduvt;
	public SearchProductpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void uRL() throws InterruptedException {
		driver.get("https://automationexercise.com/");
		Thread.sleep(1000);
	}

	public boolean isHomePageVisible() throws InterruptedException {
		Thread.sleep(1000);
		return homePageElement.isDisplayed();

	}

	public void productM() {
		ProductModule.click();
	}

	public void searchprod(String prod) {
		SearchProd.sendKeys(prod);
	}

	public void clicksearchprod() {
		ClickSearch.click();
	}
	public boolean productisVisible() throws InterruptedException {
		Thread.sleep(1000);
		return Verifyproduvt.isDisplayed();

	}


}
