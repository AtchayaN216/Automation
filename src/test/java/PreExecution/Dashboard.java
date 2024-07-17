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
		System.out.println(windowHandle + "windowHandle");
		WebElement FDOffercard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getFD_OfferCard()));
		FDOffercard.click();
		Thread.sleep(10000);
		getWindowHandles(windowHandle);

		WebElement DigitalFDOffercard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getDigitalFD_OfferCard()));
		DigitalFDOffercard.click();
		Thread.sleep(10000);
		getWindowHandles(windowHandle);

//		WebElement FIPOffercard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getFIP_OfferCard()));
//		FIPOffercard.click();
//		WebElement twoWheelerCard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getTwoWheeler_offerCard()));
//		twoWheelerCard.click();
//		WebElement personalLoanCard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getPersonalLoan_offercard()));
//		personalLoanCard.click();
//		WebElement goldLoanCard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getGoldLoan_Offercard()));
//		goldLoanCard.click();
//		WebElement FourWheelerCard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getFourWheeler_offerCard()));
//		FourWheelerCard.click();
//		WebElement businessLoanCard = wait.until(ExpectedConditions.visibilityOf(Xpath_sfl.getInstance().getBusinessLoan_offerCard()));
//		businessLoanCard.click();

	}

//		if (Page_URL.contains("https://sitsfl.stfc.in/")) {
//
//			System.out.println(Page_URL + "user sucessfully landed");
//
//		} else {
//
//			System.out.println("user hit the  wrong domain");
//		}

//		Thread.sleep(2000);
//		Actions actions = new Actions(driver);
//		WebElement fd_OfferCard = Xpath_sfl.getInstance().getFD_OfferCard();
//		actions.moveToElement(fd_OfferCard).perform();
//		Thread.sleep(1000);
//		btnClick(Xpath_sfl.getInstance().getFD_OfferCard());

}
