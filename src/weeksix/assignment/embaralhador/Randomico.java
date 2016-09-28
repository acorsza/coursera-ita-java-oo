package weeksix.assignment.embaralhador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Randomico implements Embaralhador {

	private String palavraSelecionada;

	@Override
	public String obterPalavraEmbaralhada(String palavraSelecionada) {
		this.palavraSelecionada = palavraSelecionada;
		String palavraMisturada = misturar(palavraSelecionada);
		while(palavraMisturada.equals(palavraSelecionada)) {
			palavraMisturada = misturar(palavraSelecionada);
		}
		return palavraMisturada;
	}

	@Override
	public boolean verificarPalavraEmbaralhada(String palavra) {
		if (palavra.equals(palavraSelecionada)) {
			return true;
		}
		return false;
	}

	private static String misturar(String palavraParaMisturar) {
		String[] palavras = palavraParaMisturar.split("\\s+");
		StringBuilder builder = new StringBuilder();
		for (String palavra : palavras) {
			List<Character> letras = new ArrayList<Character>();
			for (char letra : palavra.toCharArray()) {
				letras.add(letra);
			}
			if (letras.size() > 2) {
				Collections.shuffle(letras.subList(1, letras.size() - 1));
			}
			for (char letra : letras) {
				builder.append(letra);
			}
			builder.append(" ");
		}
		return builder.toString();
	}

}
