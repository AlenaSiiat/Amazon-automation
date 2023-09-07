package pompackage;


import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import basePackage.Baseclass;
import utility.TimeUtils;

public class pom_homepage extends Baseclass{

	@FindBy(linkText="See all deals") WebElement dealslink;
	@FindBy(xpath="//span[contains(text(),'Clothing & Accessories')]") WebElement category;
	@FindBy(xpath="//div[contains(text(),'Hotouch Womens Cotton Button Down Shirt Casual Lon')]") WebElement product;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/span[1]/span[1]/a[1]/i[1]") WebElement rating;
	@FindBy(xpath="//tbody/tr[1]/td[2]/span[1]/span[2]") WebElement price;
	@FindBy(xpath="//h3[contains(text(),'Top reviews from Canada')]") WebElement reviews;
	@FindBy(xpath="//span[contains(text(),'Sign Out')]") WebElement signout;
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement accandlists;
	@FindBy(id="twotabsearchtextbox") WebElement search;
	@FindBy(id="nav-search-submit-button") WebElement submitbtn;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]") WebElement image;
	@FindBy(xpath="//span[contains(text(),'Motorola Moto E (2020) 32GB 6.2\" Display Canadian ')]") WebElement itemname;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/span[1]/span[2]/span[2]") WebElement itemprice;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/span[1]") WebElement itemrating;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(11) > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div:nth-child(2) > div > span:nth-child(2) > a > span") WebElement itemreviews;
	@FindBy(linkText="Next") WebElement nextbtn;
	@FindBy(id="s-result-sort-select") WebElement sorting;
	@FindBy(xpath="//span[contains(text(),'Last 30 days')]") WebElement filter30;
	@FindBy(xpath="//span[contains(text(),'Last 90 days')]") WebElement filter90;
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']") WebElement fourstar;
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-3']") WebElement threestar;
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-2']") WebElement twostar;
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-1']") WebElement onestar;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[7]/ul[2]/span[2]/li[1]/span[1]/a[1]/span[1]") WebElement deals;
	@FindBy(xpath="//span[contains(text(),'All Discounts')]") WebElement alldiscounts;
	@FindBy(xpath="//span[@class='a-expander-prompt']") WebElement seemore;
	@FindBy(xpath="//span[contains(text(),'Under $25')]") WebElement pricerange1;
	@FindBy(xpath="//span[contains(text(),'$25 to $50')]") WebElement pricerange2;
	@FindBy(xpath="//span[contains(text(),'$50 to $100')]") WebElement pricerange3;
	@FindBy(xpath="//span[contains(text(),'$100 to $200')]") WebElement pricerange4;
	@FindBy(xpath="//span[contains(text(),'$200 & Above')]") WebElement pricerange5;
	@FindBy(xpath="//span[contains(text(),'Include Out of Stock')]") WebElement availability;
	@FindBy(xpath="//span[contains(text(),'Bestsellers') and @class='nav-a-content']") WebElement BestSeller;
	
	
	
pom_youraccount log=new pom_youraccount();	
Actions act=new Actions(driver);

public	pom_homepage () {
	PageFactory.initElements(driver,this);
}

public void login() {
	log.login();
	
	
}
public void navigatehomepage() {
	act.moveToElement(accandlists).build().perform();
	act.moveToElement(signout).build().perform();
	signout.click();
	driver.get(prop.getProperty("url"));
	JavascriptExecutor js=(JavascriptExecutor)driver; //an interface which provides methods to scroll up/down and left/right
 //1.method to scroll to the element; 2.location of the element
    js.executeScript("arguments[0].scrollIntoView()", dealslink);
    dealslink.click();
    category.click();
    product.click();
    boolean a= rating.isDisplayed();
    System.out.println(a+" "+"Rating is displayed");
    boolean b= price.isDisplayed();
    System.out.println(b+" "+"Price is displayed");
    js.executeScript("arguments[0].scrollIntoView()",reviews);
    boolean c =reviews.isDisplayed();
    System.out.println(c+" "+"Reviews are displayed");
    
}

