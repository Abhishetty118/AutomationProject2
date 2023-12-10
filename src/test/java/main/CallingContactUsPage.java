package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Module.ContactUsPage;
import main.Module.TestCasesPage;

public class CallingContactUsPage {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		ContactUsPage Cont = new ContactUsPage(driver);
		Cont.uRL();
		Cont.isHomePageVisible();
		Cont.contactModule();
		Cont.verifyText();
		Cont.nAME("ABCD");
		Cont.eMAIL("abhi118@gmail.com");
		Cont.sUBJECT("Automation Project");
		Cont.yourMsg("Thank You");
		Cont.file("C:\\Users\\sainath\\Documents\\PracticeProject");
		Cont.button();
		Cont.handleAlert("ok");
		Cont.verifySucsesstext();
		Cont.homebutton();
		Cont.isHomePageVisible1();
		
		
		TestCasesPage test = new TestCasesPage(driver);
		test.uRL();
		test.isHomePageVisible();
		test.testmodule();
		test.testPageVisible();
	}

}
