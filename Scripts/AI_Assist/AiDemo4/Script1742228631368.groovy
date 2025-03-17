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


/* Write a Katalon Studio test case to perform the following steps.
 * 1. Open browser to the URL stored in http://www.automationpractice.pl/index.php
 * 2. Click the Login
 * 3. Fill in the invalid username and valid password fields based on the variables
 * 4. Click the login button
 * 5. Verify that the Dashboard exists
 * 6. Close the browser
 * */
// Open the browser to the specified URL
WebUI.openBrowser('http://www.automationpractice.pl/index.php')

// Click the Login button
WebUI.click(findTestObject('Page_Login/button_Login'))

// Fill in the invalid username and valid password fields
WebUI.setText(findTestObject('Page_Login/input_Username'), invalidUsername) // invalidUsername is a variable
WebUI.setText(findTestObject('Page_Login/input_Password'), validPassword) // validPassword is a variable

// Click the login button
WebUI.click(findTestObject('Page_Login/button_Submit'))

// Verify that the Dashboard exists
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/label_Dashboard'), 10)

// Close the browser
WebUI.closeBrowser()