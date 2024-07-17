package Run;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.LibGlobal;
import Excel.ExcelUtils;
import PreExecution.Dashboard;

public class TestRun extends LibGlobal{

	@BeforeTest
	public static void beforeTest() {
		
		compatible_Browser();

		initElements();

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public static void f1(String INDEX, String mobile_number, String mpin1, String mpin2, String mpin3, String mpin4)
			throws Exception {

//		driver.get("https://sitsecure.novactech.net/");

//		Dashboard dash = new Dashboard();

		Dashboard.LoginPage(INDEX, mobile_number, mpin1, mpin2, mpin3, mpin4);
//		
//		
	}

}
