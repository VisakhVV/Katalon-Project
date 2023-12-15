import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.deleteAllCookies(FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://mifinuat.cim.local/lease/')

WebUI.setText(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_miFIN_userId'), 'copsuserm')

WebUI.setEncryptedText(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_miFIN_password'), 'iZKiu3Mw15dMyU9HHbuK3g==')

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/button_LOGIN'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.switchToWindowTitle('DASHBOARD')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/all in one/i_VIEWER_img1200004000'))

WebUI.click(findTestObject('Object Repository/all in one/i_DM QUOTATION_img1200004001'))

WebUI.click(findTestObject('Object Repository/all in one/a_DM APPLICATION'))

WebUI.click(findTestObject('Object Repository/all in one/input_Entity Code_btn btn-primary btn-sm'))

WebUI.waitForPageLoad(3)

WebUI.closeWindowTitle('miFIN')

WebUI.switchToWindowUrl('https://mifinuat.cim.local/lease/quotationSearchAction.do?actionPerformed=displaySearchScreen&searchType=DM&screenFlag=Y&parentBodyId=dmNewApplicantId')

/*

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SELECTLEADCUSTOMERENQUIRYQUOTATION'), 'QUOTATION',
	true)

WebUI.setText(findTestObject('Object Repository/all in one/input_ENTITY CODE_entityCode'), 'QU00022832')

WebUI.setText(findTestObject('Object Repository/all in one/input_ENTITY CODE_entityCode_1_2'), 'QU00022832')

*/
WebUI.setText(findTestObject('Object Repository/all in one/input_CUSTOMERCOMPANY FNAME_firstName'), first_name)

WebUI.setText(findTestObject('Object Repository/all in one/input_LAST NAME_lastName'), last_name)

WebUI.click(findTestObject('Object Repository/all in one/input_Entity Code_btn btn-primary btn-sm'))

WebUI.click(findTestObject('Object Repository/all in one/input_MOBILE_selectApplicant'))

WebUI.click(findTestObject('Object Repository/all in one/input_ROHAN TESTQA_btn btn-primary btn-sm'))

WebUI.switchToWindowTitle('miFIN')

WebUI.click(findTestObject('Object Repository/all in one/input_Entity Code_btn btn-primary btn-sm_1'))

WebUI.click(findTestObject('Object Repository/all in one/input_Limit Code_btndealerName'))

WebUI.switchToWindowTitle('limitChooser')

WebUI.sendKeys(findTestObject('Object Repository/all in one/input_Name_populateId'), Keys.chord(Keys.ENTER))

/*
WebUI.click(findTestObject('Object Repository/all in one/font_CNCIMF000003205 - ROHAN TESTQA , Finan_8dc407'))

WebUI.click(findTestObject('Object Repository/all in one/input_LMCST0000006150_OK'))

*/
WebUI.switchToWindowTitle('miFIN')

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SELECTBUSINESS EXPANSIONEDUCATION LO_ad1c1d'), 
    '1000000021', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SELECTAGN0000135-ALLY OOZEERALLYAGN0_388b55'), 
    '1000000135', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SELECTCONTACT CENTREDEALERSHIPDIRECT_678662'), 
    '1200000033', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SELECTALLY OOZEERALLYFABRICE DANGEOT_d85ecc'), 
    '1000000090', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/add guarantor/a_Save  Continue (1)'))

WebUI.waitForAlert(2, FailureHandling.OPTIONAL)

WebUI.acceptAlert()

WebUI.waitForPageLoad(3, FailureHandling.OPTIONAL)

/* To input a guarantor */
WebUI.click(findTestObject('Object Repository/add guarantor/a_APPLICANT (1)'))

WebUI.click(findTestObject('Object Repository/add guarantor/input_APPLICANT LIST_newbutton (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/add guarantor/select_SELECTCO-LESSEEGUARANTORBUYERBUYER LESSEE (1)'), 
    '1000000004', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/add guarantor/select_SELECTINDIVIDUALNON-INDIVIDUAL (1)'), '1000000001', 
    true)

WebUI.click(findTestObject('Object Repository/add guarantor/input_Customer Id_isExisting (1)'))

WebUI.click(findTestObject('Object Repository/add guarantor/input_Existing_search (1)'))

WebUI.switchToWindowUrl('https://mifinuat.cim.local/lease/applicantSearchAction.do?actionPerformed=displaySearchScreen&productId=&limitId=&limitAppFlag=DM')

WebUI.setText(findTestObject('Object Repository/add guarantor/input_COMPANY NAME FIRST NAME_firstName_1_2_3_4_5_6_7_8 (1)'), 
    'jonathan')

WebUI.setText(findTestObject('Object Repository/add guarantor/input_LAST NAME_lastName (1)'), 'TESTQA')

WebUI.click(findTestObject('Object Repository/add guarantor/input_DOB INCORP_blueBotton (1)'))

WebUI.click(findTestObject('Object Repository/add guarantor/input_MOBILE NO_selectApplicant (1)'))

WebUI.click(findTestObject('Object Repository/add guarantor/input_JONATHAN  TESTQA_blueBotton (1)'))

WebUI.switchToWindowTitle('miFIN')

WebUI.click(findTestObject('Object Repository/Page_miFIN/input_Existing_get'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_miFIN/select_SELECTSPOUSEFATHERMOTHERSONDAUGHTERS_92032f'), 
    '1000000011', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_miFIN/select_SELECT  AFGHANISTANALBANIAALGERIAAME_60d157'), 
    '1000000103', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_miFIN/select_SELECT  AFGHANISTANALBANIAALGERIAAME_60d157_1'), 
    '1000000103', true)

WebUI.click(findTestObject('Object Repository/Page_miFIN/i_Passport Expiry_fa fa-calendar'))

WebUI.switchToWindowTitle('Calendar')

WebUI.click(findTestObject('Object Repository/Page_Calendar/a_8'))

WebUI.switchToWindowTitle('miFIN')

WebUI.waitForPageLoad(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('DM_Quotation_Creation/Page_miFIN/a_Save_1'))

WebUI.waitForAlert(3, FailureHandling.OPTIONAL)

WebUI.acceptAlert()

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/add guarantor/a_APPLICANT (1)'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('DM_Quotation_Creation/Page_miFIN/a_ASSET DETAILS_1'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/a_Save'))

