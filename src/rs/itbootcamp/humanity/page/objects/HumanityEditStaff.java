package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {

	private static final String EMPLOYEE_XPATH = "//a[contains(text(),'Pera Peric')]";
	private static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PHOTO_XPATH = "//input[@id='fileupload']";
	private static final String BROWSE = "image";
	private static final String IMG_PATH = "C:\\Users\\Rade\\Desktop\\Rade.jpeg";
	private static final String CHANGE_NAME_XPATH = "//input[@id='first_name']";
	private static final String SAVE_EMPLOYEE_XPATH = "//input[@name='update']";

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

	/*public static WebElement getUploadPhoto(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PHOTO_XPATH));
	}

	public static void clickUploadPhoto(WebDriver driver) {
		getUploadPhoto(driver).click();
	}

	public static WebElement getBrowse(WebDriver driver) {
		WebElement drive = driver.findElement(By.id(BROWSE));
		return drive;
	}

	public static void sendKeysBrowse(WebDriver driver) throws Exception {
		getBrowse(driver).sendKeys(IMG_PATH);

	}*/
	
	public static WebElement getUploadImg (WebDriver driver) {
		    return driver.findElement(By.xpath(UPLOAD_PHOTO_XPATH));
	}
	public static void inputUploadImg(WebDriver driver, String data) {
		getUploadImg(driver).sendKeys(data);
	}
//	  UploadImg.sendKeys("C:\\Users\\Rade\\Desktop\\Rade.jpeg");

	public static WebElement getChangeName(WebDriver driver) {
		return driver.findElement(By.xpath(CHANGE_NAME_XPATH));
	}

	public static void clickChangeName(WebDriver driver) {
		getChangeName(driver).click();
	}

	public static void inputChangeName(WebDriver driver, String data) {
		getChangeName(driver).sendKeys(data);
	}

	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

}
