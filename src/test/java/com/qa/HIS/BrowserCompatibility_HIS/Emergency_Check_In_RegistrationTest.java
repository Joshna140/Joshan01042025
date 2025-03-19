package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Random;
import java.util.logging.LogManager;

import org.apache.tools.ant.taskdefs.Echo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jogamp.newt.event.KeyEvent;
import com.qa.pages.Emergency_Check_In_RegistrationPages;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

@SuppressWarnings("unused")
public class Emergency_Check_In_RegistrationTest extends CrossBrowser{
	final Logger logger = LoggerFactory.getLogger(Emergency_Check_In_RegistrationTest.class);
	public Emergency_Check_In_RegistrationTest() {
		
	}
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	Emergency_Check_In_RegistrationPages ECP;
	util utilobj=new util();
	String AdmissionNu;
	String UHIDNu;
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
		homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("StagingPass"));

	}
	
	
	@Test(priority =1)//IP072100036
	public void doNavigateToSelectHospitalLocationTest() {

		selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
	}
	
	@Test(priority =2)
	@Parameters("browser")
	public void doNavigateToHISHomeTest(String Browser) throws InterruptedException {

		hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"),Browser);
	}
	
	@Test(priority =3 )
	public void doNavigateToEmergency_Check_In_RegistrationPagesLink() throws InterruptedException {
		ECP = hishomepage.donavigateToEmergency_Check_In_Registration();
		
	}
	@Test(priority = 4)
	@Parameters("browser")
	public void Registration_Emergency_Checkin_Registration_TC_1(String Browser) throws InterruptedException {
		
		Random F=new Random();
		int Num=F.nextInt(2000);
		System.out.println("Random ="+Num);
		String Fname=Integer.toString(Num);
		utilobj.selectDropdown(ECP.getECRIP_titleDDL(), driver, "Mr.",Browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ECP.getECRIP_Firstname().sendKeys("Test"+Fname);
		
		ECP.getECRIP_Age().sendKeys("30");
		Thread.sleep(1000);
	    utilobj.selectDropdown(ECP.getECRIP_AdmisiontypeDDL(), driver, "Emergency", Browser);
	    Thread.sleep(2000);
	    
	    
	    utilobj.selectDropdown(ECP.getECRIP_AdmisionsrcDDl(), driver, "Walk In", Browser);
	    Thread.sleep(2000);
	    utilobj.selectDropdown(ECP.getECRIP_Specialisation_DDL(), driver, "General Medicine",Browser);
	    Thread.sleep(2000);
	    utilobj.selectDropdown(ECP.getECRIP_Unit_DDL(), driver, "Medicine", Browser);
	    Thread.sleep(2000);
	    utilobj.selectDropdown(ECP.getECRIP_WardTypeDLL(), driver, "CASUALTY / EMERGENCY", Browser);
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div[4]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]")));
	    
            logger.info("Sleeping for 1000 milliseconds");
            Thread.sleep(1000);

            logger.info("Clicking using JavaScript");
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
            utilobj.JSClick(ECP.getECRIP_SaveButton(), driver);
            
            logger.info("Sleeping for 4000 milliseconds");
            Thread.sleep(4000);

            logger.info("Waiting for visibility of Information message OK button");
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
            wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_InformationmsgOKBUTTON()));

            logger.info("Clicking Information message OK button");
            ECP.getECRIP_InformationmsgOKBUTTON().click();
            
            Thread.sleep(4000);
            logger.info("Waiting for visibility of Success message OK button");
//            wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_SuccesmsgOKBUTTON()));
            
//            if (driver.findElement(By.id("btnLogin")).isEnabled()) {
//            	
//            	logger.info("Success message OK button not found");
//            	driver.findElement(By.id("btnLogin")).sendKeys(Keys.ALT,Keys.ARROW_LEFT);
//            	driver.close();
//            }
            
            logger.info("Checking if Success message OK button is displayed");
            boolean visibleSaveMSG = ECP.getECRIP_SuccesmsgOKBUTTON().isDisplayed();
            System.out.println(visibleSaveMSG);
            logger.info("Interrupted?");
//    	
            logger.info("Clicking Success message OK button using JavaScript");
            utilobj.JSClick(ECP.getECRIP_SuccesmsgOKBUTTON(), driver);
        
        
            logger.info("Waiting for Success message OK button to become invisible");
            wait.until(ExpectedConditions.invisibilityOf(ECP.getECRIP_SuccesmsgOKBUTTON()));
        
