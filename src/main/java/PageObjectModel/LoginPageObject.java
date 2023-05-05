package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
  
	
	
	public WebDriver driver; // Thi driver dont have scope

	private By username = By.xpath("//input[@id='username']");

	private By password = By.xpath("//input[@id='password']");

	private By login = By.xpath("//input[@id='Login']");

	private By tryForFree = By.xpath("//a[@id='signup_link']");

	private By errorText = By.xpath("//div[@id='error']");

	public LoginPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(username);

	}

	public WebElement enterPassword() {
		return driver.findElement(password);

	}

	public WebElement clickLogin() {
		return driver.findElement(login);

	}

	public WebElement ClickOnTryForFree() {
		return driver.findElement(tryForFree);

	}

	public WebElement errorText() {
		return driver.findElement(errorText);

	}

}
