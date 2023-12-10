package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.registerUserPage.RegisterUserWithExistingemail;

public class CallingRegisterUserWithExistingemail {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		RegisterUserWithExistingemail userexist = new RegisterUserWithExistingemail(driver);
		userexist.uRL();
		userexist.isHomePageVisible();
		System.out.println("home is visible sucessfully");
		userexist.signUp();
		userexist.signupFormVisible();
		System.out.println("New User Signup is Displayed");
		userexist.nameField("XYZ");
		userexist.emailField("abhi118@gmail.com");
		userexist.singupButton();
		userexist.VerifyEmailAlredyExistText();
		System.out.println("Email address alredy exist!");
	}

}
