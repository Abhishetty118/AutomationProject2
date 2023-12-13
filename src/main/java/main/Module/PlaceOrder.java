package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	WebDriver driver;

	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[2]/a")
	WebElement prod;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[2]/ul/li/a")
	WebElement viewproduct;
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	WebElement addtocart;
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement Cart;
	@FindBy(xpath = "//*[@id='do_action']/div[1]/div/div/a")
	WebElement proceed;
	@FindBy(xpath="//div[@class='modal-body']/p[2]/a")
	WebElement Register;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[3]/a")
	WebElement Cartmodule;
	@FindBy(xpath = "//*[@id='do_action']/div[1]/div/div/a")
	WebElement proceed1;
	@FindBy(xpath = "//*[@id='cart_items']/div/div[7]/a")
	WebElement placeorder;
	@FindBy(xpath = "//div[@class='col-md-4']/form/div[1]/div/input")
	WebElement Cardname;
	@FindBy(xpath = "//div[@class='col-md-4']/form/div[2]/div/input")
	WebElement Cardnumber;
	@FindBy(xpath = "//div[@class='col-md-4']/form/div[3]/div[1]/input")
	WebElement cvv;
	@FindBy(xpath = "//div[@class='col-md-4']/form/div[3]/div[2]/input")
	WebElement month;
	@FindBy(xpath = "//div[@class='col-md-4']/form/div[3]/div[3]/input")
	WebElement year;
	@FindBy(xpath = "//div[@class='col-md-12 form-group']/button")
	WebElement pay;
	@FindBy(xpath = "//div[@class='col-sm-9 col-sm-offset-1']/h2")
	WebElement verifyconfirmation;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[5]/a")
	WebElement delete;
	@FindBy(xpath = "//*[@id='form']/div/div/div/div/a")
	WebElement continuebutton;

	public PlaceOrder(WebDriver driver) {
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
		 prod.click();
	 }
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}

	public void performActionWithScrolling() {

		scrollDown();

	}
	public void ViewProduct() {
		viewproduct.click();
	}

	public void Product1() throws InterruptedException {
		Thread.sleep(5000);
		addtocart.click();
	}

	public void viewcart() {
		Cart.click();
	}

	public void clickProceedToCheckout() {
	proceed.click();
	}
	public void register() {
		Register.click();
		}
	public void cart() {
		Cartmodule.click();
	}

	public void proceedtoclick() {
		proceed1.click();
	}

	public void placeorderbutton() {
		placeorder.click();
	}

	public void nameoncard(String name) {
		Cardname.sendKeys(name);
		
	}

	public void cardno(String no) {
		Cardnumber.sendKeys(no);
		
	}

	public void entercvv(String cvvno) {
		cvv.sendKeys(cvvno);
		
	}

	public void entermonth(String M) {
		month.sendKeys(M);
	}

	public void enteryear(String Y) {
		year.sendKeys(Y);
	}

	public void payButton() {
		pay.click();
	}

	public boolean verifyoderconfirmation() {
		return verifyconfirmation.isDisplayed();
	}

	public void deleteaccount() {
		delete.click();
	}
	public void continueB() {
		continuebutton.click();
	}
	
}
