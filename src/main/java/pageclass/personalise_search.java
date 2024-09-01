package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personalise_search {
	
	WebDriver driver;
	
	// Constructor
	
	public personalise_search(WebDriver driver) {
		
		// Assign the value of the driver which is coming from outside to this class driver
		// this is used for calling the global variable
		
		this.driver = driver;
		
		// page factory is a design pattern 
		// INIT elements is used to initialize of all our web elements
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Locators
	
	@FindBy(linkText = "With Cash On Delivery")
	private WebElement checkbox1;
	
	@FindBy(linkText = "Exclude Out Of Stock")
	private WebElement checkbox2;
	
	@FindBy(linkText = "Products With Free Shipping")
	private WebElement checkbox3;
	
	@FindBy(linkText = "Set")
	private WebElement setbox;
	
	@FindBy(linkText = "With Cash On Delivery")
	private WebElement uncheck1;

	@FindBy(linkText = "Exclude Out Of Stock")
	private WebElement uncheck22;
	
	@FindBy(linkText = "Products With Free Shipping")
	private WebElement uncheck33;
	
	@FindBy(linkText = "Set")
	private WebElement setbox1;
	
	@FindBy(id = "brandFilterBox38380")
	private WebElement brand1;
	
	@FindBy(id = "brandFilterBox38398")
	private WebElement brand2;
	
	@FindBy(id = "priceFilterBox3")
	private WebElement price;
	
	@FindBy(id = "discountFilterBox3")
	private WebElement discount1;
	
	@FindBy(id = "discountFilterBox2")
	private WebElement discount2;
	
	@FindBy(id = "featureFilterBox0f1")
	private WebElement type1;
	
	@FindBy(id = "featureFilterBox1f1")
	private  WebElement type2;
	
	@FindBy(id = "isexoutStock")
	private WebElement checkbox4;
	
	@FindBy(id = "isfreeship")
	private WebElement checkbox5;
	
	@FindBy(linkText = "Set")
	private WebElement setbox2;
	
	@FindBy(id = "isexoutStock")
	private WebElement uncheck4;

	@FindBy(id = "isfreeship")
	private WebElement uncheck5;
	
	@FindBy(linkText = "Set")
	private WebElement setbox3;
	
	@FindBy(id = "featureFilterBox0f1")
	private WebElement color1;
	
	@FindBy(linkText = "Premium, Breathable Fabric (1)")
	private WebElement fabric;
	
	@FindBy(linkText = "Thermocot (100% Polyester) (1)")
	private WebElement fabric2;
	
	@FindBy(id = "featureFilterBox0f3")
	private WebElement package1;
	
	@FindBy(id = "isexoutStock")
	private WebElement untick;
	
	@FindBy(id = "isfreeship")
	private WebElement untick2;

	@FindBy(linkText = "Set")
	private WebElement unset;
	
	@FindBy(xpath = "//*[@id='featureFilterBox0f2']")
	private WebElement type3;
	
	@FindBy(xpath = "//*[@id='featureFilterBox1f2']")
	private WebElement type4;
	
	// Getters for our web elements

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getCheckbox3() {
		return checkbox3;
	}

	public WebElement getSetbox() {
		return setbox;
	}
	
	public WebElement getUncheck1() {
		return uncheck1;
	}

	public WebElement getUncheck22() {
		return uncheck22;
	}

	public WebElement getUncheck33() {
		return uncheck33;
	}

	public WebElement getSetbox1() {
		return setbox1;
	}

	public WebElement getBrand1() {
		return brand1;
	}

	public WebElement getBrand2() {
		return brand2;
	}

	public WebElement getBrand3() {
		return price;
	}

	public WebElement getDiscount1() {
		return discount1;
	}

	public WebElement getDiscount2() {
		return discount2;
	}

	public WebElement getType1() {
		return type1;
	}

	public WebElement getType2() {
		return type2;
	}

	public WebElement getCheckbox4() {
		return checkbox4;
	}

	public WebElement getCheckbox5() {
		return checkbox5;
	}

	public WebElement getSetbox2() {
		return setbox2;
	}
	
	public WebElement getUncheck4() {
		return uncheck4;
	}

	public WebElement getUncheck5() {
		return uncheck5;
	}

	public WebElement getSetbox3() {
		return setbox3;
	}

	public WebElement getColor1() {
		return color1;
	}

	public WebElement getFabric() {
		return fabric;
	}

	public WebElement getFabric2() {
		return fabric2;
	}

	public WebElement getPackage1() {
		return package1;
	}
	
	public WebElement getUntick() {
		return untick;
	}
	
	public WebElement getUntick2() {
		return untick2;
	}

	public WebElement getUnset() {
		return unset;
	}

	public WebElement getType3() {
		return type3;
	}

	public WebElement getType4() {
		return type4;
		
	}
	
	public void check1() {
		

		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
	}
	
	public void set1() {
		setbox.click();
	}
	
	public void uncheck() {
		
		uncheck1.click();
		uncheck22.click();
		uncheck33.click();
		setbox1.click();
	}
	
	public void br1() {
		
		
		brand1.click();
		brand2.click();
		price.click();
	}
	
	public void dis1() {
		discount1.click();
		discount2.click();
	}
	
	public void Type() {
		
		type1.click();
		type2.click();
		
	}
	
	public void check2() {
		
		checkbox4.click();
		checkbox5.click();
	}
	
	public void set2() {
		
		setbox2.click();
	}
	
	public void unchecked() {
		
		uncheck4.click();
		uncheck5.click();
		setbox3.click();
	}
	
	public void color() {
		
		color1.click();
	}
	
	public void fab() {
		
		fabric.click();
		fabric2.click();
	}
	
	public void pack() {
		
		package1.click();
	}
	
	public void name() {
		
		untick.click();
		untick2.click();
		unset.click();
		
	}
	
	
	public void types() {
		
		type3.click();
		type4.click();
	}

	
	
	
	
	

}
