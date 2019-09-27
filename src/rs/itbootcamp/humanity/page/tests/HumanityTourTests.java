package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityTourTests {
	public static boolean testVirtualTour() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		HumanityHome.clickEmail(driver);
		HumanityHome.getEmail(driver).sendKeys("peraperic@temp-link.net");
		HumanityHome.clickPassword(driver);
		HumanityHome.getPassword(driver).sendKeys("Aleksic1984");
		HumanityHome.clickLoginButton(driver);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		HumanityMenu.clickShiftPlanning(driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickTimeClock(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickLeave(driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickTraining(driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickStaff(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickPayroll(driver);
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityMenu.clickReports(driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		driver.navigate().back();
		HumanityMenu.clickSettings(driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.navigate().back();
		HumanityProfile.clickProfilePhoto(driver);
		Thread.sleep(3000);
		HumanityProfile.clickProfile(driver);
		Thread.sleep(3000);
		HumanityProfile.clickProfilePhoto(driver);
		Thread.sleep(3000);
		HumanityProfile.clickSettings(driver);
		Thread.sleep(3000);
		HumanityProfile.clickProfilePhoto(driver);
		Thread.sleep(3000);
		HumanityProfile.clickAvailability(driver);
		Thread.sleep(3000);
		driver.quit();
		return false;

	}
}