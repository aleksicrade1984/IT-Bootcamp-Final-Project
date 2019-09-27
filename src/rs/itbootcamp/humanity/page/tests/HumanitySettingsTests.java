package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTests {
	public static boolean testCountry() throws InterruptedException { // testiranje promene drzave
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
		HumanitySettings.inputCountry(driver, "Senegal");
		HumanitySettings.clickSaveSettings(driver);
		Thread.sleep(5000);
		return false;
	}

	public static boolean testLanguage() throws InterruptedException { // testiranje promene jezika
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
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanitySettings.getLanguage(driver);
		HumanitySettings.inputLanguage(driver, "Serbian (machine)");
		HumanitySettings.clickSaveSettings(driver);
		Thread.sleep(5000);
		return false;
	}

//testiranje promene TimeFormata 
	public static boolean testTimeFormat() throws InterruptedException { // testiranje promene vremenskog formata
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
		HumanitySettings.inputTimeFormat(driver, "12 hour");
		HumanitySettings.clickSaveSettings(driver);
		Thread.sleep(5000);
		return false;
	}

	public static boolean testSettingsAll() throws InterruptedException { // testiranje promene vremenskog formata
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		if (driver.getCurrentUrl().contains(HumanityHome.URL) == false) {
		}
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityHome.clickEmail(driver);
		HumanityHome.getEmail(driver).sendKeys("peraperic@temp-link.net");
		HumanityHome.clickPassword(driver);
		HumanityHome.getPassword(driver).sendKeys("Aleksic1984");
		HumanityHome.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityMenu.getSettings(driver);
		HumanityMenu.clickSettings(driver);
		HumanitySettings.getCountry(driver);
		HumanitySettings.inputCountry(driver, "Portugal");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanitySettings.getLanguage(driver);
		HumanitySettings.inputLanguage(driver, "German (machine)");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanitySettings.getTimeFormat(driver);
		HumanitySettings.inputTimeFormat(driver, "24 hour");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanitySettings.clickSaveSettings(driver);
		Thread.sleep(5000);
		driver.quit();

		return false;
	}

}
