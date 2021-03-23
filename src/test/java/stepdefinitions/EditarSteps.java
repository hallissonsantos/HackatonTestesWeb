package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.EditarPage;

public class EditarSteps {
	WebDriver driver;

	@Dado("^que esteja na pagina Lista de usuarios$")
	public void que_esteja_na_pagina_Lista_de_usuarios() throws Throwable {
		EditarPage e = new EditarPage(Hooks.getDriver());
		e.listaDeUsuarios();
	}

	@Quando("^o usuario clicar no botao editar$")
	public void o_usuario_clicar_no_botao_editar() throws Throwable {
		EditarPage e = new EditarPage(Hooks.getDriver());
		e.editarUsuarioClick();
	}

	@Quando("^alterar o campo nome$")
	public void alterar_o_campo_nome() throws Throwable {
		EditarPage e = new EditarPage(Hooks.getDriver());
		e.editarNomeUsuario();
	}

	@Quando("^alterar o campo telefone$")
	public void alterar_o_campo_telefone() throws Throwable {
		EditarPage e = new EditarPage(Hooks.getDriver());
		e.editarTelefoneUsuario();
	}

	@Quando("^marcar se ja atuou em TI$")
	public void marcar_se_ja_atuou_em_TI() throws Throwable {
		EditarPage e = new EditarPage(Hooks.getDriver());
		e.atuaTi();
	}

	@Quando("^e clicar no botao Register$")
	public void e_clicar_no_botao_Register() throws Throwable {
		EditarPage e = new EditarPage(Hooks.getDriver());
		e.registrarEdicaoClick();
	}

	@Entao("^o sistema exibe um alerte com a mensagem Atualizado com sucesso$")
	public void o_sistema_exibe_um_alerte_com_a_mensagem_Atualizado_com_sucesso() throws Throwable {
		EditarPage e = new EditarPage(Hooks.getDriver());
		e.alertaEditarValidacao();
	}

}
