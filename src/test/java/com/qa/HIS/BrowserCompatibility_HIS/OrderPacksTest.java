package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OrderPacksPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class OrderPacksTest extends CrossBrowser {

	public OrderPacksTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	OrderPacksPage   orderpackspage;
	boolean InvestigationSearch;
	Random F=new Random();
	int Num=F.nextInt(2000);
	String OrderPackName=prop.getProperty("OrderPacks")+"_"+Num;
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}
	
	@Test(priority = 3)
	public void doNavigateToOrderPacksTest()  {
		
		orderpackspage = hishomepage.doNavigateToOrderPacks();
	}
	
	@Test(priority=4)
	@Parameters("browser")
	public void CLM_Order_Packs_TC_02(String Browser) throws InterruptedException, NoSuchElementException{
		
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.doOrderPacks(prop.getProperty("OrderPacks"),prop.getProperty("TestName"),prop.getProperty("Quantity"),
		prop.getProperty("DrugName"),prop.getProperty("DoseType"),prop.getProperty("Frequency"),
        prop.getProperty("Admin_Route"),prop.getProperty("TestName1"),prop.getProperty("Diagnosis_Search"));
	}
	
	@Test(priority=5)
	@Parameters("browser")
	public void CLM_Order_Packs_TC_03(String Browser) throws InterruptedException, NoSuchElementException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));

		Thread.sleep(500);
		orderpackspage = hishomepage.doNavigateToOrderPacks();//open window again
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		System.out.println(OrderPackName);
		orderpackspage.getOrderPacks().sendKeys(OrderPackName);
		
		/*Investigations*/	
		String parent3 = driver.getWindowHandle();

		utilobj.Window(driver);

		orderpackspage.getInvestigations().click();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.ChildWindow(driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		System.out.println(driver.getTitle());
		

		utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, prop.getProperty("TestName"));
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getWindowCheckBox(), driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
		//driver.close();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		 driver.switchTo().window(parent3);
		 Thread.sleep(1000);
		 
//	 InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
//		if(InvestigationSearch==true) {
//			orderpackspage.getTestName().sendKeys(prop.getProperty("TestName"));
//			orderpackspage. getSearchBtn().click();
//			orderpackspage.getChkBox().click();
//			orderpackspage.getSelectBtn().click();
//			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
//			 wait.until(ExpectedConditions.invisibilityOf(orderpackspage.getSelectBtn()));
//		}
//		
//		else {
//			 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			 System.out.println("modelpopup is not display");
//		}
//		boolean popupok1 = false;
//		try {
//		    WebElement popupElement = driver.findElement(By.id("popup_ok"));
//		    popupok1  = popupElement.isDisplayed();
//		} catch (Exception e) {
//		    // Element not found, set popupok to false or any default value
//		    popupok1 = false;
//		}
//
//		// Now you can use the value of popupok
//		System.out.println("Is popupok displayed? " + popupok1);
//		if (popupok1 ==true) {
//			driver.findElement(By.id("popup_ok")).click();
//		}
		utilobj.JSEnterText(orderpackspage.getQuantity(), driver, "1"); 
		Thread.sleep(1000);
		 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		 orderpackspage.getTickMark().click();
		 Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		/*Medications*/
		orderpackspage.getMedications().click();
		String parent4 = driver.getWindowHandle();

		utilobj.Window(driver);
		Thread.sleep(1000);

		orderpackspage.getDrugSearchBtn().click();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.ChildWindow(driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		System.out.println(driver.getTitle());
		

		utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, "abaca");
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getWindowDrugChkBx(), driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
		Thread.sleep(500);
		//driver.close();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		 driver.switchTo().window(parent4);
		Thread.sleep(500);
		
