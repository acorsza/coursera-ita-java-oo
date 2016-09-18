/**
 * Coursera ITA Orientação a Objetos com Java
 * Semana 2
 * Practice Peer Graded Assignment: Projeto Pizza
 * 
 */
package weekthree;

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

	public String adicionarPizza(Pizza pizza) {
		if (pizza.getQuantidadeIngredientes() == 0) {
			return "Não foi possível adicionar a pizza. É preciso ter pelo menos um ingrediente";
		} else {
			pizzas.add(pizza);
			valorTotalPizzas += pizza.getPreco();
			return "A pizza foi adicionada com sucesso ao Carrinho de Compras ";
		}
	}

}
