package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTests {
	public static boolean testCountry() { // testiranje promene drzave
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

		HumanityMenu.getSettings(driver);
		HumanityMenu.clickSettings(driver);

		HumanitySettings.getCountry(driver);
		HumanitySettings.inputCountry(driver, "Romania");

		HumanitySettings.clickSaveSettings(driver);

		return false;
	}

	public static boolean testLanguage() { // testiranje promene jezika
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

		HumanityMenu.getSettings(driver);
		HumanityMenu.clickSettings(driver);

		HumanitySettings.getLanguage(driver);
		HumanitySettings.inputLanguage(driver, "Romanian (machine)");

		HumanitySettings.clickSaveSettings(driver);

		return false;
	}

	public static boolean testTimeFormat() { // testiranje promene vremenskog formata
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

		HumanityMenu.getSettings(driver);
		HumanityMenu.clickSettings(driver);

		HumanitySettings.getTimeFormat(driver);
		HumanitySettings.inputTimeFormat(driver, "24 hour");

		HumanitySettings.clickSaveSettings(driver);

		return false;
	}

	public static boolean testAll() { // testiranje promene vremenskog formata
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
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityMenu.getSettings(driver);
		HumanityMenu.clickSettings(driver);

		HumanitySettings.getCountry(driver);
		HumanitySettings.inputCountry(driver, "Pakistan");

		HumanitySettings.getLanguage(driver);
		HumanitySettings.inputLanguage(driver, "Polish (machine)");

		HumanitySettings.getTimeFormat(driver);
		HumanitySettings.inputTimeFormat(driver, "24 hour");

		HumanitySettings.clickSaveSettings(driver);

		return false;
	}

}