//		 InvestigationSearch=driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnPopClose")).isDisplayed();
//		if(InvestigationSearch==true) {
//			orderpackspage.getDrugName().sendKeys("abaca");
//			orderpackspage.getDrugNameSearchBtn().click();
//			orderpackspage.getDrugNameChkBx().click();
//			orderpackspage.getDrugSelectBtn().click();
//			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
//			orderpackspage.getDoseQty().clear();
//			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(2));
//			 wait.until(ExpectedConditions.invisibilityOf(orderpackspage.getSelectBtn()));
//		}
//		
//		else {
//		}
		boolean popupok2 = false;
		try {
		    WebElement popupElement = driver.findElement(By.id("popup_ok"));
		    popupok2  = popupElement.isDisplayed();
		} catch (Exception e) {
		    // Element not found, set popupok to false or any default value
		    popupok2 = false;
		}

		// Now you can use the value of popupok
		System.out.println("Is popupok displayed? " + popupok2);
		if (popupok2 ==true) {
			driver.findElement(By.id("popup_ok")).click();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(5))));
		orderpackspage.getDoseQty().clear();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getDoseQty().sendKeys("1");
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.selectDropdown(orderpackspage.getDoseType(), driver, prop.getProperty("DoseType"), Browser);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.selectDropdown(orderpackspage.getFrequency(), driver, prop.getProperty("Frequency"), Browser);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getDuration().sendKeys("3");
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.selectDropdown(orderpackspage.getAdmin_Route(), driver,"ORAL / BY MOUTH", Browser);
		//orderpackspage.getAdmin_Route().sendKeys(prop.getProperty("Admin_Route"));
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getTotal_Strength().sendKeys("3");
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.selectDropdown(orderpackspage.getTotal_Strength_drpdwn(), driver,prop.getProperty("DoseType"), Browser);
		// orderpackspage.getTotal_Strength_drpdwn().sendKeys(prop.getProperty("DoseType"));
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage. getRemarks().sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getMedication_Tick().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
		orderpackspage.getSaveBtn().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getpopup().click();
//		assertEquals(popupok1, false);
		assertEquals(popupok2, false, "An error message appears after clicking providing investigations and clicking on medications tab which is Unable To Process the Request.Please Try Again.");
		
	}
	@Test(priority = 6)
	public void CLM_Order_Packs_TC_06() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));

		/*Diagnosis*/	
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage = hishomepage.doNavigateToOrderPacks();//open window again
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		String parent4 = driver.getWindowHandle();

		utilobj.Window(driver);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
		driver.findElement(By.id("ctl00_cphpage_ImgName")).click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.ChildWindow(driver);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSEnterText(orderpackspage.getTestNameTxtBx(), driver, OrderPackName);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getSearchBtnInvestigation(), driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getWindowDrugChkBx(), driver);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		utilobj.JSClick(orderpackspage.getSelectBtnInvestigation(), driver);
		Thread.sleep(500);
		//driver.close();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		Thread.sleep(500);
		driver.switchTo().window(parent4);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));		
		orderpackspage.getDiagnosis().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getDiagnosis_Search().sendKeys(prop.getProperty("Diagnosis_Search"));
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getCovid().click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getDiagnosis_Tick().click();
		Thread.sleep(2000);
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		try {
			driver.findElement(By.id("popup_ok")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		driver.findElement(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/div[2]/div/div[2]/div[4]/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		String Status=driver.findElement(By.id("ctl00_cphpage_tabSearch_tabPnlDiagnosis_gdvDiagnosis_ctl02_status")).getText();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		System.out.println(Status);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		assertEquals(Status, "Deleted", "the status of diagnosis after ticking on covid19 is not matching, it should reflect deleted");
		}
	@Test(priority = 7)
	public void CLM_Order_Packs_TC_04() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));

		Thread.sleep(500);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		orderpackspage.getSaveBtn().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		orderpackspage.getpopup().click();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		Thread.sleep(500);
	}
	@Test(priority = 8)
	public void CLM_Order_Packs_TC_07() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		orderpackspage.getSaveBtn().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		boolean warningmsg=orderpackspage.getpopup().isDisplayed();
		orderpackspage.getpopup().click();
		assertEquals(warningmsg, true, "No order pack is selected error should appear in case of trying to save empty data");
	}
	
}