//          catch (TimeoutException g) {
//            logger.error("Timeout Exception occurred", g);
//            driver.findElement(By.id("btnLogin")).sendKeys(Keys.ALT,Keys.ARROW_LEFT);
//            driver.close();
//            return;
          
            String expectedvalue = "true";
            logger.info("Verifying if Success message OK button is not displayed");
            assertEquals(visibleSaveMSG, expectedvalue.equalsIgnoreCase("true"));
            
        
    	
		}
		
	    


	@Test(priority = 5)
	public void Registration_Emergency_Checkin_Registration_TC_8() throws InterruptedException {
		Thread.sleep(2000);
	    AdmissionNu=ECP.getECRIP_AdmissionNotxtbox().getAttribute("value");
	    Thread.sleep(2000);
	    UHIDNu=ECP.getECRIP_UHIDNotxtbox().getAttribute("value");
	    System.out.println(AdmissionNu+" "+UHIDNu); 
		 Thread.sleep(2000);
		 
		ECP = hishomepage.donavigateToEmergency_Check_In_Registration();
		 System.out.println(AdmissionNu+" "+UHIDNu);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		ECP.getECRIP_IMGadmissionSearch().click();
		wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_IMGadmissionSearch_txtbox()));
		ECP.getECRIP_IMGadmissionSearch_txtbox().sendKeys(AdmissionNu);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		ECP.getECRIP_IMGadmissionSearch_Searchbutton().click();
		wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_IMGadmissionSearch_Radiobutton()));
		ECP.getECRIP_IMGadmissionSearch_Radiobutton().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		ECP.getECRIP_IMGadmissionSearch_Selectbutton().click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_SaveButton()));	
	}
	@Test(priority = 6)
    public void	Registration_Emergency_Checkin_Registration_TC_5() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		ECP.getECRIP_DepositeButton().click();
		
		Thread.sleep(3000);	
		utilobj.SwitchToChildWindow(driver, " 	DepositDetails-Dhanwantri ");
	Thread.sleep(3000);		

	driver.findElement(By.id("txtamt")).sendKeys("2000");
	Thread.sleep(2000);	
	driver.findElement(By.id("btnSaveDepositDetails")).click();
	
	Thread.sleep(2000);
	utilobj.SwitchToChildWindow(driver, "Dhanwantri");
		
	}
	@Test(priority = 7)
	public void Registration_Emergency_Checkin_Registration_TC_7() throws InterruptedException {
		Thread.sleep(2000);
		ECP = hishomepage.donavigateToEmergency_Check_In_Registration();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
		ECP.getECRIP_IMgUHIDSearch().click();
		wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_IMGadmissionSearch_txtbox()));
		ECP.getECRIP_IMGadmissionSearch_txtbox().sendKeys(UHIDNu);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		ECP.getECRIP_IMGadmissionSearch_Searchbutton().click();
		wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_IMGadmissionSearch_Radiobutton()));
		ECP.getECRIP_IMGadmissionSearch_Radiobutton().click();
		wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_IMGadmissionSearch_Selectbutton()));
		ECP.getECRIP_IMGadmissionSearch_Selectbutton().click();
		wait.until(ExpectedConditions.visibilityOf(ECP.getECRIP_SaveButton()));

	}
	@Test(priority = 8)
	public void Registration_Emergency_Checkin_Registration_TC_2() throws InterruptedException {
		Thread.sleep(3000);
		utilobj.JSClick(ECP.getECRIP_SaveButton(),driver);
		Thread.sleep(3000);
		utilobj.JSClick(ECP.getECRIP_SuccesmsgOKBUTTON(),driver);
	}
	
	@Test(priority = 9)
	public void Registration_Emergency_Checkin_Registration_TC_3() throws InterruptedException {
		Thread.sleep(2000);
		utilobj.JSClick(ECP.getECRIP_PrintButton(),driver);//print
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "PrintReports.aspx");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		utilobj.SwitchToChildWindow(driver, "EmergencyAdmission");
		Thread.sleep(2000);

		
	}
	@Test(priority = 10)
	public void Registration_Emergency_Checkin_Registration_TC_4() throws InterruptedException {
	Thread.sleep(2000);
	utilobj.JSClick(ECP.getECRIP_ClearButton(),driver);
	}
}