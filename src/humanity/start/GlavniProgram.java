package humanity.start;

import humanity.page.tests.HumanityAddNewEmployeeTests;
import humanity.page.tests.HumanityLoginTests;

public class GlavniProgram {

	public static void main(String[] args) {
		try {
			HumanityLoginTests.testLogin();
			HumanityAddNewEmployeeTests.testAdd();
		} catch (Exception ex) {

			System.out.println(ex);
		} finally {
			System.out.println("Svi testovi su prosli");
		}
	}

}
