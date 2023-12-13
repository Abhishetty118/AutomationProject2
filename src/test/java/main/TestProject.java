package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.Module.AddReviewOnProduct;
import main.Module.Addprodincart;
import main.Module.Cartpage;
import main.Module.ContactUsPage;
import main.Module.LoginBeforecheckout;
import main.Module.PlaceOrder;
import main.Module.RecommendedItems;
import main.Module.RegisterBeforeCheckout;
import main.Module.RegisterWhileCheckout;
import main.Module.RemoveProductFromCart;
import main.Module.SearchProductpage;
import main.Module.SubscriptionPage;
import main.Module.TestCasesPage;
import main.Module.ViewAndCartBrandProd;
import main.Module.ViewCategoryProducts;
import main.Module.ViewProductquntity;
import main.registerUserPage.EnterAccountInfoPage;
import main.registerUserPage.RegisterUser;
import main.registerUserPage.RegisterUserWithExistingemail;
import main.userLogin.LoginWithInvalidData;
import main.userLogin.LoginWithValidData;
import main.userLogin.LogoutPage;

public class TestProject {

	WebDriver driver;

	@BeforeClass
	public void driver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");

	}

	@Test(priority = 1)
	public void RegisterUser() throws InterruptedException {
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
		EnterAccountInfoPage enterinfo = new EnterAccountInfoPage(driver);
		enterinfo.verifyEnterAccountInfoText();
		enterinfo.Title();
		enterinfo.password("123w");
		enterinfo.selectDOB("16", "8", "2020");
		enterinfo.checkB1();
		enterinfo.checkB2();
		enterinfo.FirstN("abc");
		enterinfo.LastN("xyz");
		enterinfo.company("Excelar");
		enterinfo.Add1("comp A");
		enterinfo.Add2("matrushri");
		enterinfo.selectCountry("India");
		enterinfo.state("Telangana");
		enterinfo.city("Hyd");
		enterinfo.zipcode("500042");
		enterinfo.mobileNo("1234567890");
		enterinfo.createAcButton();
		enterinfo.verifyAccountCreatedText();
		enterinfo.continueButton();
		enterinfo.verifyLoggedinText();
		enterinfo.deletAcButton();
		enterinfo.verifyAcdeletedText();
		enterinfo.conButton();
	}

	@Test(priority = 2)
	public void validcredentials() throws InterruptedException {
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

	}

	@Test(priority = 3)
	public void invalidcredentials() throws InterruptedException {

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

	@Test(priority = 4)
	public void logout() throws InterruptedException {

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

	@Test(priority = 5)
	public void Registerwithexistingemail() throws InterruptedException {
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

	@Test(priority = 6)
	public void contactform() throws InterruptedException {
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

	}

	@Test(priority = 7)
	public void testcasepage() throws InterruptedException {
		TestCasesPage test = new TestCasesPage(driver);
		test.uRL();
		test.isHomePageVisible();
		test.testmodule();
		test.testPageVisible();
	}

	@Test(priority = 8)
	public void Productpage() throws InterruptedException {
		RegisterWhileCheckout pro = new RegisterWhileCheckout(driver);
		pro.uRL();
		pro.isHomePageVisible();
		pro.productM();
		pro.scrollDown();
		pro.performActionWithScrolling();
		pro.productdetails();
		pro.verifyproductdetails();
	}

	@Test(priority = 9)
	public void searchProduct() throws InterruptedException {
		SearchProductpage search = new SearchProductpage(driver);
		search.uRL();
		search.isHomePageVisible();
		search.productM();
		search.searchprod("Top for Women");
		search.clicksearchprod();
		search.productisVisible();
		System.out.println("Searched Product is displayed");

	}

	@Test(priority = 10)
	public void subscriptioninhomepage() throws InterruptedException {
		SubscriptionPage sub = new SubscriptionPage(driver);
		sub.uRL();
		sub.isHomePageVisible();
		sub.scrollDown();
		sub.performActionWithScrolling();
		sub.subscribeemail("abhi118@gmail.com");
		sub.clicksubscribeemail();
	}

	@Test(priority = 11)
	public void subscriptionincartpage() throws InterruptedException {
		Cartpage cart = new Cartpage(driver);
		cart.uRL();
		cart.isHomePageVisible();
		cart.cart();
		cart.scrollDown();
		cart.performActionWithScrolling();
		Thread.sleep(5000);
		cart.subscribeemail("abhi118@gmail.com");
		cart.clicksubscribeemail();
	}

	@Test(priority = 12)
	public void productincart() throws InterruptedException {
		Addprodincart addcart = new Addprodincart(driver);

		addcart.uRL();
		Assert.assertTrue(addcart.isHomePageVisible(), "Home page is not visible successfully.");

		addcart.productM();
		addcart.scrollDown();
		addcart.performActionWithScrolling();
		addcart.Product1();
		addcart.continuebutton();
		addcart.Product2();
		addcart.viewCart();

	}

	@Test(priority = 13)
	public void Productquantity() throws InterruptedException {
		ViewProductquntity prodQ = new ViewProductquntity(driver);
		Assert.assertTrue(prodQ.verifyHomepage(), "Home page is not visible successfully.");
		prodQ.Productmodule();
		prodQ.scrollDown();
		prodQ.performActionWithScrolling();
		prodQ.viewproductdetails();
		prodQ.increasequantity(3);
		Thread.sleep(5000);
		prodQ.addtocart();
		prodQ.viewcart();

	}

	@Test(priority = 14)
	public void placeorder() throws InterruptedException {
		PlaceOrder order = new PlaceOrder(driver);
		order.uRL();
		order.isHomePageVisible();
		order.productM();
		order.scrollDown();
		order.performActionWithScrolling();
		order.ViewProduct();
		order.Product1();
		order.viewcart();
		order.clickProceedToCheckout();
		order.register();
		RegisterUser Register = new RegisterUser(driver);
		Register.nameField("XYZ");
		Register.emailField("aabb777@gmail.com");
		Register.singupButton();
		EnterAccountInfoPage enterinfo = new EnterAccountInfoPage(driver);
		enterinfo.verifyEnterAccountInfoText();
		enterinfo.Title();
		enterinfo.password("123w");
		enterinfo.scrollDown();
		enterinfo.performActionWithScrolling();
		enterinfo.selectDOB("16", "August", "2020");
		enterinfo.checkB1();
		enterinfo.checkB2();
		enterinfo.FirstN("abc");
		enterinfo.LastN("xyz");
		enterinfo.company("Excelar");
		enterinfo.Add1("comp A");
		enterinfo.Add2("matrushri");
		enterinfo.selectCountry("India");
		enterinfo.state("Telangana");
		enterinfo.city("Hyd");
		enterinfo.zipcode("500042");
		enterinfo.mobileNo("1234567890");
		enterinfo.createAcButton();
		enterinfo.verifyAccountCreatedText();
		enterinfo.continueButton();
		enterinfo.verifyLoggedinText();
		PlaceOrder order1 = new PlaceOrder(driver);
		order1.cart();
		Thread.sleep(5000);
		order1.cart();
		order1.proceedtoclick();
		order1.placeorderbutton();
		order1.nameoncard("xyz");
		order1.cardno("675798909");
		order1.entercvv("123");
		order1.entermonth("04");
		order1.enteryear("2026");
		order1.payButton();
		order1.verifyoderconfirmation();
		order1.deleteaccount();
		order1.continueB();
	}

	@Test(priority = 15)
	public void BeforeCheckout() throws InterruptedException {

		RegisterUser Register = new RegisterUser(driver);
		Register.uRL();
		Register.isHomePageVisible();
		System.out.println("home is visible sucessfully");
		Register.signUp();
		Register.signupFormVisible();
		System.out.println("New User Signup is Displayed");
		Register.nameField("XYZ");
		Register.emailField("wwzzxxx@gmail.com");
		Register.singupButton();
		Thread.sleep(5000);
		EnterAccountInfoPage enterinfo = new EnterAccountInfoPage(driver);
		enterinfo.verifyEnterAccountInfoText();
		enterinfo.Title();
		enterinfo.password("123w");
		enterinfo.scrollDown();
		enterinfo.performActionWithScrolling();
		enterinfo.selectDOB("2", "August", "2020");
		enterinfo.checkB1();
		enterinfo.checkB2();
		enterinfo.FirstN("abc");
		enterinfo.LastN("xyz");
		enterinfo.company("Excelar");
		enterinfo.Add1("comp A");
		enterinfo.Add2("matrushri");
		enterinfo.selectCountry("India");
		enterinfo.state("Telangana");
		enterinfo.city("Hyd");
		enterinfo.zipcode("500042");
		enterinfo.mobileNo("1234567890");
		enterinfo.createAcButton();
		enterinfo.verifyAccountCreatedText();
		enterinfo.continueButton();
		enterinfo.verifyLoggedinText();
		RegisterBeforeCheckout Before = new RegisterBeforeCheckout(driver);
		Before.product();
		Before.scrollDown();
		Before.performActionWithScrolling();
		Before.viewprod();
		Before.addprod();
		Before.cart();
		Before.proceedtoclick();
		Before.placeorderbutton();
		Before.nameoncard("xyz");
		Before.cardno("564387290");
		Before.entercvv("123");
		Before.entermonth("07");
		Before.enteryear("2025");
		Before.payButton();
		Before.verifyoderconfirmation();
		Before.deleteaccount();
		Before.continueB();
	}

	@Test(priority = 16)
	public void loginbeforecheckout() throws InterruptedException {
		LoginBeforecheckout log = new LoginBeforecheckout(driver);
		log.uRL();
		log.login();
		log.verifyEnterAccountInfoText();
		log.emailField("abhi118@gmail.com");
		log.password("123w");
		log.LogButton();
		log.verifyLogin();
		RegisterBeforeCheckout Before = new RegisterBeforeCheckout(driver);
		Before.product();
		Before.scrollDown();
		Before.performActionWithScrolling();
		Before.viewprod();
		Before.addprod();
		Before.cart();
		Before.proceedtoclick();
		Before.placeorderbutton();
		Before.nameoncard("xyz");
		Before.cardno("564387290");
		Before.entercvv("123");
		Before.entermonth("07");
		Before.enteryear("2025");
		Before.payButton();
		Before.verifyoderconfirmation();
		Before.deleteaccount();
		Before.continueB();
	}

	@Test(priority = 17)
	public void removeProduct() throws InterruptedException {
		RemoveProductFromCart remove = new RemoveProductFromCart(driver);
		remove.uRL();
		remove.verifyHomePage();
		remove.product();
		remove.scrollDown();
		remove.performActionWithScrolling();
		remove.viewprod();
		remove.addprod();
		remove.cart();
		remove.removeproduct();
		remove.verifycart();
		System.out.println("Cart is empty");
	}

	@Test(priority = 18)
	public void productscategory() {
		ViewCategoryProducts Category = new ViewCategoryProducts(driver);
		Category.verifyCategories();
		Category.clickonWomenCategory();
		Category.clickunderWomenC();
		Category.confirmWomenText();
		Category.subCategory();
		Category.navigatedtoCategorypage();

	}
@Test(priority = 19)
public void cartBrandProducts() {
	ViewAndCartBrandProd brand = new ViewAndCartBrandProd(driver);
	brand.productM();
	brand.scrollDown();
	brand.performActionWithScrolling();
	brand.verifybrand();
	brand.clickonbrandHM();
	brand.verifyHM();
	brand.clickonbrandBabyHug();
	brand.verifybabyhug();
}
@Test(priority = 20)
public void Review() {
	AddReviewOnProduct review = new AddReviewOnProduct(driver);
	review.productM();
	review.verifyallproducts();
	review.scrollDown();
	review.performActionWithScrolling();
	review.viewprod();
	review.verifyyourreview();
	review.entername("XYZ");
	review.enteremail("abc123@gmail.com");
	review.enterreview("its nice");
	review.clickbutton();
}
@Test(priority = 21)
public void AddToCartRecommandeditems() {
	RecommendedItems items = new RecommendedItems(driver);
	items.scrollDown();
	items.performActionWithScrolling();
	items.verifyRecommendedItems();
	items.addtocart();
	items.viewcart();
	items.verifyproductincart();
}
	@AfterClass

	public void tearDown() {
		// Close the browser
		driver.close();
	}
}
