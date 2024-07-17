package xpaths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Xpath_sfl {

	private static Xpath_sfl xpathsPageInstance;

	private Xpath_sfl() {

	}

	public static Xpath_sfl getInstance() {
		if (xpathsPageInstance == null) {

			xpathsPageInstance = new Xpath_sfl();
		}
		return xpathsPageInstance;
	}

//************************************Login **********************************

	@FindBy(xpath = "//input[@id='cusMobNo']")
	private WebElement mobileNum;

	public WebElement getMobileNum() {
		return mobileNum;
	}

	@FindBy(xpath = "//button[@id='loginWithMPINSubmit']")
	private WebElement Loginmpin;

	public WebElement getLoginmpin() {
		return Loginmpin;
	}

	@FindBy(xpath = "//input[@id='entMpinCode1']")
	private WebElement mpinBox1;

	public WebElement getMpinBox1() {
		return mpinBox1;

	}

	@FindBy(xpath = "//input[@id='entMpinCode2']")
	private WebElement mpinBox2;

	public WebElement getMpinBox2() {
		return mpinBox2;
	}

	@FindBy(xpath = "//input[@id='entMpinCode3']")
	private WebElement mpinBox3;

	public WebElement getMpinBox3() {
		return mpinBox3;
	}

	@FindBy(xpath = "//input[@id='entMpinCode4']")
	private WebElement mpinBox4;

	public WebElement getMpinBox4() {
		return mpinBox4;
	}

	@FindBy(xpath = "//button[@id='loginVerifyMPIN']")
	private WebElement verify;

	public WebElement getVerify() {
		return verify;
	}

	@FindBy(xpath = "(//div[@class='msgclose cursor-pointer'])[5]")
	private WebElement closebtn;
	

	public WebElement getClosebtn() {
		return closebtn;
	}

	//
//	
//	
//	
//	
//	
/////	***********************************My Offers************************
//
	@FindBy(xpath = "(//a[@class='fd_offers bannerCard-link fd_redirect_offers fd_offers'])[1]")
	private WebElement FD_OfferCard;

	public WebElement getFD_OfferCard() {
		return FD_OfferCard;
	}

	@FindBy(xpath = "(//a[@id='Fd_Resume_now'])[4]")
	private WebElement DigitalFD_OfferCard;

	public WebElement getDigitalFD_OfferCard() {
		return DigitalFD_OfferCard;
	}

	@FindBy(xpath = "(//a[@id='FIP_Resume_now'])[1]")
	private WebElement FIP_OfferCard;

	public WebElement getFIP_OfferCard() {
		return FIP_OfferCard;
	}

	@FindBy(xpath = "(//a[@id='twClaimBtn'])[1]")
	private WebElement twoWheeler_offerCard;

	public WebElement getTwoWheeler_offerCard() {
		return twoWheeler_offerCard;
	}

	@FindBy(xpath = "(//a[@id='plClaimBtn'])[2]")
	private WebElement personalLoan_offercard;

	public WebElement getPersonalLoan_offercard() {
		return personalLoan_offercard;
	}

	@FindBy(xpath = "(//a[@id='glClaimBtn'])[2]")
	private WebElement goldLoan_Offercard;

	public WebElement getGoldLoan_Offercard() {
		return goldLoan_Offercard;
	}

	@FindBy(xpath = "(//a[@id='fwClaimBtn'])[2]")
	private WebElement fourWheeler_offerCard;

	public WebElement getFourWheeler_offerCard() {
		return fourWheeler_offerCard;
	}

	@FindBy(xpath = "(//a[@id='blClaimBtn'])[2]")
	private WebElement businessLoan_offerCard;

	public WebElement getBusinessLoan_offerCard() {
		return businessLoan_offerCard;
	}

//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	

}
