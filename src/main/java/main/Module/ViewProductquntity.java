package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewProductquntity {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='logo pull-left']/a/img")
	WebElement VerifyHome;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[2]/a")
	WebElement ProductModule;
	@FindBy(xpath = "//div[@class='choose']/ul/li[1]/a[1]")
	WebElement ViewDetails;
	@FindBy(id = "quantity")
	WebElement Quantity;
	@FindBy(className = "btn btn-default cart")
	WebElement AddtoCartButton;
	@FindBy(xpath = "//div[@class='modal-body']/p[2]/a")
	WebElement ViewcartButton;

	public ViewProductquntity(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);

	}

	public boolean verifyHomepage() throws InterruptedException {
		Thread.sleep(5000);
		return VerifyHome.isDisplayed();
	}

	public void Productmodule() throws InterruptedException {
		Thread.sleep(2000);
		ProductModule.click();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
	}

	public void performActionWithScrolling() {
		scrollDown();
	}

	public void viewproductdetails() {
		ViewDetails.click();
	}

	public void increasequantity(int quantityToAdd) {
		int currentQuantity = Integer.parseInt(Quantity.getAttribute("value"));

		int newQuantity = currentQuantity + quantityToAdd;

		Quantity.clear();
		Quantity.sendKeys(String.valueOf(newQuantity));
	}

	public void addtocart() {
		AddtoCartButton.click();
	}

	public void viewcart() {
		ViewcartButton.click();
	}
}
