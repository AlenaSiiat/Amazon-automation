package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.Baseclass;

public class pom_yourorders extends Baseclass {

	@FindBy(id="time-filter") WebElement dropdown;
	@FindBy(id="orderFilter") WebElement dropdown2;
	@FindBy(xpath="//div[starts-with(@class,'a-section a-spacing-top-medium a-text-center')]") WebElement noordersmessage;
	@FindBy(linkText="Buy Again") WebElement buyagain;
	@FindBy(xpath="//span[contains(text(),'There are no recommended items for you to buy again at this time.')]") WebElement recitems;
	@FindBy(linkText="Not Yet Shipped") WebElement notshipped;
	@FindBy(xpath="//div[contains(text(),'Looking for an order?')]") WebElement nordersmessage;
	@FindBy(linkText="Cancelled Orders") WebElement cancelled;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='yourOrders']/div[@id='yourOrdersContent']/div[@id='ordersContainer']/div[1]/div[1]") WebElement cancelmessage;
	
	pom_youraccount log=new pom_youraccount();
	
public pom_yourorders() {
	PageFactory.initElements(driver,this);
}

public void login() {
	log.login();
	log.accandlists.click();
	
}

public void verifypastorders() {
	log.yourorders.click();
	Select drp=new Select(dropdown);
	drp.selectByValue("months-3");
	String a=noordersmessage.getText();
	System.out.println(a);
	drp.selectByValue("last30");
	String b=noordersmessage.getText();
	System.out.println(b);
	Select drp2=new Select(dropdown2);
	drp2.selectByValue("year-2023");
	String c=noordersmessage.getText();
	System.out.println(c);
	
}
public void verifybuyagain() {
	log.yourorders.click();
	buyagain.click();
	String a=recitems.getText();
	System.out.println(a);
}
public void verifynotshipped() {

	notshipped.click();
	String a=nordersmessage.getText();
	System.out.println(a);
}
public void verifycancelled() {

	cancelled.click();
	String a=cancelmessage.getText();
	System.out.println(a);
}




}
