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

//Sending a request to the API and Storing the Response in 'response'
response = WS.sendRequest(findTestObject('User Edit Information/User Edit Information'))

//Verify that the response gotten is 200 (correct response)
WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the username was edited to this
WS.verifyElementPropertyValue(response, 'update.username', 'treysongz004', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the password was update to this
WS.verifyElementPropertyValue(response, 'update.password', 'F0rmerGho$t', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the email was update to this
WS.verifyElementPropertyValue(response, 'update.email', 'trickeytrei@zombie.net', FailureHandling.CONTINUE_ON_FAILURE)



//Take a break to test the correct signed up data (user ID)



//Sending a request to the API and Storing the Response in 'response1'
response1 = WS.sendRequest(findTestObject('User Edit Information/User Edit Information (Correct Details)'))

//Verify that the response gotten is 200 (correct response)
WS.verifyResponseStatusCode(response1, 200, FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the signed up username was edited to this
WS.verifyElementPropertyValue(response1, 'update.username', 'treysongz004', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the signed up user password was update to this
WS.verifyElementPropertyValue(response1, 'update.password', 'F0rmerGho$t', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the signed up user email was update to this
WS.verifyElementPropertyValue(response1, 'update.email', 'trickeytrei@zombie.net')
