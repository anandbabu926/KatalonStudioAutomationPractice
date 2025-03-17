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

WebUI.navigateToUrl('http://www.automationpractice.pl/index.php')

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Shop/a_Ecommerce software by PrestaShop'), 'Ecommerce software by PrestaShop™')

WebUI.click(findTestObject('Object Repository/Page_My Shop/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Shop/input_Email address_email'), 'discoverhere1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Shop/input_Password_passwd'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_Login - My Shop/span_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Shop/li_Authentication failed'), 'Authentication failed.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login - My Shop/p_There is 1 error'), 'There is 1 error')

WebUI.closeBrowser()

