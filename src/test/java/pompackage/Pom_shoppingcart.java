package pompackage;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import basePackage.Baseclass;
import utility.TimeUtils;

public class Pom_shoppingcart extends Baseclass{

	@FindBy(id="twotabsearchtextbox") WebElement search;
	@FindBy(id="nav-search-submit-button") WebElement submitbtn;
	@FindBy(xpath="//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'] //span[contains(text(),'Webber Naturals Vitamin C Timed Release 1,000 mg, 150 Tablets,For Bones, Teeth, Immune and Antioxidant Health, Vegetarian')]") WebElement oneitem;
	@FindBy(xpath="//div[@class='a-accordion-row-a11y a-accordion-row a-declarative accordion-header "
			+ "mobb-header-css']//i[@class='a-icon a-accordion-radio a-icon-radio-active']") WebElement onetimepucrhase;
	@FindBy(id="add-to-cart-button") WebElement addtocart;
	@FindBy(id="nav-cart") WebElement shoppingcart;	
	@FindBy(id="landingImage") WebElement image;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/"
			+ "div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[2]/a[1]/img[1]") WebElement shopcartimage;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/div[1]/"
			+ "form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/ul[1]/li[1]/span[1]/a[1]/span[1]/span[1]/span[2]") WebElement namecheck;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/div[1]/"
			+ "form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/ul[1]/div[1]/div[1]/div[1]/p[1]/span[1]") WebElement pricecheck;
	@FindBy(xpath="//span[@id='sc-subtotal-amount-buybox']//span[@class='a-size-medium"
			+ " a-color-base sc-price sc-white-space-nowrap']") WebElement subtotal;
	@FindBy(id="a-autoid-2-announce") WebElement quantitydrpd;
	@FindBy(id="quantity_10") WebElement ten;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/"
			+ "div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/div[1]/span[1]/span[1]/input[1]") WebElement input;
	@FindBy(id="a-autoid-3-announce") WebElement update;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='sw-full-view-container']/"
			+ "div[@id='sw-full-view']/div[@id='sw-atc-confirmation']/div[@id='sw-atc-details-single-container']/div[@id='add-to-cart-confirmation-image']/div[1]/a[1]/img[1]") WebElement img;
	@FindBy(xpath="//div[@data-csa-c-asin='B09M7GWQMT']//i[@class='a-icon"
			+ " a-accordion-radio a-icon-radio-inactive']") WebElement inactiveradiobtn;
	@FindBy(xpath="//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'] "
			+ "//span[contains(text(),"
			+ "'Webber Naturals Vitamin D3 1,000 IU, 260 Tablets,"
			+ " For Healthy Bones, Teeth, and the Maintenance of Good Health, Vegetarian')]") WebElement webber;
	@FindBy(xpath="//a[@class='a-link-normal s-underline-text s-underline"
			+ "-link-text s-link-style a-text-normal'] //span[contains(text(),'Jamieson Calcium Magnesium and Vitamin D3')]") WebElement jamieson;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[10]/"
			+ "div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/span[2]") WebElement oneitemprice;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[10]/div[1]/"
			+ "div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/span[2]") WebElement webberprice;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/"
			+ "div[@id='ppd']/div[@id='centerCol']/div[@id='apex_desktop']/div[1]/div[1]/div[3]/div[1]/span[2]/span[2]") WebElement jamiesonprice;
	@FindBy(id="landingImage") WebElement webbercimg;
	@FindBy(id="landingImage") WebElement webberdimg;
	@FindBy(id="landingImage") WebElement jamiesonimg;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/"
			+ "div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/ul[1]/li[1]/span[1]/a[1]") WebElement jamiesonname_sc;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/"
			+ "div[1]/div[1]/form[1]/div[2]/div[4]/div[4]/div[1]/div[3]/ul[1]/li[1]/span[1]/a[1]/span[1]/span[1]/span[2]")  WebElement webberdname_sc;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/"
			+ "div[1]/div[1]/form[1]/div[2]/div[5]/div[4]/div[1]/div[3]/ul[1]/li[1]/span[1]/a[1]/span[1]/span[1]/span[2]") WebElement webbercname_sc;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]/"
			+ "div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/ul[1]/"
			+ "div[1]/div[1]/div[1]/p[1]/span[1]") WebElement jamiesonprice_sc;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/"
			+ "div[1]/div[1]/form[1]/div[2]/div[4]/div[4]/div[1]/div[3]/ul[1]/"
			+ "div[1]/div[1]/div[1]/p[1]/span[1]") WebElement  webberdprice_sc;
	@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[3]/div[5]/div[1]/div[2]/"
			+ "div[1]/div[1]/form[1]/div[2]/div[5]/div[4]/div[1]/div[3]/ul[1]/div[1]/div[1]/div[1]/p[1]/span[1]") WebElement  webbercprice_sc;
	@FindBy(xpath="//img[@alt='Jamieson Calcium Magnesium and Vitamin D3, Opens in a new tab']") WebElement jamiesonimg_sc;
	@FindBy(xpath="//img[@alt='Webber Naturals Vitamin D3 1,000 IU, 260 Tablets,"
			+ " For Healthy Bones, Teeth, and the Maintenance of Good Health, Vegetarian, Opens in a new tab']")  WebElement webberdimg_sc;
	@FindBy(xpath="//img[@alt='Webber Naturals Vitamin C Timed Release 1,000 mg,"
			+ " 150 Tablets, For Bones, Teeth, Immune and Antioxidant Health, Vegetarian, Opens in a new tab']")  WebElement webbercimg_sc;
	@FindBy(xpath="//input[@value='Delete']") WebElement delete1;
	@FindBy(xpath="//input[@aria-label='Delete Webber Naturals Vitamin C Timed Release 1,000 mg, 150 Tablets, For Bones, Teeth, Immune and Antioxidant Health, Vegetarian']") WebElement delete2;
	@FindBy(xpath="//input[@aria-label='Delete Webber Naturals Vitamin D3 1,000 IU, 260 Tablets, For Healthy Bones, Teeth, and the Maintenance of Good Health, Vegetarian']") WebElement delete3;
	@FindBy(xpath="//span[contains(text(),'Webber Naturals Vitamin D3 1,000 IU, 260 Tablets, For Healthy Bones,…')]") WebElement product_valid;
	@FindBy(xpath="//h1[contains(text(),'Your Amazon Cart is empty.')]") WebElement empty;
	@FindBy(id="sc-subtotal-label-activecart") WebElement subtotal_empty; 
	@FindBy(xpath="//span[@class='a-truncate-cut' and @aria-hidden='true' and contains(text(),'Webber Naturals Vitamin C Timed Release 1,000 mg, 150 Tablets, For Bones, Teeth, Immune and Antioxidant Health, Vegetarian')]") WebElement productname;
	@FindBy(xpath="//div[@id='detailBulletsWithExceptions_feature_div']//h2['Product details']") WebElement rating;

	
	public Pom_shoppingcart() {
	PageFactory.initElements(driver,this);	
	}

	pom_youraccount log=new pom_youraccount();
	
