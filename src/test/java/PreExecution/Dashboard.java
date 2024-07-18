package PreExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.LibGlobal;

import xpaths.Xpath_sfl;

public class Dashboard extends LibGlobal {

	public static void LoginPage(String INDEX, String mobile_number, String mpin1, String mpin2, String mpin3,
			String mpin4) throws Exception {
		loadUrl("https://sitsecure.novactech.net/");
		getPageUrl();

		Thread.sleep(2000);

//			System.out.println("print Mobile:"+mobile);

		Xpath_sfl.getInstance().getMobileNum().sendKeys(mobile_number);
		Xpath_sfl.getInstance().getLoginmpin().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Mpin1 = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getMpinBox1()));
		Mpin1.sendKeys(mpin1);
		WebElement Mpin2 = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getMpinBox2()));
		Mpin2.sendKeys(mpin2);
		WebElement Mpin3 = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getMpinBox3()));
		Mpin3.sendKeys(mpin3);
		WebElement Mpin4 = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getMpinBox4()));
		Mpin4.sendKeys(mpin4);

		WebElement verifyBtn = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getVerify()));
		verifyBtn.click();

		WebElement closebtn = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getClosebtn()));
		closebtn.click();

		String windowHandle = driver.getWindowHandle();
		// System.out.println(windowHandle + "windowHandle");
		WebElement FDOffercard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getFD_OfferCard()));
		FDOffercard.click();
		Thread.sleep(10000);
		getWindowHandles(windowHandle);

		String windowHandle1 = driver.getWindowHandle();
		WebElement DigitalFDOffercard = wait
				.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getDigitalFD_OfferCard()));
		DigitalFDOffercard.click();
		// System.out.println(DigitalFDOffercard + windowHandle1 + "Check windows
		// handle");
		Thread.sleep(10000);
		getWindowHandles(windowHandle1);

		String windowHandle2 = driver.getWindowHandle();
		WebElement FIPOffercard = wait
				.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getFIP_OfferCard()));
		FIPOffercard.click();
		Thread.sleep(10000);
		getWindowHandles(windowHandle2);

		String windowHandle3 = driver.getWindowHandle();
		WebElement twoWheelerCard = wait
				.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getTwoWheeler_offerCard()));
		twoWheelerCard.click();
		Thread.sleep(10000);
		getWindowHandles(windowHandle3);

		WebElement rightArrow = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getRightArrow()));
		rightArrow.click();
		Thread.sleep(5000);

		String windowHandle4 = driver.getWindowHandle();
		WebElement personalLoanCard = wait
				.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getPersonalLoan_offercard()));
		personalLoanCard.click();
		Thread.sleep(10000);
		getWindowHandles(windowHandle4);

		WebElement rightArrow1 = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getRightArrow()));
		rightArrow1.click();
		Thread.sleep(5000);
		String windowHandle5 = driver.getWindowHandle();
		WebElement goldLoanCard = wait
				.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getGoldLoan_Offercard()));
		goldLoanCard.click();
		getWindowHandles(windowHandle5);

		WebElement rightArrow2 = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getRightArrow()));
		rightArrow2.click();
		Thread.sleep(5000);

		String windowHandle6 = driver.getWindowHandle();
		WebElement FourWheelerCard = wait
				.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getFourWheeler_offerCard()));
		FourWheelerCard.click();
		getWindowHandles(windowHandle6);

		WebElement rightArrow3 = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getRightArrow()));
		rightArrow3.click();
		Thread.sleep(5000);
		String windowHandle7 = driver.getWindowHandle();
		WebElement businessLoanCard = wait
				.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getBusinessLoan_offerCard()));
		businessLoanCard.click();
		Thread.sleep(5000);
		getWindowHandles(windowHandle7);

	}

}
