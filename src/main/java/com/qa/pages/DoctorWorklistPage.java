package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class DoctorWorklistPage extends BasePage {
	public DoctorWorklistPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	util utilobj = new util();
boolean checkinformsg;
	String checkinNumber = null; 
	String lblchkin1 = "//span[text()='";
	String lblchkin2 = "']";
	//private By lblBillNo1 = By.linkText(checkinNumber);
	// private By lblBillNo1 = By.xpath(lblchkin1+ checkinNumber +lblchkin2);
	private By checkin_no_link=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	private By ConsultenttabCheck_no_link=By.id("ctl00_cphpage_gdvSearchConsultation_ctl02_lblBillNo1");
	@SuppressWarnings("unused")
	private By MiniSheetOpenLink=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo2");
	                                                 
	private By popok = By.id("popup_ok");
	private By messageok = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	
	                                                
	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");
	                                  /* before */
	//private By lableprecripstionlink = By.("/html/body/div[1]/form/div[4]/div[2]/div/div[1]/table[4]/tbody/tr/td[1]/table/tbody/tr[2]/td/div/div/div/div[2]/table[1]/tbody/tr/td[3]/a");
	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701

	private By orderpackselection = By.id("18929"); //

	private By btnISaveClose = By.id("btnISaveClose"); //
	private By btnclear=By.id("btnClear");
	private By btnclose=By.id("btnIClose");
	private By txtIPNO = By.id("ctl00_cphpage_txtIPNO");

	// Livelist Control

	private By lnkbtnIPNo = By.id("ctl00_cphpage_lnkbtnIPNo");

	private By hisLiveListControlchkUHID = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	private By hisLiveListControlchkUHID2 = By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl03_chkUHID");

	private By hisLiveListControlbtnSelect = By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	private By btnOK = By.xpath("//html//body//div//div[@id='ctl00_cphpage_Panel4']//table//tbody//tr//td//input[@id='ctl00_cphpage_btnOK']");

	private By btnSaveDisplay = By.id("ctl00_cphpage_btnSaveDisplay");

	private By btncancel = By.id("popup_cancel");
	private By ddlSpecialisation = By.id("ctl00_cphpage_ddlSpecialisation");
	private By popupmessage = By.id("popup_message");
	private By DoctorworkListconsultent = By.id("ctl00_cphpage_imgConsultation");
	private By DoctorworkListReferral = By.id("ctl00_cphpage_imgReferral");
	private By DoctorworkListReferral_Link = By.id("ctl00_cphpage_gdvReferrals_ctl02_lblRegCode");
	
	private By DoctorworkListInfo_buttonOK = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	                                                          
	private By DoctorworkListInfo_Specialization = By.id("ctl00_cphpage_imgSpecialization");
	private By DoctorworkListInfo_SpecializationDDL = By.id("ctl00_cphpage_ddlSpecialisation");
	private By DoctorworkListCancelcheckIN = By.id("ctl00_cphpage_gdvSpecialization_ctl02_btnCancelCheckin");
	private By DoctorworkListCancelcheckINYesButton = By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonYes");
	//advice
	private By caseSheetAdviceLink = By.id("ctl00_cphpage_trvSectionst13");
	private By RefferalRadiobutoon = By.id("radbtnadmitafter1");
	private By SpecializationDDL = By.id("ddlESICSpecialization");
	private By ReasonTextbox = By.id("txtreasonForReferral");
	private By addButton = By.xpath("//*[@id='btnOk']");
	private By Save_closeButton = By.id("btnSaveClose");
	private By DoctorworkListCancelcheckINNoButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonNo");
	public WebElement getcaseSheetAdviceLink() {
		return getElement(caseSheetAdviceLink);

	}
	public WebElement getRefferalRadiobutoon() {
		return getElement(RefferalRadiobutoon);

	}
	public WebElement getSpecializationDDL() {
		return getElement(SpecializationDDL);

	}
	public WebElement getReasonTextbox() {
		return getElement(ReasonTextbox);

	}
	public WebElement getaddButton() {
		return getElement(addButton);

	}
	public WebElement getSave_closeButton() {
		return getElement(Save_closeButton);

	}
	public WebElement getDoctorworkListInfo_buttonOK() {
		return getElement(DoctorworkListInfo_buttonOK);

	}
	public WebElement getConsultenttabCheck_no_link() {
		return getElement(ConsultenttabCheck_no_link);

	}
	
	public WebElement getDoctorworkListInfo_Specialization() {
		return getElement(DoctorworkListInfo_Specialization);

	}
	public WebElement getDoctorworkListInfo_SpecializationDDL() {
		return getElement(DoctorworkListInfo_SpecializationDDL);

	}
	public WebElement getDoctorworkListCancelcheckIN() {
		return getElement(DoctorworkListCancelcheckIN);

	}
	public WebElement getDoctorworkListCancelcheckINYesButton() {
		return getElement(DoctorworkListCancelcheckINYesButton);

	}
	public WebElement getDoctorworkListCancelcheckINNoButton() {
		return getElement(DoctorworkListCancelcheckINNoButton);

	}
		
	public WebElement getDoctorworkListReferral() {
		return getElement(DoctorworkListReferral);

	}
	public WebElement getDoctorworkListReferral_Link() {
		return getElement(DoctorworkListReferral_Link);

	}
	
	public WebElement getDoctorworkListconsultent() {
		return getElement(DoctorworkListconsultent);

	}
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	public WebElement getbtn_close_Link() {
		return getElement(btnclose);
	}
	public WebElement getbtn_clear_Link() {
		return getElement(btnclear);
	}
	public WebElement getcheckin_no_link_Link() {
		return getElement(checkin_no_link);
	}

	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}

	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}

	public WebElement getpopok() {
		return getElement(popok);

	}
	
	public WebElement getmessageok() {
		return getElement(messageok);

	}

	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}

	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}

	public WebElement getorderpack() {
		return getElement(orderpack);

	}

	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}

	public WebElement getlblBillNo1(String checkinNumber) {
		return getElement(By.xpath(lblchkin1 + checkinNumber + lblchkin2));
		//// span[text()='OPGENE012200026']
	}

	/*
	 * public WebElement getlblBillNo1(String checkinNumber) { return getElement(
	 * By.linkText(checkinNumber)); //// span[text()='OPGENE012200026'] }
	 */

	public String verifyDoctorWorklistPageTitle() {

		return driver.getTitle();

	}
	public WebElement getTxtIPNO() {
		return getElement(txtIPNO);
	}
	public WebElement getLnkbtnIPNo() {
		return getElement(lnkbtnIPNo);
	}

	public WebElement getHisLiveListControlchkUHID() {
		return getElement(hisLiveListControlchkUHID);
	}
	public WebElement getHisLiveListControlchkUHID2() {
		return getElement(hisLiveListControlchkUHID2);
	}

	public WebElement getHisLiveListControlbtnSelect() {
		return getElement(hisLiveListControlbtnSelect);
	}

	public WebElement getBtnOK() {
		return getElement(btnOK);
	}

	public WebElement getBtnSaveDisplay() {
		return getElement(btnSaveDisplay);
	}

	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	public WebElement getDdlSpecialisation() {
		return getElement(ddlSpecialisation);
	}
	private By TxtboxCheckInno=By.id("ctl00_cphpage_txtCheckinno");
	public WebElement getTxtboxCheckInno() {
		return getElement(TxtboxCheckInno);
	}
	private By imgCheckinnosearch=By.id("ctl00_cphpage_imgCheckinno");
	public WebElement getimgCheckinnosearch() {
		return getElement(imgCheckinnosearch);
	}
	private By CencelCheck_inbtnCClose=By.id("ctl00_cphpage_btnCClose");
	public WebElement getCencelCheck_inbtnCClose() {
		return getElement(CencelCheck_inbtnCClose);
	}
	private By OpenMiniCaseSheet=By.id("ctl00_cphpage_btnCMiniCS");
	public WebElement getOpenMiniCaseSheet() {
		return getElement(OpenMiniCaseSheet);
	}
	private By OpenMiniCaseSheet2=By.id("ctl00_cphpage_btnMiniCS");
	public WebElement getOpenMiniCaseSheet2() {
		return getElement(OpenMiniCaseSheet2);
	}
	private By OpenStanderdCaseSheet=By.id("ctl00_cphpage_btnCOpenCaseSheet");
	public WebElement getOpenStanderdCaseSheet() {
		return getElement(OpenStanderdCaseSheet);
	}
	private By OpenStanderdCaseSheet2=By.id("ctl00_cphpage_btnOpenCaseSheet");
	public WebElement getOpenStanderdCaseSheet2() {
		return getElement(OpenStanderdCaseSheet2);
	}
	private By ClosedButton=By.id("ctl00_cphpage_btnCClose");
	public WebElement getClosedButton() {
		return getElement(ClosedButton);
	}
	private By casesheeetsBackButton=By.id("ctl00_cphpage_btnBack");
	public WebElement getcasesheeetsBackButton() {
		return getElement(casesheeetsBackButton);
	}
	private By DWLInsuranceNumberTxtbox=By.id("ctl00_cphpage_txtinsurenceno");
	public WebElement getDWLInsuranceNumberTxtbox() {
		return getElement(DWLInsuranceNumberTxtbox);
	}
	private By DWLInsuranceSearchImage=By.id("ctl00_cphpage_imageScreenSearch");
	public WebElement getDWLInsuranceSearchImage() {
		return getElement(DWLInsuranceSearchImage);
	}
	private By DWLMiniSheetOpenLink=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo2");
	public WebElement getDWLMiniSheetOpenLink() {
		return getElement(DWLMiniSheetOpenLink);
	}
	
	
	
		public void dotestcaseforDoctorWorkList(String checkinNumber) {

		try

		{

			getcheckin_no_link_Link().click();
			Thread.sleep(2000);
			//getpopok().click();
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphpage_btnBack")).click(); 
			Thread.sleep(2000); 
driver.findElement(By.id("ctl00_cphpage_txtCheckinno")).sendKeys("OPGENE072100109");
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_imgCheckinno")).click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_btnCClose")).click();
Thread.sleep(2000);
getDoctorworkListCancelcheckIN().click();
Thread.sleep(2000);
getDoctorworkListCancelcheckINYesButton().click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_txtReason")).sendKeys("test reason");
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_btnOK")).click();
Thread.sleep(2000);
driver.findElement(By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK")).click();

			// Code for testing purpose Dr Worklist. - Direct Click

			// driver.findElement(By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1")).click();

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}

	public void doCasesheetprecripstion(String orderpackname) {

		try

		{
			getpopok().click();
			Thread.sleep(2000);
			String parent3 = driver.getWindowHandle();

			utilobj.Window(driver);

			getlableprecripstionlink().click();

			Thread.sleep(2000);

			// utilobj.ChildWindowforPrescription(driver);
			utilobj.ChildWindow(driver);
			Thread.sleep(2000);

			// driver.switchTo().window("ClientSide_Prescriptions");
			System.out.println(driver.getTitle());

			utilobj.JSEnterText(gettxtOrdPackSearch(), driver, orderpackname);
			Thread.sleep(2000);

			utilobj.JSClick(getclickorderpackbutton(), driver);
			Thread.sleep(2000);

			// gettxtOrdPackSearch().sendKeys(orderpackname);
			// getclickorderpackbutton().click();

			Thread.sleep(5000);

			utilobj.JSClick(getorderpackselection(), driver);

			Thread.sleep(5000);
//			utilobj.JSClick(getbtn_clear_Link(), driver);
//			Thread.sleep(5000);
//			utilobj.JSClick(getbtn_close_Link(), driver);
			
			utilobj.JSClick(getbtnISaveClose(), driver);

			utilobj.waitForalert(driver);

			driver.switchTo().alert().accept();
			driver.switchTo().window(parent3);

			driver.switchTo().defaultContent();

			getpopok().click();

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}

}