public void login () {
	log.login();
	
}
public void addoneitem () {
	search.sendKeys("vitamins");
	submitbtn.click();
	String name=oneitem.getText();
	System.out.println("Name of the 1st item in search results page:"+name);
	oneitem.click();
	String img=image.getAttribute("alt"); //to compare two images, fetched the common attribute 
	onetimepucrhase.click();
	String price=oneitemprice.getText();
	System.out.println("Price in search results page:"+price);
	addtocart.click();
	shoppingcart.click();
	String img1=shopcartimage.getAttribute("alt");
	System.out.println("Image of the product is displayed:"+shopcartimage.isDisplayed());
	boolean a=img1.contains(img); //used this method because the second image has in the name "Opens in a new tab", can't use comparison operators
	System.out.println(a);
	if (a==true) {
		System.out.println("Image in the shopping cart is correct");
	}
	String name1=namecheck.getText();
	System.out.println("Name in the shopping cart:"+name1);
	String price1=pricecheck.getText();
	System.out.println("Price in the shopping cart:"+price1);
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(name1, name);
	softassert.assertEquals(price1, price);
	softassert.assertAll();
	
}

public void pricechange() {
	search.sendKeys("vitamins");
	submitbtn.click();
	oneitem.click();
	onetimepucrhase.click();
	addtocart.click();
	shoppingcart.click();
	quantitydrpd.click();
	Actions act=new Actions(driver);
	act.moveToElement(ten).build().perform();
	ten.click();
	input.sendKeys("10");
	update.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeUtils.time3));
	wait.until(ExpectedConditions.textToBePresentInElement(subtotal,"$99.70"));
	String a=subtotal.getText();
	String b=pricecheck.getText();
	System.out.println("Price per 1 item:"+b);
	System.out.println("Total price for 10 products"+a);
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(a,"$99.70");
	softassert.assertAll();
	
}
public void addsameitem() {
	search.sendKeys("vitamins");
	submitbtn.click();
	oneitem.click();
	onetimepucrhase.click();
	addtocart.click();
	img.click();
	inactiveradiobtn.click();
	addtocart.click();
	shoppingcart.click();
	String a=subtotal.getText();
	String b=pricecheck.getText();
	System.out.println("Price per 1 item:"+b);
	System.out.println("Total price for 2 products"+a);
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(a,"$19.94");
	softassert.assertAll();
	
}
public void add_dif_items() {
	search.sendKeys("vitamins");
	submitbtn.click();
	String name1=oneitem.getText();
	String name2=webber.getText();
	String name3=jamieson.getText();
	System.out.println("Name of the 1st item in search results page:"+name1);
	System.out.println("Name of the 2nd item in search results page:"+name2);
	System.out.println("Name of the 3rd item in search results page:"+name3);
	oneitem.click();
	String price1=oneitemprice.getText();
	System.out.println("Price of the 1st item in search results page:"+price1);
	String webc=webbercimg.getAttribute("alt"); 
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	webber.click();
	String price2=webberprice.getText();
	System.out.println("Price of the 2nd item in search results page:"+price2);
	String webd=webberdimg.getAttribute("alt"); 
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	jamieson.click();
	String price3=jamiesonprice.getText();
	System.out.println("Price of the 3rd item in search results page:"+price3);
	String jam=jamiesonimg.getAttribute("alt");
	addtocart.click();
	shoppingcart.click();
	String scname1=jamiesonname_sc.getText();
	String scname2=webberdname_sc.getText();
	String scname3=webbercname_sc.getText();
	System.out.println("Name of the 1st item in shopping cart:"+scname1);
	System.out.println("Name of the 2nd item in shopping cart:"+scname2);
	System.out.println("Name of the 3rd item in shopping cart:"+scname3);
	String scprice1=jamiesonprice_sc.getText();
	String scprice2=webberdprice_sc.getText();
	String scprice3=webbercprice_sc.getText();
	System.out.println("Price of the 1st item in search results page:"+scprice1);
	System.out.println("Price of the 2nd item in search results page:"+scprice2);
	System.out.println("Price of the 3rd item in search results page:"+scprice3);
	String jam1=jamiesonimg_sc.getAttribute("alt");
	String webd1=webberdimg_sc.getAttribute("alt");
	String webc1=webbercimg_sc.getAttribute("alt");
	//image comparison between SRP and shopping cart
	boolean a=jam1.contains(jam); 
	boolean b=webd1.contains(webd); 
	boolean c=webc1.contains(webc); 
	if (a==true &&
		b==true &&
		c==true)
	{
		System.out.println("Images of all the products in the shopping cart are correct");
	}
	//name and price comparison
	if (name1==scname1 &&
		name2==scname2 &&
		name3==scname3 &&
		price1==scprice1 &&
		price2==scprice2 &&
		price3==scprice3
			)
	{
		System.out.println("Names and prices of all the products in the shopping are correct");
	}		
}

