package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {
	public static boolean testAdd() {
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

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		HumanityMenu.clickStaff(driver);
		HumanityMenu.getStaff(driver);

		HumanityStaff.clickAddEmployee(driver);
		HumanityStaff.clickFirstName(driver);
		HumanityStaff.getFirstName(driver).sendKeys("Jovan");
		HumanityStaff.clickLastName(driver);
		HumanityStaff.getLastName(driver).sendKeys("Petrovic");
		HumanityStaff.clickEmail(driver);
		HumanityStaff.getEmail(driver).sendKeys("jovan.petrovic@gmail.com");
		HumanityStaff.clickSaveEmployee(driver);
		return true;

	}

}
