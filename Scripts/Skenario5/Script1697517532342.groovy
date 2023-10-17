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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\mst-qa-0.0.1.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Username (26)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Username (27)'), 'mstqa')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (26)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (27)'), 'P@ssw0rd')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (24)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add Todo (16)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Name (24)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Name (25)'), 'Testing 1')

Mobile.doubleTap(findTestObject('Object Repository/android.widget.TextView - (15)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (23)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (24)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 1 (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (25)'), 0)

Mobile.tap(findTestObject('android.widget.EditText - Choose Type (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Primary (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Description (24)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Description (25)'), 'test 1')

Mobile.hideKeyboard()

Mobile.doubleTap(findTestObject('Object Repository/android.widget.TextView - (16)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (25)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (26)'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Add Todo (15)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Name (24)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Name (25)'), 'Testing 2')

Mobile.doubleTap(findTestObject('Object Repository/android.widget.TextView - (15)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (23)'), 0)

Mobile.tap(findTestObject('android.widget.TextView - 1 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (25)'), 0)

Mobile.tap(findTestObject('android.widget.EditText - Choose Type (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Secondary (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Description (24)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Description (25)'), 'test 2')

Mobile.hideKeyboard()

Mobile.doubleTap(findTestObject('Object Repository/android.widget.TextView - (16)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (25)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (26)'), 0)

Mobile.closeApplication()

