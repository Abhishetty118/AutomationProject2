package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddReviewOnProduct {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[2]")
	WebElement productmodule;
	@FindBy(xpath = "//div[@class='features_items']/h2")
	WebElement Verifyproductpage;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[2]/ul/li/a")
	WebElement viewproduct;
	@FindBy(xpath="//div[@class='col-sm-12']/ul/li/a")
	WebElement VerifyReview;
	@FindBy(id="name")
	WebElement Name;
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="review")
	WebElement Review;
	@FindBy(id="button-review")
	WebElement button;

	public AddReviewOnProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void productM() {
		productmodule.click();
	}

	public void verifyallproducts() {
		Verifyproductpage.isDisplayed();
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
	public boolean verifyyourreview() {
	return	VerifyReview.isDisplayed();
	}
	public void entername(String name) {
		Name.sendKeys(name);
	}
	public void enteremail(String email) {
		Email.sendKeys(email);
	}
	public void enterreview(String review) {
		Review.sendKeys(review);
	}
	public void clickbutton() {
		button.click();
	}
}
