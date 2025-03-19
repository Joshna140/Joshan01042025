package com.qa.HIS.BrowserCompatibility_HIS;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.MADOLetterpage;
import com.qa.pages.SelectHospitalLocationPage;
import com.qa.util.util;

@SuppressWarnings("unused")
public class MADOLettertest  extends CrossBrowser {
	
	Loginpage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	BasePage BasePage;
	MADOLetterpage MADOLetterpage;
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
	public void donavigatetoMAletterDOLetter() throws InterruptedException {
		
		Thread.sleep(500);
		MADOLetterpage = hishomepage.donavigatetoMAletterDOLetter();
	}

			
	@Test(priority =4)
	public void MAReportnavigation() throws InterruptedException, IOException {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst201")));
       
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", MADOLetterpage.getDOLetter());
        Thread.sleep(500);
		MADOLetterpage.getDOLetter().click();
		Thread.sleep(2000);
	}
	
	@Test(priority =5)
	public void checkmandatoryfields() throws InterruptedException, IOException {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ctl00_cphpage_cphReport_btnPreview")));
		MADOLetterpage.getbtnPreview().click();
		 Thread.sleep(2000);
	      driver.switchTo().alert().accept();
		
	}
	@Test(priority =6)
	public void checkfuturedate() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		utilobj.selectDropdown(MADOLetterpage.getddyear(), driver, "2024", "firefox");
		Thread.sleep(1000);
		utilobj.selectDropdown(MADOLetterpage.getddlmonth(), driver, "NOV", "firefox");
		MADOLetterpage.getbtnPreview().click();
		 Thread.sleep(1000);
		 utilobj.waitForalert(driver);
	      driver.switchTo().alert().accept();
	}
	
	@Test(priority =7)
	public void clearbutton() throws InterruptedException, IOException {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		
		utilobj.selectDropdown(MADOLetterpage.getddyear(), driver, "2024", "firefox");
		utilobj.selectDropdown(MADOLetterpage.getddlmonth(), driver, "JAN", "firefox");
	
        wait.until(ExpectedConditions.visibilityOf(MADOLetterpage.getbtnClear()));
		MADOLetterpage.getbtnClear().click();
		Thread.sleep(2000);
	

	
	
}
	
	@Test(priority =8)
	public void previewbtn() throws InterruptedException, IOException {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		
		utilobj.selectDropdown(MADOLetterpage.getddyear(), driver, "2024", "firefox");
		utilobj.selectDropdown(MADOLetterpage.getddlmonth(), driver, "JAN", "firefox");
	
        wait.until(ExpectedConditions.visibilityOf(MADOLetterpage.getbtnPreview()));
		MADOLetterpage.getbtnPreview().click();
		Thread.sleep(2000);
}
	
	@Test(priority =9)
	public void nextbtn() throws InterruptedException, IOException {
		MADOLetterpage.getnextbtn().click();
		Thread.sleep(2000);

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(MADOLetterpage.getbtnprew())).click();
	
		
}

		
	@Test(priority =10)
		public void printbtn() throws InterruptedException, IOException {


		Thread.sleep(5000);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_PageUpdateProgress")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[4]/input")));
		MADOLetterpage.getprintbtn().click();
		Thread.sleep(4000);
		utilobj.SwitchToChildWindow(driver, "Print the Report");
		Thread.sleep(5000);


		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitexport")));
		MADOLetterpage.getsubmitexport().click();

}
	}



	
	