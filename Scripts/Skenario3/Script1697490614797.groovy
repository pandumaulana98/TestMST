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

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Username (14)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Username (15)'), 'mstqa')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (14)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (15)'), 'P@ssw0rd')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Login (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add Todo (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Name (12)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Name (13)'), 'MST QA Test 2')

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 3 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (15)'), 0)

Mobile.doubleTap(findTestObject('android.widget.EditText - Choose Type (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Secondary (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input Description (12)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Input Description (13)'), 'Testing')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add Todo (9)'), 0)

Mobile.closeApplication()

