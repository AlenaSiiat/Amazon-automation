package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.Select;
import basePackage.Baseclass;

public class pom_youraddress extends Baseclass {
	
	@FindBy(id="ya-myab-plus-address-icon") WebElement address;
	@FindBy(id="address-ui-widgets-form-submit-button") WebElement addressbtn;
	@FindBy(xpath="//div[contains(text(),'enter a name.')]") WebElement errorname;
	@FindBy(xpath="//div[contains(text(),'enter a phone number')]") WebElement errorphone;
	@FindBy(xpath="//div[contains(text(),'enter an address.')]") WebElement erroraddress;
	@FindBy(xpath="//select[@id='address-ui-widgets-countryCode-dropdown-nativeId']") WebElement country;
	@FindBy(id="address-ui-widgets-enterAddressFullName") WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement phone;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement streetaddress;
	@FindBy(id="address-ui-widgets-enterAddressLine2") WebElement unitnumber;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement city;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId") WebElement province;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement postalcode;
	@FindBy(id="address-ui-widgets-use-as-my-default") WebElement checkbox;
	@FindBy(xpath="//span[contains(text(),'Add preferences, notes, access codes and more')]") WebElement delivery;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[1]/div[2]/form[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/a[1]/span[1]/div[1]/div[1]/span[1]") WebElement instructions;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[1]/div[2]/form[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/span[1]/span[1]/span[1]/button[1]")  WebElement yessaturday;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[1]/div[2]/form[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/span[1]/span[1]/span[1]/button[1]") WebElement yessunday;
	@FindBy(xpath="//button[contains(text(),'House')]") WebElement house;
	@FindBy(xpath="//span[contains(text(),'Original Address:')]") WebElement originaladdress;
	@FindBy(xpath="//span[contains(text(),'Suggested Address:')]") WebElement suggestedaddress;
	
	pom_youraccount log=new pom_youraccount();
	
	public pom_youraddress () {
		PageFactory.initElements(driver,this);
	}
public void login () {
	
	log.login();
	log.accandlists.click();
	log.youraddress.click();
}	
public void addaddress() {
	address.click();
	addressbtn.click();
	String name=errorname.getText();
	String phone=errorphone.getText();
	String address=erroraddress.getText();
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(name,"Please enter a name.");
	softassert.assertEquals(phone,"Please enter a phone number so we can call if there are any issues with delivery.");
	softassert.assertEquals(address,"Please enter an address.");
	softassert.assertAll();
}
public void verifycountry() {
	address.click();
	String s=country.getText();
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(s,"Canada");
	Select drpCountry=new Select(country);
	drpCountry.selectByVisibleText("Dominican Republic");
	log.accandlists.click();
	log.youraddress.click();
	address.click();
	String m=country.getText();
	softassert.assertEquals(m,"Canada");
	
}
public void typefullname() {
	address.click();
	fullname.sendKeys("Alex Smith");
	addressbtn.click();
}
public void typephone() {
	address.click();
	phone.sendKeys("+164721620448888");
	addressbtn.click();
}
public void typephoneval() {
	address.click();
	phone.sendKeys("+16472162044");
	addressbtn.click();
}
public void typeaddress () {
	address.click();
	streetaddress.sendKeys("Royal Colwood");
	unitnumber.sendKeys("26");
	addressbtn.click();
}
public void typecity () {
	address.click();
	city.sendKeys("Toronto");
	Select drpProvince=new Select(province);
	drpProvince.selectByVisibleText("Ontario");
	addressbtn.click();
}
public void typecityinv () {
	address.click();
	city.sendKeys("Toronto");
	Select drpProvince=new Select(province);
	drpProvince.selectByVisibleText("Quebec");
	addressbtn.click();
}
public void typepostal() {
	address.click();
	postalcode.sendKeys("L4K 2J3");
	addressbtn.click();
}

public void typepostalinv() {
	address.click();
	postalcode.sendKeys("L4K 2J300VD");
	addressbtn.click();
}

public void typeaddresswindow() {
	address.click();
	fullname.sendKeys("Alex Smith");
	phone.sendKeys("+16472162044");
	streetaddress.sendKeys("Royal Colwood");
	city.sendKeys("Toronto");
	Select drpProvince=new Select(province);
	drpProvince.selectByVisibleText("Ontario");
	postalcode.sendKeys("L4K 2J3");
	checkbox.click();
	delivery.click();
	house.click();
	instructions.click();
	yessaturday.click();
	yessunday.click();
	addressbtn.click();
}
public void typeaddresswindowformat() {
	address.click();
	fullname.sendKeys("Alex Smith");
	phone.sendKeys("+16472162044");
	streetaddress.sendKeys("Royal Colwood");
	city.sendKeys("Toronto");
	Select drpProvince=new Select(province);
	drpProvince.selectByVisibleText("Ontario");
	postalcode.sendKeys("L4K 2J3");
	checkbox.click();
	delivery.click();
	house.click();
	instructions.click();
	yessaturday.click();
	yessunday.click();
	addressbtn.click();
	boolean a=	originaladdress.isDisplayed();
	System.out.println(a);
	boolean b=suggestedaddress.isDisplayed();
	System.out.println(b);
	if (a==true && b==true) {
		System.out.println("Actual result: A suggestion for right address format and a choice to select are provided.");
	}
	else {System.out.println("Not as expected"); 
	}
}




}
