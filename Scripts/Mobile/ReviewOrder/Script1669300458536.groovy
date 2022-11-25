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


'Review Order'
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/txt_review_order'), "Review your order")

	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/product_name'), GlobalVariable.product_name)
	Mobile.verifyElementExist(findTestObject('Mobile/CheckoutReviewOrder/product_image'), 2)
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/product_price'), "\$ "+GlobalVariable.product_price)
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/txt_color'), "Color:")
	Mobile.verifyElementExist(findTestObject('Mobile/CheckoutReviewOrder/product_color'), 2)
	'DeliverAddress'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/txt_deliver_address'), "Deliver Address")
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/shipping_name'), GlobalVariable.fullname)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/shipping_address'), GlobalVariable.addressline1)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/shipping_city'), GlobalVariable.city+", ")
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/shipping_country'), GlobalVariable.country+", "+GlobalVariable.zipcode)
	'PaymentMethod'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/txt_payment_method'), "Payment Method")
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/payment_name'), GlobalVariable.fullname)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/payment_card_number'), GlobalVariable.card_number)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/payment_expired'), "Exp: "+GlobalVariable.expire_date)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/payment_billing_address'), "Billing address is the same as shipping address")
	'Shipping Fee'
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/shipping_partner'), "DHL Standard Delivery")
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/shipping_fee'), "\$"+GlobalVariable.shipping_fee)
		Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/shipping_detail'), "Estimated to arrive within 3 weeks.")

'Summary Order'
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/txt_total'), "Total:")
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/summary_items'), GlobalVariable.product_qty+" Items")
	
	String sprice = GlobalVariable.product_price;
	String sqty = GlobalVariable.product_qty;
	String sfee = GlobalVariable.shipping_fee;
	double dprice = Double.parseDouble(sprice);
	int iqty = Integer.parseInt(sqty)
	double dfee = Double.parseDouble(sfee);
	total = (iqty * dprice) + dfee
	
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/summary_price'), "\$ "+total)
	
'Place Order'
	Mobile.verifyElementText(findTestObject('Mobile/CheckoutReviewOrder/btn_place_order'), "Place Order")
	Mobile.tap(findTestObject('Mobile/CheckoutReviewOrder/btn_place_order'), 2)
		