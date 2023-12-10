package main.registerUserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterAccountInfoPage {
	WebDriver driver;

	public EnterAccountInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-1']/div/h2/b")
	WebElement VerifyText;
	@FindBy(id = "id_gender2")
	WebElement Title;
	@FindBy(id = "password")
	WebElement Password;
	@FindBy(id = "days")
	WebElement DayDropdown;
	@FindBy(id = "months")
	WebElement MonthDropdown;
	@FindBy(id = "years")
	WebElement YearDropdown;
	@FindBy(id = "newsletter")
	WebElement Checkbox1;
	@FindBy(id = "optin")
	WebElement Checkbox2;
	@FindBy(id = "first_name")
	WebElement FirstName;
	@FindBy(id = "last_name")
	WebElement LastName;
	@FindBy(id = "company")
	WebElement Company;
	@FindBy(id = "address1")
	WebElement Address1;
	@FindBy(id = "address2")
	WebElement Address2;
	@FindBy(id = "country")
	WebElement Country;
	@FindBy(id = "state")
	WebElement State;
	@FindBy(id = "city")
	WebElement City;
	@FindBy(id = "zipcode")
	WebElement Zipcode;
	@FindBy(id = "mobile_number")
	WebElement MobileNo;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button\r\n")
	WebElement Createac;
	@FindBy(xpath = "//div[@class=\"col-sm-9 col-sm-offset-1\"]/h2/b")
	WebElement AccountCreatedText;
	@FindBy(xpath = "//div[@class=\"col-sm-9 col-sm-offset-1\"]/div/a")
	WebElement Continue;
	@FindBy(xpath = "//div[@class=\"shop-menu pull-right\"]/ul/li[10]/a/i")
	WebElement Loggedin;
	@FindBy(xpath = "//div[@class=\"shop-menu pull-right\"]/ul/li[5]/a")
	WebElement deletAc;
	@FindBy(xpath = "//div[@class=\"col-sm-9 col-sm-offset-1\"]/h2/b")
	WebElement AcdeletedText;
	@FindBy(xpath = "//div[@class=\"col-sm-9 col-sm-offset-1\"]/div/a")
	WebElement CButton;
	
	public boolean verifyEnterAccountInfoText() throws InterruptedException {
		Thread.sleep(2000);
		return VerifyText.isDisplayed();
	}

	public void Title() {
		Title.click();
	}

	public void password(String pass) throws InterruptedException {
		Password.sendKeys(pass);
		Thread.sleep(5000);
	}

	public void selectDOB(String day, String month, String year) {
		Select daySelect = new Select(DayDropdown);
		daySelect.selectByVisibleText(day);

		Select monthSelect = new Select(MonthDropdown);
		monthSelect.selectByVisibleText(month);

		Select yearSelect = new Select(YearDropdown);
		yearSelect.selectByVisibleText(year);
	}

	public void checkB1() {
		Checkbox1.click();
	}

	public void checkB2() {
		Checkbox2.click();
	}

	public void FirstN(String FName) {
		FirstName.sendKeys(FName);
	}

	public void LastN(String LName) {
		LastName.sendKeys(LName);
	}

	public void company(String COMP) {
		Company.sendKeys(COMP);
	}

	public void Add1(String add1) {
		Address1.sendKeys(add1);
	}

	public void Add2(String add2) {
		Address2.sendKeys(add2);
	}

	public void selectCountry(String country) {
		Select CountrySelect = new Select(Country);
		CountrySelect.selectByVisibleText(country);
	}

	public void state(String STATE) {
		State.sendKeys(STATE);
	}

	public void city(String CITY) {
		City.sendKeys(CITY);
	}

	public void zipcode(String CODE) {
		Zipcode.sendKeys(CODE);
	}

	public void mobileNo(String MNO) {
		MobileNo.sendKeys(MNO);
	}

	public void createAcButton() {
		Createac.click();
	}

	public boolean verifyAccountCreatedText() throws InterruptedException {
		Thread.sleep(2000);
		return AccountCreatedText.isDisplayed();
	}
	public void continueButton() {
		Continue.click();
	}
	public boolean verifyLoggedinText() throws InterruptedException {
		Thread.sleep(2000);
		return Loggedin.isDisplayed();
	}
	public void deletAcButton() {
		deletAc.click();
	}
	
	public boolean verifyAcdeletedText() throws InterruptedException {
		Thread.sleep(2000);
		return AcdeletedText.isDisplayed();
	}
	public void conButton() {
		CButton.click();
	}
	
	public void EnterAccountInfoProcess(String pass, String day, String month, String year, String FName, String LName,
			String COMP, String add1, String add2, String country, String STATE, String CITY, String CODE, String MNO)
			throws InterruptedException {
		verifyEnterAccountInfoText();
		Title();
		password(pass);
		selectDOB(day, month, year);
		checkB1();
		checkB2();
		FirstN(FName);
		LastN(LName);
		company(COMP);
		Add1(add1);
		Add2(add2);
		selectCountry(country);
		state(STATE);
		city(CITY);
		zipcode(CODE);
		mobileNo(MNO);
		createAcButton();
		verifyAccountCreatedText();
		continueButton();
		verifyLoggedinText();
		deletAcButton();
		verifyAcdeletedText();
		conButton();
	}

}
