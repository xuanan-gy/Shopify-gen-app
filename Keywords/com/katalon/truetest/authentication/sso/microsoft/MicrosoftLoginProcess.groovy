package com.katalon.truetest.authentication.sso.microsoft

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable

import com.katalon.truetest.authentication.AuthenticationProcess
import com.katalon.truetest.authentication.sso.microsoft.process.ConfirmStaySignedIn
import com.katalon.truetest.authentication.sso.microsoft.process.EnterEmail
import com.katalon.truetest.authentication.sso.microsoft.process.EnterPassword
import com.katalon.truetest.authentication.sso.microsoft.process.EnterTOTP
import com.katalon.truetest.authentication.sso.microsoft.process.FocusToLoginWindow
import com.katalon.truetest.authentication.sso.microsoft.process.HandleAuthenticator
import com.katalon.truetest.authentication.sso.microsoft.process.HandleOtherAuthMethods
import com.katalon.truetest.authentication.sso.microsoft.process.HandleOtherVerificationMethods

class MicrosoftLoginProcess extends AuthenticationProcess {
	private String username;
	private String password;
	private String secretKey;

	public MicrosoftLoginProcess() {
		this(true)
	}

	public MicrosoftLoginProcess(boolean isRequired) {
		super("SSO Login with identity provider Microsoft", isRequired)
		this.username = GlobalVariable.username;
		this.password = GlobalVariable.password;
		try {
			this.secretKey = GlobalVariable.secret_key
		}
		catch (Exception e) {
			this.secretKey = "secretkey"
		}
	}

	// Default configuration values
	def static final int MAIN_WINDOW_INDEX = 0
	def static final int LOGIN_WINDOW_INDEX = 1

	boolean stepProcess() {
		def processList = [
			new FocusToLoginWindow("Focus to login window", LOGIN_WINDOW_INDEX),
			new EnterEmail(this.username),
			new HandleAuthenticator(),
			new HandleOtherAuthMethods(),
			new EnterPassword(this.password),
			new HandleOtherVerificationMethods(),
			new EnterTOTP(this.secretKey),
			new ConfirmStaySignedIn("false"),
			new FocusToLoginWindow("Focus to main AUT window", MAIN_WINDOW_INDEX)
		]
		for (process in processList) {
			try {
				process.execute()
			}
			catch (StepFailedException ex) {
				return false
			}
		}
		return true
	}
}