WebUI.acceptAlert()

WebUI.waitForPageLoad(4)

WebUI.click(findTestObject('DM_Quotation_Creation/Page_miFIN/a_My Dashboard'))

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_DASHBOARD/i_DM APPLICATION_img1200004003'))

WebUI.click(findTestObject('DM_Quotation_Creation/Page_miFIN/a_CASHFLOW_Menu'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/select_SELECT PENDINGDISBURSEDCLOSEDFORECLO_ad6911'), 
    '1000000001', true)

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_Engine No_search'))

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/a_DMFIN1000008405 (1)'))

WebUI.click(findTestObject('DM_Quotation_Creation/Page_miFIN/a_QUOTATION_tab'))

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_Customer Bank_btnBank'))

WebUI.switchToWindowTitle('CUSTOMER BANK')

WebUI.setText(findTestObject('Object Repository/DM_Quotation_Creation/Page_CUSTOMER BANK/input_Name_populateId'), 'cim')

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_CUSTOMER BANK/font_CIM BANK - PORT LOUIS - SAVING ACCOUNT_c948b2'))

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_CUSTOMER BANK/input_MAURITIUS COMMERCIAL BANK LTD - SIR W_51a108'))

WebUI.switchToWindowTitle('miFIN')

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_CIM Bank_btnBank2'))

WebUI.switchToWindowTitle('CIM BENEFECIARY')

WebUI.setText(findTestObject('Object Repository/DM_Quotation_Creation/Page_CIM BENEFECIARY/input_Name_populateId'), 'abc')

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_CIM BENEFECIARY/font_ABC BANKING CORPORATION LTD - HEAD OFF_3e22ab'))

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_CIM BENEFECIARY/input_MAURITIUS COMMERCIAL BANK LTD - SIR W_51a108'))

WebUI.switchToWindowTitle('miFIN')

WebUI.scrollToElement(findTestObject('DM_Quotation_Creation/Page_miFIN/div_RV DETAILS'), 0)

WebUI.doubleClick(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_Effective Lease Start Date_START_DATE (1)'))

WebUI.setText(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_Effective Lease Start Date_START_DATE (1)'), 
    '30-jul-2023')

WebUI.selectOptionByValue(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/select_SELECT17142128 (1)'), 
    '7', true)

WebUI.scrollToElement(findTestObject('Page_miFIN/div_FORECLOSURE DETAILS'), 0)

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/a_Save (2)'))

WebUI.acceptAlert()

WebUI.waitForPageLoad(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/a_CASHFLOW (2)'))

WebUI.click(findTestObject('DM_Quotation_Creation/Page_miFIN/a_Save (1)'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

/* DM Quotation > registration details */
WebUI.click(findTestObject('Object Repository/all in one/a_REGISTRATION DETAILS_1'))

WebUI.click(findTestObject('Object Repository/all in one/a_Save'))

WebUI.waitForAlert(2, FailureHandling.OPTIONAL)

WebUI.acceptAlert()

/* to change here 

WebUI.click(findTestObject('Object Repository/all in one/a_DM SANCTION'))

*/
WebUI.click(findTestObject('Object Repository/all in one/a_DOCUMENT'))

WebUI.click(findTestObject('Object Repository/all in one/input_Last Updated Date_UPDATED_CHK0'))

WebUI.click(findTestObject('Object Repository/all in one/input_SYSUSER_UPDATED_CHK1'))

WebUI.click(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_SYSUSER_UPDATED_CHK2'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/all in one/input_Last Updated Date_DOCUMENT_DESCRIPTION0'), 'ok')

WebUI.setText(findTestObject('Object Repository/all in one/input_SYSUSER_DOCUMENT_DESCRIPTION1'), 'ok')

WebUI.setText(findTestObject('Object Repository/DM_Quotation_Creation/Page_miFIN/input_SYSUSER_DOCUMENT_DESCRIPTION2'), 
    'ok', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SelectRECEIVEDPENDINGDEFERRED'), '1000000001', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SelectRECEIVEDPENDINGDEFERRED_1'), '1000000001', 
    true)

WebUI.selectOptionByValue(findTestObject('DM_Quotation_Creation/Page_miFIN/select_SelectRECEIVEDPENDINGDEFERRED_3'), '1000000001', 
    true, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Object Repository/additional items/input_Last Updated Date_file'), file_kyc)

WebUI.uploadFile(findTestObject('Object Repository/additional items/input_SYSUSER_file'), file_kyc)

WebUI.uploadFile(findTestObject('DM_Quotation_Creation/Page_miFIN/input_SYSUSER_file_4'), file_kyc, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/all in one/a_Save'))

WebUI.waitForAlert(2, FailureHandling.OPTIONAL)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/all in one/a_DM OFFLINE ACTION (1)'))

WebUI.click(findTestObject('Object Repository/Page_miFIN/input_Sales Deed Released_ng-pristine ng-un_bb831b'))

WebUI.click(findTestObject('Object Repository/all in one/a_Save'))

WebUI.acceptAlert()

WebUI.waitForPageLoad(3, FailureHandling.OPTIONAL)

/* DM SANCTION STARTS BELOW */
WebUI.click(findTestObject('Object Repository/all in one/a_DM SANCTION'))

WebUI.setText(findTestObject('Object Repository/all in one/input_Engine No_engineNo'), '7540')

WebUI.setText(findTestObject('Object Repository/all in one/input_Chassis No_chassisNo'), '2066')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_miFIN/select_SELECTCLIENTFMC (1)'), '1000000001', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/all in one/select_SELECTHOLD REJECT RECOMMEND'), '1000000003', 
    true)

WebUI.setText(findTestObject('Object Repository/all in one/input_Remarks_remark'), 'ok')

WebUI.click(findTestObject('Object Repository/all in one/a_Save_1'))

WebUI.waitForAlert(2, FailureHandling.OPTIONAL)

WebUI.acceptAlert()

WebUI.waitForAlert(2, FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/all in one/img_Hi COPSUSERM_userr (1)'))

WebUI.click(findTestObject('Object Repository/all in one/a_Logout (1)'))

