package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.apache.xmlbeans.XmlException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.qa.pages.BedStatusPage;

import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MaternityCertificatePage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.pages.MaternityCertificatepages;

import com.qa.util.util;

@SuppressWarnings("unused")
public class MaternityCertificateTest extends CrossBrowser{
	 
		util utilobj=new util();
		 public MaternityCertificateTest() {
			// TODO Auto-generated constructor stub
		}
			
		
		Loginpage loginpage;
		HomePage homepage;
		SelectHospitalLocationPage selecthospitallocationpage;
		HISHomePage hishomepage;
		BedStatusPage bedstatuspage;
		MaternityCertificatepages MC;
		 String txtcheckInNumber ="OPGENE022400168";
		 MaternityCertificatePage MaternityCertificatePage;
		 String checkIN=null;
			
		//private WebDriver driver=null;
		@Test(priority =0)
		public void doLoginTest() {

			loginpage = new Loginpage(driver);

			homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));	

		}
		
		
		@Test(priority =1)
		public void doNavigateToSelectHospitalLocationTest() {

			selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
		}
		
		@Test(priority =2)
		@Parameters("browser")
		public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

			hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
		}
		
		

		@Test(priority =3)
		public void TC_MA_003() throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")+"\\ExcelTestdata";

		}
		@Test(priority = 4)
		public void doNavigateToPatientCheckinLinkTest() {

			MaternityCertificatePage = hishomepage.doNavigateToPatientCheck_InforMaternitycerticficate();
		}
		
		
		
		@Test(priority = 5)
		public void doCreateCheckInPageTest() throws InterruptedException {

			
			//opdflowPages.getgenratechekIn();	
			Thread.sleep(500);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
			driver.manage().window().maximize();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtIPNO")));
			 driver.findElement(By.id("ctl00_cphpage_txtIPNO")).sendKeys("1115104365");
			 Thread.sleep(500);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_lnkbtnIPNo")));
				driver.findElement(By.id("ctl00_cphpage_lnkbtnIPNo")).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")));
				driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("ctl00_cphpage_hisLiveListControl_btnSelect")).click();
				Thread.sleep(500);
				wait.until(ExpectedConditions.invisibilityOf(MaternityCertificatePage.getBlackOverlay()));
				
				Thread.sleep(4000);
				//opdflowPages.getpatientCheckInNumberSeviceOkButton().click();
				utilobj.JSClick(MaternityCertificatePage.getpatientCheckInNumberSeviceOkButton(), driver);
			Thread.sleep(4000);
			// 
			MaternityCertificatePage.getpatientCheckInNumberSaveButton().click();
			Thread.sleep(4000);
			
			checkIN = utilobj.GetCheckinNumberText(MaternityCertificatePage.getPopupmessage(), driver);
			Thread.sleep(2000);

			MaternityCertificatePage.getBtncancel().click();
			
			
					
		
		}
		@Test(priority = 6)
		public void docreate_materntycertificate() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(MaternityCertificatePage.getClinicalRecordsLink()));
			
			utilobj.MoveElement(MaternityCertificatePage.getClinicalRecordsLink(), driver);
			Thread.sleep(1000);
			MaternityCertificatePage.getDoctorWorklistLink().click();
			
			try {
				  Thread.sleep(500);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK"))));
					driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			  Thread.sleep(500);
			
			wait.until(ExpectedConditions.visibilityOf(MaternityCertificatePage.getcheckin_no_link_Link()));
			
			//getimgConsultation
			MaternityCertificatePage.getTxtboxCheckInno().sendKeys(checkIN);
			Thread.sleep(2000);
			MaternityCertificatePage.getimgCheckinnosearch().click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(MaternityCertificatePage.getOpenStanderdCaseSheet()));
            MaternityCertificatePage.getOpenStanderdCaseSheet().click();
			Thread.sleep(500);
			try {
				MaternityCertificatePage.getpopup_ok().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				MaternityCertificatePage.getButtonOK().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				MaternityCertificatePage.getbtnback().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				MaternityCertificatePage.getcheckinno().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				MaternityCertificatePage.getpopup_ok().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			Thread.sleep(2000);
			MaternityCertificatePage.getgeneralexam().click();
			Thread.sleep(500);
			
			utilobj.SwitchToChildWindow(driver, "TemplateDesigner");
			
			try {
				MaternityCertificatePage.getChkPallor().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
		
			
			Thread.sleep(500);
			MaternityCertificatePage.gettxtRemark().sendKeys("30");
			Thread.sleep(500);
			wait.until(ExpectedConditions.visibilityOf(MaternityCertificatePage.getbtnSave()));
			MaternityCertificatePage.getbtnSave().click();
			Thread.sleep(2000);
			utilobj.SwitchToChildWindow(driver, "CaseSheetM");
			Thread.sleep(1000);
			MaternityCertificatePage.getMatCertifbtn().click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_txtDurationOfPregnancy")));
			MaternityCertificatePage.gettxtDurationOfPregnancy().sendKeys("30");
			Thread.sleep(1000);
			MaternityCertificatePage.getTypeOfMaternity().click();
			Thread.sleep(500);
			utilobj.JSClick(MaternityCertificatePage.getTypeOfMaternity(), driver);
			Thread.sleep(2000);
			MaternityCertificatePage.gettxtExpectedDateOfConfinement().click();
			Thread.sleep(2000);
			MaternityCertificatePage.getCalendarExtender12_nextArrow().click();
			Thread.sleep(2000);
			MaternityCertificatePage.getCalendarExtender12().click();
			Thread.sleep(2000);
			MaternityCertificatePage.gettxtPlaceOfExamination().sendKeys("delhi");
			Thread.sleep(2000);
			MaternityCertificatePage.txtFromLeaveDate().click();
			
			Thread.sleep(2000);
			MaternityCertificatePage.getCalendarExtender5().click();
			Thread.sleep(2000);
			MaternityCertificatePage.gettxtMaternityRemrks().sendKeys("test");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_btnSave")));

			MaternityCertificatePage.getmedsavebtn().click();
			Thread.sleep(2000);
			MaternityCertificatePage.getButtonOK().click();
			Thread.sleep(2000);
			utilobj.selectDropdown(MaternityCertificatePage.getddlOutcomeofPregnancy(), driver, "Live Birth", "firefox");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_cphpage_btnSave")));
            MaternityCertificatePage.getmedsavebtn().click();
            Thread.sleep(2000);
            MaternityCertificatePage.getButtonOK().click();
            Thread.sleep(2000);
            MaternityCertificatePage.getButtonOK().click();
			
			
		}
		
		@Test(priority = 7)
		@Parameters("browser")
		public void testcaseforMaternityCertification(String Browser) throws InterruptedException, AWTException, IOException, XmlException {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
			
			Thread.sleep(5000);
			MC.getMaternitycertification_IPnoLink().click();
			Thread.sleep(4000);
			MC.getMaternitycertification_IPno_searchtextboxLink().sendKeys("1199900090");
			Thread.sleep(4000);
			MC.getMaternitycertification_IPno_searchbuttonlink().click();
			Thread.sleep(4000);
			MC.getMaternitycertification_IPno_selectRadioButtonLink().click();
			Thread.sleep(4000);
			
			MC.getMaternitycertification_IPno_selectButtonLink().click();
			Thread.sleep(4000);
			MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys("22");
			Thread.sleep(4000);
			MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			MC.getMaternitycertification_layout_certificateOfpregnancyradiobuttonLink().click();
			Thread.sleep(4000);
			MC.getMaternitycertification_layout_certificateOfpregnancy_RemarxLink().sendKeys("...........TestRemarks.........");
			  Thread.sleep(4000);
			  MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().clear();
			  Thread.sleep(4000);
			  MC.getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys("37");
			  Thread.sleep(4000);
			  MC. getMaternitycertification_Layout_DurationofpragnancytxtboxLink().sendKeys(Keys.ENTER);
			  Thread.sleep(4000);
			  MC.getMaternitycertification_layout_certificateofconfinementform18RadioButton().click();
			  Thread.sleep(2000);
			  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
			  Calendar cal = Calendar.getInstance();
			  String Date = sdf.format(cal.getTime());
			  System.out.println(Date);
			  Thread.sleep(4000);
			  utilobj.JSEnterText(MC.getMaternitycertification_Layout_DateOfConfinement(), driver, Date);
			  Thread.sleep(4000);
			  cal.add(Calendar.DAY_OF_MONTH, 1);
			  String newDate = sdf.format(cal.getTime());
			  System.out.println(newDate);
			  Thread.sleep(4000);
			  utilobj.selectDropdown(MC.getMaternitycertification_layout_outcomeofpregnancyDDL(), driver, "Live Birth",Browser);
			  Thread.sleep(4000);
			  MC.getMaternitycertification_layout_Placeofconfinementtxtbox().sendKeys("test hospital");
			  Thread.sleep(4000);
			  MC.getMaternitycertification_layout_Remarks().sendKeys("Test Remarks...");
			  Thread.sleep(4000);
			  utilobj.JSEnterText(MC.getMaternitycertification_layout_IWintend(), driver, newDate);
			  Thread.sleep(4000);
			  utilobj.JSClick(MC.getMaternitycertification_SaveButton(),driver);
			  wait.until(ExpectedConditions.visibilityOf(MC.getMaternitycertification_SaveButtonSuccesOK()));

			MC.getMaternitycertification_SaveButtonSuccesOK().click();
			
			wait.until(ExpectedConditions.visibilityOf(MC.getMaternitycertification_SaveButtonSuccesOK()));
			Thread.sleep(10000);
			MC.getMaternitycertification_SaveButtonSuccesOK().click();
			Thread.sleep(4000);
			  String certificationNo=driver.findElement(By.id("ctl00_cphpage_txtCertificateno")).getAttribute("value");
			  Thread.sleep(2000);
			  System.out.println(certificationNo);
			  
			  String parent3 = driver.getWindowHandle();
				Thread.sleep(2000);
				utilobj.Window(driver);
				Thread.sleep(1000);
				MC.getMaternitycertification_printButton().click();
				Thread.sleep(3000);
				utilobj.ChildWindow(driver);
				Thread.sleep(1000);
				System.out.println("hello window handle");
				Thread.sleep(1000);
				driver.manage().window().maximize();
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(parent3);
				Thread.sleep(1000);
				MC.getMaternitycertification_ClearButton().clear();
				Thread.sleep(1000);

		}

}