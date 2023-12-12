import internal.GlobalVariable as GlobalVariable
import com.katalon.truetest.authentication.LoginProcess as LoginProcess
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page cart html --> navigate to Page t'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/cart.html')

'step 2: Login at Page t --> navigate to Page inventory html#code=0 ASsAPh27IWxyhE-TOVG8BZK'

LoginProcess.ssoLoginWithMicrosoft()

'step 3: Add visual checkpoint at Page inventory html#code=0 ASsAPh27IWxyhE-TOVG8BZK'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Login and Access to Inventory Page with Code0 Assaph27iwxyhe Tovg8bzk_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