public void searchbykeyword() {
	search.sendKeys("cat");
	submitbtn.click();
	String actualtitle=driver.getTitle();
	String expectedtitle="Amazon.ca : cat";
	System.out.println(actualtitle);
	Assert.assertEquals(actualtitle, expectedtitle,"Product search title is correct");
	List<WebElement> productlinks=driver.findElements(By.xpath("//span[contains(text(),'cat')]"));
	System.out.println(productlinks.size());
	
	WebElement q;
	for (int i=0; i<productlinks.size();i++)  
	  {
		  q=productlinks.get(i);
		  System.out.println("Search Results"+" "+q.getText());
	  } 
	
}
public void searchbydescription() {
	search.sendKeys("artificial flowers decor");
	submitbtn.click();
	List<WebElement> products=driver.findElements(By.xpath("//span[contains(text(),'Artificial Flowers')]"));
	System.out.println(products.size());
	for (WebElement a:products) {
		System.out.println("Search Results"+" "+a.getText());
	}
} 

public void searchbypartialtext() {
	search.sendKeys("t-");
	submitbtn.click();
	List<WebElement>items=driver.findElements(By.xpath("//span[contains(text(),'T-') or @text()='T']"));
	System.out.println(items.size());
	WebElement s;
	for (int i=0;i<items.size();i++)
	{
		s=items.get(i);
		System.out.println("Search Results"+" "+s.getText());
	}
}

public void searchbycategory() {
	search.sendKeys("beauty");
	submitbtn.click();
	List<WebElement>relitems=driver.findElements(By.xpath("//span[contains(@class,'a-size-base-plus a-color-base')]"));
	System.out.println(relitems.size());
	WebElement m;
	for (int i=0;i<relitems.size();i++)
	{
		m=relitems.get(i);
		System.out.println("Search Results"+" "+m.getText());
	}
}

public void verifyproductinfo() {
	search.sendKeys("phone");
	submitbtn.click();
	//fetch all elements and store in a list
	List<WebElement>phones=driver.findElements(By.xpath("//span[contains(@class,'a-size-base-plus a-color-base')]"));
	//print the size of a list
	System.out.println(phones.size());
	//iterate through all elements in a list and for each element get text =>we got names for all products of SRP
	WebElement a;
	for (int i=0;i<phones.size();i++)
	{
		a=phones.get(i);
		System.out.println("Search Results"+" "+a.getText());
	}
	//verify that title of the search results page is relevant to keyword search
	String actualtitle=driver.getTitle();
	String expectedtitle="Amazon.ca : phone";
	System.out.println(actualtitle);
	Assert.assertEquals(actualtitle, expectedtitle);
	if (
			actualtitle.equals(expectedtitle))	
			 {
	System.out.println("Found products are relevant to keyword search");	
	}
	else {
	System.out.println("Not relevant products");	
	}
	
	//verify that all products have images
	List<WebElement> totalimages=driver.findElements(By.tagName("img"));
	System.out.println("Total Number of images found on page = " + totalimages.size());
	
	//verify that all products have prices
	List<WebElement> prices=driver.findElements(By.xpath("//span[contains(@class,'a-price-whole')]"));
	System.out.println("Total Number of price elements found on page = " + prices.size());
	
	//verify that all products have ratings
	List<WebElement> ratings=driver.findElements(By.xpath("//span[contains(@class,'a-size-base puis-normal-weight-text')]"));
	System.out.println("Total Number of rating elements found on page = " + ratings.size());
	
	//verify that all products have reviews
	List<WebElement> reviews=driver.findElements(By.xpath("//span[contains(@class,'a-size-base s-underline-text')]"));
	System.out.println("Total Number of review elements found on page = " + reviews.size());
	
	//verify that particular product has name,price,rating,review
	boolean z=	itemname.isDisplayed();
	System.out.println(z+" "+"Name of the product is displayed");
	boolean x=	itemprice.isDisplayed();
	System.out.println(x+" "+"Price of the product is displayed");
	boolean c=	itemrating.isDisplayed();
	System.out.println(c+" "+"Rating of the product is displayed");
	boolean v=	itemreviews.isDisplayed();
	System.out.println(v+" "+"Number of reviews for the product are displayed");
		
}

