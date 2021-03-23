package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LogoutPage;

public class LogoutSteps {

	@Quando("^o usuario clicar no menu Logout$")
	public void o_usuario_clicar_no_menu_Logout() throws Throwable {
		LogoutPage l = new LogoutPage(Hooks.getDriver());
		l.logoutUsuarioClick();
	}

	@Entao("^o sistema ira deslogar da conta do usuario e reornar a tela de Login$")
	public void o_sistema_ira_deslogar_da_conta_do_usuario_e_reornar_a_tela_de_Login() throws Throwable {
		LogoutPage l = new LogoutPage(Hooks.getDriver());
		l.validarLogout();
	}
}
