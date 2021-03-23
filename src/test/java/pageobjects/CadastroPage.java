package pageobjects;

import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class CadastroPage extends Utils {

	protected WebDriver driver;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[3]/a")
	private WebElement btnCadastro;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[1]/input")
	private WebElement cadNome;

	@FindBy(how = How.XPATH, using = "//*[@id=\"inline\"]/input")
	private WebElement cadIdade;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[2]/div[2]/input[1]")
	private WebElement cadDataIn;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[2]/div[2]/input[2]")
	private WebElement cadDataFim;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[2]/div[3]/input")
	private WebElement cadTel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sexo\"]")
	private WebElement cadSexo;

	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]/input")
	private WebElement cadEmail;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[5]/input[1]")
	private WebElement cadAtuaS;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[5]/input[2]")
	private WebElement cadAtuaN;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[6]/input")
	private WebElement cadUsuario;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[7]/input")
	private WebElement cadSenha;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/form/div[8]/button")
	private WebElement cadBtnRegistrar;

	public void clicarCadastro() {
		esperarElemento(btnCadastro);
		btnCadastro.click();
	}

	public void nomeCad(String nome) {
		esperarElemento(cadNome);
		cadNome.sendKeys(nome);
	}

	public void idadeCad(String idade) {
		esperarElemento(cadIdade);
		cadIdade.sendKeys(idade);
	}

	public void dataInCad(String dataInicio) {
		esperarElemento(cadDataIn);
		cadDataIn.sendKeys(dataInicio);
	}

	public void dataFimCad(String dataFim) {
		esperarElemento(cadDataFim);
		cadDataFim.sendKeys(dataFim);
	}

	public void telCad(String telefone) {
		esperarElemento(cadTel);
		cadTel.sendKeys(telefone);
	}

	public void sexoCad(String sexo) {
		esperarElemento(cadSexo);
		selecionar(cadSexo, sexo);
	}

	public void emailCad(String email) {
		esperarElemento(cadEmail);
		cadEmail.sendKeys(email);
	}

	public void atuaCad() {
		esperarElemento(cadAtuaS);
		cadAtuaS.click();

	}

	public void usuarioCad(String usuario) {
		esperarElemento(cadUsuario);
		cadUsuario.sendKeys(usuario);
	}

	public void senhaCad(String senha) {
		esperarElemento(cadSenha);
		cadSenha.sendKeys(senha);
	}

	public void registrarCadClick() throws InterruptedException {
		esperarElemento(cadBtnRegistrar);
		cadBtnRegistrar.click();

	}

	public void validarRegistro() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String alertaRegistro = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		alert.accept();
		assertEquals("Usuario Registrado com sucesso", alertaRegistro);
	}

}
