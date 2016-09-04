package com.aderleifilho.itajavaoo.weekthree.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.aderleifilho.itajavaoo.weekthree.Pizza;

public class TestePizza {
	
	private Pizza pizza;
	
	@Before
	public void before() {
		pizza = new Pizza();
		Pizza.zerarRegistroIngredientes();
	}
	
	// Testes para valores da pizza
	
	@Test
	public void testeValorPizza_PizzaComDoisIngredientes_DeveRetornar15() {
		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		assertEquals(15, pizza.getPreco(),0);
	}
	
	@Test
	public void testeValorPizza_PizzaComQuatroIngredientes_DeveRetornar20() {
		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		pizza.adicionaIngrediente("IngredienteTres");
		pizza.adicionaIngrediente("IngredienteQuatro");
		assertEquals(20, pizza.getPreco(),0);
	}
	
	@Test
	public void testeValorPizza_PizzaComSeisIngredientes_DeveRetornar23() {
		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		pizza.adicionaIngrediente("IngredienteTres");
		pizza.adicionaIngrediente("IngredienteQuatro");
		pizza.adicionaIngrediente("IngredienteCinco");
		pizza.adicionaIngrediente("IngredienteSeis");
		assertEquals(23, pizza.getPreco(),0);
	}
	
	// Testes para registro de ingredientes
	
	@Test
	public void testeRegistroDeIngredientesPizza_PizzaComDoisIngredientes_DeveRetornar2() {
		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		assertEquals(2, Pizza.getIngredientes().size());
	}
	
	@Test
	public void testeRegistroDeIngredientesPizza_PizzaComQuatroIngredientes_DeveRetornar4() {
		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		pizza.adicionaIngrediente("IngredienteTres");
		pizza.adicionaIngrediente("IngredienteQuatro");
		assertEquals(4, Pizza.getIngredientes().size());
	}
	
	@Test
	public void testeRegistroDeIngredientesPizza_PizzaComSeisIngredientes_DeveRetornar6() {
		pizza.adicionaIngrediente("IngredienteUm");
		pizza.adicionaIngrediente("IngredienteDois");
		pizza.adicionaIngrediente("IngredienteTres");
		pizza.adicionaIngrediente("IngredienteQuatro");
		pizza.adicionaIngrediente("IngredienteCinco");
		pizza.adicionaIngrediente("IngredienteSeis");
		assertEquals(6, Pizza.getIngredientes().size());
	}

}
