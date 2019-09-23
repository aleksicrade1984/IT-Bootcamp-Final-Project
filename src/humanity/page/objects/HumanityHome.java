package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com";
	private static final String ABOUT_US_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String FULL_NAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String FREE_TRIAL_XPATH = "//input[@id='free-trial-link-01']";
	private static final String FREE_TRIAL_2_XPATH = "//a[@class='button pale']";

	private static final String LOGIN_XPATH = "//p[contains(text(),'LOGIN')]";
	private static final String EMAIL_XPATH = "//input[@id='email']";
	private static final String PASSWORD_XPATH = "//input[@id='password']";
	private static final String LOGIN_BUTTON_XPATH = "//button[contains(text(),'Log in')]";


	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_XPATH));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_XPATH));
	}

	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();
	}

	public static void inputFullName(WebDriver driver, String data) {
		getFullName(driver).sendKeys(data);
	}

	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL_XPATH));
	}

	public static void clickWorkEmail(WebDriver driver) {
		getWorkEmail(driver).click();
	}

	public static void inputWorkEmail(WebDriver driver, String data) {
		getWorkEmail(driver).sendKeys(data);
	}

	public static WebElement getFreeTrial(WebDriver driver) {
		return driver.findElement(By.xpath(FREE_TRIAL_XPATH));
	}

	public static void clickFreeTrial(WebDriver driver) {
		getFreeTrial(driver).click();
	}

	public static WebElement getFreeTrial2(WebDriver driver) {
		return driver.findElement(By.xpath(FREE_TRIAL_2_XPATH));
	}

	public static void clickFreeTrial2(WebDriver driver) {
		getFreeTrial2(driver).click();
	}

	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

}
