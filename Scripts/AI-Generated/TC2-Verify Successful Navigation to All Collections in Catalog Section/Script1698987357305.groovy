import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on header object'

testObj = findTestObject('Object Repository/Page_home/header_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page home click on hyperlink headermenu catalog --> navigate to Page collections all'

testObj = findTestObject('Object Repository/Page_home/hyperlink_headermenu_catalog')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page collections all select on select sortby'

testObj = findTestObject('Object Repository/Page_collections_all/select_sortby')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/collections/all(?:#.*)?(?:\\?.*)?$', true)

WebUI.selectOptionByIndex(testObj, '6')

'step 5: At Page collections all click on div facetswrapperdesktop'

testObj = findTestObject('Object Repository/Page_collections_all/div_facetswrapperdesktop')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/collections/all(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Add visual checkpoint at Page collections all'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Navigation to All Collections in Catalog Section_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
