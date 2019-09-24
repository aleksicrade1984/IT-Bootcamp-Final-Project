package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests {
	public static boolean testLogin() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		if (driver.getCurrentUrl().contains(HumanityHome.URL) == false) {

		}
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		HumanityHome.clickEmail(driver);
		HumanityHome.getEmail(driver).sendKeys("peraperic@temp-link.net");
		HumanityHome.clickPassword(driver);
		HumanityHome.getPassword(driver).sendKeys("Aleksic1984");
		HumanityHome.clickLoginButton(driver);

		return false;
	}

}
