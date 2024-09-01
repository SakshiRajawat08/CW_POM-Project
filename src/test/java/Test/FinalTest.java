package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generics.BaseTest;
import pageclass.HomePage;
import pageclass.appealaccessories;
import pageclass.personalise_search;

public class FinalTest extends BaseTest {
	
	HomePage page1;
	appealaccessories page2;
	personalise_search page3;
	
	public void capture(WebDriver driver, int n) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// getScreenshots is used to get screenshot
		File image = ts.getScreenshotAs(OutputType.FILE);
		
		// Path where screenshots are captured
		File img = new File("C:\\Users\\singh\\OneDrive\\Pictures\\Screenshots\\image"+n+".png");
		
		FileUtils.copyFile(image, img);
	}
	
	@Test
	public void test1() throws IOException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getBottomwear().click();
		
		capture(driver, 1);
		
	
	}
	@Test
	public void test2() throws IOException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getLehangas().click();
		
		capture(driver, 2);
		
	}
	@Test
	public void test3() throws IOException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getWesternwear().click();
		
		capture(driver, 3);
		
	}
	
	@Test
	public void test4() throws IOException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getMens().click();
		page2.getInnerwear().click();
		
		capture(driver, 4);
		
	}
	
	@Test
	public void test5() throws IOException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getAccessories().click();
		page2.getEyewear().click();
		
		capture(driver, 5);
		
	}
	@Test
	public void test6() throws IOException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getAccessories().click();
		page2.getWallets().click();
		
		capture(driver, 6);
	}
	@Test
	public void test7() throws IOException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getAccessories().click();
		page2.getSunglaases().click();
		
		capture(driver, 7);
	}
	@Test
	public void test8() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getBottomwear().click();
		
		Thread.sleep(2000);
		page3.getCheckbox1().click();
		Thread.sleep(2000);
		page3.getCheckbox2().click();
		Thread.sleep(2000);
		page3.getCheckbox3().click();
		
		capture(driver, 8);
		
	}
	@Test
	public void test9() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getBottomwear().click();
		
		Thread.sleep(2000);
		page3.getCheckbox1().click();
		Thread.sleep(2000);
		page3.getCheckbox2().click();
		Thread.sleep(2000);
		page3.getCheckbox3().click();
		Thread.sleep(2000);
		page3.getSetbox().click();
		
		Thread.sleep(2000);
		page3.getUncheck1().click();
		Thread.sleep(2000);
		page3.getUncheck22().click();
		Thread.sleep(2000);
		page3.getUncheck33().click();
		Thread.sleep(2000);
		page3.getSetbox1().click();
		
		capture(driver, 9);
	}
	@Test
	public void test10() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getBottomwear().click();
		
		Thread.sleep(2000);
		page3.getBrand1().click();
		Thread.sleep(2000);
		page3.getBrand2().click();
		
		capture(driver, 10);
	}
	
	@Test
	public void test11() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getBottomwear().click();
		
		Thread.sleep(2000);
		page3.getBrand3().click();
		
		capture(driver, 11);
			
	}
	@Test
	public void test12() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getBottomwear().click();
		
		Thread.sleep(2000);
		page3.getDiscount1().click();
		Thread.sleep(2000);
		page3.getDiscount2().click();
		
		capture(driver, 12);
		
	}
	@Test
	public void test13() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getWomens().click();
		page2.getBottomwear().click();
		
		Thread.sleep(2000);
		page3.getType1().click();
		Thread.sleep(2000);
		page3.getType2().click();
		
		capture(driver, 13);
		
	}
	@Test
	public void test14() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getMens().click();
		page2.getInnerwear().click();
		
		Thread.sleep(2000);
		page3.getCheckbox4().click();
		Thread.sleep(2000);
		page3.getCheckbox5().click();
		Thread.sleep(2000);
		page3.getSetbox2().click();
		
		Thread.sleep(2000);
		page3.getUncheck4().click();
		Thread.sleep(2000);
		page3.getUncheck5().click();
		Thread.sleep(2000);
		page3.getSetbox3().click();
		
		capture(driver, 14);
		
	}
	@Test
	public void test15() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getMens().click();
		page2.getInnerwear().click();
		
		Thread.sleep(2000);
		page3.getColor1().click();
		
		capture(driver, 15);
		
	}
	@Test
	public void test16() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getMens().click();
		page2.getInnerwear().click();
		
		Thread.sleep(2000);
		page3.getFabric().click();
		Thread.sleep(2000);
		page3.getFabric2().click();
		
		capture(driver, 16);
		
	}
	@Test
	public void test17() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getMens().click();
		page2.getInnerwear().click();
		
		Thread.sleep(2000);
		page3.getPackage1().click();
		
		capture(driver, 17);
		
	}
	@Test
	public void test18( ) throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getAccessories().click();
		page2.getWallets().click();
		
		Thread.sleep(2000);
		
		page3.getUntick().click();
		Thread.sleep(2000);
		page3.getUntick2().click();
		Thread.sleep(2000);
		page3.getUnset().click();
		
		
		capture(driver, 18);
		
	}
	@Test
	public void test19() throws IOException, InterruptedException {
		
		page1 = new HomePage(driver);
		page2 = new appealaccessories(driver);
		page3 = new personalise_search(driver);
		
		page1.getShopping().click();
		page1.getApparelsacc().click();
		
		page1.getAccessories().click();
		page2.getWallets().click();
		
		Thread.sleep(2000);
		page3.getType3().click();
		Thread.sleep(2000);
		page3.getType4().click();
		
		capture(driver, 19);
	}
	
	
	
	

}
