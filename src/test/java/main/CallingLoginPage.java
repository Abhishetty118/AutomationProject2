package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.userLogin.LoginWithInvalidData;
import main.userLogin.LoginWithValidData;

public class CallingLoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		LoginWithValidData login = new LoginWithValidData(driver);
		login.uRL();
		login.verifyEnterAccountInfoText();
		System.out.println("home page is displayed");
		login.login();
		login.loginFormVisible();
		System.out.println("Login to your account is visible");
		login.emailField("abhi118@gmail.com");
		login.password("123w");
		login.LogButton();
		login.verifyLogin();
		login.deletAcButton();
		login.verifyAcdeletedText();

		LoginWithInvalidData loginInvalid = new LoginWithInvalidData(driver);

		loginInvalid.uRL();
		loginInvalid.verifyEnterAccountInfoText();
		System.out.println("home page is displayed");
		loginInvalid.login();
		loginInvalid.loginFormVisible();
		System.out.println("Login to your account is visible");
		loginInvalid.emailField("ab123@gmail.com");
		loginInvalid.password("11111");
		loginInvalid.LogButton();
		loginInvalid.verifyLoginerror();
		System.out.println("Error message is display");

	}

}
