package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.userLogin.LogoutPage;

public class CallingLogoutPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		LogoutPage logout = new LogoutPage(driver);

		logout.uRL();
		logout.verifyEnterAccountInfoText();
		System.out.println("home page is displayed");
		logout.login();
		logout.loginFormVisible();
		System.out.println("Login to your account is visible");
		logout.emailField("abhi118@gmail.com");
		logout.password("123w");
		logout.LogButton();
		logout.verifyLogin();
		logout.LogoutButton();
		logout.loginFormVisible2();
		System.out.println("Login to your account is visible");

	}

}
