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

'Complete Order'
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutComplete/txt_checkout_complete'), "Check Out Complete")
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutComplete/txt_thankyou'), "Thank you for your order")
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutComplete/txt_note'), "Your new swag is on its way")
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutComplete/txt_note1'), "Your order has been dispatched and will arrive as fast as the pony gallops!")
	Mobile.verifyElementExist(findTestObject('Mobile/CheckoutComplete/img_shipping'), 2)
	'Continue Shopping'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutComplete/btn_continue_shopping'), "Continue Shopping")
		Mobile.tap(findTestObject('Mobile/CheckoutComplete/btn_continue_shopping'), 2)
		
		Mobile.delay(1)
		Mobile.verifyElementText(findTestObject('Mobile/ListProduct/txt_product'), "Products")