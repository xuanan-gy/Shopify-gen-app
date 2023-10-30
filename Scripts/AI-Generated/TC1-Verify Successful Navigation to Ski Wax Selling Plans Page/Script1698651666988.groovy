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

'step 1: Navigate to Page account login'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/account/login')

'step 2: At Page account login click on hyperlink headermenu home --> navigate to Page home'

testObj = findTestObject('Object Repository/Page_account_login/hyperlink_headermenu_home')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/account/login(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page home click on hyperlink cardlink template 14867108397161 featu --> navigate to Page products selling-plans-ski-wax'

testObj = findTestObject('Object Repository/Page_home/hyperlink_cardlink_template_14867108397161_featu')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page products selling-plans-ski-wax'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Navigation to Ski Wax Selling Plans Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
