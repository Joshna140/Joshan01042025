package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

@SuppressWarnings("unused")
public class MaternityCertificatePage extends BasePage {
	util utilobj=new util();
	public MaternityCertificatePage(WebDriver driver) {
		super(driver);
	}
	//element located for patient check in
	private By patientCheckInNumberSeviceOkButton=By.id("ctl00_cphpage_btnOK");
	public WebElement getpatientCheckInNumberSeviceOkButton() {
		return getElement(patientCheckInNumberSeviceOkButton);
	}
	private By patientCheckInNumberSaveButton=By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getpatientCheckInNumberSaveButton() {
		return getElement(patientCheckInNumberSaveButton);
	}
	private By popupmessage = By.id("popup_message");
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	private By popup_ok = By.id("popup_ok");
	public WebElement getpopup_ok() {
		return getElement(popup_ok);

	}
	private By BlackOverlay=By.xpath("/html/body/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);
	}
	private By ClinicalRecordsLink = By.linkText("Clinical Records");
	public WebElement getClinicalRecordsLink() {
		return getElement(ClinicalRecordsLink);
		

	}
	private By DoctorWorklistLink = By.linkText("Doctor Worklist");
	public WebElement getDoctorWorklistLink() {
		return getElement(DoctorWorklistLink);

	}
	private By checkinno = By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	public WebElement getcheckinno() {
		return getElement(checkinno);

	}
	private By generalexam = By.id("ctl00_cphpage_trvSectionst5");
	public WebElement getgeneralexam() {
		return getElement(generalexam);

	}
	private By ChkPallor = By.id("TemplatePreviewControl_ChkPallor_0");
	public WebElement getChkPallor() {
		return getElement(ChkPallor);

	}
	private By btnSave = By.id("btnSave");
	public WebElement getbtnSave() {
		return getElement(btnSave);

	}
	private By MatCertifbtn = By.id("ctl00_cphpage_hypMatCertif");
	public WebElement getMatCertifbtn() {
		return getElement(MatCertifbtn);

	}
	private By txtRemark = By.id("TemplatePreviewControl_txtRemark");
	public WebElement gettxtRemark() {
		return getElement(txtRemark);

	}
	private By txtDurationOfPregnancy = By.id("ctl00_cphpage_txtDurationOfPregnancy");
	public WebElement gettxtDurationOfPregnancy() {
		return getElement(txtDurationOfPregnancy);

	}
	private By TypeOfMaternity = By.id("ctl00_cphpage_rbtnlTypeOfMaternity_1");
	public WebElement getTypeOfMaternity() {
		return getElement(TypeOfMaternity);

	}
	private By txtExpectedDateOfConfinement = By.id("ctl00_cphpage_txtdateofConfinement");
	public WebElement gettxtExpectedDateOfConfinement() {
		return getElement(txtExpectedDateOfConfinement);

	}
	private By CalendarExtender12_nextArrow = By.id("ctl00_cphpage_CalendarExtender8_nextArrow");
	public WebElement getCalendarExtender12_nextArrow() {
		return getElement(CalendarExtender12_nextArrow);

	}
	private By CalendarExtender12 = By.id("ctl00_cphpage_CalendarExtender8_day_4_4");
	public WebElement getCalendarExtender12() {
		return getElement(CalendarExtender12);

	}
	private By txtPlaceOfExamination = By.id("ctl00_cphpage_txtPlaceofConfinement");
	public WebElement gettxtPlaceOfExamination() {
		return getElement(txtPlaceOfExamination);

	}
	private By txtFromLeaveDate = By.id("ctl00_cphpage_txtLeavefromConfinement");
	public WebElement txtFromLeaveDate() {
		return getElement(txtFromLeaveDate);

	}
	private By CalendarExtender5 = By.id("ctl00_cphpage_CalendarExtender6_today");
	public WebElement getCalendarExtender5() {
		return getElement(CalendarExtender5);

	}
	private By txtMaternityRemrks = By.id("ctl00_cphpage_txtMaternityRemrks");
	public WebElement gettxtMaternityRemrks() {
		return getElement(txtMaternityRemrks);

	}
	private By medsavebtn = By.id("ctl00_cphpage_btnSave");
	public WebElement getmedsavebtn() {
		return getElement(medsavebtn);

	}
	private By imgCheckinnosearch=By.id("ctl00_cphpage_imgCheckinno");
	public WebElement getimgCheckinnosearch() {
		return getElement(imgCheckinnosearch);
	}
	private By btncancel = By.id("popup_cancel");
	public WebElement getBtncancel() {
		return getElement(btncancel);
	}
	private By checkin_no_link=By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo1");
	public WebElement getcheckin_no_link_Link() {
		return getElement(checkin_no_link);
	}
	private By TxtboxCheckInno=By.id("ctl00_cphpage_txtCheckinno");
	public WebElement getTxtboxCheckInno() {
		return getElement(TxtboxCheckInno);
	}
	private By OpenStanderdCaseSheet=By.id("ctl00_cphpage_btnCOpenCaseSheet");
	public WebElement getOpenStanderdCaseSheet() {
		return getElement(OpenStanderdCaseSheet);
	}
	private By ButtonOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	public WebElement getButtonOK() {
		return getElement(ButtonOK);
	}
	private By btnback=By.id("ctl00_cphpage_btnBack");
	public WebElement getbtnback() {
		return getElement(btnback);
	}
	private By ddlOutcomeofPregnancy=By.id("ctl00_cphpage_ddlOutcomeofPregnancy");
	public WebElement getddlOutcomeofPregnancy() {
		return getElement(ddlOutcomeofPregnancy);
	}
	private By imgConsultation=By.id("ctl00_cphpage_imgConsultation");
	public WebElement getimgConsultation() {
		return getElement(imgConsultation);
	}
	}
