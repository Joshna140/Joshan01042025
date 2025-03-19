package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.xmlbeans.XmlException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jogamp.newt.event.KeyEvent;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.HomeDrugDeliveryPage;
import com.qa.util.util;


@SuppressWarnings("unused")
public class HomeDrugDeliveryTest extends CrossBrowser {

	public HomeDrugDeliveryTest() {

	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	HomeDrugDeliveryPage HomeDrugDeliveryPage;
	String typevalue;
	String checkIN=null;

	
	@Test(priority = 0)
	public void doLoginTest() throws InterruptedException, IOException {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() throws InterruptedException {
		Thread.sleep(1000);
		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();

		
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws IOException, InterruptedException {
		System.out.println(Browser);
		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),Browser);
	}

	@Test(priority = 3)
	public void donavigatetoHomeDrugDeliverlink() throws IOException {
		
		HomeDrugDeliveryPage = hishomepage.donavigatetoHomeDrugDeliverlink();
	}
	
	@Test(priority = 4)
	@Parameters("browser")
	public void Provision_to_submit_the_address_for_home_drug_delivery (String Browser) throws InterruptedException, IOException{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		Thread.sleep(500);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtIPNO")));
        HomeDrugDeliveryPage.gettxtIPNO().sendKeys("1115104628");
		Thread.sleep(500);
		HomeDrugDeliveryPage.getlnkbtnIPNo().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
		Thread.sleep(500);
		HomeDrugDeliveryPage.getchkUHID().click();
		Thread.sleep(500);
        HomeDrugDeliveryPage.gethisLiveListControl_btnSelect().click();
        Thread.sleep(3000);
        
        //check clear buttonThread.sleep(1000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
        Thread.sleep(500);
   		HomeDrugDeliveryPage.getbtnClear().click();
        
        //check mandatory fields
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
        Thread.sleep(500);
        try {
			HomeDrugDeliveryPage.getbtnSave().click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Thread.sleep(2000);
        try {
			HomeDrugDeliveryPage.getpopup_ok().click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

   		
   	//check save button
   		
   		
		wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.gettxtIPNO()));
        HomeDrugDeliveryPage.gettxtIPNO().sendKeys("1115104628");
		Thread.sleep(500);
		HomeDrugDeliveryPage.getlnkbtnIPNo().click();
		Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getchkUHID()));
		HomeDrugDeliveryPage.getchkUHID().click();
		Thread.sleep(500);
        HomeDrugDeliveryPage.gethisLiveListControl_btnSelect().click();
        Thread.sleep(1000);
   		HomeDrugDeliveryPage.gettxtDrugAddress().sendKeys("punhana,mewat");
   	    Thread.sleep(1000);
   		utilobj.selectDropdown(HomeDrugDeliveryPage.getddlPermanentLGDState(), driver, "Haryana", "firefox");
   		Thread.sleep(1000);
   		utilobj.selectDropdown(HomeDrugDeliveryPage.getddlPermanentLGDDistrict(), driver, "Gurugram", "firefox");
   		Thread.sleep(1000);
   		utilobj.selectDropdown(HomeDrugDeliveryPage.getddlPermanentLGDSubDistrict(), driver, "Sohna", "firefox");
   		Thread.sleep(1000);
   		HomeDrugDeliveryPage.gettxtPermtPin().sendKeys("122508");
   		Thread.sleep(1000);
   		HomeDrugDeliveryPage.gettxtPermtMobileNo().sendKeys("7347298768");
   		Thread.sleep(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_btnSave")));
        Thread.sleep(1000);
        HomeDrugDeliveryPage.getbtnSave().click();
        Thread.sleep(1000);
     
		
		wait.until(ExpectedConditions.elementToBeClickable(HomeDrugDeliveryPage.getButtonOK()));

        HomeDrugDeliveryPage.getButtonOK().click();
	}
        
        
        @Test(priority = 5)
    	@Parameters("browser")
    	public void check_the_eligibility_for_the_home_drug_delivery_by_the_OPD_Doctor (String Browser) throws InterruptedException, IOException{
        	
        	Thread.sleep(1000);
        	HomeDrugDeliveryPage = hishomepage.doNavigateToPatientCheck_InforHomeDrugDeliveryPage();
        	
        	//opdflowPages.getgenratechekIn();	
			Thread.sleep(500);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtIPNO")));
			 driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1115104628");
			 Thread.sleep(500);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_lnkbtnIPNo")));
				driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
				Thread.sleep(500);
				driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
				Thread.sleep(500);
				wait.until(ExpectedConditions.invisibilityOf(HomeDrugDeliveryPage.getBlackOverlay()));
				Thread.sleep(4000);
				
				//opdflowPages.getpatientCheckInNumberSeviceOkButton().click();
				
				utilobj.JSClick(HomeDrugDeliveryPage.getpatientCheckInNumberSeviceOkButton(), driver);
			Thread.sleep(4000);
			// 
			HomeDrugDeliveryPage.getpatientCheckInNumberSaveButton().click();
			Thread.sleep(4000);
			
			checkIN = utilobj.GetCheckinNumberText(HomeDrugDeliveryPage.getPopupmessage(), driver);
			Thread.sleep(2000);

			HomeDrugDeliveryPage.getBtncancel().click();
			wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getClinicalRecordsLink()));
			
			utilobj.MoveElement(HomeDrugDeliveryPage.getClinicalRecordsLink(), driver);
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HomeDrugDeliveryPage.getDoctorWorklistLink());
			Thread.sleep(1000);
			HomeDrugDeliveryPage.getDoctorWorklistLink().click();
			
			try {
				  Thread.sleep(500);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
					driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			  Thread.sleep(1000);
			
			wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getcheckin_no_link_Link()));
			HomeDrugDeliveryPage.getTxtboxCheckInno().sendKeys(checkIN);
			Thread.sleep(2000);
			HomeDrugDeliveryPage.getimgCheckinnosearch().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getOpenStanderdCaseSheet()));
			HomeDrugDeliveryPage.getOpenStanderdCaseSheet().click();
			Thread.sleep(500);
			try {
				HomeDrugDeliveryPage.getpopup_ok().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 //edit address
			
			Thread.sleep(1000);
			HomeDrugDeliveryPage.getLnkaddress().click();
			Thread.sleep(1000);
			utilobj.SwitchToChildWindow(driver, "HomeDrugDeliveryAddressRegister");
			Thread.sleep(1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_btnSave")));
	   		HomeDrugDeliveryPage.gettxtDrugAddress().sendKeys("ctl00_cphpage_txtDrugAddress");
	   	    Thread.sleep(1000);
	   		utilobj.selectDropdown(HomeDrugDeliveryPage.getddlPermanentLGDState(), driver, "Delhi", "firefox");
	   		Thread.sleep(1000);
	   		utilobj.selectDropdown(HomeDrugDeliveryPage.getddlPermanentLGDDistrict(), driver, "New Delhi", "firefox");
	   		Thread.sleep(1000);
	   		utilobj.selectDropdown(HomeDrugDeliveryPage.getddlPermanentLGDSubDistrict(), driver, "Vasant Vihar", "firefox");
	   		Thread.sleep(1000);
	   		HomeDrugDeliveryPage.gettxtPermtPin().sendKeys("110002");
	   		Thread.sleep(1000);
	   		HomeDrugDeliveryPage.gettxtPermtMobileNo().sendKeys("7347298768");
	   		Thread.sleep(1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_btnSave")));
	        Thread.sleep(1000);
	        HomeDrugDeliveryPage.getbtnSave().click();
	        Thread.sleep(1000);
	        try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Thread.sleep(1000);
	        utilobj.SwitchToChildWindow(driver, "CaseSheetM");
	        Thread.sleep(1000);
	        
	        //check eligibility button
	        
	        try {
				HomeDrugDeliveryPage.getChkEligible().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	        Thread.sleep(1000);
	        try {
				HomeDrugDeliveryPage.getButtonNo().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	        Thread.sleep(1000);
	        try {
				HomeDrugDeliveryPage.getChkEligible().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	        Thread.sleep(1000);
	        try {
				HomeDrugDeliveryPage.getButtonYes().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	        Thread.sleep(1000);
	        
	        //medication prescription
	        
			wait.until(ExpectedConditions.elementToBeClickable(HomeDrugDeliveryPage.getprescription()));
            HomeDrugDeliveryPage.getprescription().click();
	        Thread.sleep(2000);
	        utilobj.SwitchToChildWindow(driver, "ClientSide_Prescriptions");
	        Thread.sleep(2000);
	        
			
	        try {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnDeLeteM3")));
				HomeDrugDeliveryPage.getdelete().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Thread.sleep(3000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnADDM")));
			Thread.sleep(500);
	        HomeDrugDeliveryPage.getaddbtn().click();
	        Thread.sleep(1000);
	        HomeDrugDeliveryPage.getallopathic().click();
	        Thread.sleep(1000);
	        HomeDrugDeliveryPage.gettxtSearch().sendKeys("test");
	        Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("3667")));
            HomeDrugDeliveryPage.gettxtSearchid().click();
	        Thread.sleep(1000);
            HomeDrugDeliveryPage.gettxtDrugDose().sendKeys("3");
            Thread.sleep(1000);
			utilobj.selectDropdown(HomeDrugDeliveryPage.getddlDrugDose(), driver, "mg", "firefox");
			Thread.sleep(1000);
            HomeDrugDeliveryPage.gettxtDuration().sendKeys("3");
            Thread.sleep(1000);
			utilobj.selectDropdown(HomeDrugDeliveryPage.getddlFrequency(), driver, "10X/D - 10 times a day", "firefox");
			Thread.sleep(1000);
            HomeDrugDeliveryPage.gettxtQuantity().sendKeys("3");
            Thread.sleep(1000);
			utilobj.selectDropdown(HomeDrugDeliveryPage.getddlQuantityUOM(), driver, "mg", "firefox");
			Thread.sleep(500);
			 utilobj.JSClick(HomeDrugDeliveryPage.getbtnOK(), driver);
			 Thread.sleep(500);
	      
			wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getbtnclose()));
            HomeDrugDeliveryPage.getbtnclose().click();
	        
	    
	        Thread.sleep(500);
			wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getbtnISaveClose()));
            HomeDrugDeliveryPage.getbtnISaveClose().click();
            Thread.sleep(1000);
            try {
        		utilobj.waitForalert(driver);

        		driver.switchTo().alert().accept();
        		utilobj.SwitchToChildWindow(driver, "CaseSheetM");

        		driver.switchTo().defaultContent();
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
        	try {
        		wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getpopup_ok()));
        		HomeDrugDeliveryPage.getpopup_ok().click();
        	} catch (Exception e) {
        		Thread.sleep(1000);
        		
        	}
         
 
        }

        
        
            @Test(priority = 6)
        	@Parameters("browser")
        	public void Provision_to_view_and_print_the_worklist_for_the_Home_Drug_Delivery(String Browser) throws InterruptedException, IOException{     
		
            	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
                
                utilobj.MoveElement(driver.findElement(By.linkText("Stores")), driver);
                Thread.sleep(3000);	
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/form/div[3]/div[2]/table/tbody/tr/td[2]/div/div[4]/table/tbody/tr[2]/td/table/tbody/tr/td/div/ul[4]/li[10]/a")));
                HomeDrugDeliveryPage.getPharmacyIssue().click();
                Thread.sleep(2000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_lnkHomeDrugWorklist")));

                HomeDrugDeliveryPage.getlnkHomeDrugWorklist().click();
                Thread.sleep(3000);
                HomeDrugDeliveryPage.getbtnHDDPrint().click();
                Thread.sleep(2000);
                wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getlogout()));
                HomeDrugDeliveryPage.getlogout().click();
                Thread.sleep(1000);}
            
            @Test(priority = 7)
            @Parameters("browser")
            public void Home_Drug_Delivery_Report_HQ_Report(String Browser) throws InterruptedException, IOException {

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

                loginpage = new Loginpage(driver);

                homepage = loginpage.doLogin(prop.getProperty("HQuidd"), prop.getProperty("StagingPass"));
                Thread.sleep(2000);
                selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
                Thread.sleep(2000);
                hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"), Browser);
                Thread.sleep(2000);
                HomeDrugDeliveryPage = hishomepage.donavigatetoHomeDrugDeliveryReport();
                Thread.sleep(2000);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst0")));
                HomeDrugDeliveryPage.gethomedrugdeliveryreports().click();
                Thread.sleep(2000);
                HomeDrugDeliveryPage.gettxtFromDate().click();
                Thread.sleep(2000);
                HomeDrugDeliveryPage.getClExtFromDate_day_0_1().click();
                Thread.sleep(2000);
                HomeDrugDeliveryPage.getbuttonClear().click();
                Thread.sleep(2000);
                HomeDrugDeliveryPage.gettxtFromDate().click();
                Thread.sleep(2000);
                HomeDrugDeliveryPage.getClExtFromDate_day_0_1().click();
                Thread.sleep(2000);
                HomeDrugDeliveryPage.getbtnPreview().click();
                Thread.sleep(5000);
                
                
                wait.until(ExpectedConditions.visibilityOf(HomeDrugDeliveryPage.getPrintbtn()));
                
                HomeDrugDeliveryPage.getPrintbtn().click();
                Thread.sleep(4000);
                
           
                utilobj.SwitchToChildWindow(driver, "Print the Report");
                Thread.sleep(5000);

             
                wait.until(ExpectedConditions.elementToBeClickable(HomeDrugDeliveryPage.getsubmitexport()));
                
                HomeDrugDeliveryPage.getsubmitexport().click();

                   
                 
            }
}
            
