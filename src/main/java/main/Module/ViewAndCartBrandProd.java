package main.Module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAndCartBrandProd {
 WebDriver driver;
 @FindBy(xpath = "//div[@class='shop-menu pull-right']/ul/li[2]")
 WebElement productmodule;
 @FindBy(xpath="//div[@class='brands_products']/h2")
 WebElement brand;
 @FindBy(xpath = "//div[@class='brands-name']/ul/li[2]/a")
 WebElement brandname1;
 @FindBy(xpath="//div[@class='col-sm-9 padding-right']/div/h2")
 WebElement verifybrandname1;
 @FindBy(xpath = " //div[@class='brands-name']/ul/li[5]/a")
 WebElement brandname2;
 @FindBy(xpath="//div[@class='col-sm-9 padding-right']/div/h2")
 WebElement verifybrandname2;
 public ViewAndCartBrandProd(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 
 public void productM() {
	 productmodule.click();
 }
 public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}

	public void performActionWithScrolling() {

		scrollDown();

	}
 public boolean verifybrand() {
	return brand.isDisplayed();
 }
 public void clickonbrandHM() {
	 brandname1.click();
 }
 public boolean verifyHM() {
	return verifybrandname1.isDisplayed();
 }
 public void clickonbrandBabyHug() {
	 brandname2.click();
 }
 public boolean verifybabyhug() {
	return verifybrandname2.isDisplayed();
 }
}
