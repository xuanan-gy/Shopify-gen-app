import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page products the-3p-fulfilled-snowboard'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/products/the-3p-fulfilled-snowboard')

'step 2: At Page products the-3p-fulfilled-snowboard click on product productinfo template 14867108462697 main'

testObj = findTestObject('Object Repository/Page_products/product_productinfo_template_14867108462697_main')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/products/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page products the-3p-fulfilled-snowboard'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Viewing Snowboard Product Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
