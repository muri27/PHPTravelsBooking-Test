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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Gender1'), Gender, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_First Name_firstname_1'), FirstName1)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Last Name_lastname_1'), LastName1)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Nationality_1'), Nationality, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Birth_Month1'), MonthBirth1, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Day_Birth1'), DayBirth1, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Year_Birth1'), YearBirth1, true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Passport or ID number_passport_1'), 
    Passport1)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Month1'), PassportMonth, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Date1'), PassportDate, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Year1'), PassportYear, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Month1'), ExpireMonth, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Date1'), ExpireDate, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Year1'), ExpireYear, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Gender2'), Gender2, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_First Name_firstname_2'), FirstName2)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Last Name_lastname_2'), LastName2)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Nationality_2'), Nationality, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Birth_Month2'), MonthBirth2, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Day_Birth2'), DayBirth2, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Year_Birth2'), YearBirth2, true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Passport or ID number_passport_2'), 
    Passport2)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Month2'), 
    PassportMonth, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Date2'), 
    PassportDate, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Year2'), 
    PassportYear, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Month2'), 
    ExpireMonth, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Date2'), 
    ExpireDate, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Year2'), 
    ExpireYear, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Gender3'), Gender3, true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_First Name_firstname_3'), FirstName3)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Last Name_lastname_3'), LastName3)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Nationality_3'), 
    Nationality, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Birth_Month3'), 
    MonthBirth3, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Day_Birth3'), DayBirth3)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Year_Birth3'), YearBirth3)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Passport or ID number_passport_3'), 
    Passport3)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Month3'), 
    PassportMonth, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Passport_Date3'), 
    PassportDate)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Passport_Year3'), 
    PassportYear)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Month3'), 
    ExpireMonth, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Expire_Date3'), 
    ExpireDate)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Expire_Year3'), ExpireYear)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Gender4'), Gender4, true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_First Name_firstname_4'), FirstName4)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Last Name_lastname_4'), LastName4)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Nationality_4'), 
    Nationality, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Birth_Month4'), 
    MonthBirth4, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Day_Birth4'), DayBirth4)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Year_Birth4'), YearBirth4)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Passport or ID number_passport_4'), 
    Passport4)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Passport_Month4'), 
    PassportMonth, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Passport_Date4'), 
    PassportDate)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Passport_Year4'), 
    PassportYear)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Expire_Month4'), 
    ExpireMonth, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Expire_Date4'), 
    ExpireDate)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Expire_Year4'), 
    ExpireYear)

WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVELS/label_Agreement'), 
    0)

if(Payment == "Bank"){
	WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/payment_bank_transfer'),FailureHandling.OPTIONAL)
} else if (Payment == "Paddle"){
	WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/payment_paddle'),FailureHandling.OPTIONAL)
} else if (Payment == "PayLater"){
	WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/payment_pay_later'),FailureHandling.OPTIONAL)
} else if (Payment == "PayPal"){
	WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/payment_paypal'),FailureHandling.OPTIONAL)
} else if (Payment == "Setmpos"){
	WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/payment_setmpos'),FailureHandling.OPTIONAL)
} else if (Payment == "Stripe"){
	WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/payment_stripe'),FailureHandling.OPTIONAL)
}


WebUI.scrollToPosition(999999, 999999)

WebUI.waitForElementClickable(findTestObject('Page_Flight Booking - PHPTRAVELS/label_Agreement'), 
    2)

WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVELS/label_Agreement'))

WebUI.waitForElementClickable(findTestObject('Page_Flight Booking - PHPTRAVELS/button_Confirm Booking'), 2)

WebUI.click(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/button_Confirm Booking'))

WebUI.getElementLeftPosition(findTestObject('Page_Flight Invoice - PHPTRAVELS/input_Total Price'))

WebUI.scrollToElement(findTestObject('Page_Flight Invoice - PHPTRAVELS/input_Total Price'), 
    0)

WebUI.waitForElementClickable(findTestObject('Page_Flight Invoice - PHPTRAVELS/button_Download Invoice'), 10)

WebUI.click(findTestObject('Page_Flight Invoice - PHPTRAVELS/button_Download Invoice'))

