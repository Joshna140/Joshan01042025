package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AudioVideoConsultationCR;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


@SuppressWarnings("unused")
public class AudioVideoConsultationCRTest extends CrossBrowser {
	public  AudioVideoConsultationCRTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	AudioVideoConsultationCR CRR;
	util utilobj=new util();
	
	//testing hub
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
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName2"),
				prop.getProperty("facilityName"),Browser);
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(3))));
		
		      driver.manage().window().maximize();
	}
	
	@Test(priority = 3)
	public void doNavigateToDrWorkList() throws InterruptedException {

	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));

	  

	    CRR = hishomepage.doNavigateToDrWorkListCRR();
		driver.manage().timeouts().implicitlyWait(((java.time.Duration.ofSeconds(40))));
	}
	
	
	
	@Test(priority = 4)
	public void donavigatetoVideoConsultationpage() throws InterruptedException {
		
		Thread.sleep(2000);

		try {
			CRR.getDoctorsworklistNoOPDOkButton().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Thread.sleep(5000);
		
		CRR.getVideoconsultationLink().click();
		Thread.sleep(500);
		Thread.sleep(2000);
		CRR.getVideoConsultationCheckinlink().click();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "CaseSheetMAV");
		Thread.sleep(2000);
		CRR.getOccupationalDiseaseAlertOKBtn().click();
		Thread.sleep(500);
		CRR.getJoinVideoConsultaionMeetingLink().click();
		
		
		
	}
	
	@Test(priority = 5)
	@Parameters("browser")
		
	public void CheckFunctionalityOfChiefComplants(String Browser) throws InterruptedException{
		
		//Add chief complaint
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CRR.getSearchChiefComplaints().sendKeys("Cough");
		CRR.getSearChiefComplaints().click();
		Thread.sleep(5000);
		CRR.getSelectChiefComplaints().click();
		Thread.sleep(5000);
		CRR.getChiefComplaintsRemarks().sendKeys("body pain");
		Thread.sleep(1000);
		CRR.getAddComplaintBtn().click();
		Thread.sleep(1000);
		
		
		CRR.getSearchChiefComplaints().sendKeys("Fever");
		CRR.getSearChiefComplaints().click();
		Thread.sleep(5000);
		CRR.getSelectChiefComplaints().click();
		Thread.sleep(5000);
		CRR.getChiefComplaintsRemarks().sendKeys("High Fever and body pain");
		Thread.sleep(1000);
		CRR.getAddComplaintBtn().click();
		Thread.sleep(1000);
		
	//remove chief complaint
		CRR.getChiefComplaintsRemoverButton().click();
		
		//Save chief complaint
		CRR.getChiefComplaintsSaveButton().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	
	
	@Test(priority = 6)
	@Parameters("browser")
	public void CheckFunctionalityOfPastHistory(String Browser) throws InterruptedException {
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}

	    CRR.getPastHistoryTab().click();
	    Thread.sleep(500);
	    
	    

	    // Occupational History
	    
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    utilobj.selectDropdown(CRR.getddlEducation(), driver, "Graduate", Browser);
	    Thread.sleep(500);
	    CRR.getEducationRemarks().sendKeys("B.Tech");
	    
	 
	    utilobj.selectDropdown(CRR.getddlPresentJob(), driver, "Started Job", Browser);
	    Thread.sleep(500);
	    CRR.getPresentJobRemarks().sendKeys("RM Solutions Pvt Ltd");

	    utilobj.selectDropdown(CRR.getddlNatureOFJob(), driver, "Business", Browser);
	    Thread.sleep(500);
	    CRR.getNatureOfJobRemarks().sendKeys("IT Services & Networking");

	    // Smoking History
	    
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    utilobj.selectDropdown(CRR.getddlstatusSmoking(), driver, "Non-Smoker", Browser);
	    Thread.sleep(2000);
	    CRR.getStatusOfSmokingRemarks().sendKeys("No Smoking");

	    utilobj.selectDropdown(CRR.getddlsubstanceOfSmoking(), driver, "Others", Browser);
	    Thread.sleep(3000);
	    CRR.getSmokingSubstanceRemarks().sendKeys("Other");

	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // History of Substance Abuse / Exposure
	    utilobj.selectDropdown(CRR.getddlSubstanceOfAbuseOrExposure(), driver, "Alcohol", Browser);
	    Thread.sleep(3000);
	    CRR.getSubstanceOfAbuseOrExposureRemarks().sendKeys("TEST");

	    // Menstrual History
	    CRR.getAgeOfMenarcheTxtbox().sendKeys("TEST");
	    Thread.sleep(3000);
	    CRR.gettxtLMPOfMenstrual().sendKeys("TEST");

	    // Allergy History
	    CRR.getchkallergy().click();
	    Thread.sleep(3000);
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Known Co-existent Diseases
	    utilobj.selectDropdown(CRR.getddlcoexistentdisease1(), driver, "Anaemia", Browser);
	    Thread.sleep(3000);
	    CRR.getCoexistentdisease1Remarks().sendKeys("TEST");
	    
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // Past Illness
	    utilobj.selectDropdown(CRR.getddlPastIllness1(), driver, "Others", Browser);
	    Thread.sleep(3000);
	    CRR.getPastIllness1Remarks().sendKeys("TEST");
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // Family History of Illness
	    utilobj.selectDropdown(CRR.getddlFamilyHistory1(), driver, "Others", Browser);
	    Thread.sleep(3000);
	    CRR.getFamilyHistory1Remarks().sendKeys("TEST");
	    
	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    // Drug History and Current Medication
	    
	    utilobj.selectDropdown(CRR.getddlDrugHistory1(), driver, "Others", Browser);
	    Thread.sleep(3000);
	    CRR.getDrugHistory1Remarks().sendKeys("TEST");

	    // Clear past history
	    CRR.getPastHistoryClearButton().click();
	    Thread.sleep(4000);
	}

	// Helper method to handle unexpected alerts
	public void handleUnexpectedAlert() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	        wait.until(ExpectedConditions.alertIsPresent());
	        
	        Alert alert = driver.switchTo().alert();
	        System.out.println("Unexpected alert detected: " + alert.getText());
	        alert.accept(); // Dismiss the alert
	    } catch (NoAlertPresentException e) {
	        // No alert detected, continue execution
	    }
	}



	@Test(priority = 7)
	@Parameters("browser")
	public void CheckFunctionalityOfHistoryOfPresentillness(String Browser) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
		CRR.getHistoryOfPresentIllnessTab().click();
		Thread.sleep(3000);
		CRR.gettxtHistoryofPresentIllness().sendKeys("Having fever and feeling week");
		Thread.sleep(3000);
		CRR.gethistoryofPclearbutton().click();
		Thread.sleep(3000);
		CRR.gettxtHistoryofPresentIllness().sendKeys("Having fever and feeling week");
		Thread.sleep(3000);
		CRR.gethistoryofPsavebutton().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		

}
	@Test(priority = 8)
	@Parameters("browser")
	public void CheckFunctionalityOfRefferalAdvice(String Browser) throws InterruptedException {
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    //Save Referral Advice
	    
	    CRR.getReferralAdviceTab().click();
	    Thread.sleep(500);
	    CRR.getradiobtnintra().click();
	    CRR.getdd1Hospitals().click();
	    
	    WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.select2-search__field") ));
	    searchField.sendKeys("ESIC Hospital & Dental College,Rohini");
	    Thread.sleep(2000);

	    WebElement hospitalOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
	     By.xpath("//li[contains(@class, 'select2-results__option--highlighted')]")));

	   
	    Actions actions = new Actions(driver);
	    actions.moveToElement(hospitalOption).click().perform();
	    
	   
	    utilobj.selectDropdown(CRR.getddlESICSpecialization(), driver, "General Medicine", Browser);
	    
	    CRR.gettxtreasonForReferral().sendKeys("testing");
	    Thread.sleep(2000);
	    CRR.getaddbtnReferral().click();
	    Thread.sleep(2000);
	    
	    utilobj.selectDropdown(CRR.getddlESICSpecialization(), driver, "Ayurveda", Browser);
	    Thread.sleep(2000);
	    CRR.gettxtreasonForReferral().sendKeys("testing");
	    Thread.sleep(2000);
	    CRR.getaddbtnReferral().click();
	    Thread.sleep(2000);
	    
	    CRR.getDeleteAdvice().click();
	    Thread.sleep(2000);
	   CRR.getsavebtnfollowup().click();
	   
	  }

		
		
	
	
	@Test(priority = 9)
	@Parameters("browser")
	public void CheckFunctionalityOfFollowUp(String Browser) throws InterruptedException, AWTException{
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CRR.getfollowuptab().click();
		Thread.sleep(4000);
		CRR.getradbtnfollow().click();
		Thread.sleep(4000);
		CRR.gettxtfollowafter().sendKeys("5");
		Thread.sleep(4000);
		CRR.gettxtfollowdate().click();
		Thread.sleep(4000);
		CRR.getbtnAdviceClear().click();
		Thread.sleep(4000);
		CRR.getfollowuptab().click();
		Thread.sleep(4000);
		CRR.getradbtnfollow().click();
		Thread.sleep(4000);
		CRR.gettxtfollowafter().sendKeys("6");
		Thread.sleep(4000);
		CRR.gettxtfollowdate().click();
		Thread.sleep(4000);
		CRR.getsavebtnfollowup().click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
		
		
	@Test(priority = 10)
	@Parameters("browser")
	public void CheckFunctionalityofmedicationInPrescriptions(String Browser) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
		CRR.getPrescriptionTab().click();
		Thread.sleep(2000);
		//Order Packs
		
		CRR.getPrescriptions_SearchOrderPacks().sendKeys("test");
		Thread.sleep(2000);
		CRR.getPrescriptions_MedicationsOrderPacksBtn().click();
		Thread.sleep(2000);
		CRR.getPrescriptions_SelectOrderPacks().click();
		
	//testing purpose
	
	
	//Add medication
	
		Thread.sleep(4000);
		
		CRR.getPrescriptions_AddMedicationsBtn().click();
		Thread.sleep(2000);
		CRR.getAddMedicationsSearchOptions().sendKeys("Test");
		Thread.sleep(2000);
		CRR.getSelectMedicationsOfAddOptions().click();
		Thread.sleep(2000);
		CRR.getEnterDrugDoseMediacations().sendKeys("250");
		Thread.sleep(500);
		utilobj.selectDropdown(CRR.getSelectDrugDoseDropdown(), driver, "mg", Browser);
		Thread.sleep(2000);
		CRR.getDurationOfDrugDoseMedications().sendKeys("5");
		Thread.sleep(2000);
		utilobj.selectDropdown(CRR.getFrequencyOfDrugDoseMedications(), driver, "2X - Twice", Browser);
		Thread.sleep(2000);
		CRR.getQuantityOfDrugDoseMedictions().sendKeys("10");
		Thread.sleep(2000);
		utilobj.selectDropdown(CRR.getQuantityDropDownOfMedications(), driver, "No(s)", Browser);
		CRR.getAddMedicationsOkButton().click();
		Thread.sleep(2000);
		CRR.getAddMediactionsCloseButton().click();
		Thread.sleep(2000);
		
		//Add FUP
		
		String parentWindow = driver.getWindowHandle();

		CRR.getPrescriptions_FUPMedicationsBtn().click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
		    if (!handle.equals(parentWindow)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}

		CRR.getFUPselectoption().click();
		Thread.sleep(2000);
		CRR.getbtnSelectFUP().click();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		
		//Delete Med
		
		CRR.getbtndeleteMed().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();

		alert.accept();
		
		CRR.getPrescriptions_MedicationsSaveButton().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();

		
			
		
	}
	
	@Test(priority = 11)
	@Parameters("browser")
	public void CheckFunctionalityOfInvesitgationPrescriptions(String Browser) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}
		CRR.getPrescriptions_InvestigationsTab().click();
		Thread.sleep(2000);
		CRR.getPrescriptions_AddInvestigationsBtn().click();
		Thread.sleep(2000);
		CRR.gettxtAddInvestigation().sendKeys("test");
		Thread.sleep(2000);
		CRR.getbtnInvestigation().click();
		Thread.sleep(4000);
		CRR.getinvestigationid().click();
		Thread.sleep(4000);
		CRR.getremarkinv().sendKeys("test automation");
		Thread.sleep(4000);
		CRR.getAddinvestOk().click();
		Thread.sleep(4000);
		CRR.getAddinvestclose().click();
		Thread.sleep(4000);
		CRR.getPrescriptions_InvestigationsSaveButton().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		}
	
	@Test(priority = 12)
	@Parameters("browser")
	public void CheckFunctionalityOfDiagnosisPrescriptions(String Browser) throws InterruptedException{
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		try {
			handleUnexpectedAlert();
		} catch (Exception e) {
			e.printStackTrace();
		}

		CRR.getPrescriptions_DiagnosisTab().click();
		Thread.sleep(4000);
		CRR.getPrescriptions_DiagnosisSnomedCTSearch().sendKeys("Test");
		Thread.sleep(4000);
		CRR.getselectdiagnosis().click();
		Thread.sleep(4000);
		CRR.getAddinvestRemark().click();
		Thread.sleep(4000);
		utilobj.selectDropdown(CRR.getAddinvestdropdown(), driver, "Provisional Diagnosis", Browser);
		Thread.sleep(4000);
		CRR.getPrescriptions_AddDiagnosisBtn().click();
		
		//ADD FUP
		
	
		String parentWindow = driver.getWindowHandle();

		CRR.getPrescriptions_FUPDiagnosisBtn().click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
		    if (!handle.equals(parentWindow)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		    
		  }
		
		
		CRR.getFUPselectoption().click();
		Thread.sleep(4000);
		CRR.getbtnSelectFUP().click();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		
		CRR.getDeletediagnosis().click();
		
		Thread.sleep(500);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		CRR.getPrescriptions_DiagnosisSaveButton().click();
		wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
	
	
	@Test(priority = 13)
	@Parameters("browser")
	public void CheckFunctionalityOfclinicaladvicePrescriptions(String Browser) throws InterruptedException{
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	try {
		handleUnexpectedAlert();
	} catch (Exception e) {
		e.printStackTrace();
	}

	CRR.getPrescriptions_AdviceTab().click();
	Thread.sleep(3000);
	CRR.gettxtclinicaladvice().sendKeys("testing automation");
	Thread.sleep(3000);
	CRR.getPrescriptions_AddAdviceBtn().click();
	Thread.sleep(3000);
	CRR.getPrescriptions_AdviceSaveButton().click();
	Thread.sleep(500);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
}
	
	
}