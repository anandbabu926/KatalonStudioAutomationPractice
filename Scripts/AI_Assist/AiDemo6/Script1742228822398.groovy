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
      *  5. Add a red T-shirt to the shopping cart.
      *  6. Proceed to the checkout process.
      *  7. Close the browser after completing the actions.
      *
      */

// Open the browser to the specified URL
WebUI.openBrowser('http://www.automationpractice.pl/index.php')

// Click the Login button
WebUI.click(findTestObject('Page_Login/button_Login'))

// Fill in the username and password fields
WebUI.setText(findTestObject('Page_Login/input_Username'), username) // username is a variable
WebUI.setText(findTestObject('Page_Login/input_Password'), password) // password is a variable

// Click the login button
WebUI.click(findTestObject('Page_Login/button_Submit'))

// Add a new red T shirt to Cart
WebUI.click(findTestObject('Page_Product/button_AddToCart_RedTshirt'))

// Proceed to check out
WebUI.click(findTestObject('Page_Cart/button_ProceedToCheckout'))

// Close the browser
WebUI.closeBrowser()