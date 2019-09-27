package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Objects;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityLoginTests {
	// stavka 1 u glavnom meniju, Test Login
	public static boolean testLogin() throws InterruptedException {
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
		if (driver.getCurrentUrl().contains(HumanityMenu.URL_FIRME) == false) {
			System.out.println("Login successful");
			driver.quit();
			return false;
		} else
			System.out.println("Login unsuccessful");
		Thread.sleep(5000);
		driver.quit();

		return true;
	}

//stavka 2 u glavnom meniju, Test Login using Excel
	public static boolean testLoginExcel() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		String DATA_SOURCE = "Data.xls";
		if (driver.getCurrentUrl().contains(HumanityHome.URL) == false) {
			return false;
		}

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		String email, password;
		email = ExcelUtils.getDataAt(1, 0);
		password = ExcelUtils.getDataAt(1, 1);

		HumanityHome.inputEmail(driver, email);
		HumanityHome.inputPassword(driver, password);
		HumanityHome.clickLoginButton(driver);
		if (driver.getCurrentUrl().contains(HumanityMenu.URL_FIRME) == false) {
			System.out.println("Login successful");
			driver.quit();
			return false;
		} else
			System.out.println("Login unsuccessful");
		Thread.sleep(5000);

		driver.quit();
		return true;
	}

	public static boolean testLogOut() throws InterruptedException {
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

		HumanityProfile.clickProfilePhoto(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityProfile.clickSignOut(driver);

		Thread.sleep(5000);
		driver.quit();

		return false;
	}
}
