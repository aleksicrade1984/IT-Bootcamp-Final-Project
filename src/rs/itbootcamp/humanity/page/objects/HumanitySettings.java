package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	
	private static final String COUNTRY_XPATH = "//select[@id='country']";
	private static final String TIMEFORMAT_XPATH = "//select[@name='pref_24hr']";
	private static final String LANGUAGE_XPATH = "//td[@class='nowrap']//select[@name='language']";
	private static final String SAVE_SETTINGS_XPATH = "//button[@id='_save_settings_button']";
	
	

	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_XPATH)));
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}

	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIMEFORMAT_XPATH)));
	}

	public static void inputTimeFormat(WebDriver driver, String data) {
		getTimeFormat(driver).selectByVisibleText(data);
	}

	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_XPATH)));
	}

	public static void inputLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}

	public static WebElement getSaveSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_SETTINGS_XPATH));
	}

	public static void clickSaveSettings(WebDriver driver) {
		getSaveSettings(driver).click();
	}


}
