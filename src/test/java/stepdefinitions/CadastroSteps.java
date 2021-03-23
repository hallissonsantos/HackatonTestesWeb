package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CadastroPage;

public class CadastroSteps {

	WebDriver driver;

	@Dado("^que o usuario esteja na pagina inicial do sistema$")
	public void que_o_usuario_esteja_na_pagina_inicial_do_sistema() throws Throwable {
		Hooks.abrirUrl("http://gitmaratonadev.stefanini.com.br/maratonaqa/login");
		driver = Hooks.getDriver();

	}

	@Quando("^o usuario clicar no botao Cadastre-se$")
	public void o_usuario_clicar_no_botao_Cadastre_se() throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.clicarCadastro();

	}

	@Quando("^preencher o campo nome como \"([^\"]*)\"$")
	public void preencher_o_campo_nome_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.nomeCad(arg1);

	}

	@Quando("^preencher o campo Idade como \"([^\"]*)\"$")
	public void preencher_o_campo_Idade_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.idadeCad(arg1);

	}

	@Quando("^informar data de inicio como \"([^\"]*)\"$")
	public void informar_data_de_inicio_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.dataInCad(arg1);

	}

	@Quando("^informar data de Finalizacao como \"([^\"]*)\"$")
	public void informar_data_de_Finalizacao_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.dataFimCad(arg1);
	}

	@Quando("^preencher o campo Telefone como \"([^\"]*)\"$")
	public void preencher_o_campo_Telefone_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.telCad(arg1);

	}

	@Quando("^preencher o campo Sexo como \"([^\"]*)\"$")
	public void preencher_o_campo_Sexo_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.sexoCad(arg1);

	}

	@Quando("^preencher o campo e-mail como \"([^\"]*)\"$")
	public void preencher_o_campo_e_mail_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.emailCad(arg1);

	}

	@Quando("^selecionar se ja atuou ou atua na area de Ti$")
	public void selecionar_se_ja_atuou_ou_atua_na_area_de_Ti() throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.atuaCad();

	}

	@Quando("^preencher o campo Usuario como \"([^\"]*)\"$")
	public void preencher_o_campo_Usuario_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.usuarioCad(arg1);

	}

	@Quando("^preencher o campo senha como \"([^\"]*)\"$")
	public void preencher_o_campo_senha_como(String arg1) throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.senhaCad(arg1);

	}

	@Quando("^clicar no botao Registrar$")
	public void clicar_no_botao_Registrar() throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.registrarCadClick();
		Thread.sleep(3000);

	}

	@Entao("^sistema deve cadastrar o usuario com sucesso e exibir uma mensagem de confirmacao$")
	public void sistema_deve_cadastrar_o_usuario_com_sucesso_e_exibir_uma_mensagem_de_confirmacao() throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.validarRegistro();

	}

}
