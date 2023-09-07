package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Baseclass;
import pompackage.pom_homepage;

public class HomepageTest extends Baseclass{
	pom_homepage pom;
	
public HomepageTest() {
	super();
}	
	
@BeforeMethod
public void initsetup() {
	initiation();
	pom=new pom_homepage();
	pom.login();
}

//Guest account_TC43
@Test
public void productnavigation() {
	pom.navigatehomepage();
}

//Searching, Sorting, Filtering, Pagination_TC44
@Test
public void keywordsearch() {
	pom.searchbykeyword();
}
//Searching, Sorting, Filtering, Pagination_TC45
@Test
public void descriptiontextsearch() {
	pom.searchbydescription();
}

//Searching, Sorting, Filtering, Pagination_TC46
@Test
public void partialitemsearch() {
	pom.searchbypartialtext();
}

//Searching, Sorting, Filtering, Pagination_TC47
@Test
public void categorysearch() {
	pom.searchbycategory();
}
	
//Searching, Sorting, Filtering, Pagination_TC48
@Test
public void productinfo() {
	pom.verifyproductinfo();
}

//Searching, Sorting, Filtering, Pagination_TC49
@Test
public void numberofproducts() {
	pom.verifyproductsperpage();
}

//Searching, Sorting, Filtering, Pagination_TC50
@Test
public void pagination() {
    pom.verifypagination();
}

//Searching, Sorting, Filtering, Pagination_TC51
@Test
public void filternewarrival() throws InterruptedException {
	pom.filterbynewarrival();
}

//Searching, Sorting, Filtering, Pagination_TC52
@Test
public void filterrating() {
	pom.filterbyrating();
}

//Searching, Sorting, Filtering, Pagination_TC53
@Test
public void filterdeals() {
	pom.filterbydeals();

}

//Searching, Sorting, Filtering, Pagination_TC54
@Test
public void filterbybestseller() {
	pom.filterbybestseller();
}


//Searching, Sorting, Filtering, Pagination_TC55
@Test
public void filterbrand() throws InterruptedException {
	pom.filterbybrand();
	
}
//Searching, Sorting, Filtering, Pagination_TC56
@Test
public void filterprice()  {
	pom.filterbyprice();
	
}

//Searching, Sorting, Filtering, Pagination_TC57
@Test
public void filteravailability () {
	pom.filterbyavailability();
}

//Searching, Sorting, Filtering, Pagination_TC58
//This feature is not available


//Searching, Sorting, Filtering, Pagination_TC59,_TC60,_TC61,_TC62,_TC63
@Test
public void sorting() {
   pom.sorting();
}

//Searching, Sorting, Filtering, Pagination_TC64
@Test
public void sortfilter() {
	pom.sortfilter();
	}

//Searching, Sorting, Filtering, Pagination_TC65
@Test
public void sortfilterpagination() {
	pom.sortfilterpagination();
	
	}



@AfterMethod
public void quit() {
	driver.quit();
}
}
