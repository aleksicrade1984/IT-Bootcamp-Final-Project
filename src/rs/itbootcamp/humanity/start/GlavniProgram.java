package rs.itbootcamp.humanity.start;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityEditStaffTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;
import rs.itbootcamp.humanity.page.tests.HumanityTourTests;
import rs.itbootcamp.humanity.page.tests.HumanityVersionTest;

public class GlavniProgram {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int br;
		do {
			System.out.println("*****MENU*****");
			System.out.println("");
			System.out.println("1- Test Login");
			System.out.println("2- Test Login using Excel");
			System.out.println("3- Test Logout");
			System.out.println("4- Test Add New Employee");
			System.out.println("5- Test Add New Employees using Excel");
			System.out.println("6- Test Settings - Change Language");
			System.out.println("7- Test Settings - Change Country");
			System.out.println("8- Test Settings - Change Time Format");
			System.out.println("9- Test Settings - Change All (Language, Country and Time Format)");
			System.out.println("10- Test Edit Staff- Upload Photo");
			System.out.println("11- Test Edit Staff- Change Nickname");
			System.out.println("12- Virtual Tour");
	//		System.out.println("12- Version");
			System.out.println("0- Exit");
			br = sc.nextInt();
			switch (br) {
			case 1:
				HumanityLoginTests.testLogin();
				break;
			case 2:
				HumanityLoginTests.testLoginExcel();
				break;
			case 3:
				HumanityLoginTests.testLogOut();
				break;
			case 4:
				HumanityAddNewEmployeeTests.testAddEmployee();
				break;
			case 5:
				HumanityAddNewEmployeeTests.testAddEmployeeExcel();
				break;
			case 6:
				HumanitySettingsTests.testLanguage();
				break;
			case 7:
				HumanitySettingsTests.testCountry();
				break;
			case 8:
				HumanitySettingsTests.testTimeFormat();
				break;
			case 9:
				HumanitySettingsTests.testSettingsAll();
				break;
			case 10:
				HumanityEditStaffTests.testUploadPhoto();
				break;
			case 11:
				HumanityEditStaffTests.testNickName();
				break;
			case 12:
				HumanityTourTests.testVirtualTour();
				System.out.println("Thank you. Have a nice day!");
				break;
			case 13:
				HumanityVersionTest.testVersion();
			case 0:
				System.out.println("Thank you for using our test program. ");
				break;
			default:
				System.out.println("Bad choice. Please choose beetween 1 and 12");
			}
		} while (br != 0);

	}

}
