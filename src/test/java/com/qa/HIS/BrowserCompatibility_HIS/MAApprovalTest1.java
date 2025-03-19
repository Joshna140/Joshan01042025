package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MAPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


@SuppressWarnings("unused")
public class MAApprovalTest1  extends CrossBrowser {
	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BasePage BasePage;
	MAPage MAPage;
	String EntryNo;
	util utilobj=new util();
	
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
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
	public void doNavigateToMALetterGenerationforHosptitalLinks() throws InterruptedException {
		
		Thread.sleep(500);
		MAPage = hishomepage.doNavigateToMALetterGenerationforHosptitalLinks();
	}

			
	@Test(priority =4)
	public void TC_MA_004() throws InterruptedException, IOException {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(1));
//		String path=System.getProperty("user.dir")+"\\ExcelTestdata";
		wait.until(ExpectedConditions.visibilityOf(MAPage.getddlOPDRegistration()));
		Thread.sleep(2000);
	}
	
	   	@Test(priority =5)
	   
		public void TC_MA_Page1_Availabiity_facilities() throws InterruptedException {
	    WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(1));
	    Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(MAPage.getddlOPDRegistration()));
	    MAPage.getddlOPDRegistration().sendKeys("Fully");
		MAPage.getddlOPDDoctor().sendKeys("Fully");
		MAPage.getddlIPDAdmission().sendKeys("Fully");
		MAPage.getddlIPDDoctor().sendKeys("Fully");
		MAPage.getddlERPMM().sendKeys("Fully");
		MAPage.getddlPharmacy().sendKeys("Fully");
		MAPage.getddlLaboratory().sendKeys("Fully");
		MAPage.getddlRadiology().sendKeys("Fully");
		MAPage.getddlOT().sendKeys("Fully");
		MAPage.getddlP1().sendKeys("Fully");
		MAPage.getddlUTI().sendKeys("Fully");
		MAPage.getddlERPTieUpBills().sendKeys("Fully");
	   	}
		

     @Test(priority =6)
	public void TC_MA_ALL_checkbox() throws InterruptedException {
	
    	Thread.sleep(500);
		MAPage.getchkSanctionedBed().click();
		MAPage.getchkCommissionedBeds().click();
		MAPage.getchkIPCovered().click();
		MAPage.getchkOldOPDAttendance().click();
		MAPage.getchkTotalAdmissions().click();
		MAPage.getchkDeaths().click();
		MAPage.getchkEmergencyPatients().click();
		MAPage.getchkExistingOT().click();
		MAPage.getchkFunctionalOT().click();
		MAPage.getchkMinorSurgeries().click();
		MAPage.getchkMajorsurgeries().click();
		MAPage.getchkCancelledsurgeries().click();
		MAPage.getchkDeathOperationTable().click();
		MAPage.getchkAnaesthesiaMortality().click();
		MAPage.getchkSurgicalInfectionRate().click();
		MAPage.getchkNormalDeliveries().click();
		MAPage.getchkCSectionDeliveries().click();
		MAPage.getchkLiveBirths().click();
		MAPage.getchkStillBirths().click();
		MAPage.getchkNeonatalDeaths().click();
		MAPage.getchkMTPs().click();
		MAPage.getchkLSCSRate().click();
		MAPage.getchkMaternalMortality().click();
		MAPage.getchkNeonatalMortality().click();
		MAPage.getchkInfantMortality().click();
		MAPage.getchkXRayPerformed().click();
		MAPage.getchkUltasoundPerformed().click();
		MAPage.getchkCTScanPerformed().click();
		MAPage.getchkMRIScanPerformed().click();
		MAPage.getchkRadiologyPerformed().click();
		MAPage.getchkXRayReporting().click();
		MAPage.getchkPathology().click();
		MAPage.getchkMicrobiology().click();
		MAPage.getchkBiochemistry().click();
}
	
	@Test(priority =7)
	public void TC_MA_All_remarks() throws InterruptedException, IOException {
		String txt="129.47jhdgh'.;][32bqwie bcqiy wbdiqb wdi qiwduqwi dnqwiduqni xetcytvubinompsdcf vygubhinjmrdtfcgv @.";
		
		Thread.sleep(500);
		MAPage.gettxtOperationTheatreRemarks().sendKeys(txt);
		MAPage.gettxtMaternalRemarks().sendKeys(txt);
		MAPage.gettxtRadiologyRemarks().sendKeys(txt);
		MAPage.gettxtLaboratoryRemarks().sendKeys(txt);
		assertEquals(MAPage.gettxtOperationTheatreRemarks().getAttribute("value"), txt);
		assertEquals(MAPage.gettxtMaternalRemarks().getAttribute("value"), txt);
		assertEquals(MAPage.gettxtRadiologyRemarks().getAttribute("value"), txt);
		assertEquals(MAPage.gettxtLaboratoryRemarks().getAttribute("value"), txt);



}
	
	
	@Test(priority =8)
	public void TC_MA_Rechecking_All() throws InterruptedException {
		
    	Thread.sleep(500);
		MAPage.getchkSanctionedBed().click();
		MAPage.getchkCommissionedBeds().click();
		MAPage.getchkIPCovered().click();
		MAPage.getchkOldOPDAttendance().click();
		MAPage.getchkTotalAdmissions().click();
		MAPage.getchkDeaths().click();
		MAPage.getchkEmergencyPatients().click();
		MAPage.getchkExistingOT().click();
		MAPage.getchkFunctionalOT().click();
		MAPage.getchkMinorSurgeries().click();
		MAPage.getchkMajorsurgeries().click();
		MAPage.getchkCancelledsurgeries().click();
		MAPage.getchkDeathOperationTable().click();
		MAPage.getchkAnaesthesiaMortality().click();
		MAPage.getchkSurgicalInfectionRate().click();
		MAPage.getchkNormalDeliveries().click();
		MAPage.getchkCSectionDeliveries().click();
		MAPage.getchkLiveBirths().click();
		MAPage.getchkStillBirths().click();
		MAPage.getchkNeonatalDeaths().click();
		MAPage.getchkMTPs().click();
		MAPage.getchkLSCSRate().click();
		MAPage.getchkMaternalMortality().click();
		MAPage.getchkNeonatalMortality().click();
		MAPage.getchkInfantMortality().click();
		MAPage.getchkXRayPerformed().click();
		MAPage.getchkUltasoundPerformed().click();
		MAPage.getchkCTScanPerformed().click();
		MAPage.getchkMRIScanPerformed().click();
		MAPage.getchkRadiologyPerformed().click();
		MAPage.getchkXRayReporting().click();
		MAPage.getchkPathology().click();
		MAPage.getchkMicrobiology().click();
		MAPage.getchkBiochemistry().click();
}
	
	@Test(priority =9)
	public void TC_MA_Redo_All_dropdown() throws InterruptedException {
	   
	    Thread.sleep(500);
		MAPage.getddlSanctionedBed().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlCommissionedBeds().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlIPCovered().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlOldOPDAttendance().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlTotalAdmissions().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlDeaths().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlEmergencyPatients().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlExistingOT().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlFunctionalOT().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlMinorSurgeries().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlMajorsurgeries().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlCancelledsurgeries().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlDeathOperationTable().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlAnaesthesiaMortality().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlSurgicalInfectionRate().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlNormalDeliveries().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlCSectionDeliveries().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlLiveBirths().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlStillBirths().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlNeonatalDeaths().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlMTPs().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlLSCSRate().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlMaternalMortality().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlNeonatalMortality().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlInfantMortality().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlXRayPerformed().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlUltasoundPerformed().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlCTScanPerformed().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlMRIScanPerformed().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlRadiologyPerformed().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlXRayReporting().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlPathology().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlMicrobiology().sendKeys("Partially using Dhanwantri Application");
		MAPage.getddlBiochemistry().sendKeys("Partially using Dhanwantri Application");


}
	
	@Test(priority =10)
	public void TC_MA_Redo_Manual_And_Auto_entries() throws InterruptedException, IOException, AssertionError {
		String txt="123471234";
		String sum ="246942468";
		
		MAPage.gettxtOldOPDAttendanceManual().sendKeys(txt);
		MAPage.gettxtNewOPDAttendanceManual().sendKeys(txt);
		MAPage.gettxtCommissionedBedsManual().sendKeys(txt);
		Thread.sleep(2000);
		assertEquals(MAPage.gettxtTotalAttendanceManual().getAttribute("value"), sum);
		System.out.println(MAPage.gettxtTotalAttendanceManual().getAttribute("value"));
		Thread.sleep(2000);
		MAPage.gettxtWorkingDaysManual().sendKeys(txt);
		MAPage.gettxtIPCoveredManual().sendKeys(txt);
		assertEquals(MAPage.gettxtAverageOPDAttendanceManual().getAttribute("value"), "2");
		System.out.println(MAPage.gettxtAverageOPDAttendanceManual().getText());
		Thread.sleep(2000);
		
		
		MAPage.gettxtTotalAdmissionsManual().sendKeys(txt);
		MAPage.gettxtDeathsManual().sendKeys(txt);
		MAPage.gettxtEmergencyPatientsManual().sendKeys(txt);
		MAPage.gettxtExistingOTManual().sendKeys(txt);
		MAPage.gettxtFunctionalOTManual().sendKeys(txt);
		MAPage.gettxtMinorSurgeriesManual().sendKeys(txt);
		MAPage.gettxtMajorsurgeriesManual().sendKeys(txt);
		
		MAPage.gettxtDeathOperationTableManual().sendKeys(txt);
		MAPage.gettxtAnaesthesiaMortalityManual().sendKeys(txt);
		MAPage.gettxtNormalDeliveriesManual().sendKeys(txt);
		MAPage.gettxtCSectionDeliveriesManual().sendKeys(txt);
		MAPage.gettxtLiveBirthsManual().sendKeys(txt);
		MAPage.gettxtStillBirthsManual().sendKeys(txt);
		MAPage.gettxtNeonatalDeathsManual().sendKeys(txt);
		MAPage.gettxtMTPsManual().sendKeys(txt);
		MAPage.gettxtMaternalMortalityManual().sendKeys(txt);
		MAPage.gettxtNeonatalMortalityManual().sendKeys(txt);
		MAPage.gettxtInfantMortalityManual().sendKeys(txt);
		MAPage.gettxtXRayPerformedManual().sendKeys(txt);
		MAPage.gettxtUltasoundPerformedManual().sendKeys(txt);
		MAPage.gettxtCTScanPerformedManual().sendKeys(txt);
		MAPage.gettxtMRIScanPerformedManual().sendKeys(txt);
		MAPage.gettxtRadiologyPerformedManual().sendKeys(txt);
		MAPage.gettxtXRayReportingManual().sendKeys(txt);
		MAPage.gettxtPathologyManual().sendKeys(txt);
		MAPage.gettxtMicrobiologyManual().sendKeys(txt);
		MAPage.gettxtBiochemistryManual().sendKeys(txt);
		
	}
	
	@Test(priority =11)
	public void TC_MA_Redo_All_float_values() throws InterruptedException, IOException {
		String txt="1234719.47";
		
		Thread.sleep(500);
		MAPage.gettxtCancelledsurgeriesManual().sendKeys(txt);
		MAPage.gettxtSurgicalInfectionRateManual().sendKeys(txt);
		MAPage.gettxtLSCSRateManual().sendKeys(txt);
		assertEquals(MAPage.gettxtCancelledsurgeriesManual().getAttribute("value"), txt);
		assertEquals(MAPage.gettxtSurgicalInfectionRateManual().getAttribute("value"), txt);
		assertEquals(MAPage.gettxtLSCSRateManual().getAttribute("value"), txt);


}
	
	@Test(priority =12)
	
	public void TC_MA_Page_1_mandatory_alert_check() throws InterruptedException, IOException {
		
			
			try {
				MAPage.getbtnNext().click();
				Thread.sleep(500);
				MAPage.getbtnNext().sendKeys(Keys.ENTER);
				Thread.sleep(500);
			    Alert alert = driver.switchTo().alert();
			    Thread.sleep(500);
			    // You can get the text of the alert and handle it accordingly
			    System.out.println("Alert message: " + alert.getText());
			    assertEquals(alert.getText(), "Please enter Sanctioned Beds.");
			    // You can dismiss the alert using the dismiss() method
			    alert.dismiss();
			    // Or you can accept it using the accept() method
			    // alert.accept();
			    
			    // Continue with your test script
			} catch (UnhandledAlertException e) {
			    // Log the exception or handle it appropriately
			    e.printStackTrace();
			}

		
}
	@Test(priority =13)
	public void TC_MA_Page_1_SanctionedBedsManual() throws InterruptedException, IOException {
		String SanctionedBeds="1234712345";
		Thread.sleep(500);
		MAPage.gettxtSanctionedBedsManual().sendKeys(SanctionedBeds);
		
		
	}
	
	@Test(priority =14)
	public void TC_MA_Page_1_save_and_next_and_previous() throws InterruptedException, IOException {
		
		
		Thread.sleep(500);
		MAPage.getbtnNext().click();
		
	}
	

}
	




	
	
	
	


	

