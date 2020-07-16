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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.selenium.dev/selenium/docs/api/java/')

WebUI.switchToFrame(findTestObject('WEB/Page_Overview/frame_html1frameset1frameset1frame1_package_d3e5c8'), 0)

WebUI.click(findTestObject('WEB/Page_Overview/a_comthoughtworksselenium'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('WEB/Page_Overview/a_BrowserConfigurationOptions'))

WebUI.click(findTestObject('WEB/Page_BrowserConfigurationOptions/h2_Class BrowserConfigurationOptions'))

WebUI.click(findTestObject('WEB/Page_BrowserConfigurationOptions/a_BrowserConfigurationOptions'))

WebUI.click(findTestObject('WEB/Page_BrowserConfigurationOptions/a_Instance Methods'))

WebUI.closeBrowser()

