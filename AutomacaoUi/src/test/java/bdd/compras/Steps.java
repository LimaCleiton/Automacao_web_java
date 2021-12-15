package bdd.compras;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {
	
	WebDriver driver;
	Metodos metodos = new Metodos();
	
	
	@Given("que e acesse o site da loja")
	public void que_e_acesse_o_site_da_loja() {
		
		metodos.abrirNavegador();
		
	   
	}

	@Given("escolher um produto")
	public void escolher_um_produto() {
		
		metodos.escolherProduto();
	    
	}

	

	@Then("valido os produtos no carrinho fechando o browser")
	public void valido_os_produtos_no_carrinho_fechando_o_browser() {
		
	
	   metodos.validarProdutos();
	
	    
	}

}
