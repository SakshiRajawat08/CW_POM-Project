package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class appealaccessories {
	
	WebDriver driver;
	
	// Constructor
	public appealaccessories(WebDriver driver) {   
		
		// Assign the value of the driver which is coming from outside to this class driver
		// this is used for calling the global variable
		
		this.driver = driver;
		
		// page factory is a design pattern 
		// INIT elements is used to initialize of all our web elements
		
		PageFactory.initElements(driver, this);
		
	}
	
	// locators
	
	@FindBy(linkText = "Bottom Wear")
	private WebElement bottomwear;
	
	@FindBy(linkText = "Lehengas")
	private WebElement lehangas;
	
	@FindBy(linkText = "Western Wear")
	private WebElement westernwear;
	
	@FindBy(linkText = "Innerwear")
	private WebElement innerwear;
	
	@FindBy(linkText = "Eyewear")
	private WebElement eyewear;
	
	@FindBy(linkText = "Men's Wallets")
	private WebElement wallets;
	
	@FindBy(linkText = "Sunglasses")
	private WebElement sunglaases;
	
	// Getter methods for all our web elements

	public WebElement getBottomwear() {
		return bottomwear;
	}

	public WebElement getLehangas() {
		return lehangas;
	}

	public WebElement getWesternwear() {
		return westernwear;
	}

	public WebElement getInnerwear() {
		return innerwear;
	}

	public WebElement getEyewear() {
		return eyewear;
	}

	public WebElement getWallets() {
		return wallets;
	}

	public WebElement getSunglaases() {
		return sunglaases;
		
	}
	
	public void apparelacc() {
		
		bottomwear.click();
			
	}
	public void ls() {
		
		lehangas.click();
	}
	public void western() {
		
		westernwear.click();
		
	}
	public void inner() {
		
		innerwear.click();
		
	}
	public void eye() {
		
		eyewear.click();
	}
	public void wallet() {
		
		wallets.click();
		
	}
	public void glasses() {
		
		sunglaases.click();
	}
}
