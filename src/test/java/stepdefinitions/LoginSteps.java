package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {

	WebDriver driver;

	@Dado("^que usuario esteja logado$")
	public void que_usuario_esteja_logado() throws Throwable {
		LoginPage login = new LoginPage(Hooks.getDriver());
		login.preencherUsuario("1234");
		login.preencherSenha("123456");
		login.clicarBotaoLogin();
		// ACONTECE DE DELETAREM O USUARIO
		// SE DER ERRO NESSE STEP O CADASTRO TEM QUE SER RECRIADO
	}

	// LOGIN VÁLIDO

	@Quando("^o usuario preencher o campo usuario com \"([^\"]*)\"$")
	public void o_usuario_preencher_o_campo_usuario_com(String arg1) throws Throwable {
		LoginPage l = new LoginPage(Hooks.getDriver());
		l.preencherUsuario(arg1);
	}

	@Quando("^preencher o campo senha com \"([^\"]*)\"$")
	public void preencher_o_campo_senha_com(String arg1) throws Throwable {
		LoginPage l = new LoginPage(Hooks.getDriver());
		l.preencherSenha(arg1);
	}

	@Quando("^clicar no botao de Login$")
	public void clicar_no_botao_de_Login() throws Throwable {
		LoginPage l = new LoginPage(Hooks.getDriver());
		l.clicarBotaoLogin();
	}

	@Entao("^o sistema ira exibir a tela inicial e uma mesnagem de boas vindas$")
	public void o_sistema_ira_exibir_a_tela_inicial_e_uma_mesnagem_de_boas_vindas() throws Throwable {
		Thread.sleep(2000);
		LoginPage l = new LoginPage(Hooks.getDriver());
		l.verificarLogin();

	}

	// LOGIN INVÁLIDO

	@Quando("^o usuario preencher o campo usuario como\"([^\"]*)\" invalido$")
	public void o_usuario_preencher_o_campo_usuario_como_invalido(String arg1) throws Throwable {
		LoginPage l = new LoginPage(Hooks.getDriver());
		l.preencherUsuario(arg1);
	}

	@Quando("^preencher o campo senha com \"([^\"]*)\" invalida$")
	public void preencher_o_campo_senha_com_invalida(String arg1) throws Throwable {
		LoginPage l = new LoginPage(Hooks.getDriver());
		l.preencherSenha(arg1);
	}

	@Entao("^o sistema ira exibir um alerta mostrando uma mesnagem de erro$")
	public void o_sistema_ira_exibir_um_alerta_mostrando_uma_mesnagem_de_erro() throws Throwable {
		LoginPage l = new LoginPage(Hooks.getDriver());
		l.validarAlerta();
	}

}
