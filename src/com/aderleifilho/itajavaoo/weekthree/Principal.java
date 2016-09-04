/**
 * Coursera ITA Orientação a Objetos com Java
 * Semana 2
 * Practice Peer Graded Assignment: Projeto Pizza
 * 
 */
package com.aderleifilho.itajavaoo.weekthree;

import java.util.Map;
/**
 * @author aderleifilho
 *
 */
public class Principal {

	public static void main(String[] args) {

		// Cria 3 pizzas com ingredientes diferentes
		Pizza mussarela = new Pizza();
		Pizza portuguesa = new Pizza();
		Pizza peperone = new Pizza();
		Pizza pizzaSemIngredientes = new Pizza();
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		mussarela.adicionaIngrediente("Molho de Tomate");
		mussarela.adicionaIngrediente("Queijo Mussarela");

		portuguesa.adicionaIngrediente("Molho de Tomate");
		portuguesa.adicionaIngrediente("Ovos");
		portuguesa.adicionaIngrediente("Presunto");
		portuguesa.adicionaIngrediente("Queijo Mussarela");
		portuguesa.adicionaIngrediente("Palmito");
		portuguesa.adicionaIngrediente("Tomates");
		portuguesa.adicionaIngrediente("Ervilhas");

		peperone.adicionaIngrediente("Molho de Tomate");
		peperone.adicionaIngrediente("Queijo Mussarela");
		peperone.adicionaIngrediente("Peperone");
		peperone.adicionaIngrediente("Tomates");

		// Adiciona as Pizzas criadas em um CarrinhoDeCompra
		carrinhoDeCompras.adicionarPizza(mussarela);
		carrinhoDeCompras.adicionarPizza(portuguesa);
		carrinhoDeCompras.adicionarPizza(peperone);
		
		// Teste se a pizza será adicionada com ingredientes vazios
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
