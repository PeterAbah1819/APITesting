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
response = WS.sendRequest(findTestObject('User SignUp/User SignUp'))

//VErify that the response gotten is 201 (correct response)
WS.verifyResponseStatusCode(response, 201)

//Verify that the username is the same as that signed up with
WS.verifyElementPropertyValue(response, 'username', 'elisha.dev12@test-sonalysis-ui')

//Verify that the password is the same as the signedup with
WS.verifyElementPropertyValue(response, 'password', '@pPYn3$s--84', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the source is the same as that signed up with
WS.verifyElementPropertyValue(response, 'source', 'testing', FailureHandling.CONTINUE_ON_FAILURE)

//Verfiry that the role is the same as that signed up with
WS.verifyElementPropertyValue(response, 'role', 'user')

//Verify that the first_name is the same as that signed up with
WS.verifyElementPropertyValue(response, 'first_name', 'Elisha', FailureHandling.CONTINUE_ON_FAILURE)

//Verify that the last_name is the same as that signed up with
WS.verifyElementPropertyValue(response, 'last_name', 'AppDev')

