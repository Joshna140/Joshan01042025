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
	
	private By checkinnospc=By.id("ctl00_cphpage_gdvSearchConsultation_ctl02_lblBillNo1");
	public WebElement getcheckinnospc() {
		return getElement(checkinnospc);
	}
	
	private By ddcontains=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
	public WebElement getddcontains() {
		return getElement(ddcontains);
	}
	
	private By Maternitycertification_IPno=By.id("ctl00_cphpage_imgbtnInsuranceno");
	public WebElement getMaternitycertification_IPnoLink() {
		return getElement(Maternitycertification_IPno);
	}
		private By Maternitycertification_IPno_searchtextbox=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
		public WebElement getMaternitycertification_IPno_searchtextboxLink() {
			return getElement(Maternitycertification_IPno_searchtextbox);
		}
		private By Maternitycertification_IPno_searchbutton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
		public WebElement getMaternitycertification_IPno_searchbuttonlink() {
			return  getElement(Maternitycertification_IPno_searchbutton);
		}
		private By Maternitycertification_IPno_selectRadioButton=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
		public WebElement getMaternitycertification_IPno_selectRadioButtonLink() {
			return getElement(Maternitycertification_IPno_selectRadioButton);
			
		}
		private By Maternitycertification_IPno_selectButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSelect");
		public WebElement getMaternitycertification_IPno_selectButtonLink() {
			return getElement(Maternitycertification_IPno_selectButton);
			
		} 
		private By Maternitycertification_IPno_DDL=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
		public WebElement getMaternitycertification_IPno_DDLLink() {
			return getElement(Maternitycertification_IPno_DDL);
			
		}
		private By Maternitycertification_Layout_Durationofpragnancytxtbox=By.id("ctl00_cphpage_txtDurationOfPregnancy");
		public WebElement getMaternitycertification_Layout_DurationofpragnancytxtboxLink() {
			return getElement(Maternitycertification_Layout_Durationofpragnancytxtbox);
		}                                                                         
		private By Maternitycertification_Layout_ExpectedDateOfConfinement=By.id("ctl00_cphpage_txtExpectedDateOfConfinement");
		public WebElement getMaternitycertification_Layout_ExpectedDateOfConfinementLink() {
			return getElement(Maternitycertification_Layout_ExpectedDateOfConfinement);
		}
		private By Maternitycertification_Layout_DateOfConfinement=By.id("ctl00_cphpage_txtdateofConfinement");
		public WebElement getMaternitycertification_Layout_DateOfConfinement() {
			return getElement(Maternitycertification_Layout_DateOfConfinement);
		}
		
		private By Maternitycertification_Layout_ExpectedDateOfConfinement_date=By.id("ctl00_cphpage_CalendarExtender12_day_1_2");
		public WebElement getMaternitycertification_Layout_ExpectedDateOfConfinement_dateLink() {
			return getElement(Maternitycertification_Layout_ExpectedDateOfConfinement_date);
		}
		private By Maternitycertification_Layout_certificateOfMiscarriageRadioButton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_2");
		public WebElement getMaternitycertification_Layout_certificateOfMiscarriageLink() {
			return getElement(Maternitycertification_Layout_certificateOfMiscarriageRadioButton);
		}
		private By Maternitycertification_Layout_Dateofmiscariege=By.id("ctl00_cphpage_txtdateofMiscariage");
		public WebElement getMaternitycertification_Layout_DateofmiscariegeLink() {
			return getElement(Maternitycertification_Layout_Dateofmiscariege);
		}
		private By Maternitycertification_Layout_Dateofmiscariege_date=By.id("ctl00_cphpage_CalendarExtender11_day_1_2");
		public WebElement getMaternitycertification_Layout_Dateofmiscariege_dateLink() {
			return getElement(Maternitycertification_Layout_Dateofmiscariege_date);
		}
		private By Maternitycertification_Layout_Placeofmiscariege=By.id("ctl00_cphpage_txtPlaceofMiscariage");
		public WebElement getMaternitycertification_Layout_PlaceofmiscariegeLink() {
			return getElement(Maternitycertification_Layout_Placeofmiscariege);
		}
		private By Maternitycertification_layout_certificateOfpregnancyradiobutton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_3");
		public WebElement getMaternitycertification_layout_certificateOfpregnancyradiobuttonLink() {
			return getElement(Maternitycertification_layout_certificateOfpregnancyradiobutton);
		}
		private By Maternitycertification_layout_certificateOfpregnancy_Remarx=By.id("ctl00_cphpage_txtMaternityRemrks");
		public WebElement getMaternitycertification_layout_certificateOfpregnancy_RemarxLink() {
			return getElement(Maternitycertification_layout_certificateOfpregnancy_Remarx);
		}
		private By Maternitycertification_layout_previousCertification_hidebutton=By.id("ctl00_cphpage_Image5");
		public WebElement getMaternitycertification_layout_previousCertification_hidebuttonLink() {
			return getElement(Maternitycertification_layout_previousCertification_hidebutton);
		}                                                                                     //ctl00_cphpage_MyMessageBoxInfo_ButtonOK 
		private By Maternitycertification_layout_previousCertification_WarningmsgboxOk=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
		public WebElement getMaternitycertification_layout_previousCertification_WarningmsgboxOkLink() {
			return getElement(Maternitycertification_layout_previousCertification_WarningmsgboxOk);
		}
		private By Maternitycertification_layout_certificateofconfinementform18RadioButton=By.id("ctl00_cphpage_rbtnlTypeOfMaternity_1");
		public WebElement getMaternitycertification_layout_certificateofconfinementform18RadioButton() {
			return getElement(Maternitycertification_layout_certificateofconfinementform18RadioButton);
		}
		private By Maternitycertification_layout_outcomeofpregnancyDDL=By.id("ctl00_cphpage_ddlOutcomeofPregnancy");
		public WebElement getMaternitycertification_layout_outcomeofpregnancyDDL() {
			return getElement(Maternitycertification_layout_outcomeofpregnancyDDL);
		}
		private By Maternitycertification_layout_Placeofconfinementtxtbox=By.id("ctl00_cphpage_txtPlaceofConfinement");
		public WebElement getMaternitycertification_layout_Placeofconfinementtxtbox() {
			return getElement(Maternitycertification_layout_Placeofconfinementtxtbox);
		}
		private By Maternitycertification_layout_Remarks=By.id("ctl00_cphpage_txtMaternityRemrks");
		public WebElement getMaternitycertification_layout_Remarks() {
			return getElement(Maternitycertification_layout_Remarks);
		}
		private By Maternitycertification_printButton=By.id("ctl00_cphpage_btnPrint");
		public WebElement getMaternitycertification_printButton() {
			return getElement(Maternitycertification_printButton);
		}
		private By Maternitycertification_SaveButton=By.id("ctl00_cphpage_btnSave");
		public WebElement getMaternitycertification_SaveButton() {
			return getElement(Maternitycertification_SaveButton);
		}
		private By Maternitycertification_layout_IWintend=By.id("ctl00_cphpage_txtLeavefromConfinement");
		public WebElement getMaternitycertification_layout_IWintend() {
			return getElement(Maternitycertification_layout_IWintend);
		}
		private By Maternitycertification_SaveButtonSuccesOK=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
		public WebElement getMaternitycertification_SaveButtonSuccesOK() {
			return getElement(Maternitycertification_SaveButtonSuccesOK);
		}
		private By Maternitycertification_ClearButton=By.id("ctl00_cphpage_btnClear");
		public WebElement getMaternitycertification_ClearButton() {
			return getElement(Maternitycertification_ClearButton);
		}
	}
