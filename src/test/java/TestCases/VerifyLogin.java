package TestCases;

import java.io.IOException;


import org.testng.annotations.Test;


import PageObjectModel.LoginPageObject;
import Resources.CommonMethods;
import Resources.baseClass;
import Resources.constant;

public class VerifyLogin extends baseClass {
	@Test
	public void invalidLogin() throws IOException {

		LoginPageObject LPO = new LoginPageObject(driver);

		LPO.enterUsername().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		LPO.clickLogin().click();

		String actualText = LPO.errorText().getText();
		String expctedText = constant.loginExpectedMessage;

		CommonMethods.handleAssertions(actualText, expctedText, "error message is not valid");

		// String privacyActualText=LPO.privacyText().getText();

		// String privacyExpctedText="Privacy";

		// CommonMethods.handleAssertions(privacyActualText,privacyExpctedText ,
		// "privayc text is not showing on screen");

		// CommonMethodns.handlseeAssertion(s.getFirstSelectedOption().getText(),
		// "Option2","dd")

	}

}
