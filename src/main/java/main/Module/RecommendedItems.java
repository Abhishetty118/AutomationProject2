package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendedItems {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='recommended_items']/h2")
	WebElement VerifyItems;
	@FindBy(xpath = "//*[@id='recommended-item-carousel']/div/div[1]/div[1]/div/div/div/a")
	WebElement Addtocart;
	@FindBy(xpath = "//div[@class='modal-body']/p[2]/a")
	WebElement ViewCart;
	@FindBy(xpath="//div[@class='table-responsive cart_info']/table/tbody/tr")
	WebElement Verifyproductincart;

	public RecommendedItems(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}

	public void performActionWithScrolling() {

		scrollDown();

	}

	public boolean verifyRecommendedItems() {
		return VerifyItems.isDisplayed();
	}

	public void addtocart() {
		Addtocart.click();
	}

	public void viewcart() {
		ViewCart.click();
	}
	public boolean verifyproductincart() {
	return	Verifyproductincart.isDisplayed();
	}
}
