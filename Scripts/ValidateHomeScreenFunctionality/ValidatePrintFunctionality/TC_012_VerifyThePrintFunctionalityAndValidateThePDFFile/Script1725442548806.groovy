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
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths

// Call the print test case
WebUI.callTestCase(findTestCase('ValidateHomeScreenFunctionality/ValidatePrintFunctionality/TC_005_VerifyThePrintFunctionality'), 
    [:], FailureHandling.STOP_ON_FAILURE)

// Get the current user's username
String username = System.getProperty('user.name')

// Define the dynamic download path based on the username
String downloadPath = ('C:\\Users\\' + username) + '\\Downloads\\'

String expectedFileName = 'caring_connections_members.pdf'

// Define the download path and file name
//String downloadPath = 'C:\\Users\\KoustavBasak\\Downloads\\'     
//String expectedFileName = 'caring_connections_members.pdf'
// Wait for the file to be downloaded (adjust the timeout as needed)
WebUI.delay(10)

// Check if the file exists and is a PDF
File downloadedFile = new File(downloadPath + expectedFileName)

if (downloadedFile.exists()) {
    if (Files.probeContentType(Paths.get(downloadedFile.getAbsolutePath())) == 'application/pdf') {
        WebUI.comment('The downloaded file is a PDF.')
    } else {
        WebUI.comment('The downloaded file is not a PDF.')

        WebUI.verifyMatch(Files.probeContentType(Paths.get(downloadedFile.getAbsolutePath())), 'application/pdf', true, 
            FailureHandling.STOP_ON_FAILURE)
    }
} else {
    WebUI.comment('The downloaded file does not exist.')

    WebUI.verifyEqual(downloadedFile.exists(), true, FailureHandling.STOP_ON_FAILURE)
}

