/**
 * Coursera ITA Orientação a Objetos com Java
 * Semana 2
 * Practice Peer Graded Assignment: Projeto Pizza
 * 
 */
package weektwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author aderleifilho
 *
 */
public class Pizza {
	
	private static Map<String, Integer> totalIngredientes = new HashMap<String, Integer>();
	private List<String> ingredientes = new ArrayList<>();
	private String tipo;
	
	public double getPreco() {
		if (ingredientes.size() > 0 && ingredientes.size() <= 2) {
			return 15;
		} else if (ingredientes.size() >= 3 && ingredientes.size() <= 5) {
			return 20;
		} else {
			return 23;
		}
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static Map<String, Integer> getIngredientes() {
		return totalIngredientes;
	}

	public int getQuantidadeIngredientes() {
		return ingredientes.size();
	}

	public void adicionaIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}

	private static void contabilizaIngrediente(String ingrediente) {

		int quantidadeTotal = 0;

		if (totalIngredientes.get(ingrediente) != null) {
			quantidadeTotal = totalIngredientes.get(ingrediente);
			quantidadeTotal++;
		} else {
			quantidadeTotal++;
		}

		totalIngredientes.put(ingrediente, quantidadeTotal);
	}
}