public void verifyproductsperpage() {
	search.sendKeys("dress");
	submitbtn.click();
	List<WebElement> items=driver.findElements(By.xpath("//div[contains(@class,'s-product-image-container aok-relative s-text-center s-image-overlay-grey puis-image-overlay-grey s-padding-left-small s-padding-right-small puis-spacing-small s-height-equalized puis puis-v1g4cn23aiw4pq21ytu1qia8qu3')]"));
	System.out.println("Total Number of items found on page = " + items.size());
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(items.size(), 60);
	softassert.assertAll();
	nextbtn.click();

}
public void verifypagination() {
	search.sendKeys("vase");
	submitbtn.click();
	List<WebElement> itemsfound=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	System.out.println("The quantity of items displayed on the page:"+itemsfound.size());
	//Created a Set, because it can't have duplicate values
		Set<WebElement> set=new HashSet<>(itemsfound);
		//compare the size of set and list, if they are equal -> no duplicates
		if (set.size()==itemsfound.size()) {
			System.out.println("There are no duplicates of products on the page");
		}
		
		else { 
			System.out.println("There are duplicates");
		}
	nextbtn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	List<WebElement> itemsfound2=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	
	System.out.println("The quantity of items displayed on the 2nd page:"+itemsfound2.size());
	Set<WebElement> set2=new HashSet<>(itemsfound2);
	//compare the size of set and list, if they are equal -> no duplicates
	if (set2.size()==itemsfound2.size()) {
		System.out.println("There are no duplicates of products on the page 2");
	}
	
	else { 
		System.out.println("There are duplicates on the page 2");
	}
	
	if (set.size()!=set2.size()) {
		System.out.println("There are no duplicates of products on the page 1 and page 2");
	}
	
	else {
		System.out.println("There are duplicates on the page 1 and 2");
	}
	
	
	

}

public void filterbynewarrival() throws InterruptedException {
	search.sendKeys("brush");
	submitbtn.click();
	filter30.click();
	Thread.sleep(6000);
	filter90.click();
	
	
}
public void filterbyrating() { 
	search.sendKeys("toys");
	submitbtn.click();
	fourstar.click();
	threestar.click();
	twostar.click();
	onestar.click();
	
	
}

public void filterbydeals() {
	search.sendKeys("candles");
	submitbtn.click();
	alldiscounts.click();
	deals.click();
}
public void filterbybestseller() {
	search.sendKeys("brush");
	submitbtn.click();

	try {	
	boolean a=BestSeller.isDisplayed();
	System.out.println(a);	
	if ( a==true)
	{
		BestSeller.click();
	}}
	catch (NoSuchElementException e) 
	{
		System.out.println("Bestseller tab is not available for this product ");
	}
	
}
	

public void filterbybrand() throws InterruptedException {
	search.sendKeys("candles");
	submitbtn.click();
	//3 loops are performed, every time it will click on the checkbox
	for (int i = 0; i < 3; i++) {
		//fetch all elements and store in a list
		List<WebElement> checkboxes=driver.findElements(By.xpath("//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox']"));
		checkboxes.get(i).click();
		Thread.sleep(1000);
		}

	
}
public void filterbyprice() {
	search.sendKeys("candles");
	submitbtn.click();
	pricerange1.click();
	pricerange2.click();
	pricerange3.click();
	pricerange4.click();
	pricerange5.click();
}
public void filterbyavailability () {
	search.sendKeys("brush");
	submitbtn.click();
	availability.click();
	
}

public void sorting ()  {
	search.sendKeys("brush");
	submitbtn.click();
	Select drpd=new Select(sorting);
	drpd.selectByVisibleText("Newest arrivals");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	drpd.selectByVisibleText("Avg. customer review");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	drpd.selectByVisibleText("Price: High to low");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	drpd.selectByVisibleText("Price: Low to high");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	drpd.selectByVisibleText("Featured");
	
}

public void sortfilter() {
	search.sendKeys("brush");
	submitbtn.click();
	Select drpd=new Select(sorting);
	drpd.selectByVisibleText("Featured");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	fourstar.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	for (int i = 0; i < 1; i++) {
		List<WebElement> checkboxes=driver.findElements(By.xpath("//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox']"));
		checkboxes.get(i).click();}

}

public void sortfilterpagination() {
	search.sendKeys("brush");
	submitbtn.click();
	Select drpd=new Select(sorting);
	drpd.selectByVisibleText("Avg. customer review");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.time2));
	filter30.click();
	List<WebElement> itemsfound=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	System.out.println("The quantity of items displayed on the page:"+itemsfound.size());
	//Created a Set, because it can't have duplicate values
	Set<WebElement> set=new HashSet<>(itemsfound);
	//compare the size of set and list, if they are equal -> no duplicates
	if (set.size()==itemsfound.size()) {
		System.out.println("There are no duplicates of products on the page");
	}
	
	else { 
		System.out.println("There are duplicates");
	}
		
}}
	


