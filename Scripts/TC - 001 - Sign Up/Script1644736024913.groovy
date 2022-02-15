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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://phptravels.net')

WebUI.click(findTestObject('Page_Login - PHPTRAVELS/button_Got It'))

WebUI.click(findTestObject('Page_PHPTRAVELS - PHPTRAVELS/a_Signup'))

WebUI.setText(findTestObject('Page_Signup - PHPTRAVELS/input_First Name_first_name'), FirstName)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVELS/input_Last Name_last_name'), LastName)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVELS/input_Phone_phone'), Hp)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVELS/input_Email_email'), Email)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVELS/input_Password_password'), Password)

WebUI.scrollToElement(findTestObject('Page_Signup - PHPTRAVELS/a_Login'), 0)

WebUI.click(findTestObject('Page_Signup - PHPTRAVELS/button_Signup'))

if (WebUI.verifyElementVisible(findTestObject('Page_Signup - PHPTRAVELS/div_Email already exist'), FailureHandling.OPTIONAL)) {
    WebUI.navigateToUrl('https://phptravels.net/login')

    WebUI.callTestCase(findTestCase('TC - 002 - Login'), [('Type') : Type, ('Email') : Email, ('Password') : Password, ('FlightType') : FlightType
            , ('Adult') : Adult, ('Child') : Child, ('Infant') : Infant, ('Flying') : Flying, ('Destination') : Destination, ('Departure') : Departure
            , ('Return') : Return, ('Gender') : Gender, ('Gender2') : Gender2, ('Gender3') : Gender3, ('Gender4') : Gender4, ('FirstName1') : FirstName1
            , ('LastName1') : LastName1, ('FirstName2') : FirstName2, ('LastName2') : LastName2, ('FirstName3') : FirstName3, ('LastName3') : LastName3, ('FirstName4') : FirstName4
            , ('LastName4') : LastName4, ('Nationality') : Nationality, ('MonthBirth1') : MonthBirth1, ('DayBirth1') : DayBirth1, ('YearBirth1') : YearBirth1, ('MonthBirth2') : MonthBirth2
            , ('DayBirth2') : DayBirth2, ('YearBirth2') : YearBirth2, ('MonthBirth3') : MonthBirth3, ('DayBirth3') : DayBirth3, ('YearBirth3') : YearBirth3, ('MonthBirth4') : MonthBirth4
            , ('DayBirth4') : DayBirth4, ('YearBirth4') : YearBirth4, ('Passport1') : Passport1, ('Passport2') : Passport2, ('Passport3') : Passport3, ('Passport4') : Passport4
            , ('PassportMonth') : PassportMonth, ('PassportDate') : PassportDate, ('PassportYear') : PassportYear, ('ExpireMonth') : ExpireMonth, ('ExpireDate') : ExpireDate
            , ('ExpireYear') : ExpireYear, ('Payment') : Payment], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('TC - 002 - Login'), [('Type') : Type, ('Email') : Email, ('Password') : Password, ('FlightType') : FlightType
            , ('Adult') : Adult, ('Child') : Child, ('Infant') : Infant, ('Flying') : Flying, ('Destination') : Destination, ('Departure') : Departure
            , ('Return') : Return, ('Gender') : Gender, ('Gender2') : Gender2, ('Gender3') : Gender3, ('Gender4') : Gender4, ('FirstName1') : FirstName1
            , ('LastName1') : LastName1, ('FirstName2') : FirstName2, ('LastName2') : LastName2, ('FirstName3') : FirstName3, ('LastName3') : LastName3, ('FirstName4') : FirstName4
            , ('LastName4') : LastName4, ('Nationality') : Nationality, ('MonthBirth1') : MonthBirth1, ('DayBirth1') : DayBirth1, ('YearBirth1') : YearBirth1, ('MonthBirth2') : MonthBirth2
            , ('DayBirth2') : DayBirth2, ('YearBirth2') : YearBirth2, ('MonthBirth3') : MonthBirth3, ('DayBirth3') : DayBirth3, ('YearBirth3') : YearBirth3, ('MonthBirth4') : MonthBirth4
            , ('DayBirth4') : DayBirth4, ('YearBirth4') : YearBirth4, ('Passport1') : Passport1, ('Passport2') : Passport2, ('Passport3') : Passport3, ('Passport4') : Passport4
            , ('PassportMonth') : PassportMonth, ('PassportDate') : PassportDate, ('PassportYear') : PassportYear, ('ExpireMonth') : ExpireMonth, ('ExpireDate') : ExpireDate
            , ('ExpireYear') : ExpireYear, ('Payment') : Payment], FailureHandling.STOP_ON_FAILURE)
}

