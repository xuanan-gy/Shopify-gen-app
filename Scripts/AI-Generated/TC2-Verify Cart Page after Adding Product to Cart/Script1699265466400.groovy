import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on hyperlink cardlink template 14867108397161 featu --> navigate to Page products selling-plans-ski-wax'

testObj = findTestObject('Object Repository/Page_home/hyperlink_cardlink_template_14867108397161_featu')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page products selling-plans-ski-wax input on button productsubmitbutton template 1486710846269'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/button_productsubmitbutton_template_1486710846269')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_button_productsubmitbutton_template_1486710846269)

'step 4: At Page products selling-plans-ski-wax click on div cart notification'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/div_cart_notification')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page products selling-plans-ski-wax click on hyperlink cart notification button --> navigate to Page cart'

testObj = findTestObject('Object Repository/Page_products_selling-plans-ski-wax/hyperlink_cart_notification_button')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/selling-plans-ski-wax(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Add visual checkpoint at Page cart'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Cart Page after Adding Product to Cart_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
