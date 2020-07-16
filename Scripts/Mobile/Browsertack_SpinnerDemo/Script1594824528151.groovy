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

Mobile.startApplication('bs://999159c8b414a40da6cd3b157e4bba7759c83071', true)

Mobile.tap(findTestObject('Mobile/Spinner/android.widget.TextView11 - Views'), 10)

Mobile.waitForElementPresent(findTestObject('Mobile/Spinner/android.widget.TextView10 - Spinner'), 20)

Mobile.scrollToText('Spinner')

Mobile.tap(findTestObject('Mobile/Spinner/android.widget.TextView10 - Spinner'), 10)

Mobile.tap(findTestObject('Mobile/Spinner/android.widget.Spinner0'), 10)

Mobile.tap(findTestObject('Mobile/Spinner/android.widget.CheckedTextView3 - green'), 10)

Mobile.tap(findTestObject('Mobile/Spinner/android.widget.Spinner1'), 10)

Mobile.tap(findTestObject('Mobile/Spinner/android.widget.CheckedTextView4 - Jupiter'), 10)

actualText = Mobile.getText(findTestObject('Mobile/Spinner/android.widget.TextView4 - Jupiter'), 10)

Mobile.verifyMatch(actualText, "Jupiter", false)

//Mobile.tap(findTestObject('Mobile/Spinner/android.widget.TextView4 - Jupiter'), 10)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

