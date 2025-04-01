package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@SuppressWarnings("unused")
public class Inpatient_EmergencyPatientpages extends BasePage {
	
	public Inpatient_EmergencyPatientpages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/*img search*/
	private By ImgUhidSearchLink = By.id("ctl00_cphpage_imgsearchuhid");
	/*Serch Text box*/
	private By UhidSerchTextBoxLink = By.id("ctl00_cphpage_txtUhid");
	/*uhidserch window textbox*/
	private By UhidSerchWindowtextBox = By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
	/*uhidserch window textbox*/
	private  By UhidSerchWindowSerchButton=By.id("ctl00_cphpage_hisDataSearchCtrl_btnSearch");
	private By  UhidButtonClose= By.id("ctl00_cphpage_hisDataSearchCtrl_imgbtnClose");
	
	private By  popokbutton= By.id("popup_ok");
	public WebElement getpopokbutton() {
		return getElement(popokbutton);

	}
	private By  BlackOverlay= By.xpath("/html/body/div[1]/form/div[4]/div[2]/div/div/div[2]/div[1]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td/div[2]/div[2]");
	public WebElement getBlackOverlay() {
		return getElement(BlackOverlay);

	}

	/*inpatient_emergency module/ medicine*/
	////tr[@id='ctl00_cphpage_lstViewUnit_ctrl1_row']//img
	private By Inpatient_Emergencypatient_Medicine_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl0_row']//img");
	private By Inpatient_Emergencypatient_Medicine_minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl0_row']//img");
	                                                              
	private By Inpatient_Emergencypatient_Medicine_bed02imgclick=By.id("ctl00_cphpage_lstViewUnit_ctrl1_lstViewUnitBeds_ctrl0_imgComDetails");
	
	/*inpatient_emergency module/ Emergency Unit*/
	
	private By Inpatient_Emergencypatient_EmergencyUnit_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl1_row']//img");
	private By Inpatient_Emergencypatient_EmergencyUnit_minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl2_row']//img");
	
	/*inpatient_emergency module/ IcuUnit*/
	private By Inpatient_Emergencypatient_IcuUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl2_row']//img");
	private By Inpatient_Emergencypatient_IcuUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl2_row']//img");
	
	/*inpatient_emergency module/ CasualityUnit*/
	
	private By Inpatient_Emergencypatient_CasualityUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl3_row']//img");
	private By Inpatient_Emergencypatient_CasualityUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl3_row']//img");
	
	/*inpatient_emergency module/ SurgeryUnit*/
//	html body div#wrapper form#aspnetForm div#ctl00_UpdContentPage div div#ctl00_cphpage_MainScreen div.maincontent table.formlevel tbody tr td div.ListViewContainer div#ctl00_cphpage_pnlDetail div.grid table#orders tbody tr#ctl00_cphpage_lstViewUnit_ctrl0_row.group th.first img
	private By Inpatient_Emergencypatient_SurgeryUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl4_row']//img");
	private By Inpatient_Emergencypatient_SurgeryUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl4_row']//img");
	/*inpatient_emergency module/ DumyUnit*/
	private By Inpatient_Emergencypatient_ENTUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl5_row']//img");
	private By Inpatient_Emergencypatient_ENTUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl5_row']//img");
	/*inpatient_emergency module/ TestingUnit*/
	
