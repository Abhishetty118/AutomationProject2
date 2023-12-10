package main.Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage {
	WebDriver driver;
	
	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class=\"shop-menu pull-right\"]/ul/li[5]/a")
	WebElement Testmodule;
	@FindBy(xpath = "//div[@class=\"col-sm-9 col-sm-offset-1\"]/h2/b")
	WebElement testpage;
	public TestCasesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void uRL() throws InterruptedException {
		driver.get("https://automationexercise.com/");
		Thread.sleep(2000);
	}

	public boolean isHomePageVisible() throws InterruptedException {
		Thread.sleep(5000);
		return homePageElement.isDisplayed();

	}
	public void testmodule () {
		Testmodule.click();
	}
	public boolean testPageVisible() throws InterruptedException {
		Thread.sleep(5000);
		return testpage.isDisplayed();

	}
}
