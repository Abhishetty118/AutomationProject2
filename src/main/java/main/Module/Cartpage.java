package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	WebDriver driver;

	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[3]")
	WebElement cartM;
	@FindBy(id = "susbscribe_email")
	WebElement Enteremail;
	@FindBy(id = "subscribe")
	WebElement Clickenteremail;
	

	public Cartpage(WebDriver driver) {
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
	public void cart() {
		cartM.click();
	}
	 public void scrollDown() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);"); 
	    }

	    public void performActionWithScrolling() {
	        
	        scrollDown();

	    }
	    public void subscribeemail(String email) {
	    	Enteremail.sendKeys(email);
	    }
	    public void clicksubscribeemail() {
	    	Clickenteremail.click();
	    }
}
