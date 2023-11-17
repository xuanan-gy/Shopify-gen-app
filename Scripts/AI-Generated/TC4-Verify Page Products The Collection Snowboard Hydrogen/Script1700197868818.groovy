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

'step 1: Navigate to Page products the-collection-snowboard-hydrogen'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/products/the-collection-snowboard-hydrogen')

'step 2: At Page products the-collection-snowboard-hydrogen input on button productsubmitbutton template 1486710846269'

testObj = findTestObject('Object Repository/Page_products_the-collection-snowboard-hydrogen/button_productsubmitbutton_template_1486710846269')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/the-collection-snowboard-hydrogen(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_button_productsubmitbutton_template_1486710846269)

'step 3: At Page products the-collection-snowboard-hydrogen click on div object'

testObj = findTestObject('Object Repository/Page_products_the-collection-snowboard-hydrogen/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/the-collection-snowboard-hydrogen(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page products the-collection-snowboard-hydrogen click on div object'

testObj = findTestObject('Object Repository/Page_products_the-collection-snowboard-hydrogen/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/the-collection-snowboard-hydrogen(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page products the-collection-snowboard-hydrogen click on div cart notification'

testObj = findTestObject('Object Repository/Page_products_the-collection-snowboard-hydrogen/div_cart_notification')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/the-collection-snowboard-hydrogen(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Add visual checkpoint at Page products the-collection-snowboard-hydrogen'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Page Products The Collection Snowboard Hydrogen_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
