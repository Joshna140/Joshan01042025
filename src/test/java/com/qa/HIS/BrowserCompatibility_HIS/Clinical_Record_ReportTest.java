package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Clinical_Record_ReportPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


@SuppressWarnings("unused")
public class Clinical_Record_ReportTest extends CrossBrowser {
	public  Clinical_Record_ReportTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Clinical_Record_ReportPages CRR;
	util utilobj=new util();
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
	public void doNavigateToClinical_Record_Reports() {

		driver.manage().window().maximize();

		CRR=hishomepage.doNavigateToClinical_Record_Reports();
	}
	@Test(priority = 4)
	public void checkTheFunctionalityOfItemMasterdata() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getExpand_Super_Speciality_Patient_Referrals().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getItem_Master_Data().click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getPreviewButton().click();
		Thread.sleep(1000);

	}
	@Test(priority = 5)
	public void checkTheFunctionalityOfprescreption_itemIssue() throws InterruptedException  {
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.elementToBeClickable(CRR.getprescreption_itemIssue()));
		utilobj.scroolDownintoview(driver, CRR.getprescreption_itemIssue());
		Thread.sleep(1000);
		CRR.getprescreption_itemIssue().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));

		
	}
	@Test(priority = 6)
	public void checkTheFunctionalityOfStockStatus_StationWise() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getExpand_Super_Speciality_Patient_Referrals().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getStockStatus_StationWise().click();	
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	@Parameters("browser")
	public void checkTheFunctionalityOfExportReport(String Browser) throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getExpand_Super_Speciality_Patient_Referrals().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getZeroStock_Item().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		utilobj.selectDropdown(CRR.getDepartment_DLL(), driver, "ADMINISTRATIVE SERVICES",Browser);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		CRR.getPreviewButton().click();
		Thread.sleep(1000);
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		if (CRR.getExprotReport() != null) {
		    try {
		        CRR.getExprotReport().click();
		    } catch (NoSuchElementException e) {
		        System.out.println("Element not found: " + e.getMessage());
		        Assert.fail("Test failed: Export Report button was not found.");
		    }
		} else {
		    System.out.println("Extent Report not found: Test case failed.");
		    Assert.fail("Test failed: Export Report button is missing.");
		}

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "Crystal Reports (RPT)",Browser);
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "MS Excel 97-2000",Browser);
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(2000);
		
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "MS Word",Browser);
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(CRR.getExprotReport_DLL(), driver, "Acrobat Format (PDF)",Browser);
		Thread.sleep(1000);
		CRR.getExprotReport_OKButon().click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().window(parent3);
	}
		@Test(priority = 8)
		@Parameters("browser")
		public void ChecktheFunctionalityofClearButton(String Browser) throws InterruptedException, AWTException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
			Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
			CRR.getExpand_Super_Speciality_Patient_Referrals().click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
			CRR.getZeroStock_Item().click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
			utilobj.selectDropdown(CRR.getDepartment_DLL(), driver, "ADMINISTRATIVE SERVICES",Browser);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
			CRR.getPreviewButton().click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_ctl00_PageUpdateProgress")));
			CRR.getClearButton().click();
		
		
	}
}
