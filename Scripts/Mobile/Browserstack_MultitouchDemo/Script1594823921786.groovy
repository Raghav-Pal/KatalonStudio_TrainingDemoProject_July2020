import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.Duration

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MultiTouchAction
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption

Mobile.startApplication('bs://b49261b3ca29138f60482ece9fc41149914dfd8a', true)

//Mobile.tap(findTestObject('Mobile/Multitouch/android.widget.TextView1 - 0'), 0)


'Wait for Element Visible "Touch Me"'
Mobile.waitForElementPresent(findTestObject('Mobile/Multitouch/android.widget.TextView1 - 0'), 10)

'Verify Element Visible "Touch Me"'
Mobile.verifyElementVisible(findTestObject('Mobile/Multitouch/android.widget.TextView1 - 0'), 10)

'Initializing Katalon Mobile Driver to Appium Driver'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

'Get Device Height and store to "device_Height" variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and store to "device_Width" variable'
device_Width = Mobile.getDeviceWidth()

'Get X1 coordinate of touchpoint 1 (Top Left Side)'
int X1 = device_Width * 0.20

'Get Y1 coordinate of touch action 1 (Top Left Side)'
int Y1 = device_Height * 0.20

'Get X2 coordinate of touchpoint 2 (Top Right Side)'
int X2 = device_Width * 0.80

'Get Y2 coordinate of touchpoint 2 (Top Right Side)'
int Y2 = device_Height * 0.20

'Get X3 coordinate of touchpoint 3 (Bottom Left Side)'
int X3 = device_Width * 0.20

'Get Y3 coordinate of touchpoint 3 (Bottom Left Side)'
int Y3 = device_Height * 0.80

'Get X4 coordinate of touchpoint 4 (Bottom Right Side)'
int X4 = device_Width * 0.80

'Get Y4 coordinate of touchpoint 4 (Bottom Right Side)'
int Y4 = device_Height * 0.80

'Create object to "MultiTouchAction" class '
MultiTouchAction multiTouch = new MultiTouchAction(driver)

'Create First action Object to "TouchAction" class'
TouchAction action1 = new TouchAction(driver)

'Create Second action Object to "TouchAction" class'
TouchAction action2 = new TouchAction(driver)

'Create Third action Object to "TouchAction" class'
TouchAction action3 = new TouchAction(driver)

'Create Fourth action Object to "TouchAction" class'
TouchAction action4 = new TouchAction(driver)

'Press First action with x y coordinates wait 5 Seconds then release'
action1.press(PointOption.point(X1, Y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Press Second action with x y coordinates wait 5 Seconds then release'
action2.press(PointOption.point(X2, Y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Press Third action with x y coordinates wait 5 Seconds then release'
action3.press(PointOption.point(X3, Y3)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Press Fourth action with x y coordinates wait 5 Seconds then release'
action4.press(PointOption.point(X4, Y4)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()

'Multi Touch Object to add Multiple touch actions as per you need'
multiTouch.add(action1).add(action2).add(action3).add(action4).perform()

Mobile.closeApplication()

