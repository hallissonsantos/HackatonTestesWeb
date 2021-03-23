package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.DeletarPage;

public class DeletarSteps {

	WebDriver driver;

	@Quando("^o usuario clicar no menu Usuarios$")
	public void o_usuario_clicar_no_menu_Usuarios() throws Throwable {
		DeletarPage d = new DeletarPage(Hooks.getDriver());
		d.listaDeUsuarios();

	}

	@Quando("^clicar no botao delete de um usuario$")
	public void clicar_no_botao_delete_de_um_usuario() throws Throwable {
		DeletarPage d = new DeletarPage(Hooks.getDriver());
		d.deletarUsuarioClick();
	}

	@Quando("^clicar em OK na caixa de confirmacao$")
	public void clicar_em_OK_na_caixa_de_confirmacao() throws Throwable {
		DeletarPage d = new DeletarPage(Hooks.getDriver());
		d.alertaDeletar();

	}

	@Entao("^o usuario deletado deve ser apagado da lista de usuarios$")
	public void o_usuario_deletado_deve_ser_apagado_da_lista_de_usuarios() throws Throwable {

	}

}
