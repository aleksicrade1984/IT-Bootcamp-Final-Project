package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;

public class GlavniProgram {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * try { HumanityLoginTests.testLogin(); HumanityAddNewEmployeeTests.testAdd();
		 * } catch (Exception ex) {
		 * 
		 * System.out.println(ex); } finally {
		 * System.out.println("Svi testovi su prosli"); }
		 */
	/*	driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		  HumanityHome.getAboutUs(driver); HumanityHome.clickAboutUs(driver);
		 
		HumanityHome.getLogin(driver);
		HumanityHome.clickLogin(driver);
		HumanityHome.getEmail(driver);
		HumanityHome.clickEmail(driver);
		HumanityHome.getEmail(driver).sendKeys("peraperic@temp-link.net");
		HumanityHome.getPassword(driver);
		HumanityHome.clickPassword(driver);
		HumanityHome.getPassword(driver).sendKeys("Aleksic1984");
		HumanityHome.getLoginButton(driver);
		HumanityHome.clickLoginButton(driver);
	//	HumanityLoginTests.testLogin();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);*/
		
	/*	HumanityMenu.getStaff(driver);
		HumanityMenu.clickStaff(driver);
		HumanityEditStaff.getEmployee(driver);
		HumanityEditStaff.clickEmployee(driver);
		HumanityEditStaff.getEditDetails(driver);
		HumanityEditStaff.clickEditDetails(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HumanityEditStaff.getUploadImg(driver);
		HumanityEditStaff.getUploadImg(driver).sendKeys("C:\\Users\\Rade\\Desktop\\Rade.jpeg");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);*/
		
	/*	HumanityEditStaff.getUploadPhoto(driver);
		HumanityEditStaff.clickUploadPhoto(driver);
		HumanityEditStaff.getBrowse(driver);
		HumanityEditStaff.sendKeysBrowse(driver);
		HumanityEditStaff.getSaveEmployee(driver);
		HumanityEditStaff.clickSaveEmployee(driver);*/
		
	/*	HumanitySettings.getSettings(driver);
		HumanitySettings.clickSettings(driver);
		HumanitySettings.getCountry(driver);
		HumanitySettings.inputCountry(driver, "Romania");
		HumanitySettings.getSaveSettings(driver);
		HumanitySettings.clickSaveSettings(driver);*/
		
		
		/*HumanityProfile.getProfilePhoto(driver);
		HumanityProfile.clickProfilePhoto(driver);
		HumanityProfile.getSignOut(driver);
		HumanityProfile.clickSignOut(driver);*/
		
		HumanitySettingsTests.testAll();

	}

}
