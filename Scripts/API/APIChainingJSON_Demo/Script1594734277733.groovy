import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

getUserListResponse = WS.sendRequest(findTestObject('REST/GetUserList'))

// JSON Slurper
def slurper = new JsonSlurper()

def result = slurper.parseText(getUserListResponse.getResponseBodyContent())

def value = result.data[5].first_name

println('  Value extracted is : ' + value)

GlobalVariable.FirstName = value

println('  GlobalVariable.FirstName  : ' + GlobalVariable.FirstName)

WS.sendRequestAndVerify(findTestObject('REST/UpdateUser', [('firstName') : GlobalVariable.FirstName]))

