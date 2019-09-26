package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityTourTests {
	public static boolean testVirtualTour() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		HumanityHome.clickEmail(driver);
		HumanityHome.getEmail(driver).sendKeys("peraperic@temp-link.net");
		HumanityHome.clickPassword(driver);
		HumanityHome.getPassword(driver).sendKeys("Aleksic1984");
		HumanityHome.clickLoginButton(driver);
		Thread.sleep(3000);
		HumanityMenu.clickDashboard(driver);
		Thread.sleep(3000);
		HumanityMenu.clickShiftPlanning(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickTimeClock(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickLeave(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickTraining(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickStaff(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickPayroll(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickReports(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickSettings(driver);
		Thread.sleep(5000);		
		driver.quit();
		return false;

	}
}