/**
 * Coursera ITA Orientação a Objetos com Java
 * Semana 2
 * Practice Peer Graded Assignment: Projeto Pizza
 * 
 */
package com.aderleifilho.itajavaoo.weektwo;

import java.util.Map;
/**
 * @author aderleifilho
 *
 */
public class Principal {
	
	private static final String MOLHO = "Molho de Tomate";
	private static final String QUEIJO = "Queijo Mussarela";
	private static final String PEPERONE = "Peperone";
	private static final String OVOS = "Ovos";
	private static final String PALMITO = "Palmito";
	private static final String PRESUNTO = "Presunto";
	private static final String ERVILHAS = "Ervilhas";
	private static final String TOMATES = "Tomates";

	public static void main(String[] args) {

		// Cria 3 pizzas com ingredientes diferentes
		Pizza mussarela = new Pizza();
		Pizza portuguesa = new Pizza();
		Pizza peperone = new Pizza();
		Pizza pizzaSemIngredientes = new Pizza();
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		mussarela.setTipo("Mussarela");
		mussarela.adicionaIngrediente(MOLHO);
		mussarela.adicionaIngrediente(QUEIJO);

		portuguesa.setTipo("Portuguesa");
		portuguesa.adicionaIngrediente(MOLHO);
		portuguesa.adicionaIngrediente(OVOS);
		portuguesa.adicionaIngrediente(PRESUNTO);
		portuguesa.adicionaIngrediente(QUEIJO);
		portuguesa.adicionaIngrediente(PALMITO);
		portuguesa.adicionaIngrediente(TOMATES);
		portuguesa.adicionaIngrediente(ERVILHAS);

		peperone.setTipo("Peperone");
		peperone.adicionaIngrediente(MOLHO);
		peperone.adicionaIngrediente(QUEIJO);
		peperone.adicionaIngrediente(PEPERONE);
		peperone.adicionaIngrediente(TOMATES);

		// Adiciona as Pizzas criadas em um CarrinhoDeCompra
		carrinhoDeCompras.adicionarPizza(mussarela);
		carrinhoDeCompras.adicionarPizza(portuguesa);
		carrinhoDeCompras.adicionarPizza(peperone);
		
		// Teste se a pizza será adicionada com ingredientes vazios
		pizzaSemIngredientes.setTipo("Pizza sem ingredientes");
		carrinhoDeCompras.adicionarPizza(pizzaSemIngredientes);

		
		// Imprime o total do CarrinhoDeCompra
		System.out.println("\nO valor total em pizzas é de R$ " + carrinhoDeCompras.getValorTotalPizzas());
		
		// Imprime a quantidade utilizada de cada ingredient
		System.out.println("\nA quantidade utilizada de cada ingrediente foi:");
		for (Map.Entry<String, Integer> ingrediente : Pizza.getIngredientes().entrySet()) {
			System.out.println(ingrediente.getKey() + " : " + ingrediente.getValue());
		}
	}
}
