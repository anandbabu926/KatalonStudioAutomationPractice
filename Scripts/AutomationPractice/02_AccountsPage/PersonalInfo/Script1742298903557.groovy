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

WebUI.callTestCase(findTestCase('AutomationPractice/01_Login/verify_valid_login'), [('username') : 'discoverhere@gmail.com', ('password') : 'iGDxf8hSRT4='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_My account - My Shop/span_My personal information'))

WebUI.click(findTestObject('Object Repository/Page_Identity - My Shop/input_Mr_id_gender'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Identity - My Shop/input_Current Password_old_passwd'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_Identity - My Shop/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Identity - My Shop/p_Your personal information has been succes_b21e86'), 
    'Your personal information has been successfully updated.')

WebUI.click(findTestObject('Object Repository/Page_Identity - My Shop/a_Sign out'))

WebUI.closeBrowser()

