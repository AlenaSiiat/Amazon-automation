package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pompackage.pom_youraddress;
import testdata.excelsheet;

public class YouraddrTest extends Baseclass{

	public YouraddrTest() {
		super();
	}

	pom_youraddress pom;
	
@BeforeMethod
public void initsetup() {
	initiation();
	pom=new pom_youraddress();
	pom.login();
}
@DataProvider 
public Object[][]data(){
Object result[][]=excelsheet.readdata("Sheet3");
return result;
}

//Your addresses_TC26
@Test
public void addresswindowblank () {
pom.addaddress();
}

//Your addresses_TC27
@Test
public void addresswindowcountry() {
	pom.verifycountry();
}

//Your addresses_TC28
@Test 
public void addresswindownamevalid () {
	pom.typefullname();
}
//Your addresses_TC29
@Test
public void addresswindowphoneinvalid () { 
	pom.typephone();
}
//Your addresses_TC30
@Test
public void addresswindowphonevalid () {
	pom.typephoneval();
}
//Your addresses_TC31
@Test
public void addresswindowaddress () {
	pom.typeaddress();
}

//Your addresses_TC32
@Test
public void addresswindowcity () {
	pom.typecity();
}
//Your addresses_TC33
@Test
public void addresswindowcityinv () {
	pom.typecityinv();
}

//Your addresses_TC34
@Test
public void addresswindowpostalvalid () {
	pom.typepostal();
}
//Your addresses_TC35
@Test
public void addresswindowpostalinvalid () {
	pom.typepostalinv();
}
//Your addresses_TC36
@Test
public void addresswindow() {
	pom.typeaddresswindow();
}
//Your addresses_TC37
@Test
public void addresswindowformat() {
	pom.typeaddresswindowformat();
}



@AfterMethod
public void quit() {
	driver.quit();
}
}
