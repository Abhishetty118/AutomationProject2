package main.Module;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;

	@FindBy(id = "header")
	WebElement homePageElement;
	@FindBy(xpath = "//div[@class=\"shop-menu pull-right\"]/ul/li[8]/a")
	WebElement ContactUsB;
	//div[@class='contact-form']/h2
	@FindBy(xpath = "//div[@class='contact-form']/h2")
	WebElement TEXT;
	@FindBy(name = "name")
	WebElement Name;
	@FindBy(name = "email")
	WebElement Email;
	@FindBy(name = "subject")
	WebElement Sub;
	@FindBy(id = "message")
	WebElement Msg;
	@FindBy(name = "upload_file")
	WebElement File;
	@FindBy(name = "submit")
	WebElement Sbutton;
	@FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")
	WebElement Sucsesstext;
	@FindBy(xpath = "//div[@id=\"form-section\"]/a/span/i")
	WebElement Hbutton;
	@FindBy(id = "header")
	WebElement homePageElement1;
	
	
	public ContactUsPage(WebDriver driver) {
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
	public void contactModule() throws InterruptedException {
		Thread.sleep(1000);
		ContactUsB.click();
	}
	public boolean verifyText() throws InterruptedException {
		Thread.sleep(5000);
		return TEXT.isDisplayed();

	}
	
	public void nAME (String N) {
		Name.sendKeys(N);
		}
	public void eMAIL (String E) {
		Email.sendKeys(E);
		}
	public void sUBJECT (String SUB) {
		Sub.sendKeys(SUB);
		}
	public void yourMsg (String MSG) {
		Msg.sendKeys(MSG);
		}
	public void file (String Filepath) {
		File.sendKeys(Filepath);
		}
	public void button () {
		Sbutton.click();
		}
	 public Alert handleAlert(String alertText) {
	        Alert alert = driver.switchTo().alert();
	         alert.getText();
	        alert.accept();
	        return alert;
	    }
	 
	 public boolean verifySucsesstext() throws InterruptedException {
		 Thread.sleep(1000);
		return Sucsesstext.isDisplayed();
	 }
	 public void homebutton () {
			Hbutton.click();
			}
	 public boolean isHomePageVisible1() throws InterruptedException {
			Thread.sleep(5000);
			return homePageElement1.isDisplayed();
			
	 }

}
