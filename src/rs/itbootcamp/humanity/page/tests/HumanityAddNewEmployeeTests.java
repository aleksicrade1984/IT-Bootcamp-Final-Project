package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityAddNewEmployeeTests {
	//stavka 4 u glavnom meniju, Test Add New Employee
	public static boolean testAddEmployee() throws InterruptedException {
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
		HumanityStaff.clickAddEmployee(driver);
		HumanityStaff.getFirstName(driver, 1).sendKeys("Jovanka");
		HumanityStaff.getLastName(driver,1).sendKeys("Petrovic");
		HumanityStaff.getEmail(driver,1).sendKeys("jovancica.petrovic@gmail.com");
		HumanityStaff.clickSaveEmployee(driver);
		Thread.sleep(3000);
		driver.quit();
		return true;

	}
	//stavka 5 u glavnom meniju, Test Add New Employee using Excel
	public static boolean testAddEmployeeExcel() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityHome.clickEmail(driver);
		HumanityHome.getEmail(driver).sendKeys("peraperic@temp-link.net");
		HumanityHome.clickPassword(driver);
		HumanityHome.getPassword(driver).sendKeys("Aleksic1984");
		HumanityHome.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HumanityMenu.getStaff(driver);
		HumanityMenu.clickStaff(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HumanityStaff.getAddEmployee(driver);
		HumanityStaff.clickAddEmployee(driver);
		
		String DATA_SOURCE = "Data.xls";
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(1);
		for (int i=1; i <ExcelUtils.getRowNumber(); i++) {
			String name= ExcelUtils.getDataAt(i, 0);
			String lastName= ExcelUtils.getDataAt(i, 1);
			String email = ExcelUtils.getDataAt(i, 2);			
			HumanityStaff.getFirstName(driver,i).sendKeys(name);
			HumanityStaff.getLastName(driver, i).sendKeys(lastName);
			HumanityStaff.getEmail(driver, i).sendKeys(email);
		}
			HumanityStaff.clickSaveEmployee(driver);
			Thread.sleep(3000);
		
		driver.quit();
		return false;
		
		
	

}
}