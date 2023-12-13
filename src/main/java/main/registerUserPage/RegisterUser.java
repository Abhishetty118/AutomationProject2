package main.registerUserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {
    WebDriver driver;

	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class='col-sm-8']/div/ul/child::li[4]/a")
	WebElement Singup;
	@FindBy(xpath = "//div[@class='signup-form']/h2")
	WebElement signupForm;
	@FindBy(name = "name")
	WebElement NameField;
	@FindBy(xpath = "//div[@class=\"signup-form\"]/form/input[3]")
	WebElement EmailField;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement button;
	
	
	public RegisterUser(WebDriver driver) {
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
	public void signUp() {
		Singup.click();
	}
	public boolean signupFormVisible() throws InterruptedException {
		Thread.sleep(2000);
		return signupForm.isDisplayed();
	}
	public void nameField(String Name) {
		NameField.sendKeys(Name);
	}
	public void emailField(String email) {
		EmailField.sendKeys(email);
	}
	public void singupButton() {
		button.click();
	}
	
	public void registrationProcess(String Name,String email) throws InterruptedException {
		uRL();
		isHomePageVisible();
		signUp();
		signupFormVisible();
		nameField(Name);
		emailField(email);
		singupButton();
		
	}

}
