package TestCases;

import java.io.IOException;


import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.CommonMethods;
import Resources.baseClass;
import Resources.constant;

public class VerifySignUp extends baseClass {
	@Test
	public void signup() throws IOException, InterruptedException {

		LoginPageObject LPO = new LoginPageObject(driver);

		LPO.ClickOnTryForFree().click();

		SignUpPageObject SPO = new SignUpPageObject(driver);
		Thread.sleep(5000);

		SPO.firstname().sendKeys(constant.firstname);
		SPO.lastname().sendKeys(constant.lastname);

		CommonMethods.handleDropdown(SPO.SelectEmployee(), 1);

		// CommonMethods.handleDropdown(SPO.jobtitle(), 6);

	}

}
