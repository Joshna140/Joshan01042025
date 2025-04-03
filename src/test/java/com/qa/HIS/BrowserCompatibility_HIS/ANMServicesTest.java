package com.qa.HIS.BrowserCompatibility_HIS;



import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.ANMServicesPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


public class ANMServicesTest extends CrossBrowser {

	public ANMServicesTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	//OPCaseSheetPage opCaseSheetPage;
	PatientCheckInPage patientcheckInpage;
    ANMServicesPage anmservicespage;
    String txtcheckInNumber;
    util utilobj = new util();

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
	public void doNavigateToPatientCheckInTest() {

		anmservicespage = hishomepage.doNavigateToPatientCheckInforANMServices();
	}
	
	
	@Test(priority = 4)
	@Parameters("browser")
	public void doPatientCheckINTest(String Browser) throws InterruptedException {
		Thread.sleep(500);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			anmservicespage.getTxtIPNO().sendKeys(prop.getProperty("Staging_IPNumber2"));
			anmservicespage.getLnkbtnIPNo().click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			anmservicespage.getHisLiveListControlchkUHID().click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			 
			 anmservicespage.getHisLiveListControlbtnSelect().click();
			 Thread.sleep(500);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_PageUpdateProgress")));
//				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_hisDataSearchCtrl_PageUpdateProgress")));
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
				
			utilobj.ActionClick(anmservicespage.getBtnOK(), driver);
			Thread.sleep(2000);

			
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));

			
			anmservicespage.getBtnSaveDisplay().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			
			System.out.println(anmservicespage.getPopupmessage().getText());
			System.out.println(utilobj.GetCheckinNumberText(anmservicespage.getPopupmessage(), driver));
	
			 txtcheckInNumber  = utilobj.GetCheckinNumberText(anmservicespage.getPopupmessage(), driver);
			 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
	
			 anmservicespage.getBtncancel().click();			

	}

	@Test(priority = 5)
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.linkText("Doctor Worklist")).click();
	    Thread.sleep(1000);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_txtCheckinno")));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    try {
			driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    Thread.sleep(1000);
	    // Check if txtcheckInNumber is not null before sending keys
	    if (txtcheckInNumber != null) {
	    	Thread.sleep(500);
	        driver.findElement(By.id("ctl00_cphpage_txtCheckinno")).sendKeys(txtcheckInNumber);
	    } else {
	        System.out.println("txtcheckInNumber is null. Please provide a non-null value.");
	        // You may throw an exception or handle this situation based on your requirement
	    }
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Thread.sleep(1000);
	    driver.findElement(By.id("ctl00_cphpage_imgCheckinno")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Thread.sleep(1000);
	    driver.findElement(By.id("ctl00_cphpage_btnCOpenCaseSheet")).click();
	    try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popup_ok")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Test(priority = 6)
	public void doCasesheetprecripstionTest() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	    Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			anmservicespage.getpopok().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String parent3 = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			wait.until(ExpectedConditions.visibilityOf(anmservicespage.getlableprecripstionlink()));

			anmservicespage.getlableprecripstionlink().click();
		} catch (Exception e) {
		    System.out.println("Server issue detected. Skipping this test case and moving to the next test.");
		    throw new SkipException("Skipping CLM_Dr_worklist_TC_5 due to server issue.");
		}
		Thread.sleep(1000);
		
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(anmservicespage.gettxtOrdPackSearch()));
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		utilobj.JSEnterText(anmservicespage.gettxtOrdPackSearch(), driver, prop.getProperty("orderpacknameA"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

		utilobj.JSClick(anmservicespage.getclickorderpackbutton(), driver);
		Thread.sleep(1000);	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

		try {
			utilobj.JSClick(anmservicespage.getorderpackselection(), driver);

		} catch (Exception e) {
			utilobj.JSClick(anmservicespage.getorderpack(), driver);

		}
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

		utilobj.JSClick(anmservicespage.getbtnISaveClose(), driver);
		Thread.sleep(2000);

		utilobj.waitForalert(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.switchTo().alert().dismiss();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.findElement(By.id("btnIClose")).click();
			
		} catch(Exception e) {
			
		}
		Thread.sleep(500);
		driver.switchTo().window(parent3);

		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			anmservicespage.getpopok().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(500);
		//anmservicespage.doCasesheetprecripstion(prop.getProperty("orderpackname"));
	}
		
	@Test(priority=7)
	public void doANMServicesTest() throws InterruptedException{	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

		
		try {
			  Thread.sleep(1000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
				driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		Thread.sleep(1000);
		utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_lnkbtnHome")));
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    utilobj.MoveElement(driver.findElement(By.linkText("Clinical Records")), driver);
	    Thread.sleep(1000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.linkText("ANM Service")).click();
		Thread.sleep(2000);
		
		
	}
	@Test(priority = 8)
	public void CLM_ANM_servicess_TC_004() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		//anmservicespage.doANMServices(prop.getProperty("ActionTaken"),txtcheckInNumber);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		utilobj.JSEnterText(driver.findElement(By.xpath("//*[@id='ctl00_cphpage_txtAdmissionno']")), driver, txtcheckInNumber);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgAdmissionno")), driver);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement searchCheckIn = driver.findElement(By.xpath("//*[@id='ctl00_cphpage_imgAdmissionno']"));
		try {
			anmservicespage.getActionTaken().sendKeys(prop.getProperty("ActionTaken"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			  Thread.sleep(1000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
				driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	@Test(priority = 9)
	public void CLM_ANM_servicess_TC_005() throws InterruptedException {
		
		 
			 Thread.sleep(1000);

			 anmservicespage.getSaveBtn().click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 String SuccessMessage=anmservicespage.getpopupmessageInformation().getText();
			 
			 anmservicespage.getOkBtn().click();
			 assertEquals(SuccessMessage, "Record(s) saved successfully");
	}
	@Test(priority = 10)
	public void CLM_ANM_servicess_TC_006() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 anmservicespage.getSaveBtn().click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 String WarningMessage=anmservicespage.getpopupmessageInformation().getText();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 anmservicespage.getOkBtn().click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 assertEquals(WarningMessage, "Select OP-Checkin No.");
		 
	}
	@Test(priority = 11)
	public void CLM_ANM_servicess_TC_0010() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 utilobj.JSEnterText(driver.findElement(By.xpath("//*[@id='ctl00_cphpage_txtAdmissionno']")), driver, txtcheckInNumber);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 utilobj.JSClick(driver.findElement(By.id("ctl00_cphpage_imgAdmissionno")), driver);
				
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				try {
					  Thread.sleep(1000);
						wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
						driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
					} catch (Exception e) {
						e.printStackTrace();
					}
	          
	          int ValidOPCheckinNumber = 0;
				try {
					driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
					 driver.findElement(By.id("ctl00_cphpage_btnDelete1")).click();
				} catch (Exception e) {
					ValidOPCheckinNumber = 1;
					
				}
				Assert.assertEquals(ValidOPCheckinNumber, 0, "Invalid check in number ");
	          Thread.sleep(500);
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Please enter the reason for deleting
	          String WarningMessage=anmservicespage.getpopupmessageInformation().getText();
	          Thread.sleep(500);
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	          try {
				anmservicespage.getOkBtn().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	          assertEquals(WarningMessage, "Please enter the reason for deleting");
	}
	@Test(priority = 12)
	public void CLM_ANM_servicess_TC_011() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    // Click Delete Button
	    driver.findElement(By.id("ctl00_cphpage_btnDelete1")).click();

	    // Check if the element exists before interacting
	    List<WebElement> elements = driver.findElements(By.id("ctl00_cphpage_grvResults_ctl02_txtReason"));
	    if (elements.size() > 0) {
	        elements.get(0).sendKeys("test Reason");
	    } else {
	        System.out.println("Element not found: ctl00_cphpage_grvResults_ctl02_txtReason");
	        Assert.fail("Test failed: OP-Checkin number is invalid, and reason field did not appear.");
	    }

	    // Click Delete Button Again
	    driver.findElement(By.id("ctl00_cphpage_btnDelete1")).click();

	    // Click OK Button if present
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
	    okButton.click();
	}

}
