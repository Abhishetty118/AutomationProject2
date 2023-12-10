package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.registerUserPage.EnterAccountInfoPage;
import main.registerUserPage.RegisterUser;

public class Callingpage1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		RegisterUser Register = new RegisterUser(driver);
		Register.uRL();
		Register.isHomePageVisible();
		System.out.println("home is visible sucessfully");
		Register.signUp();
		Register.signupFormVisible();
		System.out.println("New User Signup is Displayed");
		Register.nameField("XYZ");
		Register.emailField("abhi118@gmail.com");
		Register.singupButton();
		
		EnterAccountInfoPage Enterinfo = new EnterAccountInfoPage(driver);
		Enterinfo.verifyEnterAccountInfoText();
		System.out.println("Enter Account Information Text is Visible");
		Enterinfo.Title();
		Enterinfo.password("1234w");
		Enterinfo.selectDOB("8", "August", "2020");
		Enterinfo.checkB1();
		Enterinfo.checkB2();
		Enterinfo.FirstN("abc");
		Enterinfo.LastN("xyz");
		Enterinfo.company("Excelar");
		Enterinfo.Add1("efgh");
		Enterinfo.Add2("cgvgyu");
		Enterinfo.selectCountry("India");
		Enterinfo.state("Telangana");
		Enterinfo.city("Hyderabad");
		Enterinfo.zipcode("500043");
		Enterinfo.mobileNo("9587988908");
		Enterinfo.createAcButton();
		Enterinfo.verifyAccountCreatedText();
		System.out.println("Account created text is visible");
		Enterinfo.continueButton();
		Enterinfo.verifyLoggedinText();
		System.out.println("Logged in as XYZ is visible");
		Enterinfo.deletAcButton();
		Enterinfo.verifyAcdeletedText();
		System.out.println("Account Deleted text is visible");
		Enterinfo.conButton();
		//driver.quit();
	}

}