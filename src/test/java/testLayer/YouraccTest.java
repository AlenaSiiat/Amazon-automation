package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pompackage.pom_youraccount;

public class YouraccTest extends Baseclass{
	pom_youraccount pom;

	public YouraccTest() {
		super();//we've called parent's class constructor (BaseClass)with the help of this word
		//it will read the properties of config.properties file
	}
	
@BeforeMethod
public void initsetup() {
	initiation();
	pom=new pom_youraccount();
	pom.login();
}
	
//Your account_TC24
@Test 
public void youraccountinfo() {
	pom.verify();	
}	
//Your addresses_TC25
@Test
public void navigation() {

	pom.navigation();
}



@AfterMethod
public void quit() {
	driver.quit();
}
	
}
