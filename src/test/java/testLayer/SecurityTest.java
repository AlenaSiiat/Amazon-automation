package testLayer;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pompackage.pom_security;
import utility.TimeUtils;

public class SecurityTest extends Baseclass{

	
	public SecurityTest() {
		super();
	}
	pom_security pom;
	
@BeforeMethod
public void initsetup() {
	initiation();
	pom=new pom_security();
	pom.login();
	}
	
//Login and Security_TC42
@Test
public void logininfo() {
	pom.updatename();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time));
	pom.updatepass();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time));
	pom.editphone();
}

@AfterMethod
public void quit() {
	driver.quit();
}
	
}
