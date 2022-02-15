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

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/input_one_way'))

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Flying From_from'), Flying)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/div_From'))

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVELS/input_To Destination_to'), Destination)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/div_Destination'))

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVELS/input_Departure Date_depart'), Departure)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/select_Passenger'))

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Adults'), Adult)

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Childs'), Child)

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Infants'), Infant)

WebUI.selectOptionByValue(findTestObject('Page_Search Hotels - PHPTRAVELS/select_Flight_Type'), 
    FlightType, true)

WebUI.click(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVELS/button_Search'))

WebUI.click(findTestObject('Page_Flights - PHPTRAVELS/button_Book Now'))

WebUI.callTestCase(findTestCase('TC - 005 - Fill Form'), [('Gender') : Gender, ('Gender2') : Gender2, ('Gender3') : Gender3
        , ('Gender4') : Gender4, ('FirstName1') : FirstName1, ('LastName1') : LastName1, ('FirstName2') : FirstName2, ('LastName2') : LastName2
        , ('FirstName3') : FirstName3, ('LastName3') : LastName3, ('FirstName4') : FirstName4, ('LastName4') : LastName4
        , ('Nationality') : Nationality, ('MonthBirth1') : MonthBirth1, ('DayBirth1') : DayBirth1, ('YearBirth1') : YearBirth1
        , ('MonthBirth2') : MonthBirth2, ('DayBirth2') : DayBirth2, ('YearBirth2') : YearBirth2, ('MonthBirth3') : MonthBirth3
        , ('DayBirth3') : DayBirth3, ('YearBirth3') : YearBirth3, ('MonthBirth4') : MonthBirth4, ('DayBirth4') : DayBirth4
        , ('YearBirth4') : YearBirth4, ('Passport1') : Passport1, ('Passport2') : Passport2, ('Passport3') : Passport3, ('Passport4') : Passport4
        , ('PassportMonth') : PassportMonth, ('PassportDate') : PassportDate, ('PassportYear') : PassportYear, ('ExpireMonth') : ExpireMonth
        , ('ExpireDate') : ExpireDate, ('ExpireYear') : ExpireYear, ('Payment') : Payment], FailureHandling.STOP_ON_FAILURE)

