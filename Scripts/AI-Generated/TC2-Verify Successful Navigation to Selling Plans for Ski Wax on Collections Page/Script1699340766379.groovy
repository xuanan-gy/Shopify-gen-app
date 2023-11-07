import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page cart'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/cart')

'step 2: At Page cart click on hyperlink collections all --> navigate to Page collections all'

testObj = findTestObject('Object Repository/Page_cart/hyperlink_collections_all')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page collections all click on hyperlink cardlink template 14867108233321 produ --> navigate to Page products selling-plans-ski-wax'

testObj = findTestObject('Object Repository/Page_collections_all/hyperlink_cardlink_template_14867108233321_produ')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/collections/all(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page products selling-plans-ski-wax'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Navigation to Selling Plans for Ski Wax on Collections Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
