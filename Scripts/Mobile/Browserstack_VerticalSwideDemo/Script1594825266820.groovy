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


//
//Mobile.tap(findTestObject('Mobile/VerticalSwipe/android.view.ViewGroup1'), 0)
//
//Mobile.pressBack()
//
//Mobile.tap(findTestObject('Mobile/VerticalSwipe/android.view.ViewGroup1'), 0)
//


'wait for element Present'

Mobile.waitForElementPresent(findTestObject('Mobile/VerticalSwipe/android.view.ViewGroup1'), 0)



'\'Scroll to Text Views\''

Mobile.scrollToText('Views', FailureHandling.STOP_ON_FAILURE)



'\'Tap on Views\''

//Mobile.tap(findTestObject('API Demos Objects/text_Views'), 20)
Mobile.tap(findTestObject('Mobile/VerticalSwipe/android.widget.TextView11 - Views'), 10)



'Get Device Height and Store in device_height variable'

device_Height = Mobile.getDeviceHeight()



'Get Width Height and Store in device_Width variable'

device_Width = Mobile.getDeviceWidth()



'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'

int startX = device_Width / 2



'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'

int endX = startX



'Storing the startY value'

int startY = device_Height * 0.30



'Storing the endY value'

int endY = device_Height * 0.70



'Swipe Vertical from top to bottom'

Mobile.swipe(startX, endY, endX, startY)



'Swipe Vertical from bottom to top'

Mobile.swipe(startX, startY, endX, endY)


Mobile.closeApplication()

