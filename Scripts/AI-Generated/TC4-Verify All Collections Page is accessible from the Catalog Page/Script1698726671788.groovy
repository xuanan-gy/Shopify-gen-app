import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page products the-3p-fulfilled-snowboard'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/products/the-3p-fulfilled-snowboard')

'step 2: At Page products the-3p-fulfilled-snowboard click on hyperlink headermenu catalog --> navigate to Page collections all'

testObj = findTestObject('Object Repository/Page_products/hyperlink_headermenu_catalog')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page collections all'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify All Collections Page is accessible from the Catalog Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
