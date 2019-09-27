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

public class GlavniProgram {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int br, bro, broj;
		do {
			System.out.println("*****MENU*****");
			System.out.println("1- Manuel tests");
			System.out.println("2- Automation tests");
			System.out.println("3- Virtual Tour");
			System.out.println("0- Exit");
			br = sc.nextInt();
			switch (br) {
			case 1:
				do {
					System.out.println("1- Test Login");
					System.out.println("2- Test Logout");
					System.out.println("3- Test Add New Employee");
					System.out.println("4- Test Settings - Change Language");
					System.out.println("5- Test Settings - Change Country");
					System.out.println("6- Test Settings - Change Time Format");
					System.out.println("7- Test Settings - Change All (Language, Country and Time Format)");
					System.out.println("8- Test Edit Staff- Upload Photo");
					System.out.println("9- Test Edit Staff- Change Nickname");
					System.out.println("0- Exit");
					bro = sc.nextInt();
					switch (bro) {
					case 1:
						HumanityLoginTests.testLogin();
						break;
					case 2:
						HumanityLoginTests.testLogOut();
						break;
					case 3:
						HumanityAddNewEmployeeTests.testAddEmployee();
						break;
					case 4:
						HumanitySettingsTests.testLanguage();
						break;
					case 5:
						HumanitySettingsTests.testCountry();
						break;
					case 6:
						HumanitySettingsTests.testTimeFormat();
						break;
					case 7:
						HumanitySettingsTests.testSettingsAll();
						break;
					case 8:
						HumanityEditStaffTests.testUploadPhoto();
						break;
					case 9:
						HumanityEditStaffTests.testNickName();
						break;
					case 0:
						System.out.println("Thank you for using our test program.");
						break;
					default:
						System.out.println("Bad choice. Please choose beetween 1-9 to start an app or 0 to exit.");
						break;
					}
				} while (bro != 0);
				break;

			case 2:
				do {
					System.out.println("1- Test Login using Excel");
					System.out.println("2- Test Add New Employees using Excel");
					System.out.println("0- Exit");
					broj = sc.nextInt();
					switch (broj) {
					case 1:
						HumanityLoginTests.testLoginExcel();
						break;
					case 2:
						HumanityAddNewEmployeeTests.testAddEmployeeExcel();
						break;
					case 0:
						System.out.println("Thank you for using our test program.");
						break;
					default:
						System.out.println("Bad choice! Please choose 1 or 2 to start an app or 0 to exit. Thank you!");
						break;
					}
				} while (broj != 0);
				break;
			case 3:
				HumanityTourTests.testVirtualTour();
				System.out.println("Thank you for using our program. Have a wonderful day!");
				break;
			case 0:
				System.out.println("Thank you for using our program. Have a wonderful day!");
				break;
			default:
				System.out.println("Bad choice! Please choose from 1-3 to start an app or 0 to exit. Thank you!");
				break;
			}
		} while (br != 0);

	}
}
