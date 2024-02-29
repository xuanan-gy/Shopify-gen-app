import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://dropstab.com/coins/altlayer/vesting"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/coins/altlayer/vesting')

"Step 2: Click on button 'Investors\nUnlocked\xa0\n0\xa0ALT\n/\xa01.85\xa0B\xa0ALT\nValue Locked\n$894.64\xa0M'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_investors_unlocked_0_alt_1_85_b_alt_valu'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_investors_unlocked_0_alt_1_85_b_alt_valu'))

"Step 3: Click on button 'Protocol Development\nUnlocked\xa0\n340.73\xa0M\xa0ALT\n/\xa02.00\xa0B\xa0ALT\nValue Locked\n$796.35\xa0M'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_protocol_development_unlocked_340_73_m_alt'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_protocol_development_unlocked_340_73_m_alt'))

"Step 4: Click on button 'Treasury\nUnlocked\xa0\n51.57\xa0M\xa0ALT\n/\xa02.15\xa0B\xa0ALT\nValue Locked\n$1.01\xa0B'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_treasury_unlocked_51_57_m_alt_2_15_b_alt'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_treasury_unlocked_51_57_m_alt_2_15_b_alt'))

"Step 5: Click on button 'Advisors\nUnlocked\xa0\n0\xa0ALT\n/\xa0500.00\xa0M\xa0ALT\nValue Locked\n$241.80\xa0M'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_advisors_unlocked_0_alt_500_00_m_alt_val'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_advisors_unlocked_0_alt_500_00_m_alt_val'))

"Step 6: Click on button 'Advisors\nUnlocked\xa0\n0\xa0ALT\n/\xa0500.00\xa0M\xa0ALT\nValue Locked\n$241.80\xa0M'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_advisors_unlocked_0_alt_500_00_m_alt_val'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_advisors_unlocked_0_alt_500_00_m_alt_val'))

"Step 7: Click on button 'Team\nUnlocked\xa0\n0\xa0ALT\n/\xa01.50\xa0B\xa0ALT\nValue Locked\n$719.91\xa0M'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_team_unlocked_0_alt_1_50_b_alt_value_loc'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_team_unlocked_0_alt_1_50_b_alt_value_loc'))

"Step 8: Click on button 'Investors\nUnlocked\xa0\n0\xa0ALT\n/\xa01.85\xa0B\xa0ALT\nValue Locked\n$894.64\xa0M'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_investors_unlocked_0_alt_1_85_b_alt_valu'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/button_investors_unlocked_0_alt_1_85_b_alt_valu'))

"Step 9: Click on link '\U0001fa82\nPotential Airdrop' -> Navigate to page 'tab/airdrops'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_coins_altlayer_vesting/hyperlink_potential_airdrop'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/coins/altlayer/vesting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_coins_altlayer_vesting/hyperlink_potential_airdrop'))

"Step 10: Click on link 'customize-presets-item-R3ZKHbqEVzhchqfCcH8EW-5448' -> Navigate to page 'tab/performance && tab/fdv'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_tab_airdrops/hyperlink_customize_presets_item_r3zkhbqevzhchqfcc'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/tab/airdrops?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_tab_airdrops/hyperlink_customize_presets_item_r3zkhbqevzhchqfcc'))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify Performance Tab on Altlayer Vesting Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
