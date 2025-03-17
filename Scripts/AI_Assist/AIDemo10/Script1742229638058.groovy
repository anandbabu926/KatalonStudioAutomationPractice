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

/*
 *  The purpose of the code is to automate a test case for logging into a website and adding an item to the cart.
 *
 *  1. Open a browser and navigate to the specified URL.
 *  2. Click on the login button to access the login page.
 *  3. Input the username and password using predefined variables.
 *  4. Click the login button to authenticate the user.
 *  5. Search a White T-shirt and add it to the shopping cart.
 *  6. Proceed to the checkout process.
 *  7. Proceed to shiping information and payment
 *  8. Close the browser after completing the actions.
 *
 */
// Open a browser and navigate to the specified URL
WebUI.openBrowser('https://example.com')

// Click on the login button to access the login page
WebUI.click(findTestObject('Page_Login/button_Login'))

// Input the username and password using predefined variables
WebUI.setText(findTestObject('Page_Login/input_Username'), username)
WebUI.setText(findTestObject('Page_Login/input_Password'), password)

// Click the login button to authenticate the user
WebUI.click(findTestObject('Page_Login/button_Submit'))

// Search a White T-shirt and add it to the shopping cart
WebUI.setText(findTestObject('Page_Home/input_Search'), 'White T-shirt')
WebUI.click(findTestObject('Page_Home/button_Search'))
WebUI.click(findTestObject('Page_SearchResults/button_AddToCart'))

// Proceed to the checkout process
WebUI.click(findTestObject('Page_Cart/button_ProceedToCheckout'))

// Proceed to shipping information and payment
WebUI.click(findTestObject('Page_Checkout/button_ShippingInfo'))
WebUI.click(findTestObject('Page_Checkout/button_Payment'))

// Close the browser after completing the actions
WebUI.closeBrowser()