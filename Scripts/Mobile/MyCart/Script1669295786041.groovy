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


'Open Cart'
	Mobile.tap(findTestObject('Mobile/DetailProduct/cart'), 2)
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/txt_my_cart'), "My Cart")
	
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/product_name'), GlobalVariable.product_name)
	Mobile.verifyElementExist(findTestObject('Mobile/MyCart/product_image'), 2)
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/product_prices'), "\$ "+GlobalVariable.product_price)
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/txt_color'), "Color:")
	Mobile.verifyElementExist(findTestObject('Mobile/MyCart/color_blue'), 2)
	
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/qty'), GlobalVariable.product_qty)
	
'Summary'
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/summary_total'), "Total:")
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/summary_items'), GlobalVariable.product_qty+" Items")
	
	String sprice = GlobalVariable.product_price;  
	String sqty = GlobalVariable.product_qty;
	double dprice = Double.parseDouble(sprice);  	
	int iqty = Integer.parseInt(sqty)
	price = iqty * dprice
	
	Mobile.verifyElementText(findTestObject('Mobile/MyCart/summary_price'), "\$ "+price)

'Proceed to Checkout'
	Mobile.tap(findTestObject('Mobile/MyCart/btn_checkout'), 2)
	
	
	