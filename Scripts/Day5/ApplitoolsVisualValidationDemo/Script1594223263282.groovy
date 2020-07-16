import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://applitools.com/helloworld2/')

WebUI.click(findTestObject('WEB/Page_Applitools/a_diff1'))

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('Check1')

WebUI.click(findTestObject('WEB/Page_Applitools/a_diff2'))

WebUI.click(findTestObject('WEB/Page_Applitools/button_Click me'))

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('Check2')

WebUI.closeBrowser()

