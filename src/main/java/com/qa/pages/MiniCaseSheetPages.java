package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.util;

@SuppressWarnings("unused")
public class MiniCaseSheetPages extends BasePage {
	util utilobj=new util();
	public MiniCaseSheetPages(WebDriver driver) {
		super(driver);
	}
	//element located for patient check in
	private By patientcheck_in_ip_txtbox=By.id("ctl00_cphpage_txtIPNO");
	public WebElement getpatientcheck_in_ip_txtboxLink() {
		return getElement(patientcheck_in_ip_txtbox);
	}
	private By patientcheck_in_LiveList_link=By.id("ctl00_cphpage_lnkbtnIPNo");
	public WebElement getpatientcheck_in_LiveList_linkLink() {
		return getElement(patientcheck_in_LiveList_link);
	}
	private By patientcheck_in_Livelist_select_UHID=By.id("ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl02_chkUHID");
	//ctl00_cphpage_hisLiveListControl_gdvInsurance_ctl04_chkUHID
	public WebElement getpationcheck_in_Livelist_select_UHIDradiobuttonLink() {
		return getElement(patientcheck_in_Livelist_select_UHID);
	}
	private By patientcheck_in_Livelist_Selectbutton=By.id("ctl00_cphpage_hisLiveListControl_btnSelect");
	public WebElement getpatientcheck_in_Livelist_SelectbuttonLink() {
		return getElement(patientcheck_in_Livelist_Selectbutton);
	}
	private By patientcheckin_registration_selectddl=By.id("ctl00_cphpage_ddlSpecialisation");
	public WebElement getpatientcheckin_registration_selectddlLink() {
		return getElement(patientcheckin_registration_selectddl);
	}
	private By patientcheck_in_registration_okbutton=By.id("ctl00_cphpage_btnOK");
	public WebElement getpatientcheck_in_registration_okbuttonLink() {
		return getElement(patientcheck_in_registration_okbutton);
	}
	private By patientcheck_in_registration_savebutton=By.id("ctl00_cphpage_btnSaveDisplay");
	public WebElement getpatientcheck_in_registration_savebuttonLink() {
		return getElement(patientcheck_in_registration_savebutton);
	}
	private By popcancelbutton=By.id("popup_cancel");
	public WebElement getpopcencelbuttonLink() {
		return getElement(popcancelbutton);
	}
	private By popokbutton=By.id("popup_ok");
	public WebElement getpopokbuttonLink() {
		return getElement(popokbutton);
	}
//element located minicase sheet
	private By MiniCaseSheetOpenLink =By.id("ctl00_cphpage_gdvSpecialization_ctl02_lblBillNo2");
	public WebElement getMiniCaseSheetOpenLink() {
		return getElement(MiniCaseSheetOpenLink);
	}
	private By minicasesheetcmplatetxt_box=By.id("ctl00_cphpage_txt_complaint");
	public WebElement getminicasesheetcmplatetxt_boxLink() {
		return getElement(minicasesheetcmplatetxt_box);
	}
	private By popupmessage = By.id("popup_message");
	public WebElement getPopupmessage() {
		return getElement(popupmessage);

	}
	private By minicasesheetcmplain_autoserch=By.id("Abuse of disabled person");
	public WebElement getminicasesheetcmplain_autoserchLink() {
		return getElement(minicasesheetcmplain_autoserch);
		
	}
	private By minicasesheetcmplain_remark_explanations=By.id("ctl00_cphpage_txtExplanationsRemarks");
	public WebElement getminicasesheetcmplain_remark_explanationsLink() {
		return getElement(minicasesheetcmplain_remark_explanations);
	}
	private By minicasesheet_addcomplainbutton=By.id("ctl00_cphpage_btn_Add");
	public WebElement getminicasesheet_addcomplainbuttonlink() {
		return getElement(minicasesheet_addcomplainbutton);
	}
	private By minicasesheet_othercomplain=By.id("ctl00_cphpage_txtOtherComplaints");
	public WebElement getminicasesheet_othercomplainlink() {
		return getElement(minicasesheet_othercomplain);
		
	}
private By minicasesheet_pallor_chkbox_yes=By.id("ctl00_cphpage_ChkPallor_0");
public WebElement getminicasesheet_pallor_chkbox_yesLink() {
	return getElement(minicasesheet_pallor_chkbox_yes);
}
private By minicasesheet_caynosis_chkbox_yes=By.id("ctl00_cphpage_rdbCyanosis_0");
public WebElement getminicasesheet_caynosis_chkbox_yesLink() {
	return getElement(minicasesheet_caynosis_chkbox_yes);
}
private By minicasesheet_icterus_chkbox_yes=By.id("ctl00_cphpage_rdlIcterus_0");
public WebElement getminicasesheet_icterus_chkbox_yesLink() {
	return getElement(minicasesheet_icterus_chkbox_yes);
}
private By minicasesheet_clubbing_chkbox_yes=By.id("ctl00_cphpage_chkClubbing_0");
public WebElement getminicasesheet_clubing_chkbox_yesLink() {
	return getElement(minicasesheet_clubbing_chkbox_yes);
}
private By  minicasesheet_pallor_remark_txtbox=By.id("ctl00_cphpage_txtRemark01");
public WebElement getminicasesheet_pallor_remark_txtboxLink() {
	return getElement(minicasesheet_pallor_remark_txtbox);
}
private By minicasesheet_cynosis_remark_txtbox=By.id("ctl00_cphpage_txtRemarksCyanosis");
public WebElement getminicasesheet_cynosis_remark_txtboxLink() {
	return getElement(minicasesheet_cynosis_remark_txtbox);
}
private By minicasesheet_iceterus_remark_txtbox=By.id("ctl00_cphpage_txtRemarkIcterus");
public WebElement getminicasesheet_iceterus_remark_txtboxLink() {
	return getElement(minicasesheet_iceterus_remark_txtbox);
}

private By minicasesheet_clubing_remark_txtbox=By.id("ctl00_cphpage_txtRemarksClubbing");
public WebElement getminicasesheet_clubing_remark_txtboxLink() {
	return getElement(minicasesheet_clubing_remark_txtbox);
}
private By minicasesheet_skinchanges_radiobutton=By.id("ctl00_cphpage_radSkinChanges_0");
public WebElement getminicasesheet_scinchanges_radiobuttonLink() {
	return getElement(minicasesheet_skinchanges_radiobutton);
}
private By minicasesheet_naturetxtbox=By.id("ctl00_cphpage_txtRemarksSkinChanges");
public WebElement getminicasesheet_naturetxtboxLink() {
	return getElement(minicasesheet_naturetxtbox);
}
private By minicasesheet_hydration_status_radiobutton_normal=By.id("ctl00_cphpage_radHydrationStatus_0");
public WebElement getminicasesheet_hydration_status_radiobutton_normalLink() {
	return getElement(minicasesheet_hydration_status_radiobutton_normal);
}
private By minicasesheet_RemarksHydrationStatustxt=By.id("ctl00_cphpage_txtRemarksHydrationStatus");
public WebElement getminicasesheet_RemarksHydrationStatustxtLink() {
	return getElement(minicasesheet_RemarksHydrationStatustxt);
}
private By minicasesheet_heighttxtbox=By.id("ctl00_cphpage_txtHeight");
public WebElement getminicasesheet_heighttxtboxLink() {
	return getElement(minicasesheet_heighttxtbox);
}
private By minicasesheet_weighttxtbox=By.id("ctl00_cphpage_txtWeight");
public WebElement getminicasesheet_weighttxtboxLink() {
	return getElement(minicasesheet_weighttxtbox);
}
private By minicasesheet_Lymphadenopathyradiobutton=By.id("ctl00_cphpage_radLymphadenopathy_1");
public WebElement getminicasesheet_LymphadenopathyradiobuttonLink() {
	return getElement(minicasesheet_Lymphadenopathyradiobutton);
}
private By minicasesheet_radPedalOedemaradiobutton=By.id("ctl00_cphpage_radPedalOedema_1");
public WebElement getminicasesheet_radPedalOedemaradiobuttonLink() {
	return getElement(minicasesheet_radPedalOedemaradiobutton);
}
private By minicasesheet_Pulsextbox=By.id("ctl00_cphpage_txtRatePerMin");
public WebElement getminicasesheet_PulsextboxLink() {
	return getElement(minicasesheet_Pulsextbox);
}
private By minicasesheet_Rhythmradiobutton=By.id("ctl00_cphpage_radRhythm_0");
public WebElement getminicasesheet_RhythmradiobuttonLink() {
	return getElement(minicasesheet_Rhythmradiobutton);
}
private By minicasesheet_AllPulseradiobutton=By.id("ctl00_cphpage_radAllPulse_0");
public WebElement getminicasesheet_AllPulseradiobuttonLink() {
	return getElement(minicasesheet_AllPulseradiobutton);
}
private By minicasesheet_Respirationtxtbox=By.id("ctl00_cphpage_txtRespiration");
public WebElement getminicasesheet_RespirationtxtboxLink() {
	return getElement(minicasesheet_Respirationtxtbox);
}
private By minicasesheet_BPtxtbox=By.id("ctl00_cphpage_txtBP");
public WebElement getminicasesheet_BPtxtboxLink() {
	return getElement(minicasesheet_BPtxtbox);
}
private By minicasesheet_JVPradiobox=By.id("ctl00_cphpage_radJVP_1");
public WebElement getminicasesheet_JVPradioboxLink() {
	return getElement(minicasesheet_JVPradiobox);
}
private By minicasesheet_Thyroidtxtbox=By.id("ctl00_cphpage_txThyroid");
public WebElement getminicasesheet_ThyroidtxtboxLink() {
	return getElement(minicasesheet_Thyroidtxtbox);
}
private By minicasesheet_SNOMED_search=By.id("ctl00_cphpage_txtICDDiagnosis");
public WebElement getminicasesheet_SNOMED_searchLink() {
	return getElement(minicasesheet_SNOMED_search);
}
private By minicasesheet_SNOMED_search_selectAbscess=By.id("27916005$Abscess of liver");
public WebElement getminicasesheet_SNOMED_search_selectAbscessLink() {
	return getElement(minicasesheet_SNOMED_search_selectAbscess);
}
private By minicasesheet_ODDiagnosissearchbox=By.id("ctl00_cphpage_txtODDiagnosis");
public WebElement getminicasesheet_ODDiagnosissearchboxLink() {
	return getElement(minicasesheet_ODDiagnosissearchbox);
}
private By minicasesheet_ODDiagnosisselectdiseases=By.id("12171$Biological agents and infectious or parasitic diseases $OD1.3.");
public WebElement getminicasesheet_ODDiagnosisselectdiseasesLink() {
	return getElement(minicasesheet_ODDiagnosisselectdiseases);
}
private By minicasesheet_FUPbutton=By.id("btnFUP");
public WebElement getminicasesheet_FUPbuttonLink() {
	return getElement(minicasesheet_FUPbutton);
}
private By minicasesheet_FUPcheckselect=By.id("ChkSelect0");
public WebElement getminicasesheet_FUPcheckselectLink() {
	return getElement(minicasesheet_FUPcheckselect);
}
private By minicasesheet_FUPselectButton=By.id("btnSelect");
public WebElement getminicasesheet_FUPselectButtonLink() {
	return getElement(minicasesheet_FUPselectButton);
}
private By minicasesheet_ADDButton=By.id("btnOK");
public WebElement getminicasesheet_ADDButtonLink() {
	return getElement(minicasesheet_ADDButton);
}

private By minicasesheet_Discription=By.id("ctl00_cphpage_txtDescProvisionalDiagnosis");
public WebElement getminicasesheet_DiscriptionLink() {
	return getElement(minicasesheet_Discription);
}
private By minicasesheet_BUTTONSave=By.id("btnSaveDisplay");
public WebElement getminicasesheet_BUTTONSaveLink() {
	return getElement(minicasesheet_BUTTONSave);
}
private By minicasesheet_selectTypeddl=By.id("ctl00_cphpage_ddl_DropDown");
public WebElement getminicasesheet_selectTypeddlLink() {
	return getElement(minicasesheet_selectTypeddl);
}
private By minicasesheet_ButtonAdvice=By.id("btnAdviceNew");
public WebElement getminicasesheet_ButtonAdvice() {
	return getElement(minicasesheet_ButtonAdvice);
}
private By minicasesheet_Prescription_FUPButton=By.id("btnSaveAndPrescribe");
public WebElement getminicasesheet_Prescription_FUPButton() {
	return getElement(minicasesheet_Prescription_FUPButton);
}
private By minicasesheet_MeternityCertificate=By.id("ctl00_cphpage_btnMatrntyCert");
public WebElement getminicasesheet_MeternityCertificate() {
	return getElement(minicasesheet_MeternityCertificate);
}
private By minicasesheet_Requlatory_Certificate=By.id("ctl00_cphpage_btnSaveAndIssue");
public WebElement getminicasesheet_Requlatory_Certificate() {
	return getElement(minicasesheet_Requlatory_Certificate);
}
private By minicasesheet_InvestigationButton=By.id("btnInvestigation");
public WebElement getminicasesheet_InvestigationButton() {
	return getElement(minicasesheet_InvestigationButton);
}
private By minicasesheet_MedicationButton=By.id("btnSaveMediDisp");
public WebElement getminicasesheet_MedicationButton() {
	return getElement(minicasesheet_MedicationButton);
}
private By minicasesheet_HealthInterventionButton=By.id("btnHealthInterventions");
public WebElement getminicasesheet_HealthInterventionButton() {
	return getElement(minicasesheet_HealthInterventionButton);
}

private By minicasesheet_SaveSuccus_OK_Button=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
public WebElement getminicasesheet_SaveSuccus_OK_Button() {
	return getElement(minicasesheet_SaveSuccus_OK_Button);
}
private By txtOrdPackSearch = By.id("txtOrdPackSearch");
public WebElement gettxtOrdPackSearch() {
	return getElement(txtOrdPackSearch);

}
private By orderpackselection = By.id("18929"); //
public WebElement getorderpackselection() {
	return getElement(orderpackselection);

}
private By orderpack = By.id("97701");
public WebElement getorderpack() {
	return getElement(orderpack);

}
private By clickorderpackbutton = By.id("btnOrdpack"); // 97701
public WebElement getclickorderpackbutton() {
	return getElement(clickorderpackbutton);

}
private By btnISaveClose = By.id("btnISaveClose");
public WebElement getbtnISaveClose() {
	return getElement(btnISaveClose);

}
private By minicasesheet_Investigationtxtbox=By.id("txtSearch");
public WebElement getminicasesheet_Investigationtxtbox() {
	return getElement(minicasesheet_Investigationtxtbox);
}
private By minicasesheet_InvestigationSearchButton=By.id("btnGeneric");
public WebElement getminicasesheet_InvestigationSearchButton() {
	return getElement(minicasesheet_InvestigationSearchButton);
}
private By minicasesheet_InvestigationValue=By.id("1715,48,4");
public WebElement getminicasesheet_InvestigationValue() {
	return getElement(minicasesheet_InvestigationValue);
}
private By minicasesheet_InvestigationOKButton=By.id("btnOK");
public WebElement getminicasesheet_InvestigationOKButton() {
	return getElement(minicasesheet_InvestigationOKButton);
}
private By minicasesheet_MedicationDrugSerchButton=By.id("btnDrug");
public WebElement getminicasesheet_MedicationDrugSerchButton() {
	return getElement(minicasesheet_MedicationDrugSerchButton);
}
private By minicasesheet_MedicationDrugValue=By.id("9511");
public WebElement getminicasesheet_MedicationDrugValue() {
	return getElement(minicasesheet_MedicationDrugValue);
}
private By minicasesheet_MedicationDrugDose=By.id("txtDrugDose");
public WebElement getminicasesheet_MedicationDrugDose() {
	return getElement(minicasesheet_MedicationDrugDose);
}
private By minicasesheet_MedicationDrugDoseDLL=By.id("ddlDrugDose");
public WebElement getminicasesheet_MedicationDrugDoseDLL() {
	return getElement(minicasesheet_MedicationDrugDoseDLL);
}
private By minicasesheet_MedicationDuratiionTextBox=By.id("txtDuration");
public WebElement getminicasesheet_MedicationDuratiionTextBox() {
	return getElement(minicasesheet_MedicationDuratiionTextBox);
}
private By minicasesheet_MedicationFrequencyDLL=By.id("ddlFrequency");
public WebElement getminicasesheet_MedicationFrequencyDLL() {
	return getElement(minicasesheet_MedicationFrequencyDLL);
}
private By minicasesheet_MedicationQuantityTextBox=By.id("txtQuantity");
public WebElement getminicasesheet_MedicationQuantityTextBox() {
	return getElement(minicasesheet_MedicationQuantityTextBox);
}
private By minicasesheet_MedicationQuantityUOMDll=By.id("ddlQuantityUOM");
public WebElement getminicasesheet_MedicationQuantityUOMDll() {
	return getElement(minicasesheet_MedicationQuantityUOMDll);
}
private By minicasesheet_MedicationRouteOfAdmin=By.id("ddlAdminRoute");
public WebElement getminicasesheet_MedicationRouteOfAdmin() {
	return getElement(minicasesheet_MedicationRouteOfAdmin);
}
private By minicasesheet_AdviceRefferlRadioButton=By.id("radbtnadmitafter1");
public WebElement getminicasesheet_AdviceRefferlRadioButton() {
	return getElement(minicasesheet_AdviceRefferlRadioButton);
}
private By minicasesheet_AdviceSpecialLization=By.id("ddlESICSpecialization");
public WebElement getminicasesheet_AdviceSpecialLization() {
	return getElement(minicasesheet_AdviceSpecialLization);
}
private By minicasesheet_AdviceAddbutton=By.id("btnOk");
public WebElement getminicasesheet_AdviceAddbutton() {
	return getElement(minicasesheet_AdviceAddbutton);
}
private By minicasesheet_HealthIntervention_HealthInterventionButton=By.id("btnProcedures");
public WebElement getminicasesheet_HealthIntervention_HealthInterventionButton() {
	return getElement(minicasesheet_HealthIntervention_HealthInterventionButton);
}
private By minicasesheet_HealthIntervention_value=By.id("76496");
public WebElement getminicasesheet_HealthIntervention_value() {
	return getElement(minicasesheet_HealthIntervention_value);
}
private By minicasesheet_meternitycertificate=By.id("ctl00_cphpage_btnMatrntyCert");
public WebElement getminicasesheet_meternitycertificate() {
	return getElement(minicasesheet_meternitycertificate);
}
private By minicasesheet_meternitycertificate_saveButton=By.id("ctl00_cphpage_btnSave");
public WebElement getminicasesheet_meternitycertificate_saveButton() {
	return getElement(minicasesheet_meternitycertificate_saveButton);
}
private By minicasesheet_PrintButton=By.id("ctl00_cphpage_btnPrint");
public WebElement getminicasesheet_PrintButton() {
	return getElement(minicasesheet_PrintButton);
}

private By minicasesheet_PrintButtonInprintWindow=By.id("print");
public WebElement getminicasesheet_PrintButtonInprintWindow() {
	return getElement(minicasesheet_PrintButtonInprintWindow);
}
private By minicasesheet_BackButton=By.id("ctl00_cphpage_btnBack");
public WebElement getminicasesheet_BackButton() {
	return getElement(minicasesheet_BackButton);
}

private By minicasesheet_closeButton=By.id("ctl00_cphpage_btnCClose");
public WebElement getminicasesheet_closeButton() {
	return getElement(minicasesheet_closeButton);
}




//







}