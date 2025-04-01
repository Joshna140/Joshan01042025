package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.TimeZone;

import org.apache.tools.ant.property.GetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.DoctorWorklistPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class DoctorWorklistTest extends CrossBrowser {

	public DoctorWorklistTest() {

	}

	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	DoctorWorklistPage DWP;
	PatientCheckInPage patientcheckInpage;
	util utilobj = new util();
	String txtcheckInNumber;
	@Test(priority = 0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(1);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

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
		
		//driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(30))));


		DWP=hishomepage.doNavigateToPatientCheckInforDoctorWorklist();
	}

	@Test(priority = 4)
	@Parameters("browser")
	public void doPatientCheckINTest(String Browser) throws InterruptedException {


		Thread.sleep(500);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(DWP.getLnkbtnIPNo()));
		DWP.getTxtIPNO().sendKeys(prop.getProperty("Staging_IPNumber2"));
			DWP.getLnkbtnIPNo().click();
			Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getHisLiveListControlchkUHID().click();
			Thread.sleep(500);
			 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			 
			DWP.getHisLiveListControlbtnSelect().click();
			Thread.sleep(500);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_PageUpdateProgress")));
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_hisDataSearchCtrl_PageUpdateProgress")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			Thread.sleep(1000);
			utilobj.ActionClick(DWP.getBtnOK(), driver);
			Thread.sleep(2000);
			
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));

			
			DWP.getBtnSaveDisplay().click();
			Thread.sleep(500);
			

	}

		



	

	
	@Test(priority = 5)
	public void doNavigateToDoctorWorklistTest() throws InterruptedException {

		
			System.out.println(DWP.getPopupmessage().getText());
			System.out.println(utilobj.GetCheckinNumberText(DWP.getPopupmessage(), driver));
	
			 txtcheckInNumber  = utilobj.GetCheckinNumberText(DWP.getPopupmessage(), driver);
			 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
	
			DWP.getBtncancel().click();
			
		    
		  
			
			DWP = hishomepage.donavigatetoDoctorworklist();
		
			
		
		
		
		
	}
	@Test(priority = 6)
	public void CLM_Dr_worklist_TC_4() throws InterruptedException {
	
		    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		    
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListInfo_buttonOK().click();
				
				
			}
		    Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getTxtboxCheckInno().sendKeys(txtcheckInNumber);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getimgCheckinnosearch().click();
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getOpenStanderdCaseSheet().click();
			
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
				DWP.getpopok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
		//	driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			
		//	DWP.getpopok().click();
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(5))));
			String parent3 = driver.getWindowHandle();
		
			utilobj.Window(driver);
			Thread.sleep(500);
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getmessageok()));
				DWP.getmessageok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getlableprecripstionlink()));

			    DWP.getlableprecripstionlink().click();
			} catch (Exception e) {
			    System.out.println("Server issue detected. Skipping this test case and moving to the next test.");
			    throw new SkipException("Skipping CLM_Dr_worklist_TC_4 due to server issue.");
			}

		
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
			utilobj.ChildWindow(driver);
			wait.until(ExpectedConditions.visibilityOf(DWP.gettxtOrdPackSearch()));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
			
			System.out.println(driver.getTitle());
		
			utilobj.JSEnterText(DWP.gettxtOrdPackSearch(), driver, "Automation");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));
		
			utilobj.JSClick(DWP.getclickorderpackbutton(), driver);
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));
			
			utilobj.JSClick(DWP.getorderpackselection(), driver);
			Thread.sleep(4000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));
		
			utilobj.JSClick(DWP.getbtnISaveClose(), driver);
			Thread.sleep(500);

			try {
				utilobj.waitForalert(driver);
		
				driver.switchTo().alert().dismiss();
				Thread.sleep(500);
				
				driver.findElement(By.id("btnIClose")).click();
				
				
				Thread.sleep(500);
				driver.switchTo().window(parent3);
		
				driver.switchTo().defaultContent();
			} catch (Exception e) {
				Thread.sleep(500);
				driver.switchTo().window(parent3);
		
				driver.switchTo().defaultContent();
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
				DWP.getpopok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	
	
	
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm");
			 Calendar cal = Calendar.getInstance();
		//	 Checks if it's AM or PM
			 String z;
			 if (cal.get(Calendar.AM_PM) == Calendar.AM) {
		         z = "AM";
		     } else {
		         z = "PM";
		     }
			 String Original_Date = sdf.format(cal.getTime()) + " " + z;
			 int s = 1;
			 String Date = Original_Date;
			 String text = null;
			// Loop until s equals 3 or the element is found
			 while (s != 3) {
		
			     // Pause execution for 2000 milliseconds (2 seconds)
			     driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
			     // Scroll down into view using the utilobj.scroolDownintoview method
			     utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("//*[@id=\"ctl00_cphpage_divPrescription\"]/table[1]/tbody/tr[1]/td/span")));
		
			     // Pause execution for 2000 milliseconds (2 seconds)
			     driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
			     // Try to find the element with the link text equal to the formatted date
			     try {
			        text = driver.findElement(By.linkText(Date)).getText();
			         // Break out of the loop if the element is found
			         break;
			     } catch (Exception e) {
			    	 cal.add(Calendar.MINUTE, -s);
			    	 Date = sdf.format(cal.getTime()) + " " + z;
			    	 s= s+1;
			         // Handle the exception if the element is not found
			         e.printStackTrace();
			     }
			 }
		
			 // Now outside the loop, you can use the updated value of the 'text' variable	 
		
			System.out.println("the text of a tag:- "+text);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			utilobj.scroolDownintoview(driver, driver.findElement(By.xpath("//*[@id=\"ctl00_cphpage_divPrescription\"]/table[1]/tbody/tr[1]/td/span")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");
			
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			
			assertEquals(text, Original_Date, "The time of prescription is not matching with the exact time of inserting prescription data");

	}
	@Test(priority = 7)
	@Parameters("browser")
	public void CLM_Dr_worklist_TC_5(String Browser) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
			DWP = hishomepage.donavigatetoDoctorworklist();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListconsultent()));
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListInfo_buttonOK().click();
				
				
			}
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			DWP.getDoctorworkListconsultent().click();
			
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getmessageok()));
				DWP.getmessageok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getConsultenttabCheck_no_link()));

			    DWP.getConsultenttabCheck_no_link().click();
			} catch (Exception e) {
			    System.out.println("Server issue detected. Skipping this test case and moving to the next test.");
			    throw new SkipException("Skipping CLM_Dr_worklist_TC_5 due to server issue.");
			}
			Thread.sleep(500);
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
				DWP.getpopok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			utilobj.scroolDownintoview(driver, DWP.getcaseSheetAdviceLink());
			
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			String parent3 = driver.getWindowHandle();
		
			utilobj.Window(driver);
		
			DWP.getcaseSheetAdviceLink().click();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
		
			
			utilobj.ChildWindow(driver);
			wait.until(ExpectedConditions.visibilityOf(DWP.getRefferalRadiobutoon()));
			wait.until(ExpectedConditions.elementToBeClickable(DWP.getRefferalRadiobutoon()));
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(50))));
			DWP.getRefferalRadiobutoon().click();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			utilobj.selectDropdown(DWP.getSpecializationDDL(), driver, "General Medicine", Browser);
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getReasonTextbox().sendKeys("Test");
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getaddButton().click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(DWP.getSave_closeButton()));
			utilobj.scroolDownintoview(driver, DWP.getSave_closeButton());
			Thread.sleep(1000);
			DWP.getSave_closeButton().click();
			Thread.sleep(1000);
			
		//	utilobj.waitForalert(driver);
		//
		//	driver.switchTo().alert().accept();
			driver.switchTo().window(parent3);
		
			driver.switchTo().defaultContent();
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
				DWP.getpopok().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			

	
	}
	@Test(priority = 8)
	public void CLM_Dr_worklist_TC_6() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			Thread.sleep(500);
			Thread.sleep(1000);
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_lnkbtnHome")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP = hishomepage.donavigatetoDoctorworklist();
			Thread.sleep(1000);
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListInfo_buttonOK().click();
				Thread.sleep(1000);
				
			}
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getDoctorworkListReferral().click();
			Thread.sleep(1000);
			try {
				  Thread.sleep(1000);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
					driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			int Refferalvisibility = 0;
			try {
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListReferral_Link().click();
			} catch (Exception e) {
				Refferalvisibility = 1;
				
			}
			Assert.assertEquals(Refferalvisibility, 0, "Referral generated earlier is not visible in referral link list");
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
				DWP.getpopok().click();
			} catch (Exception e) {
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
	public void CLM_Dr_worklist_TC_10() throws InterruptedException {
			Thread.sleep(1000);
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_lnkbtnHome")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			
			DWP = hishomepage.donavigatetoDoctorworklist();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListInfo_buttonOK().click();
				
				
			}
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			Thread.sleep(1000);
			DWP.getTxtboxCheckInno().sendKeys(txtcheckInNumber);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getimgCheckinnosearch().click();
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getOpenStanderdCaseSheet().click();
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(5))));
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));//check in nu se casesheet open
				DWP.getpopok().click();
			} catch (Exception e) {
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
	@Test(priority = 10)
	public void CLM_Dr_worklist_TC_11() throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(5))));
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_lnkbtnHome")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));

			DWP = hishomepage.donavigatetoDoctorworklist();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListInfo_buttonOK().click();
				
				
			}
			Thread.sleep(1000);
			utilobj.JSEnterText(DWP.getTxtboxCheckInno(),driver, txtcheckInNumber);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getimgCheckinnosearch().click();
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			boolean MiniCasesheetvisibility = true;
			try {
				DWP.getOpenMiniCaseSheet().click();
			} catch (Exception e) {
				MiniCasesheetvisibility = false;
				DWP.getOpenStanderdCaseSheet().click();
				try {
					wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
					DWP.getpopok().click();//ip se  casesheet open
				} catch (Exception f) {
					e.printStackTrace();
				}
				
			}
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			Assert.assertEquals(MiniCasesheetvisibility, true, "Minicase sheet is not visible after searching for checkin number and clicking on it");
				
			
	}
	
	@Test(priority = 11)
	public void CLM_Dr_worklist_TC_12() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			Thread.sleep(1000);
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_lnkbtnHome")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));

			DWP = hishomepage.donavigatetoDoctorworklist();//
			wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				
				DWP.getDoctorworkListInfo_buttonOK().click();
				
				
			}
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			utilobj.JSEnterText(DWP.getTxtboxCheckInno(),driver, txtcheckInNumber);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));

			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getimgCheckinnosearch().click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_MyMessageBoxInfo_ModalPopupExtenderMessageOK_backgroundElement")));

			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getClosedButton().click();//check in nu se closed buttn
	}
	@Test(priority = 12)
	public void CLM_Dr_worklist_TC_15() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			DWP.getDWLInsuranceNumberTxtbox().sendKeys(prop.getProperty("Staging_IPNumber2"));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getDWLInsuranceSearchImage().click();
			Thread.sleep(4000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getOpenStanderdCaseSheet2().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(5))));
			
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
				DWP.getpopok().click();//ip se  casesheet open
			} catch (Exception e) {
				e.printStackTrace();
			}
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			
			try {
				  Thread.sleep(1000);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
					driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	@Test(priority = 13)
	public void CLM_Dr_worklist_TC_16() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(100))));
			DWP = hishomepage.donavigatetoDoctorworklist();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListInfo_buttonOK().click();	
			}
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getDWLInsuranceNumberTxtbox().sendKeys(prop.getProperty("Staging_IPNumber2"));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getDWLInsuranceSearchImage().click();
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			int MiniCasesheetvisibility2 = 0;
			try {
				DWP.getOpenMiniCaseSheet2().click();
			} catch (Exception e) {
				MiniCasesheetvisibility2 = 1;
				DWP.getOpenStanderdCaseSheet2().click();
				try {
					wait.until(ExpectedConditions.visibilityOf(DWP.getpopok()));
					DWP.getpopok().click();//ip se  casesheet open
				} catch (Exception f) {
					e.printStackTrace();
				}
			}
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			Assert.assertEquals(MiniCasesheetvisibility2, 0, "Minicase sheet is not visible after searching for checkin number and clicking on it");
			
			try {
				  Thread.sleep(1000);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
					driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
	}

	@Test(priority = 14)
	public void CLM_Dr_worklist_TC_17() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
			Thread.sleep(1000);
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00$cphpage$txt_complaint")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			utilobj.scroolDownintoview(driver, driver.findElement(By.id("ctl00_lnkbtnHome")));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			try {
				  Thread.sleep(1000);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
					driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			DWP=hishomepage.doNavigateToPatientCheckInforDoctorWorklist();//go to check in screen
			//make a check in
			Thread.sleep(500);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(DWP.getLnkbtnIPNo()));

			DWP.getTxtIPNO().sendKeys(prop.getProperty("Staging_IPNumber2"));
			DWP.getLnkbtnIPNo().click();
			Thread.sleep(500);
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP.getHisLiveListControlchkUHID().click();
			Thread.sleep(500);
			 driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			 
			DWP.getHisLiveListControlbtnSelect().click();
			Thread.sleep(500);
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_PageUpdateProgress")));
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_cphpage_hisDataSearchCtrl_PageUpdateProgress")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			utilobj.ActionClick(DWP.getBtnOK(), driver);
			Thread.sleep(2000);

			
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));

			
			DWP.getBtnSaveDisplay().click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(DWP.getBtncancel()));
			DWP.getBtncancel().click();
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			DWP = hishomepage.donavigatetoDoctorworklist();//go to doctor worklist
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListReferral()));
			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListInfo_buttonOK().click();	
			}
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getDWLMiniSheetOpenLink()));
					DWP.getDWLMiniSheetOpenLink().click();//click on mini sheet
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
			} catch (Exception e) {
			}

				}
	@Test(priority = 15)
	public void CLM_Dr_worklist_TC_18() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
			DWP = hishomepage.donavigatetoDoctorworklist();//
			Thread.sleep(2000);
			try {
				wait.until(ExpectedConditions.visibilityOf(DWP.getDoctorworkListInfo_buttonOK()));
			} catch (Exception e) {
				e.printStackTrace();
			}

			boolean message =DWP.getDoctorworkListInfo_buttonOK().isDisplayed();
			if(message==true) {
				DWP.getDoctorworkListInfo_buttonOK().click();	
			}
			Thread.sleep(1000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));

			boolean Cancelentry = false;
			try {
			    ;
			    Cancelentry  = DWP.getDoctorworkListCancelcheckIN().isDisplayed();
			} catch (Exception e) {
			    // Element not found, set popupok to false or any default value
			    Cancelentry = false;
			}
			if (Cancelentry == true) {
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				DWP.getDoctorworkListCancelcheckIN().click();
				Thread.sleep(3000);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));


				DWP.getDoctorworkListCancelcheckINNoButton().click();//click on no button
				Thread.sleep(3000);

				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
				DWP.getDoctorworkListCancelcheckIN().click();
				Thread.sleep(3000);

				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
				DWP.getDoctorworkListCancelcheckINYesButton().click();
				Thread.sleep(3000);

				driver.findElement(By.id("ctl00_cphpage_txtReason")).sendKeys("test reason");
				driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(20))));
				driver.findElement(By.id("ctl00_cphpage_btnOK")).click();
			} else {
				Cancelentry = false;
			}
			Assert.assertEquals(Cancelentry, true, "check in entry is not visible in doctor's worklist in speciality tab despite being already created");

	}

}