package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pompackage.pomlogin;
import testdata.excelsheet;

public class LoginTest extends Baseclass {
	pomlogin pomlog;
	
public LoginTest() {
	super();
	
}

@BeforeMethod
public void initsetup() {
	initiation();
	pomlog=new pomlogin();
	
}
@DataProvider 
public Object[][]info(){
Object result[][]=excelsheet.readdata("Sheet1");
return result;
}
@DataProvider
public Object[][]info2(){
Object result[][]=excelsheet.readdata("Sheet2");
return result;
}

@Test //Login_TC16
public void emailblank()  {
	pomlog.accandlists();
	pomlog.continuebtn();
	}

//Login_TC17
@Test (dataProvider="info2")
public void emailnotreg(String username,String password) {
	pomlog.accandlists();
	pomlog.typeusername(username);
	pomlog.continuebtn();
	pomlog.messagecheck();} //assert implemented

//Login_TC18
@Test (dataProvider="info")
public void emailinvalid(String username,String password) {
	pomlog.accandlists();
	pomlog.typeusername(username);
	pomlog.continuebtn();
}

@Test //Login_TC19
public void emailvalid() {
	pomlog.accandlists();
	pomlog.typeusername(prop.getProperty("username"));
	pomlog.continuebtn();
}
@Test //Login_TC20
public void passwblank() {
	pomlog.accandlists();
	pomlog.typeusername(prop.getProperty("username"));
	pomlog.continuebtn();
	pomlog.signin();
	pomlog.passwmiss(); //assert implemented
}
//Login_TC21
@Test (dataProvider="info2")
public void passwinvalid(String username,String password) {
	pomlog.accandlists();
	pomlog.typeusername(prop.getProperty("username"));
	pomlog.continuebtn();
	pomlog.typepassword(password);
	pomlog.signin();
	pomlog.passwincorrect();//assert
}
@Test //Login_TC22
public void passwvalid() {
	pomlog.accandlists();
	pomlog.typeusername(prop.getProperty("username"));
	pomlog.continuebtn();
	pomlog.typepassword(prop.getProperty("password"));
	pomlog.checkbox();
	pomlog.signin();
	//pomlog.storecookie();
	
}
//Login_TC23
@Test 
public void checkbox () {
	pomlog.accandlists();
	pomlog.typeusername(prop.getProperty("username"));
	pomlog.continuebtn();
	pomlog.typepassword(prop.getProperty("password"));
	pomlog.checkbox();
	pomlog.signin();
	pomlog.opentab();
	}


@AfterMethod
public void quit() {
	driver.quit();
}



}
