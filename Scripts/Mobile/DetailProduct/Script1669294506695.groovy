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
	
'Detail Product Page'
	Mobile.verifyElementText(findTestObject('Mobile/DetailProduct/product_name'), GlobalVariable.product_name)
	Mobile.verifyElementExist(findTestObject('Mobile/DetailProduct/product_image'), 2)
	Mobile.verifyElementText(findTestObject('Mobile/DetailProduct/product_price'), "\$ "+GlobalVariable.product_price)
	Mobile.verifyElementExist(findTestObject('Mobile/DetailProduct/product_color_black'), 2)
	'Choose Product Color'
		Mobile.tap(findTestObject('Mobile/DetailProduct/product_color_blue'), 2)
		Mobile.verifyElementExist(findTestObject('Mobile/DetailProduct/product_color_active'), 2)
	'Add Quantity'
		Mobile.verifyElementExist(findTestObject('Mobile/DetailProduct/decrease_qty'), 2)
		Mobile.verifyElementExist(findTestObject('Mobile/DetailProduct/increase_qty'), 2)
		Mobile.verifyElementText(findTestObject('Mobile/DetailProduct/qty'), "1")
		
		Mobile.tap(findTestObject('Mobile/DetailProduct/increase_qty'), 2)
		Mobile.verifyElementText(findTestObject('Mobile/DetailProduct/qty2'), GlobalVariable.product_qty)
	'Add to Cart'
		Mobile.verifyElementExist(findTestObject('Mobile/DetailProduct/cart'), 2)
		Mobile.verifyElementNotExist(findTestObject('Mobile/DetailProduct/cart_qty'), 2)
		Mobile.tap(findTestObject('Mobile/DetailProduct/btn_add_to_cart'), 2)
		
		Mobile.verifyElementExist(findTestObject('Mobile/DetailProduct/cart_qty'), 2)
		Mobile.verifyElementText(findTestObject('Mobile/DetailProduct/cart_qty'), GlobalVariable.product_qty)
		