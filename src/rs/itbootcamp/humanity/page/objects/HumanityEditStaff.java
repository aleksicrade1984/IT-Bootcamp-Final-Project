package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {

	private static final String EMPLOYEE_XPATH = "//a[contains(text(),'Pera Peric')]";
	private static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PHOTO_XPATH = "//input[@id='fileupload']";
	private static final String IMG_PATH = "C:\\Users\\Rade\\Desktop\\slika.jpg"; 
	private static final String CHANGE_NICK_NAME_XPATH = "//input[@id='nick_name']";
	private static final String SAVE_EMPLOYEE_XPATH = "//[@name='update']";

	public static WebElement getEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_XPATH));
	}

	public static void clickEmployee(WebDriver driver) {
		getEmployee(driver).click();
	}

	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}

	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}

	public static WebElement getUploadPhoto(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PHOTO_XPATH));

	}

	public static void clickUploadPhoto(WebDriver driver) {
		getUploadPhoto(driver).click();
	}

	public static void sendPhoto(WebDriver driver) throws Exception {
		getUploadPhoto(driver).sendKeys(IMG_PATH);
		Thread.sleep(3000);

	}

	public static WebElement getChangeNickName(WebDriver driver) {
		return driver.findElement(By.xpath(CHANGE_NICK_NAME_XPATH));
	}

	public static void clickChangeNickName(WebDriver driver) {
		getChangeNickName(driver).click();
	}

	public static void inputChangeNickName(WebDriver driver, String data) {
		getChangeNickName(driver).sendKeys(data);
	}

	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

}
