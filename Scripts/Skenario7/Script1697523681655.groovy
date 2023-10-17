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

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Username (30)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Username (31)'), 'mstqa')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (30)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (31)'), 'P@ssw0rd')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (30)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add Todo (20)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Name (28)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Name (29)'), 'MST QA Test 3')

Mobile.doubleTap(findTestObject('Object Repository/android.widget.TextView - (19)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (31)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (32)'), 0)

Mobile.tap(findTestObject('android.widget.TextView - 1 (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OK (4)'), 0)

Mobile.doubleTap(findTestObject('android.widget.EditText - Choose Type (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Secondary (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Description (28)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Description (29)'), 'Testing 3')

Mobile.hideKeyboard()

Mobile.doubleTap(findTestObject('Object Repository/android.widget.TextView - (20)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (33)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (31)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (11)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - MST QA Test 3'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - 01 August 2023'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Secondary (5)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Testing 3'), 0)

Mobile.closeApplication()

