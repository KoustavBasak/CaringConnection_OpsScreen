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

WebUI.callTestCase(findTestCase('ValidateLoginScreenFunctionality/TC_001_VerifyLoginFunctionality'), [('uname') : '', ('pass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('HomePageObject/input_Search_input-tableSearch--style'), name)

WebUI.click(findTestObject('HomePageObject/button_Search'))

WebUI.click(findTestObject('HomePageObject/SelectJohnDoe'))

WebUI.setText(findTestObject('PersonalInformationPageObject/Education_and_Professional_Background'), 'Graduated in Computer Science, currently a Software Engineer with 5 years of experience in app development.')

WebUI.setText(findTestObject('PersonalInformationPageObject/Family_and_Community_Involvement'), 'Actively participates in local community service and enjoys spending time with family.')

WebUI.setText(findTestObject('PersonalInformationPageObject/Hobbies'), 'Loves hiking, photography, and exploring new technologies.')

WebUI.setText(findTestObject('PersonalInformationPageObject/Expectations'), 'Looking for meaningful connections and shared interests.')

WebUI.setText(findTestObject('PersonalInformationPageObject/Other_Information'), 'Avid traveler with a passion for lifelong learning.')

WebUI.click(findTestObject('PersonalInformationPageObject/UpdateProfile/Page_Caring Connection Ops - V- 1.05/button_Save'))

WebUI.click(findTestObject('PersonalInformationPageObject/UpdateProfile/Page_Caring Connection Ops - V- 1.05/button_Save'))

