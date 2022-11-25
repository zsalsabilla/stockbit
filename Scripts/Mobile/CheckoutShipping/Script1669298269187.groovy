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

	
'Enter Shipping Address'
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/txt_checkout'), "Checkout")
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/txt_shipping'), "Enter a shipping address")
	'Form'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/label_fullname'), "Full Name*")
		Mobile.setText(findTestObject('Mobile/CheckoutShipping/input_fullname'), GlobalVariable.fullname, 2)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/label_address_line1'), "Address Line 1*")
		Mobile.setText(findTestObject('Mobile/CheckoutShipping/input_address_line1'), GlobalVariable.addressline1, 2)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/label_city'), "City*")
		Mobile.setText(findTestObject('Mobile/CheckoutShipping/input_city'), GlobalVariable.city, 2)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/label_zipcode'), "Zip Code*")
		Mobile.setText(findTestObject('Mobile/CheckoutShipping/input_zipcode'), GlobalVariable.zipcode, 2)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/label_country'), "Country*")
		Mobile.setText(findTestObject('Mobile/CheckoutShipping/input_country'), GlobalVariable.country, 2)
	'To Payment'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutShipping/btn_payment'), "To Payment")
		Mobile.tap(findTestObject('Mobile/CheckoutShipping/btn_payment'), 5)