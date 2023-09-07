package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pompackage.Pom_shoppingcart;

public class ShoppingcartTest extends Baseclass{

Pom_shoppingcart pom;
public ShoppingcartTest() {
	super();
	
}

@BeforeMethod
public void initsetup () {
	initiation();
	pom=new Pom_shoppingcart();
	pom.login();	
}

//Shopping cart_TC66
@Test
public void shoppingcart () {
	pom.addoneitem();
	
}
//Shopping cart_TC67
@Test
public void shoppingcartprice () { 
	pom.pricechange();
}
//Shopping cart_TC68
@Test
public void shoppingcart_sameitem() { 
	pom.addsameitem();
}

//Shopping cart_TC69
@Test
public void shoppingcart_difitems() { 
	pom.add_dif_items();
}

//Shopping cart_TC70
@Test
public void shoppingcart_removeitems() throws InterruptedException {
	pom.removeitems();
}
//Shopping cart_TC71
@Test
public void shoppingcart_remove_allitems() {
	pom.removeall();
}
//Shopping cart_TC72
@Test
public void shoppingcart_productinfo() throws InterruptedException {
	pom.productinfo();
}
//Shopping cart_TC73
@Test
public void itemhold() {
	pom.itemhold();
	
}


@AfterMethod
public void quit() {
    driver.quit();
}

	
}
