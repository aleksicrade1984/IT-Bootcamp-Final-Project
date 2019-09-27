package rs.itbootcamp.humanity.page.tests;

import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HumanityLoginTestNG {
	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		String loginEmail = "peraperic@temp-link.net";
//		String password = "Aleksic1984";

		HumanityHome.openPage(driver);
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		HumanityHome.clickEmail(driver);
		HumanityHome.getEmail(driver).sendKeys("peraperic@temp-link.net");
		HumanityHome.clickPassword(driver);
		HumanityHome.getPassword(driver).sendKeys("Aleksic1984");
		HumanityHome.clickLoginButton(driver);

		boolean log = driver.getCurrentUrl().contains(HumanityHome.URL);
		Assert.assertTrue(log);
		

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test Login");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Login succesfull");
	}

}
