package weekfive.assignment;

public class ComTitulo implements FormatadorNome {
	
	private String titulo;

	public ComTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return String.join(" ", titulo , nome, sobrenome);
	}

}