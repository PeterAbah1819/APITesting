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
response = WS.sendRequest(findTestObject('User Login/User Login'))

//VErify that the response gotten is 200 (correct response)
WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

//Verify that using a different sign in username fails
WS.verifyElementPropertyValue(response, 'username', 'elisha.dev123456@test-sonalysis-ui', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that using a different sign in password fails
WS.verifyElementPropertyValue(response, 'password', '@pPYn3$s--84', FailureHandling.CONTINUE_ON_FAILURE)


//Take a break to test the correct signed up data


//Sending a request to the API and Storing the Response in 'response1' for the correct signed up data
response1 = WS.sendRequest(findTestObject('User Login/User Login (Correct Details)'))

//VErify that the response gotten is 200 (correct response) for the correct signed up data
WS.verifyResponseStatusCode(response1, 200, FailureHandling.CONTINUE_ON_FAILURE)

//Verify that using a different sign in username fails
WS.verifyElementPropertyValue(response1, 'username', 'elisha.dev12@test-sonalysis-ui', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that using a different sign in password fails
WS.verifyElementPropertyValue(response1, 'password', '@pPYn3$s--84')



