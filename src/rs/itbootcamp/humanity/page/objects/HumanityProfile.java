package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	public static final String URL = "https://www.humanity.com";
	private static final String PROFILE_PHOTO_CLICK_XPATH = "//img[@id='tr_avatar']";
	private static final String PROFILE_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SIGN_OUT_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String VERSION_XPATH = "//div[@id='humanityAppVersion']";

	public static WebElement getProfilePhoto(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_PHOTO_CLICK_XPATH));
	}

	public static void clickProfilePhoto(WebDriver driver) {
		getProfilePhoto(driver).click();
	}
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_XPATH));
	}

	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}

	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH));
	}

	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT_XPATH));
	}

	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}
	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION_XPATH));
	}

	public static void clickVersion(WebDriver driver) {
		getVersion(driver).click();
	}
	
}
