package main.Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCategoryProducts {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='col-sm-3']/div/h2")
    WebElement leftcategory;
	@FindBy(xpath = "//div[@class='panel-group category-products']/div[1]/div[1]/h4/a")
    WebElement ClickWomen;
	@FindBy(xpath = "//div[@id='Women']/div/ul/li[2]")
	WebElement Tops;
	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']/div/h2")
	WebElement womentext;
	@FindBy(xpath="//div[@class='panel-group category-products']/div[3]/div[1]/h4/a")
	WebElement kids;
	@FindBy (id = "Kids")
	WebElement category;
	public ViewCategoryProducts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyCategories() {
		return leftcategory.isDisplayed();
	}

	public void clickonWomenCategory() {
		ClickWomen.click();
	}

	public void clickunderWomenC() {
		Tops.click();
	}

	public boolean confirmWomenText() {
		return womentext.isDisplayed();
	}

	public void subCategory() {
		kids.click();
	}

	public boolean navigatedtoCategorypage() {
	return category.isDisplayed();
	}

}
