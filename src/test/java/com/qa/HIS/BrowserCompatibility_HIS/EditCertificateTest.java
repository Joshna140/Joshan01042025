package com.qa.HIS.BrowserCompatibility_HIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.tools.ant.taskdefs.Echo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.EditCertificatePage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.OpenVisitPage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class EditCertificateTest extends CrossBrowser {
	public EditCertificateTest() {
		
	}
	util utilobj = new util();
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	EditCertificatePage ECP;
	
	@Test(priority = 0)
	public void doLoginOpenVisitTest() {

		loginpage = new Loginpage(driver);

		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

	}

	@Test(priority = 1)
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}

	@Test(priority = 2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"),
				prop.getProperty("facilityName"),browser);
	}

	@Test(priority = 3)
	public void doNavigateToEditCertificateTest() {

		ECP=hishomepage.doNavigateToEditCertificatePageLink();		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void CheckTheFunctionalityOfRequestForChangedUPdateButton(String browser) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		driver.manage().window().maximize();
		ECP.getEditCertificate_SearchImage().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_Insurance_NO_DLL(), driver, "Starts With",browser);
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_NO_TextBox().sendKeys("1199900");
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SearchButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_RadioButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SelectButton().click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		ECP.getEditCertificate_RadioButtonSpellchange().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButtonCencetCertificate().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_CertificateTypeChange().click();
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-First",browser);
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-Intermediate",browser);
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-Final",browser);
		Thread.sleep(1000);
		utilobj.selectDropdown(ECP.getEditCertificate_RadioButton_DDLTypeChange(), driver, "Medical Certificate-Special Intermediate",browser);
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_DOA_DOCChanged().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_ButtonUpdate().click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_cphpage_MyMessageBox_ButtonOK")).click();
		Thread.sleep(1000);
	}

	@Test(priority = 5)
	@Parameters("browser")
	public void ChecktheFunctionalityOfUpdateButtonOfEditMeternityCertificatePages(String browser) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement searchImage = wait.until(ExpectedConditions.elementToBeClickable(ECP.getEditCertificate_SearchImage()));

		ECP.getEditCertificate_SearchImage().click();
		utilobj.selectDropdown(ECP.getEditCertificate_Insurance_NO_DLL(), driver, "Starts With",browser);
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_NO_TextBox().sendKeys("1199900");
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SearchButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_RadioButton().click();
		Thread.sleep(1000);
		ECP.getEditCertificate_Certification_No_SelectButton().click();
		Thread.sleep(1000);
		try {
		    WebElement remarksTextBox = wait.until(ExpectedConditions.visibilityOf(ECP.getEditMeterNityCertificate_RemarksTextBoxElement()));

		    // If found and visible, interact with it
		    remarksTextBox.clear();
		    remarksTextBox.sendKeys("Test Remark");

		} catch (Exception e) {
		    Assert.fail("Remarks text box is not visible even after waiting.", e);
		}
		Thread.sleep(1000);
		ECP.getEditCertificate_RadioButton_ButtonUpdate().click();
		Thread.sleep(1000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		
}
	}
