package pageobjects;

import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.*;

public class LoginPage extends Utils {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[1]/input")
	private WebElement loginUsuario;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[2]/input")
	private WebElement loginSenha;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[3]/button")
	private WebElement loginBtn;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/h3")
	private WebElement loginOla;

	public void preencherUsuario(String usuario) {
		esperarElemento(loginUsuario);
		loginUsuario.sendKeys(usuario);
	}

	public void preencherSenha(String senha) {
		esperarElemento(loginSenha);
		loginSenha.sendKeys(senha);
	}

	public void clicarBotaoLogin() {
		loginBtn.click();
	}

	public void verificarLogin() {
		String saudacao = loginOla.getText();
		assertEquals(true, saudacao.contains("Olá"));
	}

	public void validarAlerta() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String alertaLogin = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		alert.accept();
		assertEquals("Usuario nao existe", alertaLogin);
	}
}
