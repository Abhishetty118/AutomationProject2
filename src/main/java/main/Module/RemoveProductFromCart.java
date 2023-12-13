package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductFromCart {
	WebDriver driver;
	@FindBy(id = "header")
	WebElement Verifyhome;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[2]/a")
	WebElement prod;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[2]/ul/li/a")
	WebElement viewproduct;
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	WebElement addtocart;
	@FindBy(xpath = "//*[@id='cartModal']/div/div/div[2]/p[2]/a/u")
	WebElement ViewCart;
	@FindBy(xpath="//div[@class='table-responsive cart_info']/table/tbody/tr/td[6]/a/i")
	WebElement RemoveProduct;
	@FindBy(xpath="//div[@class='table-responsive cart_info']/span/p")
	WebElement verifyemptycart;
	public RemoveProductFromCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void uRL() throws InterruptedException {
		driver.get("https://automationexercise.com/");
		Thread.sleep(2000);
	}
	public boolean verifyHomePage() throws InterruptedException {
	
		return Verifyhome.isDisplayed();
	}
	public void product() {
		prod.click();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}

	public void performActionWithScrolling() {

		scrollDown();

	}

	public void viewprod() {
		viewproduct.click();
	}

	public void addprod() {
		addtocart.click();
	}
	public void cart() {
		ViewCart.click();
	}
	public void removeproduct() {
		RemoveProduct.click();
	}
	
	public boolean verifycart() {
		return verifyemptycart.isDisplayed();
	}
}
