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

'Enter Payment Method'
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/txt_payment_method'), "Enter a payment method")
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/txt_payment_method_detail'), "You will not be charged until you review your purchase on the next screen.")
	
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/txt_card'), "Card")
	Mobile.verifyElementExist(findTestObject('Mobile/CheckoutPayment/img_visa'), 2)
	Mobile.verifyElementExist(findTestObject('Mobile/CheckoutPayment/img_mastercard'), 2)
	'Form Payment'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/txt_full_name'), "Full Name*")
		Mobile.setText(findTestObject('Mobile/CheckoutPayment/input_full_name'), GlobalVariable.fullname, 2)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/txt_card_number'), "Card Number*")
		Mobile.setText(findTestObject('Mobile/CheckoutPayment/input_card_number'), GlobalVariable.card_number, 2)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/txt_expire_date'), "Expiration Date*")
		Mobile.setText(findTestObject('Mobile/CheckoutPayment/input_expire_date'), GlobalVariable.expire_date, 2)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/txt_security_code'), "Security Code*")
		Mobile.setText(findTestObject('Mobile/CheckoutPayment/input_security_code'), GlobalVariable.security_code, 2)
		
		Mobile.verifyElementChecked(findTestObject('Mobile/CheckoutPayment/check_address'), 2)
	'Review Order'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutPayment/btn_review_order'), "Review Order")
		Mobile.tap(findTestObject('Mobile/CheckoutPayment/btn_review_order'), 2)
		
		