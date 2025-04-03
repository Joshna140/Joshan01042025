package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AudioVideoConsultationCR extends BasePage{

	public AudioVideoConsultationCR(WebDriver driver) {
		super(driver); 
		// TODO Auto-generated constructor stub
	}
	
	private By DoctorsworklistNoOPDOkButton=By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
	private By Expand_Super_Speciality_Patient_Referrals=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[1]/div/div/table[1]/tbody/tr/td[1]/a/img");
	private By Item_Master_Data=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst1");
	private By prescreption_itemIssue=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst4");
	private By StockStatus_StationWise=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst2");
	private By ZeroStock_Item=By.id("ctl00_ctl00_cphpage_cphReportMenu_trvReportst3");
	private By PreviewButton=By.id("ctl00_ctl00_cphpage_cphReport_btnPreview");
	private By IPNumber_textBox=By.id("ctl00_ctl00_cphpage_cphReport_txtIpNumber");
	private By Department_DLL=By.id("ctl00_ctl00_cphpage_cphReport_ddlList");
	private By ExprotReport=By.xpath("/html/body/div[1]/form/div[4]/div[2]/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/div/div[1]/table/tbody/tr/td[2]/input");
	private By ExprotReport_DLL=By.id("exportFormatList");
	private By ExprotReport_OKButon=By.id("submitexport");
	private By ClearButton=By.id("ctl00_ctl00_cphpage_cphReport_btnClear");
	private By VideoconsultationLink =By.id("ctl00_cphpage_lnkVideoConsultation");
	private By VideoConsultationCheckinlink =By.id("ctl00_cphpage_gdvSearchConsultation_ctl02_lnkMeetingEmbedded");
	private By SendNotificationLink = By.id("ctl00_cphpage_gdvSearchConsultation_ctl03_lnkSendNotification");
	
	private By ChiefComplaintsTab = By.id("tab_ctl00_cphpage_tabSearch_tabPnlSearchResults");
	private By SearchChiefComplaints= By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_txt_complaint");
	private By SearChiefComplaints= By.xpath("//*[@id=\"Img2\"]");
	
	private By SelectChiefComplaints= By.xpath("//*[@id=\"Img2\"]");
	
	private By ChiefComplaintsRemarks= By.id("ctl00_cphpage_tabSearch_tabPnlSearchResults_txt_Remarks");
	private By ChiefComplaintsSaveButton = By.id("saveChief");
	private By ChiefComplaintsClearButton= By.xpath("//*[@id=\"ClearChief\"]");
	private By ChiefComplaintsRemoverButton= By.xpath("//*[@id=\"complaintTable\"]/tbody/tr/td[4]/a");

	
	//private By ChiefComplaintsDataSavedPopUp= By.xpath("//*[@id=\"ClearChief\"]");
	//Past History
	private By PastHistoryTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel1");
	private By PastHistorySaveButton = By.xpath("//*[@id=\"SPH_btn\"]");
	private By PastHistoryClearButton = By.xpath("//*[@id=\"SPHCL_btn\"]");
	
	//Occupational History
	private By ddlEducation= By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddleducation");	
	private By EducationRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark1");
	private By ddlPresentJob = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPresentJob");
	private By PresentJobRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark2");
	private By ddlNatureOFJob = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlNatureofJob");
	private By NatureOfJobRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark3");
	private By ddlWorkrecord = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlWorkrecord");
	private By WorkRecordRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark4");
	private By ddlWorksatisfaction = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlWorksatisfaction");
	private By WorkSatisfactionRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark5");
	private By PastJobHistoryTextbox = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark6");
	private By PastJobHistoryDuration = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark7");
	//Smoking History
	private By ddlstatusSmoking = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlStatus");
	private By StatusOfSmokingRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark37");
	private By ddlsubstanceOfSmoking = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlSubstance");
	private By SmokingSubstanceRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark44");
	private By ddlDurationYearOfSmoking = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDuration");
	private By ddlDurationMonthOfSmoking = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDuration2");
	private By ddlFrequencyOfSmoking = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFrequency");
	//History of Substance Abuse / Exposure:
	private By ddlSubstanceOfAbuseOrExposure = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlSubstance58");
	private By SubstanceOfAbuseOrExposureRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark60");
	private By AbuseOrExposureYearDuration = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDuration62");
	private By AbuseOrExposureMonthDuration = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDuration64");
	//Menstrual History:
	private By AgeOfMenarcheTxtbox = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark69");
	private By txtLMPOfMenstrual = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtLMP");
	private By ddlCycleOfMenstrual = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlCycle");
	private By CycleOfMenstrualRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark76");
	private By txtDurationinDays = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtDurationindays");
	private By txtCycleinDays = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtCyclesinDays");
	private By ddlFlowOfMenstrual = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFlow");
	private By FlowRemarksOfMenstrual= By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark244");
	private By DurationOfFlow= By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtDuration76");
	private By ddlContraceptiveHistory =By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlContraceptiveHistory");
	private By ContraceptiveRemparks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark88");
	//Allergy History:
	private By chkallergy = By.xpath("//*[@id=\"ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_chkallergy_3\"]");
	//Known Co-existent Diseases:
	private By ddlcoexistentdisease1 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlcoexistentdisease");
	private By Coexistentdisease1Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark97");
	private By ddlcoexistentdis2 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlcoexistentdis105");
	private By Coexistentdisease2Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark107");
	private By ddlcoexistentdis3 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlcoexistentdisease99");
	private By Coexistentdisease3Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark124");
	private By ddlcoexistentdis4 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlcoexistentdisea108");
	private By Coexistentdisease4Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark110");
	private By ddlcoexistentdis5 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlcoexistentdisease102");
	private By Coexistentdisease5Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark104");
	private By ddlcoexistentdis6 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlcoexistentdisea111");
	private By Coexistentdisease6Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark113");
	//Past Illness:
	private By ddlPastIllness1 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPastIllness120");
	private By PastIllness1Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark122");
	private By ddlPastIllness2 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPastIllness128");
	private By PastIllness2Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark130");
	private By ddlPastIllness3 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPastIllness123");
	private By PastIllness3Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark124");
	private By ddlPastIllness4 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPastIllness131");
	private By PastIllness4Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark133");
	private By ddlPastIllness5 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPastIllness125");
	private By PastIllness5Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark127");
	private By ddlPastIllness6 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPastIllness134");
	private By PastIllness6Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark136");
	//Family History of Illness:
	private By ddlFamilyHistory1 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFamilyHistory140");
	private By FamilyHistory1Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark142");
	private By ddlFamilyHistory2 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFamilyHistory149");
	private By FamilyHistory2Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark151");
	private By ddlFamilyHistory3 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFamilyHistory143");
	private By FamilyHistory3Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark145");
	private By ddlFamilyHistory4 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFamilyHistory152");
	private By FamilyHistory4Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark154");
	private By ddlFamilyHistory5 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFamilyHistory146");
	private By FamilyHistory5Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark148");
	private By ddlFamilyHistory6 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFamilyHistory155");
	private By FamilyHistory6Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark157");
	//Drug History and Current Medication:
	private By ddlDrugHistory1 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDrugHistory159");
	private By DrugHistory1Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark161");
	private By ddlDrugHistory2 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDrugHistory168");
	private By DrugHistory2Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark170");
	private By ddlDrugHistory3 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDrugHistory162");
	private By DrugHistory3Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark164");
	private By ddlDrugHistory4 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDrugHistory171");
	private By DrugHistory4Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark173");
	private By ddlDrugHistory5 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDrugHistory165");
	private By DrugHistory5Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark167");
	private By ddlDrugHistory6 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlDrugHistory174");
	private By DrugHistory6Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark176");
	//Surgical Treatment History:
	private By NameOfSurgeryDate = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtSurgery181");
	private By txtAnaesthesia = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtAnaesthesia183");
	private By txtComplications = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtComplications");
	private By ddlAnaesthetic = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlAnaesthetic188");
	private By AnaestheticRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark1a0");
	private By ddlPastInvestigations = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlPastInvestigations");
	private By PastInvestigationsRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark195");
	private By ddlImmunisationHistory = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlImmunisationHistory198");
	private By ImmunisationHistoryRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark190");
	private By txtPsychologicalHistory = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtPsychologicalHistory");
	//Birth History:
	private By ddlBirthHistory = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlBirthHistory");
	private By BirthHistoryRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark208");
	private By ddlMilestones = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlMilestones");
	private By MilestonesRemarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark212");
	private By ddlChildhoodDisorder1 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlChildhoodDisorder1");
	private By ChildhoodDisorder1Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark216");
	//Feeding History:
	private By ddlFeedingHistory1 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFeedingHistory218");
	private By FeedingHistory1Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark220");
	private By ddlFeedingHistory2 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFeedingHistory");
	private By FeedingHistory2Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark223");
	private By ddlFeedingHistory3 = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_ddlFeedingHistory224");
	private By FeedingHistory3Remarks = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtremark226");
	
	private By txtOtherHistory = By.id("ctl00_cphpage_tabSearch_TabPanel1_TemplatePreview1_txtOtherHistory226");
	
	//History of present illness
	
	private By HistoryOfPresentIllnessTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel2");
	private By txtHistoryofPresentIllness = By.id("ctl00_cphpage_tabSearch_TabPanel2_TemplatePreViewControl_txtHistoryofPresentIllness");
	private By HistoryOfPresentIllnessSaveButton = By.id("ctl00_cphpage_tabSearch_TabPanel2_btnHistoryOfPresentIllnessSave");
	private By HistoryOfPresentIllnessClearButton = By.id("ctl00_cphpage_tabSearch_TabPanel2_btnHistoryOfPresentIllnessClear");
	
	
	private By VitalsTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel3");
	private By VitalsSaveButton = By.id("ctl00_cphpage_tabSearch_TabPanel3_Button1");
	private By VitalsClearButton = By.id("ctl00_cphpage_tabSearch_TabPanel3_Button2");
	
	private By ReferralAdviceTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel4");
	private By AdviceSaveButton = By.xpath("//*[@id=\"ctl00_cphpage_tabSearch_TabPanel4\"]/div[2]/table/tbody/tr/td/div/table/tbody/tr/td[1]/input");
	private By AdviceClearButton = By.xpath("//*[@id=\"ctl00_cphpage_tabSearch_TabPanel4\"]/div[2]/table/tbody/tr/td/div/table/tbody/tr/td[2]/input");
	
	
	private By PrescriptionTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel5");
	
	private By Prescriptions_MedicationsTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab1");
	
	//Medications Order Packs
	private By Prescriptions_SearchOrderPacks= By.id("ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab1_txtOrdPackSearch");
	private By Prescriptions_SelectOrderPacks=By.xpath("//*[@id=\"18925\"]");
	private By Prescriptions_MedicationsOrderPacksBtn= By.xpath("//*[@id=\"btnOrdpack\"]");
	
	private By Prescriptions_AddMedicationsBtn= By.id("btnADDM");
	private By Prescriptions_FUPMedicationsBtn= By.xpath("//*[@id=\"btnMedFUP\"]");
	private By Prescriptions_DirectIssuePrescriptions = By.xpath("//*[@id=\"btnlastten\"]");
	private By Prescriptions_MedicationsSaveButton = By.xpath("//*[@id=\"btnISaveClose\"]");
	private By Prescriptions_MedicationsSavePrintButton = By.xpath("//*[@id=\"btnSave\"]");
	private By Prescriptions_MedicationsPrintButton = By.xpath("//*[@id=\"Button9\"]");
	private By Prescriptions_MedicationsClearButton = By.xpath("//*[@id=\"btnClear\"]");
	private By AddMediactionsCloseButton = By.xpath("//*[@id=\"btnM\"]");
	private By saveprescriptionButton = By.id("btnISaveClose");

	
	
	//Last Ten Prescriptions
	private By Prescriptions_LastTenPrescriptions = By.xpath("//*[@id=\"btnlastFive\"]/input[2]");
	private By SelectLastPrescriptionsCheckbox = By.xpath("//*[@id=\"ChkSelect3\"]");
	private By LastTenPrescriptions_SelectForEditButton = By.xpath("//*[@id=\"btnSelect\"]");
	
	// Add Options in Prescriptions_Medications
	
	private By AddMedicationsSearchOptions = By.xpath("//*[@id=\"ctl00_cphpage_txtSearch\"]");
	private By SelectMedicationsOfAddOptions = By.xpath("//*[@id=\"3688\"]");
	private By EnterDrugDoseMediacations = By.id("ctl00_cphpage_txtDrugDose");
	private By SelectDrugDoseDropdown = By.xpath("//*[@id=\"ctl00_cphpage_ddlDrugDose\"]");
	private By DurationOfDrugDoseMedications = By.xpath("//*[@id=\"ctl00_cphpage_txtDuration\"]");
	private By FrequencyOfDrugDoseMedications = By.id("ctl00_cphpage_ddlFrequency");
	private By QuantityOfDrugDoseMedictions =By.id("ctl00_cphpage_txtQuantity");
	private By QuantityDropDownOfMedications = By.id("ctl00_cphpage_ddlQuantityUOM");
	private By AddMedicationsOkButton = By.xpath("//*[@id=\"Button11\"]");
	
	// Add Options in Prescriptions_Medications
	
    
	private By Prescriptions_InvestigationsTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab2");
	private By Prescriptions_AddInvestigationsBtn = By.xpath("//*[@id=\"btnAddI\"]");
	private By Prescriptions_FUPInvestigationsBtn = By.xpath("//*[@id=\"btnInvFUP\"]");
	private By Prescriptions_InvestigationsSaveButton = By.xpath("//*[@id=\"btnISaveClose\"]");
	private By Prescriptions_InvestigationsSavePrintButton = By.xpath("//*[@id=\"btnSave\"]");
	private By Prescriptions_InvestigationsPrintButton = By.xpath("//*[@id=\"Button9\"]");
	private By Prescriptions_InvestigationsClearButton = By.xpath("//*[@id=\"btnClear\"]");
	
	private By Prescriptions_DiagnosisTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab3");
	private By Prescriptions_DiagnosisSnomedCTSearch = By.id("ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab3_txtICDDiagnosis");
	private By Prescriptions_AddDiagnosisBtn = By.xpath("//*[@id=\"Button7\"]");
	private By Prescriptions_FUPDiagnosisBtn = By.xpath("//*[@id=\"btnDiaFUP\"]");
	private By Prescriptions_DiagnosisSaveButton = By.xpath("//*[@id=\"btnISaveClose\"]");
	private By Prescriptions_DiagnosisSavePrintButton = By.xpath("//*[@id=\"btnSave\"]");
	private By Prescriptions_DiagnosisPrintButton = By.xpath("//*[@id=\"Button9\"]");
	private By Prescriptions_DiagnosisClearButton = By.xpath("//*[@id=\"btnClear\"]");
	
	private By Prescriptions_AdviceTab = By.id("__tab_ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab4");
	private By Prescriptions_EnterAdviceFld = By.id("ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab4_txtAdvice");
	private By Prescriptions_AddAdviceBtn = By.xpath("//*[@id=\"btnAddAdvice\"]");
	private By Prescriptions_AdviceSaveButton = By.xpath("//*[@id=\"btnISaveClose\"]");
	private By Prescriptions_AdviceSavePrintButton = By.xpath("//*[@id=\"btnSave\"]");
	private By Prescriptions_AdvicePrintButton = By.xpath("//*[@id=\"Button9\"]");
	private By Prescriptions_AdviceClearButton = By.xpath("//*[@id=\"btnClear\"]");
	
	
	private By AddComplaintBtn = By.id("btnAddcomplaint");
	private By JoinVideoConsultaionMeetingLink = By.xpath("//*[@id=\"JoinMeeting\"]");
	private By CancelOrHangUpConsultationLink = By.xpath("//*[@id=\"hangup\"]");
	private By CasesheetDateRange_OkBtn = By.id("ctl00_cphpage_btnOk");
	private By InvestigationHistoryResultLink = By.id("ctl00_cphpage_lnkresults");
	private By OccupationalDiseaseAlertOKBtn = By.xpath("//*[@id=\"popup_ok\"]");
	private By popokbutton=By.id("popup_ok");
	
	
	
	public WebElement gettxtHistoryofPresentIllness() {
		return getElement(txtHistoryofPresentIllness);
	}
	
	
	//Past History
	
	public WebElement getddlEducation() {
		return getElement(ddlEducation);
	}
	
	public WebElement getEducationRemarks() {
		return getElement(EducationRemarks);
	}
	
	public WebElement getddlPresentJob() {
		return getElement(ddlPresentJob);
	}
	
	public WebElement getPresentJobRemarks() {
		return getElement(PresentJobRemarks);
	}
	
	public WebElement getddlNatureOFJob() {
		return getElement(ddlNatureOFJob);
	}
	
	public WebElement getNatureOfJobRemarks() {
		return getElement(NatureOfJobRemarks);
	}
	
	public WebElement getddlWorkrecord() {
		return getElement(ddlWorkrecord);
	}
	public WebElement getWorkRecordRemarks() {
		return getElement(WorkRecordRemarks);
	}
	
	public WebElement getddlWorksatisfaction() {
		return getElement(ddlWorksatisfaction);
	}
	
	public WebElement getWorkSatisfactionRemarks() {
		return getElement(WorkSatisfactionRemarks);
	}
	
	public WebElement getPastJobHistoryTextbox() {
		return getElement(PastJobHistoryTextbox);
	}
	
	public WebElement getPastJobHistoryDuration() {
		return getElement(PastJobHistoryDuration);
	}
	
	public WebElement getddlstatusSmoking() {
		return getElement(ddlstatusSmoking);
	}
	
	public WebElement getStatusOfSmokingRemarks() {
		return getElement(StatusOfSmokingRemarks);
	}
	
	public WebElement getddlsubstanceOfSmoking() {
		return getElement(ddlsubstanceOfSmoking);
	}
	
	public WebElement getSmokingSubstanceRemarks() {
		return getElement(SmokingSubstanceRemarks);
	}
	
	public WebElement getddlDurationYearOfSmoking() {
		return getElement(ddlDurationYearOfSmoking);
	}
	
	public WebElement getddlDurationMonthOfSmoking() {
		return getElement(ddlDurationMonthOfSmoking);
	}
	
	public WebElement getddlFrequencyOfSmoking() {
		return getElement(ddlFrequencyOfSmoking);
	}
	
	public WebElement getddlSubstanceOfAbuseOrExposure() {
		return getElement(ddlSubstanceOfAbuseOrExposure);
	}
	
	public WebElement getSubstanceOfAbuseOrExposureRemarks() {
		return getElement(SubstanceOfAbuseOrExposureRemarks);
	}
	
	public WebElement getAbuseOrExposureYearDuration() {
		return getElement(AbuseOrExposureYearDuration);
	}
	
	public WebElement getAbuseOrExposureMonthDuration() {
		return getElement(AbuseOrExposureMonthDuration);
	}
	
	public WebElement getAgeOfMenarcheTxtbox() {
		return getElement(AgeOfMenarcheTxtbox);
	}
	
	public WebElement gettxtLMPOfMenstrual() {
		return getElement(txtLMPOfMenstrual);
	}
	
	public WebElement getddlCycleOfMenstrual() {
		return getElement(ddlCycleOfMenstrual);
	}
	
	public WebElement getCycleOfMenstrualRemarks() {
		return getElement(CycleOfMenstrualRemarks);
	}
	
	public WebElement gettxtDurationinDays() {
		return getElement(txtDurationinDays);
	}
	
	public WebElement gettxtCycleinDays() {
		return getElement(txtCycleinDays);
	}
	
	public WebElement getddlFlowOfMenstrual() {
		return getElement(ddlFlowOfMenstrual);
	}
	
	public WebElement getFlowRemarksOfMenstrual() {
		return getElement(FlowRemarksOfMenstrual);
	}
	
	public WebElement getDurationOfFlow() {
		return getElement(DurationOfFlow);
	}
	
	public WebElement getddlContraceptiveHistory() {
		return getElement(ddlContraceptiveHistory);
	}
	
	public WebElement getchkallergy() {
		return getElement(chkallergy);
	}
	
	public WebElement getContraceptiveRemparks() {
		return getElement(ContraceptiveRemparks);
	}
	
	public WebElement getddlcoexistentdisease1() {
		return getElement(ddlcoexistentdisease1);
	}
	
	public WebElement getCoexistentdisease1Remarks() {
		return getElement(Coexistentdisease1Remarks);
	}
	
	public WebElement getddlcoexistentdis2() {
		return getElement(ddlcoexistentdis2);
	}
	
	public WebElement getCoexistentdisease2Remarks() {
		return getElement(Coexistentdisease2Remarks);
	}
	
	public WebElement getddlcoexistentdis3() {
		return getElement(ddlcoexistentdis3);
	}
	
	public WebElement getCoexistentdisease3Remarks() {
		return getElement(Coexistentdisease3Remarks);
	}
	
	public WebElement getddlcoexistentdis4() {
		return getElement(ddlcoexistentdis4);
	}
	
	public WebElement getCoexistentdisease4Remarks() {
		return getElement(Coexistentdisease4Remarks);
	}
	
	public WebElement getddlcoexistentdis5() {
		return getElement(ddlcoexistentdis5);
	}
	
	public WebElement getCoexistentdisease5Remarks() {
		return getElement(Coexistentdisease5Remarks);
	}
	
	public WebElement getddlcoexistentdis6() {
		return getElement(ddlcoexistentdis6);
	}
	
	public WebElement getCoexistentdisease6Remarks() {
		return getElement(Coexistentdisease6Remarks);
	}
	
	public WebElement getddlPastIllness1() {
		return getElement(ddlPastIllness1);
	}
	
	public WebElement getPastIllness1Remarks() {
		return getElement(PastIllness1Remarks);
	}
	
	public WebElement getddlPastIllness2() {
		return getElement(ddlPastIllness2);
	}
	
	public WebElement getPastIllness2Remarks() {
		return getElement(PastIllness2Remarks);
	}
	
	public WebElement getddlPastIllness3() {
		return getElement(ddlPastIllness3);
	}
	
	public WebElement getPastIllness3Remarks() {
		return getElement(PastIllness3Remarks);
	}
	
	public WebElement getddlPastIllness4() {
		return getElement(ddlPastIllness4);
	}
	
	public WebElement getPastIllness4Remarks() {
		return getElement(PastIllness4Remarks);
	}
	
	public WebElement getddlPastIllness5() {
		return getElement(ddlPastIllness5);
	}
	
	public WebElement getPastIllness5Remarks() {
		return getElement(PastIllness5Remarks);
	}
	
	public WebElement getddlPastIllness6() {
		return getElement(ddlPastIllness6);
	}
	
	public WebElement getPastIllness6Remarks() {
		return getElement(PastIllness6Remarks);
	}
	
	public WebElement getddlFamilyHistory1() {
		return getElement(ddlFamilyHistory1);
	}
	
	public WebElement getFamilyHistory1Remarks() {
		return getElement(FamilyHistory1Remarks);
	}
	
	public WebElement getddlFamilyHistory2() {
		return getElement(ddlFamilyHistory2);
	}
	
	public WebElement getFamilyHistory2Remarks() {
		return getElement(FamilyHistory2Remarks);
	}
	
	public WebElement getddlFamilyHistory3() {
		return getElement(ddlFamilyHistory3);
	}
	
	public WebElement getFamilyHistory3Remarks() {
		return getElement(FamilyHistory3Remarks);
	}
	
	public WebElement getddlFamilyHistory4() {
		return getElement(ddlFamilyHistory4);
	}
	
	public WebElement getFamilyHistory4Remarks() {
		return getElement(FamilyHistory4Remarks);
	}
	
	public WebElement getddlFamilyHistory5() {
		return getElement(ddlFamilyHistory5);
	}
	
	public WebElement getFamilyHistory5Remarks() {
		return getElement(FamilyHistory5Remarks);
	}
	
	public WebElement getddlFamilyHistory6() {
		return getElement(ddlFamilyHistory6);
	}
	
	public WebElement getFamilyHistory6Remarks() {
		return getElement(FamilyHistory6Remarks);
	}
	
	public WebElement getddlDrugHistory1() {
		return getElement(ddlDrugHistory1);
	}
	
	public WebElement getDrugHistory1Remarks() {
		return getElement(DrugHistory1Remarks);
	}
	
	public WebElement getddlDrugHistory2() {
		return getElement(ddlDrugHistory2);
	}
	
	public WebElement getDrugHistory2Remarks() {
		return getElement(DrugHistory2Remarks);
	}
	
	public WebElement getddlDrugHistory3() {
		return getElement(ddlDrugHistory3);
	}
	
	public WebElement getDrugHistory3Remarks() {
		return getElement(DrugHistory3Remarks);
	}
	
	public WebElement getddlDrugHistory4() {
		return getElement(ddlDrugHistory4);
	}
	
	public WebElement getDrugHistory4Remarks() {
		return getElement(DrugHistory4Remarks);
	}
	
	public WebElement getddlDrugHistory5() {
		return getElement(ddlDrugHistory5);
	}
	
	public WebElement getDrugHistory5Remarks() {
		return getElement(DrugHistory5Remarks);
	}
	
	public WebElement getddlDrugHistory6() {
		return getElement(ddlDrugHistory6);
	}
	
	public WebElement getDrugHistory6Remarks() {
		return getElement(DrugHistory6Remarks);
	}
	
	public WebElement getNameOfSurgeryDate() {
		return getElement(NameOfSurgeryDate);
	}
	
	public WebElement gettxtAnaesthesia() {
		return getElement(txtAnaesthesia);
	}
	
	public WebElement gettxtComplications() {
		return getElement(txtComplications);
	}
	
	public WebElement getddlAnaesthetic() {
		return getElement(ddlAnaesthetic);
	}
	
	public WebElement getAnaestheticRemarks() {
		return getElement(AnaestheticRemarks);
	}
	
	public WebElement getddlPastInvestigations() {
		return getElement(ddlPastInvestigations);
	}
	
	public WebElement getPastInvestigationsRemarks() {
		return getElement(PastInvestigationsRemarks);
	}
	
	public WebElement getddlImmunisationHistory() {
		return getElement(ddlImmunisationHistory);
	}
	
	public WebElement getImmunisationHistoryRemarks() {
		return getElement(ImmunisationHistoryRemarks);
	}
	
	public WebElement gettxtPsychologicalHistory() {
		return getElement(txtPsychologicalHistory);
	}
	
	public WebElement getddlBirthHistory() {
		return getElement(ddlBirthHistory);
	}
	
	public WebElement getBirthHistoryRemarks() {
		return getElement(BirthHistoryRemarks);
	}
	
	public WebElement getddlMilestones() {
		return getElement(ddlMilestones);
	}
	
	public WebElement getMilestonesRemarks() {
		return getElement(MilestonesRemarks);
	}
	
	public WebElement getddlChildhoodDisorder1() {
		return getElement(ddlChildhoodDisorder1);
	}
	
	public WebElement getChildhoodDisorder1Remarks() {
		return getElement(ChildhoodDisorder1Remarks);
	}
	
	public WebElement getddlFeedingHistory1() {
		return getElement(ddlFeedingHistory1);
	}
	
	public WebElement getFeedingHistory1Remarks() {
		return getElement(FeedingHistory1Remarks);
	}
	
	public WebElement getddlFeedingHistory2() {
		return getElement(ddlFeedingHistory2);
	}
	
	public WebElement getFeedingHistory2Remarks() {
		return getElement(FeedingHistory2Remarks);
	}
	
	public WebElement getddlFeedingHistory3() {
		return getElement(ddlFeedingHistory3);
	}
	
	public WebElement getFeedingHistory3Remarks() {
		return getElement(FeedingHistory3Remarks);
	}
	
	public WebElement gettxtOtherHistory() {
		return getElement(txtOtherHistory);
	}
	
	

	//Past History
	
	//Last Ten Prescriptions
	
	public WebElement getSelectLastPrescriptionsCheckbox() {
		return getElement(SelectLastPrescriptionsCheckbox);
	}
	
	
	public WebElement getLastTenPrescriptions_SelectForEditButton() {
		return getElement(LastTenPrescriptions_SelectForEditButton);
	}
	
	
	// Add Options in Prescriptions_Medications
	
	public WebElement getAddMedicationsSearchOptions() {
		return getElement(AddMedicationsSearchOptions);
	}
	
	public WebElement getSelectMedicationsOfAddOptions() {
		return getElement(SelectMedicationsOfAddOptions);
	}
	
	public WebElement getEnterDrugDoseMediacations() {
		return getElement(EnterDrugDoseMediacations);
	}
	
	public WebElement getSelectDrugDoseDropdown() {
		return getElement(SelectDrugDoseDropdown);
	}
	
	public WebElement getDurationOfDrugDoseMedications() {
		return getElement(DurationOfDrugDoseMedications);
	}
	
	public WebElement getFrequencyOfDrugDoseMedications() {
		return getElement(FrequencyOfDrugDoseMedications);
	}
	
	public WebElement getQuantityOfDrugDoseMedictions() {
		return getElement(QuantityOfDrugDoseMedictions);
	}
	
	public WebElement getQuantityDropDownOfMedications() {
		return getElement(QuantityDropDownOfMedications);
	}
	
	public WebElement getAddMedicationsOkButton() {
		return getElement(AddMedicationsOkButton);
	}
	
	
	public WebElement getAddMediactionsCloseButton() {
		return getElement(AddMediactionsCloseButton);
	}
	
	// Add Options in Prescriptions_Medications
	
	
	public WebElement getPrescriptions_MedicationsTab() {
		return getElement(Prescriptions_MedicationsTab);
	}
	
	public WebElement getPrescriptions_SelectOrderPacks() {
		return getElement(Prescriptions_SelectOrderPacks);
	}
	
	public WebElement getPrescriptions_SearchOrderPacks() {
		return getElement(Prescriptions_SearchOrderPacks);
	}
	
	public WebElement getpopokbuttonLink() {
    	return getElement(popokbutton);
    

	}
	
	public WebElement getOccupationalDiseaseAlertOKBtn() {
		return getElement(OccupationalDiseaseAlertOKBtn);
	}
	
	public WebElement getSearChiefComplaints() {
		return getElement(SearChiefComplaints);
	}
	public WebElement getSelectChiefComplaints() {
		return getElement(SelectChiefComplaints);
	}
	
	public WebElement getChiefComplaintsRemarks() {
		return getElement(ChiefComplaintsRemarks);
	}
	
	public WebElement getSearchChiefComplaints() {
		return getElement(SearchChiefComplaints);
	}
	
	public WebElement getPrescriptions_AdviceTab() {
		return getElement(Prescriptions_AdviceTab);
	}
	
	public WebElement getDoctorsworklistNoOPDOkButton() {
		return getElement(DoctorsworklistNoOPDOkButton);
	}
	
	public WebElement getPrescriptions_AdviceClearButton() {
		return getElement(Prescriptions_AdviceClearButton);
	}
	
	public WebElement getPrescriptions_AdvicePrintButton() {
		return getElement(Prescriptions_AdvicePrintButton);
	}
	
	public WebElement getPrescriptions_AdviceSavePrintButton() {
		return getElement(Prescriptions_AdviceSavePrintButton);
	}
	
	public WebElement getPrescriptions_AdviceSaveButton() {
		return getElement(Prescriptions_AdviceSaveButton);
	}
	
	public WebElement getPrescriptions_AddAdviceBtn() {
		return getElement(Prescriptions_AddAdviceBtn);
	}
	
	public WebElement getPrescriptions_EnterAdviceFld() {
		return getElement(Prescriptions_EnterAdviceFld);
	}
	
	public WebElement getPrescriptions_DiagnosisClearButton() {
		return getElement(Prescriptions_DiagnosisClearButton);
	}
	
	
	public WebElement getPrescriptions_DiagnosisPrintButton() {
		return getElement(Prescriptions_DiagnosisPrintButton);
	}
	
	public WebElement getPrescriptions_DiagnosisSavePrintButton() {
		return getElement(Prescriptions_DiagnosisSavePrintButton);
	}
	
	public WebElement getPrescriptions_DiagnosisSaveButton() {
		return getElement(Prescriptions_DiagnosisSaveButton);
	}
	
	public WebElement getPrescriptions_FUPDiagnosisBtn() {
		return getElement(Prescriptions_FUPDiagnosisBtn);
	}
	
	public WebElement getPrescriptions_AddDiagnosisBtn() {
		return getElement(Prescriptions_AddDiagnosisBtn);
	}
	
	public WebElement getPrescriptions_DiagnosisSnomedCTSearch() {
		return getElement(Prescriptions_DiagnosisSnomedCTSearch);
	}
	
	public WebElement getPrescriptions_DiagnosisTab() {
		return getElement(Prescriptions_DiagnosisTab);
	}
	
	public WebElement getPrescriptions_InvestigationsClearButton() {
		return getElement(Prescriptions_InvestigationsClearButton);
	}
	
	public WebElement getPrescriptions_InvestigationsPrintButton() {
		return getElement(Prescriptions_InvestigationsPrintButton);
	}
	
	public WebElement getPrescriptions_InvestigationsSavePrintButton() {
		return getElement(Prescriptions_InvestigationsSavePrintButton);
	}
	
	public WebElement getPrescriptions_InvestigationsSaveButton() {
		return getElement(Prescriptions_InvestigationsSaveButton);
	}
	
	public WebElement getPrescriptions_FUPInvestigationsBtn() {
		return getElement(Prescriptions_FUPInvestigationsBtn);
	}
	
	public WebElement getPrescriptions_AddInvestigationsBtn() {
		return getElement(Prescriptions_AddInvestigationsBtn);
	}
	
	public WebElement getPrescriptions_InvestigationsTab() {
		return getElement(Prescriptions_InvestigationsTab);
	}
	
	public WebElement getPrescriptions_MedicationsClearButton() {
		return getElement(Prescriptions_MedicationsClearButton);
	}
	
	public WebElement getPrescriptions_MedicationsPrintButton() {
		return getElement(Prescriptions_MedicationsPrintButton);
	}
	
	public WebElement getPrescriptions_MedicationsSavePrintButton() {
		return getElement(Prescriptions_MedicationsSavePrintButton);
	}
	
	public WebElement getPrescriptions_MedicationsSaveButton() {
		return getElement(Prescriptions_MedicationsSaveButton);
	}
	
	public WebElement getInvestigationHistoryResultLink() {
		return getElement(InvestigationHistoryResultLink);
	}
	
	public WebElement getPrescriptions_LastTenPrescriptions() {
		return getElement(Prescriptions_LastTenPrescriptions);
	}
	
	public WebElement getPrescriptions_DirectIssuePrescriptions() {
		return getElement(Prescriptions_DirectIssuePrescriptions);
	}
	
	public WebElement getPrescriptions_FUPMedicationsBtn() {
		return getElement(Prescriptions_FUPMedicationsBtn);
	}
	
	public WebElement getPrescriptions_AddMedicationsBtn() {
		return getElement(Prescriptions_AddMedicationsBtn);
	}
	
	public WebElement getPrescriptions_MedicationsOrderPacksBtn() {
		return getElement(Prescriptions_MedicationsOrderPacksBtn);
	}
	
	public WebElement getClearButton() {
		return getElement(ClearButton);
	}
	
	public WebElement getAdviceSaveButton() {
		return getElement(AdviceSaveButton);
	}
	
	public WebElement getAdviceClearButton() {
		return getElement(AdviceClearButton);
	}
	
	public WebElement getVitalsSaveButton() {
		return getElement(VitalsSaveButton);
	}
	
	public WebElement getVitalsClearButton() {
		return getElement(VitalsClearButton);
	}
	
	public WebElement getChiefComplaintsSaveButton() {
		return getElement(ChiefComplaintsSaveButton);
	}
	public WebElement getChiefComplaintsRemoverButton() {
		return getElement(ChiefComplaintsRemoverButton);
	}
	public WebElement getChiefComplaintsClearButton() {
		return getElement(ChiefComplaintsClearButton);
	}
	
	public WebElement getPastHistorySaveButton() {
		return getElement(PastHistorySaveButton);
	}
	
	public WebElement getPastHistoryClearButton() {
		return getElement(PastHistoryClearButton);
	}
	
	public WebElement getHistoryOfPresentIllnessSaveButton() {
		return getElement(HistoryOfPresentIllnessSaveButton);
	}
	
	public WebElement getHistoryOfPresentIllnessClearButton() {
		return getElement(HistoryOfPresentIllnessClearButton);
	}
	
	
	
	public WebElement getVideoconsultationLink() {
		return getElement(VideoconsultationLink);
	}
	
	public WebElement getSendNotificationLink() {
		return getElement(SendNotificationLink);
	}
	
	public WebElement getVideoConsultationCheckinlink() {
		return getElement(VideoConsultationCheckinlink);
	}
	
	public WebElement getChiefComplaintsTab() {
		return getElement(ChiefComplaintsTab);
	}
	
	public WebElement getPastHistoryTab() {
		return getElement(PastHistoryTab);
	}
	
	public WebElement getHistoryOfPresentIllnessTab() {
		return getElement(HistoryOfPresentIllnessTab);
	}
	
	public WebElement getVitalsTab() {
		return getElement(VitalsTab);
	}
	
	public WebElement getReferralAdviceTab() {
		return getElement(ReferralAdviceTab);
	}
	
	public WebElement getPrescriptionTab() {
		return getElement(PrescriptionTab);
	}
	
	public WebElement getCasesheetDateRange_OkBtn() {
		return getElement(CasesheetDateRange_OkBtn);
	}
	
	public WebElement getJoinVideoConsultaionMeetingLink() {
		return getElement(JoinVideoConsultaionMeetingLink);
	}
	
	public WebElement getCancelOrHangUpConsultationLink() {
		return getElement(CancelOrHangUpConsultationLink);
	}
	
	public WebElement getAddComplaintBtn() {
		return getElement(AddComplaintBtn);
	}
	
	public WebElement getExpand_Super_Speciality_Patient_Referrals() {
		return getElement(Expand_Super_Speciality_Patient_Referrals);
	}	                                 
	public WebElement getItem_Master_Data() {
		return getElement(Item_Master_Data);
	}
	public WebElement getprescreption_itemIssue() {
		return getElement(prescreption_itemIssue);
	}
	public WebElement getStockStatus_StationWise() {
		return getElement(StockStatus_StationWise);
	}
	public WebElement getZeroStock_Item() {
		return getElement(ZeroStock_Item);
	}
	public WebElement getPreviewButton() {
		return getElement(PreviewButton);
	}
	public WebElement getIPNumber_textBox() {
		return getElement(IPNumber_textBox);
	}
	public WebElement getDepartment_DLL() {
		return getElement(Department_DLL);
	}
	public WebElement getExprotReport() {
		return getElement(ExprotReport);
	}
	public WebElement getExprotReport_DLL() {
		return getElement(ExprotReport_DLL);
	}
	public WebElement getExprotReport_OKButon() {
		return getElement(ExprotReport_OKButon);
	}
	
	
	//History of present illness
	
	private By historyofPsavebutton=By.id("Button8");
	public WebElement gethistoryofPsavebutton() {
		return getElement(historyofPsavebutton);
	}

	private By historyofPclearbutton=By.id("Button15");
	public WebElement gethistoryofPclearbutton() {
		return getElement(historyofPclearbutton);
	}
	
	
	//Referral Advice
	
	private By radiobtnintra=By.id("radbtnadmitafter1");
	public WebElement getradiobtnintra() {
		return getElement(radiobtnintra);
	}
	
	private By dd1Hospitals=By.id("select2-ctl00_cphpage_tabSearch_TabPanel4_ddlHospitals-container");
	public WebElement getdd1Hospitals() {
		return getElement(dd1Hospitals);
	}
	
	private By ddlESICSpecialization=By.id("ddlESICSpecialization");
	public WebElement getddlESICSpecialization() {
		return getElement(ddlESICSpecialization);
	}
	
	private By txtreasonForReferral=By.id("ctl00_cphpage_tabSearch_TabPanel4_txtreasonForReferral");
	public WebElement gettxtreasonForReferral() {
		return getElement(txtreasonForReferral);
	}
	
	private By addbtnReferral=By.id("Button6");
	public WebElement getaddbtnReferral() {
		return getElement(addbtnReferral);
		
		}
	
	private By hospitalselect=By.id("select2-ctl00_cphpage_tabSearch_TabPanel4_ddlHospitals-results");
	public WebElement gethospitalselect() {
		return getElement(hospitalselect);
		
		
	}
	
	private By searchfield=By.xpath("/html/body/span/span/span[1]/input");
	public WebElement getsearchfield() {
		return getElement(searchfield);
		
		}
	
	private By selectfield=By.xpath("/html/body/span/span/span[2]/ul/li[154]");
	public WebElement getselectfield() {
		return getElement(selectfield);
		
		}
	
	private By followuptab=By.id("btnAdmit");
	public WebElement getfollowuptab() {
		return getElement(followuptab);
		
		}
	
	private By radbtnfollow=By.id("radbtnfollow");
	public WebElement getradbtnfollow() {
		return getElement(radbtnfollow);
		
		}
	private By txtfollowafter=By.id("txtfollowafter");
	public WebElement gettxtfollowafter() {
		return getElement(txtfollowafter);
		
		}
	
	private By txtfollowdate=By.id("txtfollowdate");
	public WebElement gettxtfollowdate() {
		return getElement(txtfollowdate);
		
		}
	
	private By btnAdviceClear=By.id("btnAdviceClear");
	public WebElement getbtnAdviceClear() {
		return getElement(btnAdviceClear);
		
		}
	
	
	private By savebtnfollowup=By.id("btnAdvice");
	public WebElement getsavebtnfollowup() {
		return getElement(savebtnfollowup);
		
		}
	
	public WebElement getsaveprescriptionButton() {
		return getElement(saveprescriptionButton);
		
		}
	
	
	private By FUPselectoption=By.id("ChkSelect0");
	public WebElement getFUPselectoption() {
		return getElement(FUPselectoption);
		
		}
	
	private By btnSelectFUP=By.id("btnSelect");
	public WebElement getbtnSelectFUP() {
		return getElement(btnSelectFUP);
		
		}
	private By btndeleteMed=By.id("btnDeLeteM4");
	public WebElement getbtndeleteMed() {
		return getElement(btndeleteMed);
		
		}
	
	private By txtAddInvestigation=By.id("ctl00_cphpage_txtISearch");
	public WebElement gettxtAddInvestigation() {
		return getElement(txtAddInvestigation);
		
		}
	
	private By btnInvestigation=By.id("btnInvestigation");
	public WebElement getbtnInvestigation() {
		return getElement(btnInvestigation);
		
		}
	
	private By investigationid=By.id("1694,261,4");
	public WebElement getinvestigationid() {
		return getElement(investigationid);
		
		}
	
	private By remarkinv=By.id("Textarea1");
	public WebElement getremarkinv() {
		return getElement(remarkinv);
		
		}
	
	private By AddinvestOk=By.id("btnOKI");
	public WebElement getAddinvestOk() {
		return getElement(AddinvestOk);
		
		}
	
	private By Addinvestclose=By.id("btnI");
	public WebElement getAddinvestclose() {
		return getElement(Addinvestclose);
		
		}
	
	private By AddinvestRemark=By.id("ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab3_TextBox1");
	public WebElement getAddinvestRemark() {
		return getElement(AddinvestRemark);
		
		}
	
	private By Addinvestdropdown=By.id("ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab3_ddl_DropDown");
	public WebElement getAddinvestdropdown() {
		return getElement(Addinvestdropdown);
		
		}
	
	private By Deletediagnosis=By.id("btnDeLeteD4");
	public WebElement getDeletediagnosis() {
		return getElement(Deletediagnosis);
		
		}
	
	private By selectdiagnosis=By.id("33793000$Infarction of testis");
	public WebElement getselectdiagnosis() {
		return getElement(selectdiagnosis);
		
		}
	private By txtclinicaladvice=By.id("ctl00_cphpage_tabSearch_TabPanel5_NestedTabContainer_NestedTab4_txtAdvice");
	public WebElement gettxtclinicaladvice() {
		return getElement(txtclinicaladvice);
		
		}
	
	private By hosptalselectclinicaladvice = By.xpath("//li[contains(text(),'ESIC Hospital & Dental College')]");
	public WebElement gethosptalselectclinicaladvice() {
		return getElement(hosptalselectclinicaladvice);
		
		}
	
	private By DeleteAdvice=By.id("btnDelete2");
	public WebElement getDeleteAdvice() {
		return getElement(DeleteAdvice);
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	}