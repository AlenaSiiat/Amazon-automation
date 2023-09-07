package pompackage;

import static org.testng.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basePackage.Baseclass;

public class pomlogin extends Baseclass {

@FindBy(id="nav-link-accountList-nav-line-1") WebElement accandlists;
@FindBy(id="ap_email") WebElement username;
@FindBy(id="continue") WebElement continuebtn;
@FindBy(id="ap_password") WebElement password;
@FindBy(name="rememberMe") WebElement checkbox;
@FindBy(id="signInSubmit") WebElement signinbtn;
@FindBy (xpath="//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span") WebElement message;
@FindBy (xpath="//*[@id=\"auth-password-missing-alert\"]/div/div") WebElement passwmiss;
@FindBy (xpath="//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span") WebElement passwincorrect;
@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span") WebElement signinbtn2;




public pomlogin() {

	PageFactory.initElements(driver,this);
}

public void typeusername(String name) {
	
username.sendKeys(name);
}
public void typepassword(String pass) {
	password.sendKeys(pass);
}
public void continuebtn () {
	continuebtn.click();
}
public void checkbox () {
	checkbox.click();
}
public void signin() {
	signinbtn.click();
}
public void accandlists() {
	Actions action=new Actions(driver);
	action.moveToElement(accandlists).build().perform();
	accandlists.click();
}
public void messagecheck() {
	String r=message.getText();
	System.out.println(r);
	assertEquals(r,"We cannot find an account with that e-mail address");
}
public void passwmiss() {
	String b=passwmiss.getText();
	System.out.println(b);
	assertEquals(b,"Enter your password");
}
public void passwincorrect() {
	String c=passwincorrect.getText();
	System.out.println(c);
	assertEquals(c,"Your password is incorrect");
}
public void signinbtn2() {
	signinbtn2.click();
}
public void opentab () {
	String originalWindow=driver.getWindowHandle();
	System.out.println(originalWindow);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get(prop.getProperty("url"));
	String newWindow=driver.getWindowHandle();
	System.out.println(newWindow);
	driver.switchTo().window(originalWindow).close();
	driver.switchTo().window(newWindow);
	accandlists();
	String actualtitle = driver.getTitle();
	String expectedtitle="Your Account";
	if(actualtitle.equalsIgnoreCase(expectedtitle))
		System.out.println("keep me sign in feature works");
	else System.out.println("User is signed out");
	}

}





