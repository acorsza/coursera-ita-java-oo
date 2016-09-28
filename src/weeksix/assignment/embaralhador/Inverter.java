package weeksix.assignment.embaralhador;

public class Inverter implements Embaralhador {

	private String palavraSelecionada;

	@Override
	public String obterPalavraEmbaralhada(String palavraSelecionada) {
		this.palavraSelecionada = palavraSelecionada;
		return new StringBuilder(palavraSelecionada).reverse().toString();
	}

	@Override
	public boolean verificarPalavraEmbaralhada(String palavra) {
		if (palavra.equals(palavraSelecionada)) {
			return true;
		}
		return false;
	}
}
