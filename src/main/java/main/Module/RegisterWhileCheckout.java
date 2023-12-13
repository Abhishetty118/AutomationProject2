package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterWhileCheckout{
	WebDriver driver;
	
	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[2]/a")
	WebElement ProductModule;
	@FindBy(xpath = "//div[@class='choose'][1]/ul/li/a[1]")
	WebElement ViewProduct;
	@FindBy(xpath = "//div[@class='product-information']")
	WebElement Productdetails;
	
	public RegisterWhileCheckout(WebDriver driver) {
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
	 public void scrollDown() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);"); 
	    }

	    public void performActionWithScrolling() {
	        
	        scrollDown();

	    }
	public void productdetails() {
		ViewProduct.click();
	}
	public boolean verifyproductdetails() {
	 return Productdetails.isDisplayed();
	
	}
	
}
