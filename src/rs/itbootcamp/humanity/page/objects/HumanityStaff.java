package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL_STAFF = "https://peraperic6.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEE_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_XPATH = "//input[@id='_asf";
	private static final String LAST_NAME_XPATH = "//input[@id='_asl";
	private static final String EMAIL_XPATH = "//input[@id='_ase";
	private static final String ENDING_XPATH = "']";
	private static final String SAVE_EMPLOYEE_XPATH = "//button[@id='_as_save_multiple']";
	private static final String OPEN_EMPLOYEE_XPATH = "//a[@class='staff-employee']";

	public static WebElement getAddEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH));
	}

	public static void clickAddEmployee(WebDriver driver) {
		getAddEmployee(driver).click();
	}

	public static WebElement getFirstName(WebDriver driver, int br) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH + br + ENDING_XPATH));
	}

	public static void setFirstName(WebDriver driver, int br, String name) {
		getFirstName(driver, br).sendKeys(name);

	}

	public static WebElement getLastName(WebDriver driver, int br) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH + br + ENDING_XPATH));
	}

	public static void setLastName(WebDriver driver, int br, String lastName) {
		getLastName(driver, br).sendKeys(lastName);
	}

	public static WebElement getEmail(WebDriver driver, int br) {
		return driver.findElement(By.xpath(EMAIL_XPATH + br + ENDING_XPATH));
	}

	public static void setEmail(WebDriver driver, int br, String email) {
		getEmail(driver, br).sendKeys(email);

	}

	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

	public static WebElement getOpenEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(OPEN_EMPLOYEE_XPATH));
	}

	public static void clickOpenEmployee(WebDriver driver) {
		getOpenEmployee(driver).click();
	}

}
