import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page products selling-plans-ski-wax'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/products/selling-plans-ski-wax')

'step 2: At Page products selling-plans-ski-wax click on button plus'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/button_plus')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page products selling-plans-ski-wax click on button plus'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/button_plus')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page products selling-plans-ski-wax click on button plus'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/button_plus')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page products selling-plans-ski-wax input on button productsubmitbutton template 1486710846269'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/button_productsubmitbutton_template_1486710846269')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_button_productsubmitbutton_template_1486710846269)

'step 6: At Page products selling-plans-ski-wax click on div cart notification'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/div_cart_notification')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: Add visual checkpoint at Page products selling-plans-ski-wax'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Adding Multiple Ski Wax Products to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
