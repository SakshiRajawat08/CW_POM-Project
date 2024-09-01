package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	
	// Constructor
	public HomePage(WebDriver driver) {
		
		// Assign the value of the driver which is coming from outside to this class driver
		// this is used for calling the global variable

		this.driver = driver;
		
		// page factory is a design pattern 
		// INIT elements is used to initialize of all our web elements
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	// locators
	
	@FindBy(css = "[class='arrowNav']")
	private WebElement shopping;
	
	@FindBy(linkText = "Apparel & Accessories")
	private WebElement apparelsacc;
	
	@FindBy(linkText = "Women's Wear")
	private WebElement womens;
	
	@FindBy(linkText = "Men's Wear")
	private WebElement mens;
	
	@FindBy(linkText = "Accessories")
	private WebElement accessories;
	
	// Getter methods for all our web elements


	public WebElement getShopping() {
		return shopping;
	}

	public WebElement getApparelsacc() {
		return apparelsacc;
	}

	public WebElement getWomens() {
		return womens;
	}

	public WebElement getMens() {
		return mens;
	}

	public WebElement getAccessories() {
		return accessories;
		
	}
	
	public void products() {
	
		shopping.click();
		apparelsacc.click();
		womens.click();
		mens.click();
		accessories.click();
	}
    
	
}
    

	


