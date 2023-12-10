package main.userLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithInvalidData {

	WebDriver driver;
	@FindBy(xpath = "//div[@class='col-sm-4']/div/a/img")
	WebElement VerifyText;
	@FindBy(xpath = "//div[@class='col-sm-8']/div/ul/child::li[4]/a")
	WebElement Login;
	@FindBy(xpath = "//div[@class=\"login-form\"]/h2")
	WebElement Loginform;
	@FindBy(name = "email")
	WebElement EmailField;
	@FindBy(name = "password")
	WebElement Pass;
	@FindBy(xpath = "//div[@class=\"login-form\"]/form/button")
	WebElement loginbutton;
	@FindBy(xpath = "//div[@class=\"login-form\"]/form/p")
	WebElement errorverification;

	public LoginWithInvalidData(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void uRL() throws InterruptedException {
		driver.get("https://automationexercise.com/");
		Thread.sleep(2000);
	}

	public boolean verifyEnterAccountInfoText() throws InterruptedException {
		Thread.sleep(2000);
		return VerifyText.isDisplayed();
	}

	public void login() {
		Login.click();
	}

	public boolean loginFormVisible() throws InterruptedException {
		Thread.sleep(2000);
		return Loginform.isDisplayed();
	}

	public void emailField(String email) {
		EmailField.sendKeys(email);
	}

	public void password(String Password) throws InterruptedException {
		Pass.sendKeys(Password);
		Thread.sleep(5000);
	}

	public void LogButton() {
		loginbutton.click();
	}

	public boolean verifyLoginerror() throws InterruptedException {
		Thread.sleep(2000);
		return errorverification.isDisplayed();
	}

	public void loginwithvalidcredentials(String email, String Password) throws InterruptedException {
		uRL();
		verifyEnterAccountInfoText();
		login();
		loginFormVisible();
		emailField(email);
		password(Password);
		LogButton();
		verifyLoginerror();
	}

}
