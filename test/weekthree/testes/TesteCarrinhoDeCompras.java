package weekthree.testes;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import weekthree.CarrinhoDeCompras;
import weekthree.Pizza;

public class TesteCarrinhoDeCompras {
	
	private static CarrinhoDeCompras carrinhoDeCompras;
	
	@Before
	public void before() {
		carrinhoDeCompras = new CarrinhoDeCompras();
	}
	
	@AfterClass
	public static void afterClass() {
		carrinhoDeCompras = null;
	}
	
	// Testes para verificar preco do carrinho de compras
	
	@Test
	public void testeVerificaPrecoCarrinho_CarrinhoComTresPizzasDeCadaTipo_DeveRetornar58() {
		Pizza pizza = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		
		pizza2.adicionaIngrediente("IngredienteUm");
		pizza2.adicionaIngrediente("IngredienteDois");
		pizza2.adicionaIngrediente("IngredienteTres");
		pizza2.adicionaIngrediente("IngredienteQuatro");
		
		pizza3.adicionaIngrediente("IngredienteUm");
		pizza3.adicionaIngrediente("IngredienteDois");
		pizza3.adicionaIngrediente("IngredienteTres");
		pizza3.adicionaIngrediente("IngredienteQuatro");
		pizza3.adicionaIngrediente("IngredienteCinco");
		pizza3.adicionaIngrediente("IngredienteSeis");
		
		carrinhoDeCompras.adicionarPizza(pizza);
		carrinhoDeCompras.adicionarPizza(pizza2);
		carrinhoDeCompras.adicionarPizza(pizza3);
		
		assertEquals(58, carrinhoDeCompras.getValorTotalPizzas(),0);
	}
	
	@Test
	public void testeVerificaPrecoCarrinho_CarrinhoComTresPizzasDeDoisIngredientes_DeveRetornar45() {
		Pizza pizza = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		
		pizza2.adicionaIngrediente("IngredienteUm");
		pizza2.adicionaIngrediente("IngredienteDois");
		
		pizza3.adicionaIngrediente("IngredienteUm");
		pizza3.adicionaIngrediente("IngredienteDois");
		
		carrinhoDeCompras.adicionarPizza(pizza);
		carrinhoDeCompras.adicionarPizza(pizza2);
		carrinhoDeCompras.adicionarPizza(pizza3);
		
		assertEquals(45, carrinhoDeCompras.getValorTotalPizzas(),0);
	}
	
	@Test
	public void testeVerificaPrecoCarrinho_CarrinhoComTresPizzasDeQuatroIngredientes_DeveRetornar60() {
		Pizza pizza = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		pizza.adicionaIngrediente("IngredienteTres");
		pizza.adicionaIngrediente("IngredienteQuatro");
		
		pizza2.adicionaIngrediente("IngredienteUm");
		pizza2.adicionaIngrediente("IngredienteDois");
		pizza2.adicionaIngrediente("IngredienteTres");
		pizza2.adicionaIngrediente("IngredienteQuatro");
		
		pizza3.adicionaIngrediente("IngredienteUm");
		pizza3.adicionaIngrediente("IngredienteDois");
		pizza3.adicionaIngrediente("IngredienteTres");
		pizza3.adicionaIngrediente("IngredienteQuatro");
		
		carrinhoDeCompras.adicionarPizza(pizza);
		carrinhoDeCompras.adicionarPizza(pizza2);
		carrinhoDeCompras.adicionarPizza(pizza3);
		
		assertEquals(60, carrinhoDeCompras.getValorTotalPizzas(),0);
	}
	
	@Test
	public void testeVerificaPrecoCarrinho_CarrinhoComTresPizzasDeSeisIngredientes_DeveRetornar69() {
		Pizza pizza = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		pizza.adicionaIngrediente("IngredienteTres");
		pizza.adicionaIngrediente("IngredienteQuatro");
		pizza.adicionaIngrediente("IngredienteCinco");
		pizza.adicionaIngrediente("IngredienteSeis");
		
		pizza2.adicionaIngrediente("IngredienteUm");
		pizza2.adicionaIngrediente("IngredienteDois");
		pizza2.adicionaIngrediente("IngredienteTres");
		pizza2.adicionaIngrediente("IngredienteQuatro");
		pizza2.adicionaIngrediente("IngredienteCinco");
		pizza2.adicionaIngrediente("IngredienteSeis");
		
		pizza3.adicionaIngrediente("IngredienteUm");
		pizza3.adicionaIngrediente("IngredienteDois");
		pizza3.adicionaIngrediente("IngredienteTres");
		pizza3.adicionaIngrediente("IngredienteQuatro");
		pizza3.adicionaIngrediente("IngredienteCinco");
		pizza3.adicionaIngrediente("IngredienteSeis");	
		
		carrinhoDeCompras.adicionarPizza(pizza);
		carrinhoDeCompras.adicionarPizza(pizza2);
		carrinhoDeCompras.adicionarPizza(pizza3);
		
		assertEquals(69, carrinhoDeCompras.getValorTotalPizzas(),0);
	}
	
	// Testes para verificar se carrinho pode receber pizza sem ingredientes
	
	@Test
	public void testeVerificaPizzaSemIngredientes_CarrinhoTentaReceberPizzaSemIngrediente_NaoDeveAdicionarPizza() {
		Pizza pizza = new Pizza();
		String resultadoEsperado = "Não foi possível adicionar a pizza. É preciso ter pelo menos um ingrediente";
		String resultadoAtual = carrinhoDeCompras.adicionarPizza(pizza);
		
		assertEquals(resultadoEsperado, resultadoAtual);
		assertEquals(0, carrinhoDeCompras.getValorTotalPizzas(),0);
	}

}
