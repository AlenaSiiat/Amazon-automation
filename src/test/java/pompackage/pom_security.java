package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class pom_security extends Baseclass {

	@FindBy(id="auth-cnep-edit-name-button") WebElement editname;
	@FindBy(id="ap_customer_name") WebElement newname;
	@FindBy(id="cnep_1C_submit_button") WebElement savebtn;
	@FindBy(id="auth-cnep-edit-email-button") WebElement editmail;
	@FindBy(xpath="//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]") WebElement newmail;
	@FindBy(name="cvf_action") WebElement continuebtn;
	@FindBy(id="auth-cnep-edit-password-button") WebElement editpass;
	@FindBy(id="ap_password") WebElement currentpass;
	@FindBy(id="ap_password_new") WebElement newpass;
	@FindBy(id="ap_password_new_check") WebElement newpasscheck;
	@FindBy(id="cnep_1D_submit_button") WebElement savechangebtn;
	@FindBy(id="auth-cnep-add-phone-button") WebElement editphone;
	@FindBy(id="ap_phone_number")  WebElement newphone;
	
pom_youraccount log=new pom_youraccount();	
	
public	pom_security() {
	PageFactory.initElements(driver,this);
}


public void login() {
	log.login();
	
	
}

public void updatename() {
	log.accandlists.click();
	log.logandsec.click();
	editname.click();
	newname.clear();
	newname.sendKeys("Alena");
	savebtn.click();

}
public void updateemail() {
	//editmail.click(); 
	//newmail.sendKeys("asiiatskaia+1@gmail.com");
	//continuebtn.click();
	
	
}
public void updatepass() {
	editpass.click();
	currentpass.sendKeys(prop.getProperty("password"));
	newpass.sendKeys(prop.getProperty("password"));
	newpasscheck.sendKeys(prop.getProperty("password")); 
	savechangebtn.click();
}

public void editphone() {
	editphone.click();
	newphone.sendKeys("+1647216204400");
}

}
