package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.ANMServicesPage;
import com.qa.pages.DosageTypePage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PatientCheckInPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class DosageTypeTest extends CrossBrowser{
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	DosageTypePage DTP;
	String DosageTypeName;
   
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
	public void doNavigateToDosageType() {

		DTP = hishomepage.doNavigateToDosageTypePageLink();
	}
	@Test(priority = 4)
	public void CLM_Dosage_Types_TC_4() throws InterruptedException {
		Random F=new Random();
		int Num=F.nextInt(4000);
		String Fname=Integer.toString(Num);
		DosageTypeName="TestDosageType"+Fname;
		DTP.getDosagetypeTextBox().sendKeys(DosageTypeName);
		
		Thread.sleep(3000);
		DTP.getDosageTypeSearch_UpDate().click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(DTP.getDosageType_MessageButtonOK()));
		Thread.sleep(2000);
		DTP.getDosageType_MessageButtonOK().click();
		Thread.sleep(2000);
		
	}
	@Test(priority = 5)
	public void CLM_Dosage_Types_TC_6() throws InterruptedException, AWTException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		Thread.sleep(2000);
		DTP.getDosageTypeIMG_search().click();
		Thread.sleep(2000);
		DTP.getDosageTypeSearch_TextBox().sendKeys(DosageTypeName);
		Thread.sleep(2000);
		DTP.getDosageTypeSearch_BTNSearch().click();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(DTP.getDosageTypeSearch_RadioButton()));
		DTP.getDosageTypeSearch_RadioButton().click();
		Thread.sleep(2000);
		DTP.getDosageTypeSearch_SelectButton().click();
		Thread.sleep(2000);
		DTP.getDosageTypeSearch_UpDate().click();
		int FatalError = 0;
		try {
			if (driver.findElement(By.id("lblDisplayMessage")).isDisplayed() == true) {
			try {
	            FatalError = 1;
	
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(FatalError, 0, "Fatal Error has Occured, Page redirected to the blank page quoted with 'Unable To Process the Request.Please Try Again.'");
		Thread.sleep(2000);
		DTP.getDosageType_MessageButtonOK().click();
		Thread.sleep(2000);
		}
}
