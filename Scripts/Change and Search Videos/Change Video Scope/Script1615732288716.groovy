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

response = WS.sendRequest(findTestObject('Change Video Scope/Change Video Scope'))

WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'links[0]', 'https://snapfill-external-api-web-scraper-tasks.s3.amazonaws.com/2021/Mar/03/elisha.dev123456789012345678900001234567890@test-sonalysis-ui/fv376.mp4', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'is_public', 'false', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'reason', 'restricted by policy')

