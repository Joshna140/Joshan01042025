package com.qa.HIS.BrowserCompatibility_HIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BedStatusPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Inpatient_EmergencyPatientpages;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;
public class InpatientEmergencyPatientTest extends CrossBrowser {
public	InpatientEmergencyPatientTest() {
	
}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BedStatusPage bedstatuspage;
	Inpatient_EmergencyPatientpages IPEP;
	
	util utilobj = new util();
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
	
	
	@Test(priority = 3)
	public void CLM_Inpatients_Emergency_Patients_TC_3() throws InterruptedException {
		
		
		IPEP=hishomepage.doNavigateInpatientsEmergencyPatients();
		Thread.sleep(3000);
		
		
			try {
				IPEP.getInpatient_Emergencypatient_Medicine_pluselink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(1000);	
			try {
				IPEP.getInpatient_Emergencypatient_Medicine_minusLink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(1000);
			try {
				IPEP.getInpatient_Emergencypatient_EmergencyUnit_pluseLink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(1000);
			try {
				IPEP.getInpatient_Emergencypatient_EmergencyUnit_MinusLink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(1000);
			try {
				IPEP.getInpatient_Emergencypatient_IcuUnit_PluseLink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(1000);
			try {
				IPEP.getInpatient_Emergencypatient_IcuUnit_MinusLink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(1000);
			try {
				IPEP.getInpatient_Emergencypatient_CasualityUnit_PluseLink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(1000);
			try {
				IPEP.getInpatient_Emergencypatient_CasualityUnit_MinusLink().click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			
			Thread.sleep(1000);
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
			
			IPEP.getInpatient_Emergencypatient_Medicine_bed02imgclickLink().click();
			
		
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_back_buttonLink()));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", IPEP.getInpatient_Emergencypatient_ipcasesheet_back_buttonLink());

	
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_imgSpecialization")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).isDisplayed()==true) {
			driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Clinical Records")));
		IPEP=hishomepage.doNavigateInpatientsEmergencyPatients();
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void  CLM_Inpatients_Emergency_Patients_TC_4(String Browser) throws InterruptedException{
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_cphpage_ImgAdmissionNo")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		utilobj.selectDropdown(IPEP.getaddnodropdown(), driver, "Contains", Browser);


		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")));
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria")).sendKeys("000");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch")).click();
		wait.until(ExpectedConditions.invisibilityOf(IPEP.getBlackOverlay()));
		
		try {
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_back_buttonLink()));
//		IPEP.getInpatient_Emergencypatient_ipcasesheet_back_buttonLink().click();
        wait.until(ExpectedConditions.invisibilityOf(IPEP.getBlackOverlay()));
        

		
	}
	
	@Test(priority = 5)
	public void  CLM_Inpatients_Emergency_Patients_TC_7() throws InterruptedException{
		
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
				driver.findElement(By.id("popup_ok")).click();
			}
		} catch (Exception e) {
			
		}
			
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplain().click();
		Thread.sleep(2000);	
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainTextBox()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainTextBox().sendKeys("Tenement");
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainVlaue()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainVlaue().click();
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainAddButton().click();
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_ChiefComplainSubmitButon().click();
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
	}
	@Test(priority = 6)
	public void  CLM_Inpatients_Emergency_Patients_TC_8() throws InterruptedException{
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
				driver.findElement(By.id("popup_ok")).click();
			}
		} catch (Exception e) {
			
		}
		IPEP.getInpatient_Emergencypatient_ipcasesheet_HistorofpresentIllness().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessTextBox()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessTextBox().sendKeys("test present Illness");
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessSaveButton().click();
		
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 7)
	public void  CLM_Inpatients_Emergency_Patients_TC_9() throws InterruptedException{
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
				driver.findElement(By.id("popup_ok")).click();
			}
		} catch (Exception e) {
			
		}
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_PastHistory().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_PastHistoryTextBox()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_PastHistoryTextBox().sendKeys("test past History");
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_PastHistorysaveButton().click();
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 8)
	public void  CLM_Inpatients_Emergency_Patients_TC_10() throws InterruptedException{
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
				driver.findElement(By.id("popup_ok")).click();
			}
		} catch (Exception e) {
			
		}
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_GenralExamination().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorRadioButton()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorRadioButton().click();
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorSaveButton().click();
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 9)
	public void  CLM_Inpatients_Emergency_Patients_TC_11() throws InterruptedException{
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
				driver.findElement(By.id("popup_ok")).click();
			}
		} catch (Exception e) {
			
		}
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_SystemincExamination().click();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "TemplateDesigner");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem_radiobutton()));
        IPEP.getInpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem_radiobutton().click();
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystemSave().click();
		
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 10)
	public void  CLM_Inpatients_Emergency_Patients_TC_12() throws InterruptedException{
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
				driver.findElement(By.id("popup_ok")).click();
			}
		} catch (Exception e) {
			
		}
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_Local_SpecialExamination().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleTextBox()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleTextBox().sendKeys("Muscle Test");
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleSaveButton().click();
		driver.switchTo().window(parent3);
		driver.switchTo().defaultContent();
		
	}
	@Test(priority = 11)
	@Parameters("browser")
	public void  CLM_Inpatients_Emergency_Patients_TC_13(String Browser) throws InterruptedException{
		Thread.sleep(2000);	
		String parent3 = driver.getWindowHandle();
		utilobj.Window(driver);
		Thread.sleep(2000);
		try {
			if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
				driver.findElement(By.id("popup_ok")).click();
			}
		} catch (Exception e) {
			
		}
		IPEP.getInpatient_Emergencypatient_ipcasesheet_Diagnos().click();
		Thread.sleep(2000);
		utilobj.ChildWindow(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosSerchTextBox()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosSerchTextBox().sendKeys("test");
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosVlaue()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosVlaue().click();
		Thread.sleep(2000);
		utilobj.selectDropdown(IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosTypeDdl(), driver, "Provisional Diagnosis", Browser);
		Thread.sleep(2000);
		IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosADDbutton().click(); 
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosSaveButton()));
		IPEP.getInpatient_Emergencypatient_ipcasesheet_DiagnosSaveButton().click();
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
	}
	@Test(priority = 12)
	
	public void  CLM_Inpatients_Emergency_Patients_TC_14() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		String parent3 = driver.getWindowHandle();
		
		Thread.sleep(2000);
			utilobj.Window(driver);
			
			try {
				if(driver.findElement(By.id("popup_ok")).isDisplayed()==true) {
					driver.findElement(By.id("popup_ok")).click();
				}
			} catch (Exception e) {
				
			}
			
		Thread.sleep(2000);
			
			IPEP.getInpatient_Emergencypatient_ipcasesheet_Prescription().click();
		
			Thread.sleep(2000);
		
			
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			wait.until(ExpectedConditions.visibilityOf(IPEP.gettxtOrdPackSearch()));
			System.out.println(driver.getTitle());
		
			utilobj.JSEnterText(IPEP.gettxtOrdPackSearch(), driver, "test");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

			utilobj.JSClick(IPEP.getclickorderpackbutton(), driver);
			
		
			
			Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

			utilobj.JSClick(IPEP.getorderpackselection(), driver);
		
			Thread.sleep(2000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("img1")));

			utilobj.JSClick(IPEP.getbtnISaveClose(), driver);
		
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));

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
				wait.until(ExpectedConditions.visibilityOf(IPEP.getpopokbutton()));
				IPEP.getpopokbutton().click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	}
	
}
//String parent3 = driver.getWindowHandle();
//utilobj.Window(driver);
//DSP.getClinicalSummary().click();
//Thread.sleep(2000);	
//utilobj.ChildWindow(driver);
//
//driver.switchTo().window(parent3);
//driver.switchTo().defaultContent();
