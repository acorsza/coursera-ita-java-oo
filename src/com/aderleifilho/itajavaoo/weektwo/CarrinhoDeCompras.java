/**
 * Coursera ITA Orientação a Objetos com Java
 * Semana 2
 * Practice Peer Graded Assignment: Projeto Pizza
 * 
 */
package com.aderleifilho.itajavaoo.weektwo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aderleifilho
 *
 */
public class CarrinhoDeCompras {

	private List<Pizza> pizzas = new ArrayList<Pizza>();
	private double valorTotalPizzas = 0;

	public double getValorTotalPizzas() {
		return valorTotalPizzas;
	}

	public void adicionarPizza(Pizza pizza) {
		if (pizza.getQuantidadeIngredientes() == 0) {
			System.out.println("Não foi possível adicionar a pizza: " + pizza.getTipo() + ". É preciso ter pelo menos um ingrediente");
		} else {
			pizzas.add(pizza);
			valorTotalPizzas += pizza.getPreco();
			System.out.println("A pizza " + pizza.getTipo() + " foi adicionada com sucesso ao Carrinho de Compras ");
		}
	}

}
