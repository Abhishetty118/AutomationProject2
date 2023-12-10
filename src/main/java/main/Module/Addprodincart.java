package main.Module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addprodincart {

	WebDriver driver;

	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class=\"shop-menu pull-right\"]/ul/li[2]/a")
	WebElement ProductModule;
	@FindBy(id = "1")
	WebElement Addtocart1;
	@FindBy(className = "btn btn-success close-modal btn-block")
	WebElement Continue;
	@FindBy(id = "2")
	WebElement Addtocart2;
	@FindBy(xpath = "//div[@class=\"modal-body\"]/p/a")
	WebElement Viewcart;
	 @FindBy(id = "cart_info_table") 
	  WebElement table;

	

	public Addprodincart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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

	public void Product1() {
		Addtocart1.click();
	}

	public void continuebutton() {
		Continue.click();
	}

	public void Product2() {
		Addtocart2.click();
	}
	public void viewCart() {
		Viewcart.click();
	}
	public void printAllTableValues() {
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }
           
        }
    }
	
}
