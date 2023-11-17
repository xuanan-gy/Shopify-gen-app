import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page products the-3p-fulfilled-snowboard'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/products/the-3p-fulfilled-snowboard')

'step 2: At Page products the-3p-fulfilled-snowboard click on button plus'

testObj = findTestObject('Object Repository/Page_products/button_plus')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page products the-3p-fulfilled-snowboard input on button productsubmitbutton template 1486710846269'

testObj = findTestObject('Object Repository/Page_products/button_productsubmitbutton_template_1486710846269')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_button_productsubmitbutton_template_1486710846269)

'step 4: At Page products the-3p-fulfilled-snowboard click on div cart notification product'

testObj = findTestObject('Object Repository/Page_products/div_cart_notification_product')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page products the-3p-fulfilled-snowboard click on div cart notification product'

testObj = findTestObject('Object Repository/Page_products/div_cart_notification_product')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page products the-3p-fulfilled-snowboard click on div cart notification'

testObj = findTestObject('Object Repository/Page_products/div_cart_notification')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: Add visual checkpoint at Page products the-3p-fulfilled-snowboard'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Page Products The3 p Fulfilled Snowboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
