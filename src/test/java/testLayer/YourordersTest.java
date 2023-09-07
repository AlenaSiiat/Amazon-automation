package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pompackage.pom_yourorders;

public class YourordersTest extends Baseclass{
	
public YourordersTest() {
	super();
}
pom_yourorders pom;

@BeforeMethod
public void initsetup() {
	initiation();
	pom=new pom_yourorders();
	pom.login();
}

//Your orders_TC38
@Test
public void orderhistory () {
	pom.verifypastorders();
}
//Your orders_TC39,Your orders_TC40,Your orders_TC41
@Test
public void verifyoptions() {
	pom.verifybuyagain();
	pom.verifynotshipped();
	pom.verifycancelled();
}

@AfterMethod
public void quit() {
	driver.quit();
}


}
