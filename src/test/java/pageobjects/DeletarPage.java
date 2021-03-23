package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class DeletarPage extends Utils {

	protected WebDriver driver;

	public DeletarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/app/nav/div[2]/a[2]")
	private WebElement listarUsuarios;

	@FindBy(how = How.XPATH, using = "/html/body/app/div/div/div/div/ng-component/div/table/tbody/tr[1]/td[9]/button[1]")
	private WebElement deletarUsuario;

	public void listaDeUsuarios() {
		esperarElemento(listarUsuarios);
		listarUsuarios.click();
	}

	public void deletarUsuarioClick() {
		esperarElemento(deletarUsuario);
		deletarUsuario.click();
	}

	public void alertaDeletar() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

	}

}
