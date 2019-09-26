package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityEditStaffTests {
	public static boolean testUploadPhoto() throws Exception {
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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		HumanityMenu.clickStaff(driver);
		HumanityEditStaff.clickEmployee(driver);
		HumanityEditStaff.clickEditDetails(driver);
		HumanityEditStaff.getUploadPhoto(driver);
		HumanityEditStaff.sendPhoto(driver);
		Thread.sleep(5000);
		HumanityEditStaff.clickSaveEmployee(driver);
		Thread.sleep(3000);
		driver.quit();
		return false;
}
	public static boolean testNickName() throws Exception {
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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		HumanityMenu.clickStaff(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HumanityEditStaff.clickEmployee(driver);
		HumanityEditStaff.clickEditDetails(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityEditStaff.clickChangeNickName(driver);
		HumanityEditStaff.inputChangeNickName(driver, "Zika");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityEditStaff.clickSaveEmployee(driver);
		return false;
}
}