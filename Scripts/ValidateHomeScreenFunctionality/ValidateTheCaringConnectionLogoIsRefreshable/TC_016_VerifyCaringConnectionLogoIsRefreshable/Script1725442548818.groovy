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

// Call the login test case
WebUI.callTestCase(findTestCase('ValidateLoginScreenFunctionality/TC_001_VerifyLoginFunctionality'), [('uname') : '', ('pass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

// Wait for the page to load
WebUI.waitForPageLoad(4)

// Verify the page state before clicking the logo (e.g., by getting the page title)
String pageTitleBeforeClick = WebUI.getWindowTitle()

// Click the logo
WebUI.click(findTestObject('Object Repository/HomePageObject/img_CaringConnectionLogo'))

// Wait for the page to reload after clicking the logo
WebUI.waitForPageLoad(3)

// Verify the page state after clicking the logo
String pageTitleAfterClick = WebUI.getWindowTitle()

if (pageTitleBeforeClick.equals(pageTitleAfterClick)) {
    WebUI.comment('The page did not refresh after clicking the Caring Connection Logo.')

    WebUI.verifyNotEqual(pageTitleBeforeClick, pageTitleAfterClick, FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.comment('The page refreshed successfully after clicking the Caring Connection Logo.')
}

//// Optionally, you can verify if a specific element on the page is refreshed
//boolean isLogoPresentAfterClick = WebUI.verifyElementPresent(findTestObject('Object Repository/HomePageObject/img_CaringConnectionLogo'), 
//    10, FailureHandling.CONTINUE_ON_FAILURE)
//
//if (isLogoPresentAfterClick) {
//    WebUI.comment('The Caring Connection Logo is present after the page refresh.')
//} else {
//    WebUI.comment('The Caring Connection Logo is not present after the page refresh.')
//
//    WebUI.verifyEqual(isLogoPresentAfterClick, true, FailureHandling.STOP_ON_FAILURE)
//}

