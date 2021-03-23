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

import utils.Utils;

public class EditarPage extends Utils {

	protected WebDriver driver;

	public EditarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/app/nav/div[2]/a[2]")
	private WebElement listarUsuarios;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/table/tbody/tr[3]/td[9]/button[2]")
	private WebElement editarUsuario;

	@FindBy(how = How.XPATH, using = "//*[@id=\"nome\"]")
	private WebElement editarNome;
	@FindBy(how = How.XPATH, using = "//*[@id=\"telefone\"]")
	private WebElement editarTelefone;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[8]/input[1]")
	private WebElement editarAtuaTi;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/button[1]")
	private WebElement registrarEdicao;

	public void listaDeUsuarios() {
		esperarElemento(listarUsuarios);
		listarUsuarios.click();
	}

	public void editarUsuarioClick() {
		esperarElemento(editarUsuario);
		editarUsuario.click();
	}

	public void editarNomeUsuario() {
		esperarElemento(editarNome);
		editarNome.sendKeys("José Teste");
	}

	public void editarTelefoneUsuario() {
		esperarElemento(editarTelefone);
		editarTelefone.sendKeys("90901010");
	}

	public void atuaTi() {
		esperarElemento(editarAtuaTi);
		editarAtuaTi.click();
	}

	public void registrarEdicaoClick() {
		esperarElemento(registrarEdicao);
		registrarEdicao.click();
	}

	public void alertaEditarValidacao() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String editAlert = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		alert.accept();
		assertEquals("Atualizado com Sucesso", editAlert);

	}

}
