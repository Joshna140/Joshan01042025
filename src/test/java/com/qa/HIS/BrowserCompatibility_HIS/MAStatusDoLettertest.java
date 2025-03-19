package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MADOLetterpage;
import com.qa.pages.MAStatusDoletterpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MAStatusDoLettertest  extends CrossBrowser {
	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BasePage BasePage;
	MAStatusDoletterpage MAStatusDoLetterpage;
	String EntryNo;
	util utilobj=new util();
	
	
	@Test(priority =0)
	public void doLoginTest() {

		loginpage = new Loginpage(driver);
		util.executeKeyPressCombination(3);
		homepage = loginpage.doLogin(prop.getProperty("HQuidd"), prop.getProperty("StagingPass"));

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
	public void donavigatetoMAletterDOLetter() throws InterruptedException {
		
		Thread.sleep(500);
		MAStatusDoLetterpage = hishomepage.donavigatetoMAStatusDoLetter();
	}
	
	@Test(priority = 4)
	public void mandotaryfields() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
      wait.until(ExpectedConditions.visibilityOf(MAStatusDoLetterpage.getstatusDOLetter()));
     MAStatusDoLetterpage.getstatusDOLetter().click();
		
		
      wait.until(ExpectedConditions.visibilityOf(MAStatusDoLetterpage.getstatusDOLetter()));
      MAStatusDoLetterpage.getbtnPreview().click();
      Thread.sleep(2000);
      driver.switchTo().alert().accept();
     
	}
	@Test(priority = 5)
	public void checkfuturedate() throws InterruptedException {
		
     
		Thread.sleep(1000);
		utilobj.selectDropdown(MAStatusDoLetterpage.getddl_year(), driver, "2024", "firefox");
		Thread.sleep(1000);
		utilobj.selectDropdown(MAStatusDoLetterpage.getddlmonth(), driver, "AUG", "firefox");
		Thread.sleep(1000);
		MAStatusDoLetterpage.getbtnPreview().click();
		 Thread.sleep(2000);
	      driver.switchTo().alert().accept();
		
	}
			
	@Test(priority =6)
	public void MAReportnavigation() throws InterruptedException, IOException {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(MAStatusDoLetterpage.getstatusDOLetter()));
       
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", MAStatusDoLetterpage.getstatusDOLetter());
        Thread.sleep(500);
        MAStatusDoLetterpage.getstatusDOLetter().click();
		Thread.sleep(2000);
	}
	@Test(priority =7)
	public void clearbutton() throws InterruptedException, IOException {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		
		utilobj.selectDropdown(MAStatusDoLetterpage.getddl_year(), driver, "2024", "firefox");
		utilobj.selectDropdown(MAStatusDoLetterpage.getddlmonth(), driver, "JAN", "firefox");
		   Thread.sleep(5000);
	        MAStatusDoLetterpage.getbtnClear().click();
		
}
	@Test(priority =8)
	public void previewbtn() throws InterruptedException, IOException {
		utilobj.selectDropdown(MAStatusDoLetterpage.getddl_year(), driver, "2024", "firefox");
		utilobj.selectDropdown(MAStatusDoLetterpage.getddlmonth(), driver, "JAN", "firefox");
		MAStatusDoLetterpage.getbtnPreview().click();
		Thread.sleep(3000);
		
		
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(MAStatusDoLetterpage.getbtnlast()));
        wait.until(ExpectedConditions.elementToBeClickable(MAStatusDoLetterpage.getbtnlast()));
      		MAStatusDoLetterpage.getbtnlast().click();
      		Thread.sleep(5000);
      		MAStatusDoLetterpage.getfrstpage().click();
      		Thread.sleep(5000);
	}
	
	
      		@Test(priority =9)
      		public void printbtn() throws InterruptedException, IOException {
	
	
      		Thread.sleep(2000);
      		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
      		wait.until(ExpectedConditions.visibilityOf(MAStatusDoLetterpage.getprintbtn()));
      		Thread.sleep(2000);
      		MAStatusDoLetterpage.getprintbtn().click();
      		Thread.sleep(3000);
     		utilobj.SwitchToChildWindow(driver, "Print the Report");
      		Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(MAStatusDoLetterpage.getsubmitexport()));
      		MAStatusDoLetterpage.getsubmitexport().click();
		
	}
}
