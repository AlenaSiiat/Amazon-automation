package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import basePackage.Baseclass;

public class pom_youraccount extends Baseclass {

	@FindBy(id="nav-link-accountList-nav-line-1") WebElement accandlists;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement yourorders;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]") WebElement logandsec;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement youraddress;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(4) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span") WebElement customerserv;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span") WebElement yourpaym;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(3) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span") WebElement prime;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(3) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement gift;
	@FindBy(linkText="Your Recommendations") WebElement recs;

	Actions action=new Actions(driver);
	pomlogin pomlog=new pomlogin();
	
public 	pom_youraccount() {
	PageFactory.initElements(driver, this);/*init.Elemens-static method which used to initialize all WebElmements
	 located at @FindBy, otherwise you can't access them */
	//driver is coming from our parent-base class	
	//"this" keyword converts local variables to global:values will be passed to the driver and it will interact with WebElements
}
	
public void login () {
	
	accandlists.click();
	pomlog.username.sendKeys(prop.getProperty("username"));
	pomlog.continuebtn();
	pomlog.password.sendKeys(prop.getProperty("password"));
	pomlog.checkbox();
	pomlog.signin();

}
	
public void verify() {
		
String message=accandlists.getText();
SoftAssert softassert=new SoftAssert();
softassert.assertEquals(message, "Hello, Alena*!Siia567");
accandlists.click();
boolean a=	yourorders.isDisplayed();
System.out.println(a);
boolean b=logandsec.isDisplayed();
System.out.println(b);
boolean c=youraddress.isDisplayed();
System.out.println(c);
boolean d=customerserv.isDisplayed();
System.out.println(d);
boolean e =yourpaym.isDisplayed();
System.out.println(e);
boolean f=prime.isDisplayed();
System.out.println(f);
boolean g=gift.isDisplayed();
System.out.println(g);
action.moveToElement(accandlists).build().perform();
action.moveToElement(recs).build().perform();
recs.click();
	
	}

public void navigation () {
	accandlists.click();
	youraddress.click();
	
}

}