public void removeitems () throws InterruptedException {
	search.sendKeys("vitamins");
	submitbtn.click();
	oneitem.click();
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	webber.click();
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	jamieson.click();
	addtocart.click();
	shoppingcart.click();
	String total_before=subtotal.getText();
	System.out.println("Total sum before removing items:"+total_before);
	Thread.sleep(3000);
	delete1.click();
	delete2.click();
	String total_after=subtotal.getText();
	System.out.println("Total sum after removing 2 items:"+total_after);
	
	SoftAssert softassert=new SoftAssert();
	try {
		
	boolean a=jamiesonname_sc.isDisplayed();
	boolean b=webbercname_sc.isDisplayed();
	softassert.assertNotEquals(a,true);
	softassert.assertNotEquals(b,true); }
			
	catch (NoSuchElementException e){
	System.out.println("Shopping cart is updated after deleting 2 items");
	}
	
	boolean c=webberdimg_sc.isDisplayed();
	softassert.assertEquals(c,true);
	softassert.assertAll();
}

public void removeall() {
	search.sendKeys("vitamins");
	submitbtn.click();
	oneitem.click();
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	webber.click();
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	jamieson.click();
	addtocart.click();
	shoppingcart.click();
	String total_before=subtotal.getText();
	System.out.println("Total sum before removing all items:"+total_before);
	delete1.click();
	delete2.click();
	delete3.click();
	boolean a =empty.isDisplayed();
	boolean b=subtotal_empty.isDisplayed();
	if (a==true && b==true) {
		System.out.println("The cart balance is 0; the cart is empty.");
	}
}

public void productinfo() throws InterruptedException {
	search.sendKeys("vitamins");
	submitbtn.click();
	oneitem.click();
	onetimepucrhase.click();
	addtocart.click();
	shoppingcart.click();
	String originalhandle=driver.getWindowHandle();
	productname.click();
	for (String windowHandle : driver.getWindowHandles()) {
	    if(!originalhandle.contentEquals(windowHandle)) {
	        driver.switchTo().window(windowHandle);
	        break;
	    }
	}
	Thread.sleep(3000);
	
	boolean b=rating.isDisplayed();
	if (b==true) {
	System.out.println("The user is redirected to the product page");
	}

}

public void itemhold() {
	search.sendKeys("vitamins");
	submitbtn.click();	
	oneitem.click();
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	webber.click();
	onetimepucrhase.click();
	addtocart.click();
	driver.navigate().back();
	driver.navigate().back();
	jamieson.click();
	addtocart.click();

	  String originalWindow=driver.getWindowHandle();
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get(prop.getProperty("url")); 
	  String newWindow=driver.getWindowHandle();
	  driver.switchTo().window(originalWindow).close();
	  driver.switchTo().window(newWindow);
	  shoppingcart.click();
	boolean a=  jamiesonimg_sc.isDisplayed();
	boolean b= webberdimg_sc.isDisplayed();
	boolean c=  webbercimg_sc.isDisplayed();
	
	if (a==true && b==true && c==true)
	{
		System.out.println("User's items are still in the cart");
	}
	
}




}
