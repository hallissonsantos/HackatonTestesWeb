package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class LogoutPage extends Utils {
	protected WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/app/nav/div[2]/a[3]")
	private WebElement logout;

	@FindBy(how = How.XPATH, using = "//*[@id=\"login\"]")
	private WebElement logoutConfirm;

	public void logoutUsuarioClick() {
		esperarElemento(logout);
		logout.click();
	}

	public void validarLogout() {
		esperarElemento(logoutConfirm);
		assertTrue(logoutConfirm.isDisplayed());
	}
}