	private By Inpatient_Emergencypatient_TestingUnit_Pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl6_row']//img");
	private By Inpatient_Emergencypatient_TestingUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl6_row']//img");
	/*inpatient_emergency module/ L1dcUnit*/
	private By Inpatient_Emergencypatient_l1dcUnit_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl7_row']//img");
	private By Inpatient_Emergencypatient_l1dcUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl7_row']//img");
	
	
	/*inpatient_emergency module/ Gernal_Unit*/
	private By Inpatient_Emergencypatient_GenralUnit_pluse=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl8_row']//img");
	private By Inpatient_Emergencypatient_GenralUnit_Minus=By.xpath("//html//body//div[@id='wrapper']//table[@id='orders']/tbody/tr[@id='ctl00_cphpage_lstViewUnit_ctrl8_row']//img");
	
	
	private By Inpatient_Emergencypatient_ipcasesheet_back_button=By.id("ctl00_cphpage_btnBack");
	
	
	/*inpatient_emergency module*/
	public WebElement getInpatient_Emergencypatient_ipcasesheet_back_buttonLink() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_back_button);
	}
	
	public WebElement getInpatient_Emergencypatient_Medicine_pluselink() {
		return getElement(Inpatient_Emergencypatient_Medicine_pluse);
	}
	public WebElement getInpatient_Emergencypatient_Medicine_minusLink() {
		return getElement(Inpatient_Emergencypatient_Medicine_minus);
	}
	public WebElement getInpatient_Emergencypatient_Medicine_bed02imgclickLink() {
		return getElement(Inpatient_Emergencypatient_Medicine_bed02imgclick);
		
		
	}
	
	public WebElement getInpatient_Emergencypatient_EmergencyUnit_pluseLink() {
		return getElement(Inpatient_Emergencypatient_EmergencyUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_EmergencyUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_EmergencyUnit_minus);
	}
	public WebElement getInpatient_Emergencypatient_ENTUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_ENTUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_ENTUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_ENTUnit_Minus);
	}
	public WebElement getInpatient_Emergencypatient_CasualityUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_CasualityUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_CasualityUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_CasualityUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_SurgeryUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_SurgeryUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_SurgeryUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_SurgeryUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_TestingUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_TestingUnit_Pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_TestingUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_TestingUnit_Minus);
		
	}
	public WebElement getInpatient_Emergencypatient_l1dcUnit_pluseLink() {
		return getElement(Inpatient_Emergencypatient_l1dcUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_l1dcUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_l1dcUnit_Minus);
		
	}
	
	
	public WebElement getInpatient_Emergencypatient_GenralUnit_pluselink() {
		return getElement(Inpatient_Emergencypatient_GenralUnit_pluse);
		
	}
	public WebElement getInpatient_Emergencypatient_GenralUnit_Minuslink() {
		return getElement(Inpatient_Emergencypatient_GenralUnit_Minus);
		
	}	
	public WebElement getInpatient_Emergencypatient_IcuUnit_PluseLink() {
		return getElement(Inpatient_Emergencypatient_IcuUnit_Pluse);
	}
	public WebElement getInpatient_Emergencypatient_IcuUnit_MinusLink() {
		return getElement(Inpatient_Emergencypatient_IcuUnit_Minus);
	}
	//ipcasesheet
	//chief Complain
	private By Inpatient_Emergencypatient_ipcasesheet_ChiefComplain=By.id("ctl00_cphpage_trvSectionst1");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ChiefComplain() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ChiefComplain);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_ChiefComplainTextBox=By.id("txt_complaint");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ChiefComplainTextBox() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ChiefComplainTextBox);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_ChiefComplainVlaue=By.id("Tenement");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ChiefComplainVlaue() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ChiefComplainVlaue);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_ChiefComplainAddButton=By.id("btn_Add");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ChiefComplainAddButton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ChiefComplainAddButton);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_ChiefComplainSubmitButon=By.id("btn_Submit");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ChiefComplainSubmitButon() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ChiefComplainSubmitButon);
	}
	//Hisstory of Illness
	private By Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllness=By.id("ctl00_cphpage_trvSectionst2");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_HistorofpresentIllness() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllness);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessTextBox=By.id("TemplatePreviewControl_txtHistoryofPresentIllness");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessTextBox() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessTextBox);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnesssaveButton=By.id("btnSave");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnessSaveButton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_HistorofpresentIllnesssaveButton);
	}
	//past History
	private By Inpatient_Emergencypatient_ipcasesheet_PastHistory=By.id("ctl00_cphpage_trvSectionst3");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_PastHistory() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_PastHistory);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_PastHistoryTextBox=By.id("TemplatePreviewControl_txtremark6");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_PastHistoryTextBox() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_PastHistoryTextBox);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_PastHistorysaveButton=By.id("btnSave");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_PastHistorysaveButton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_PastHistorysaveButton);
	}
	//Genral Examination
	private By Inpatient_Emergencypatient_ipcasesheet_GenralExamination=By.id("ctl00_cphpage_trvSectionst5");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_GenralExamination() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_GenralExamination);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorRadioButton=By.id("TemplatePreviewControl_ChkPallor_0");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorRadioButton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorRadioButton);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorSaveButton=By.id("btnSave");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorSaveButton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_GenralExaminationParloorSaveButton);
	}
	//System Examination
	private By Inpatient_Emergencypatient_ipcasesheet_SystemincExamination=By.id("ctl00_cphpage_trvSectionst6");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_SystemincExamination() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_SystemincExamination);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem=By.id("TemplatePreviewControl_txtRespiratorySystem");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem);
	}
	
	private By Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem_radiobutton=By.id("TemplatePreviewControl_radRaised_0");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem_radiobutton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystem_radiobutton);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystemSave=By.id("btnSave");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystemSave() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_SystemincExaminationRespiratorySystemSave);
	}
	
	//Local_Special Examination
	private By Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExamination=By.id("ctl00_cphpage_trvSectionst7");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Local_SpecialExamination() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExamination);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleTextBox=By.id("TemplatePreviewControl_txtlblSiteandExtentofinjury");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleTextBox() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleTextBox);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleSaveButton=By.id("btnSave");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleSaveButton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Local_SpecialExaminationMuscleSaveButton);
	}
	//Diagnos
	private By Inpatient_Emergencypatient_ipcasesheet_Diagnos=By.id("ctl00_cphpage_trvSectionst9");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Diagnos() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Diagnos);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_DiagnosSerchTextBox=By.id("txtDiagnosis");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_DiagnosSerchTextBox() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_DiagnosSerchTextBox);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_DiagnosVlaue=By.id("33793000$Testicular infarction");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_DiagnosVlaue() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_DiagnosVlaue);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_DiagnosTypeDdl=By.id("ddl_DropDown");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_DiagnosTypeDdl() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_DiagnosTypeDdl);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_DiagnosADDbutton=By.id("btnOK");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_DiagnosADDbutton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_DiagnosADDbutton);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_DiagnosSaveButton=By.id("btnISaveClose");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_DiagnosSaveButton() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_DiagnosSaveButton);
	}
	
	//prescription
	private By Inpatient_Emergencypatient_ipcasesheet_Prescription=By.id("ctl00_cphpage_trvSectionst11");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Prescription() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Prescription);
	}
	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}
	private By orderpack = By.id("18929");
	public WebElement getorderpack() {
		return getElement(orderpack);

	}
	private By clickorderpackbutton = By.id("btnOrdpack"); // 97701
	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}
	private By btnISaveClose = By.id("btnISaveClose"); //
	public WebElement getbtnISaveClose() {
		return getElement(btnISaveClose);

	}
	private By orderpackselection = By.id("18990"); //
	public WebElement getorderpackselection() {
		return getElement(orderpackselection);

	}
	private By Inpatient_Emergencypatient_ipcasesheet_ArtificalLimbAidsApplince=By.id("ctl00_cphpage_trvSectionst12");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ArtificalLimbAidsApplince() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ArtificalLimbAidsApplince);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_Advice=By.id("ctl00_cphpage_trvSectionst13");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Advice() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Advice);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_Vitals=By.id("ctl00_cphpage_trvSectionst15");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Vitals() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Vitals);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_ImmunizationStatus=By.id("ctl00_cphpage_trvSectionst16");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ImmunizationStatus() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ImmunizationStatus);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_Allergies=By.id("ctl00_cphpage_trvSectionst17");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Allergies() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Allergies);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_GlasgComaScaleow=By.id("ctl00_cphpage_trvSectionst18");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_GlasgComaScaleow() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_GlasgComaScaleow);
	}
	
	private By Inpatient_Emergencypatient_ipcasesheet_Apgar=By.id("ctl00_cphpage_trvSectionst19");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_Apgar() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_Apgar);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_PAC=By.id("ctl00_cphpage_trvSectionst20");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_PAC() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_PAC);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_ProgressNote=By.id("ctl00_cphpage_trvSectionst21");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_ProgressNote() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_ProgressNote);
	}
	private By Inpatient_Emergencypatient_ipcasesheet_DietPlan=By.id("ctl00_cphpage_trvSectionst22");
	public WebElement getInpatient_Emergencypatient_ipcasesheet_DietPlan() {
		return getElement(Inpatient_Emergencypatient_ipcasesheet_DietPlan);
	}
	
	private By addnodropdown=By.id("ctl00_cphpage_hisDataSearchCtrl_hisSearchCriteria_dlData_ctl00_ddlCriteria");
	public WebElement getaddnodropdown() {
		return getElement(addnodropdown);
	}
//	public void prescription() {
//	String parent3 = driver.getWindowHandle();
//
//	utilobj.Window(driver);
//
//	getlableprecripstionlink().click();
//
//	Thread.sleep(2000);
//
//	
//	utilobj.ChildWindow(driver);
//	Thread.sleep(2000);
//
//	wait.until(ExpectedConditions.visibilityOf(gettxtOrdPackSearch()));
//	System.out.println(driver.getTitle());
//
//	utilobj.JSEnterText(gettxtOrdPackSearch(), driver, "Automation");
//	Thread.sleep(2000);
//
//	utilobj.JSClick(getclickorderpackbutton(), driver);
//	
//
//	
//	Thread.sleep(5000);
//
//	utilobj.JSClick(getorderpackselection(), driver);
//
//	Thread.sleep(5000);
//
//	utilobj.JSClick(getbtnISaveClose(), driver);
//
//	utilobj.waitForalert(driver);
//
//	driver.switchTo().alert().accept();
//	driver.switchTo().window(parent3);
//
//	driver.switchTo().defaultContent();
//}
}